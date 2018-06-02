package com.olympus.hora.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.olympus.hora.Exception.OverlapTimeIntervalException;
import com.olympus.hora.Exception.RecordNotFoundException;
import com.olympus.hora.common.util.MonthUtil;
import com.olympus.hora.constants.LogMessageKeyConstants;
import com.olympus.hora.constants.SystemCodeConstants;
import com.olympus.hora.dbflute.exbhv.MHolidayBhv;
import com.olympus.hora.dbflute.exbhv.MShopBhv;
import com.olympus.hora.dbflute.exbhv.MWorkingDayBhv;
import com.olympus.hora.dbflute.exbhv.MWorkingDayDeffBhv;
import com.olympus.hora.dbflute.exbhv.MWorkingDayDetailDeffBhv;
import com.olympus.hora.dbflute.exentity.MHoliday;
import com.olympus.hora.dbflute.exentity.MShop;
import com.olympus.hora.dbflute.exentity.MWorkingDay;
import com.olympus.hora.dbflute.exentity.MWorkingDayDeff;
import com.olympus.hora.dbflute.exentity.MWorkingDayDetailDeff;
import com.olympus.hora.dto.LabelValueDto;
import com.olympus.hora.dto.shop.MWorkingDayDeffDto;
import com.olympus.hora.dto.shop.MWorkingDayDetailDeffDto;

/**
 * 営業日設定のサービスクラス．
 * @author hasegawa_m
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class WorkshopEditService {

    @Autowired
    MWorkingDayDeffBhv mWorkingDayDeffBhv;

    @Autowired
    MWorkingDayDetailDeffBhv mWorkingDayDetailDeffBhv;

    @Autowired
    MWorkingDayBhv mWorkingDayBhv;

    @Autowired
    MShopBhv mShopBhv;

    @Autowired
    MHolidayBhv mHolidayBhv;

    @Autowired
    LoggerService loggerService;


    /**
     * 店舗マスタからショップIDで検索をする．
     *
     * @param shopId ショップID
     * @return mShopEntity
     */
    public OptionalEntity<MShop> findMShopEntity(Integer shopId) {
        OptionalEntity<MShop> mShopEntity = mShopBhv.selectEntity(cb ->{
            cb.query().setShopId_Equal(shopId);
            cb.query().setDeleteFlag_Equal(false);
        });
        return mShopEntity;
    }

    /**
     * 祝日マスタから一致する日付を検索をする．
     *
     * @param date 日付
     * @return mHolidayEntity
     */
    public OptionalEntity<MHoliday> findHoliday(LocalDate date) {
        OptionalEntity<MHoliday> mHolidayEntity = mHolidayBhv.selectEntity(cb ->{
            cb.query().setHoliday_Equal(date);
            cb.query().setDeleteFlag_Equal(false);
        });
        return mHolidayEntity;
    }

    /**
     * 営業日の設定を行う．
     *
     * @param mWorkingDayDeffDto dto
     * @param mWorkingDayDetailDeffDtoList dtoList
     * @return 営業日マスタのentityリスト
     * @throws RecordNotFoundException レコード取得エラー
     * @throws OverlapTimeIntervalException 時間帯重複エラー
     */
    public List<MWorkingDay> store(MWorkingDayDeffDto mWorkingDayDeffDto, List<MWorkingDayDetailDeffDto> mWorkingDayDetailDeffDtoList)
            throws RecordNotFoundException, OverlapTimeIntervalException{

      //営業日定義マスタ登録処理
        MWorkingDayDeff mWorkingDayDeffEntity = storeMWorkingDayDeff(mWorkingDayDeffDto);

      //営業日詳細定義マスタ登録処理
        storeMWorkingDayDetailDeff(mWorkingDayDetailDeffDtoList, mWorkingDayDeffEntity.getMWorkingDayDeffId());

        //営業日マスタ登録処理
        mWorkingDayDeffDto.setmWorkingDayDeffId(mWorkingDayDeffEntity.getMWorkingDayDeffId());
        List<MWorkingDay> MWorkingDayEntityList = storeMWorkingDay(mWorkingDayDeffDto);

        return MWorkingDayEntityList;
    }


    /**
     * 営業日定義マスタの登録処理を行う．
     *
     * @param dto MWorkingDayDeffDto
     * @return
     * @throws RecordNotFoundException レコード取得エラー
     */
    public MWorkingDayDeff storeMWorkingDayDeff(MWorkingDayDeffDto dto) throws RecordNotFoundException {

        //対象の店舗IDが店舗マスタに存在するかチェック。
        OptionalEntity<MShop> mShopEntity = findMShopEntity(dto.getShopId());

        if(!mShopEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"店舗マスタ", dto.getShopId()});
            throw new RecordNotFoundException("MShop", dto.getShopId());
        }

      //対象の設定開始日が営業日定義マスタに存在するかチェック。
        OptionalEntity<MWorkingDayDeff> mWorkingDayDeffSameDayCheckEntity = mWorkingDayDeffBhv.selectEntity(cb ->{
            cb.query().setShopId_Equal(dto.getShopId());
            cb.query().setStartDay_Equal(dto.getStartDay());
            cb.query().setDeleteFlag_Equal(false);
        });

        if(mWorkingDayDeffSameDayCheckEntity.isPresent()){
            // 同日のテーブル情報があれば、データを削除。
            MWorkingDayDeff mWorkingDayDeffSameDayEntity = mWorkingDayDeffSameDayCheckEntity.get();
            mWorkingDayDeffSameDayEntity.setDeleteFlag(true);
            mWorkingDayDeffBhv.update(mWorkingDayDeffSameDayEntity);
        }

        // 次の営業日定義IDを取得する。
        Integer mWorkingDayDeffId = mWorkingDayDeffBhv.selectNextVal();
        MWorkingDayDeff mWorkingDayDeffEntity = new MWorkingDayDeff();

        // 入力情報をDBに挿入する。
        BeanUtils.copyProperties(dto, mWorkingDayDeffEntity);
        mWorkingDayDeffEntity.setMWorkingDayDeffId(mWorkingDayDeffId);

        mWorkingDayDeffBhv.insert(mWorkingDayDeffEntity);
        loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"営業日定義マスタ", mWorkingDayDeffId});


        return mWorkingDayDeffEntity;
    }

    /**
     * 営業日詳細定義マスタの登録処理を行う．
     *
     * @param dtoList MWorkingDayDetailDeffDtoList
     * @return MWorkingDayDetailDeffEntityList
     * @throws RecordNotFoundException レコード取得エラー
     */
    public List<MWorkingDayDetailDeff> storeMWorkingDayDetailDeff(List<MWorkingDayDetailDeffDto> dtoList, Integer mWorkingDayDeffId) throws RecordNotFoundException {

        //対象の営業日定義IDが営業日定義マスタに存在するかチェック。
        OptionalEntity<MWorkingDayDeff> mWorkingDayDeffEntity = mWorkingDayDeffBhv.selectEntity(cb ->{
            cb.query().setMWorkingDayDeffId_Equal(mWorkingDayDeffId);
            cb.query().setDeleteFlag_Equal(false);
        });

        if(!mWorkingDayDeffEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"営業日定義マスタ", mWorkingDayDeffId});
            throw new RecordNotFoundException("MWorkingDayDeff", mWorkingDayDeffId);
        }

        List<MWorkingDayDetailDeff> entityList = new ArrayList<MWorkingDayDetailDeff>();

        for(MWorkingDayDetailDeffDto dto : dtoList){
            // 次の営業日詳細定義IDを取得する。
            Integer workingDayDetailDeffId = mWorkingDayDetailDeffBhv.selectNextVal();
            MWorkingDayDetailDeff mWorkingDayDetailDeffEntity = new MWorkingDayDetailDeff();

            BeanUtils.copyProperties(dto, mWorkingDayDetailDeffEntity);
            mWorkingDayDetailDeffEntity.setWorkingDayDetailDeffId(workingDayDetailDeffId);
            mWorkingDayDetailDeffEntity.setMWorkingDayDeffId(mWorkingDayDeffId);

            entityList.add(mWorkingDayDetailDeffEntity);
        }

        // 入力情報をDBに挿入する。
        mWorkingDayDetailDeffBhv.batchInsert(entityList);
        loggerService.outLog(LogMessageKeyConstants.Info.I_99_0005, new Object[]{"営業日詳細定義マスタ", dtoList.size()});

        return entityList;
    }


    /**
     * 営業日マスタの登録処理を行う．
     *
     * @param dto MWorkingDayDeffDto
     * @return MWorkingDayのentityリスト
     * @throws RecordNotFoundException レコード取得エラー
     * @throws OverlapTimeIntervalException 時間帯重複エラー
     */
    public List<MWorkingDay> storeMWorkingDay(MWorkingDayDeffDto dto) throws RecordNotFoundException, OverlapTimeIntervalException {

      //対象の店舗IDが店舗マスタに存在するかチェック。
        OptionalEntity<MShop> mShopEntity = findMShopEntity(dto.getShopId());

        if(!mShopEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"店舗マスタ", dto.getShopId()});
            throw new RecordNotFoundException("MShop", dto.getShopId());
        }

        //対象の営業日定義マスタが存在するかチェック。(営業日定義Idで検索)
        OptionalEntity<MWorkingDayDeff> mWorkingDayDeffPreEntity = mWorkingDayDeffBhv.selectEntity(cb ->{
            cb.query().setMWorkingDayDeffId_Equal(dto.getmWorkingDayDeffId());
            cb.query().setDeleteFlag_Equal(false);
        });

        if(!mWorkingDayDeffPreEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"営業日定義マスタ", dto.getmWorkingDayDeffId()});
            throw new RecordNotFoundException("MWorkingDayDeff", dto.getmWorkingDayDeffId());
        }

        //営業日定義マスタのEntity取得
        MWorkingDayDeff mWorkingDayDeffEntity = mWorkingDayDeffPreEntity.get();


        //対象の営業日詳細定義マスタが存在するかチェック。(営業日定義Idで検索)
        ListResultBean<MWorkingDayDetailDeff> mWorkingDayDetailDeffSelectList = mWorkingDayDetailDeffBhv.selectList(cb ->{
            cb.query().setMWorkingDayDeffId_Equal(mWorkingDayDeffEntity.getMWorkingDayDeffId());
            cb.query().setDeleteFlag_Equal(false);
            cb.query().addOrderBy_WorkingDayFlg_Asc(); //営業Flagがfalseのレコードからチェックする。
            cb.query().addOrderBy_WorkingDayDetailDeffId_Asc();
        });

        if(CollectionUtils.isEmpty(mWorkingDayDetailDeffSelectList)){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0002, new Object[]{"営業日詳細定義マスタ"});
            throw new RecordNotFoundException("MWorkingDayDetailDeff", dto.getShopId());
        }


        //営業日マスタからレコードを削除する。
        ListResultBean<MWorkingDay> mWorkingDayDeleteList = mWorkingDayBhv.selectList(cb ->{
            cb.query().setShopId_Equal(dto.getShopId());
            cb.query().setWorkingDate_GreaterEqual(mWorkingDayDeffEntity.getStartDay());
            cb.query().setDeleteFlag_Equal(false);
        });
        //一括削除
        mWorkingDayBhv.batchDelete(mWorkingDayDeleteList);


        List<MWorkingDay> mWorkingDayStoreList = new ArrayList<MWorkingDay>();
        List<LocalDate> shopHolidayList = new ArrayList<LocalDate>();

        for(MWorkingDayDetailDeff mWorkingDayDetailDeff :mWorkingDayDetailDeffSelectList){

            if(!mWorkingDayDetailDeff.getEffectiveFlag()){
                //適応Flagがfalseであれば、スキップ。
                continue;
            }

            List<Boolean> weekFlagList = new ArrayList<Boolean>();
            weekFlagList.add(mWorkingDayDetailDeff.getWeek1Flag());
            weekFlagList.add(mWorkingDayDetailDeff.getWeek2Flag());
            weekFlagList.add(mWorkingDayDetailDeff.getWeek3Flag());
            weekFlagList.add(mWorkingDayDetailDeff.getWeek4Flag());
            weekFlagList.add(mWorkingDayDetailDeff.getWeek5Flag());

            LocalDate InputStartDay = mWorkingDayDeffEntity.getStartDay();
            LocalDate CheckLimitDay = MonthUtil.getEndDayOfTheAfterManyMonths(InputStartDay, SystemCodeConstants.WOKING_STORE_MONTHS_NUM);

            //設定開始日から、xヵ月後の月末日まで繰り返し
            for(LocalDate date = InputStartDay; date.isBefore(CheckLimitDay) || date.isEqual(CheckLimitDay); date = date.plusDays(1)){

                if(shopHolidayList.contains(date)){
                    //休業日と一致すれば、対象日をスキップ。
                    continue;
                }

                MWorkingDay mWorkingDayEntity = new MWorkingDay();

                createMWorkingDay(mWorkingDayEntity, mWorkingDayDetailDeff, date, mWorkingDayStoreList, shopHolidayList, weekFlagList);

                if(mWorkingDayEntity.getWorkingDate() != null){
                    //日付以外のカラムの値をセットする。
                    Integer workingDayId = mWorkingDayBhv.selectNextVal();
                    mWorkingDayEntity.setWorkingDayId(workingDayId);
                    mWorkingDayEntity.setShopId(dto.getShopId());
                    mWorkingDayEntity.setStartTime(mWorkingDayDetailDeff.getStartTime());
                    mWorkingDayEntity.setEndTime(mWorkingDayDetailDeff.getEndTime());

                    //同営業日で時間帯重複チェック.
                    checkOverlapTimeInterval(mWorkingDayEntity, mWorkingDayStoreList);
                    mWorkingDayStoreList.add(mWorkingDayEntity);
                }
            }
        }

        if(mWorkingDayStoreList.size() > 0){
            // entityリストに情報がある場合、営業日情報をDBに一括挿入する。
            mWorkingDayBhv.batchInsert(mWorkingDayStoreList);
            loggerService.outLog(LogMessageKeyConstants.Info.I_99_0005, new Object[]{"営業日マスタ", mWorkingDayStoreList.size()});
        }

        return mWorkingDayStoreList;
    }


    /**
     * 営業日詳細マスタの条件に一致する日付を営業日にセットする。
     *
     * @param mWorkingDayEntity 営業日マスタentity
     * @param mWorkingDayDetailDeff 営業日詳細マスタentity
     * @param date 日付
     * @param mWorkingDayStoreList 営業日登録リスト
     * @param shopHolidayList 休日リスト
     * @param weekFlagList 第ｘ週Flagのbooleanリスト
     */
    private void createMWorkingDay(MWorkingDay mWorkingDayEntity, MWorkingDayDetailDeff mWorkingDayDetailDeff,
            LocalDate date, List<MWorkingDay> mWorkingDayStoreList, List<LocalDate> shopHolidayList, List<Boolean> weekFlagList) {

      //指定日//
        if(mWorkingDayDetailDeff.getSpecifiedDay() != null){
            //指定日が入力されている場合
            if(date.isEqual(mWorkingDayDetailDeff.getSpecifiedDay())){
                //指定日と一致した場合
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }

        //毎月指定日//
        if(mWorkingDayDetailDeff.getDayOfMonth() != null){
            //毎月指定日が入力されている場合
            if(date.getDayOfMonth() == mWorkingDayDetailDeff.getDayOfMonth()){
                //毎月指定日と一致した場合
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }

        //祝日Flag//
        if(mWorkingDayDetailDeff.getHolidayFlg()){
            //祝日Flagがtrueの場合、祝日マスタの日付と照会する。
            OptionalEntity<MHoliday> mHolidayEntity = findHoliday(date);

            if(mHolidayEntity.isPresent()){
                //祝日日と一致した場合
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }

        //第ｘ週Flag//
        for(int i = 0; i < weekFlagList.size(); i++){
            if(weekFlagList.get(i)){
              //第x週目の指定曜日と一致した場合
                checkDayOfWeekInMonth(mWorkingDayDetailDeff, mWorkingDayEntity, date, (i+1), shopHolidayList);

                if(mWorkingDayEntity.getWorkingDate() != null){
                    //営業日がセットされている場合
                    return;

                }else if(shopHolidayList.contains(date)){
                  //休日リストに対象日がセットされている場合
                    return;
                }
            }
        }

        //曜日Flag//
        if(!weekFlagList.contains(true)){
            //第x週目のいずれも設定されていない、かつ、指定曜日と一致した場合
            checkDayOfWeekInMonth(mWorkingDayDetailDeff, mWorkingDayEntity, date, 0, shopHolidayList);

            if(mWorkingDayEntity.getWorkingDate() != null){

                //営業Flagがtrueの場合、entityに日付をセット。
                mWorkingDayEntity.setWorkingDate(date);
                return;

            }else if(shopHolidayList.contains(date)){
                return;
            }
        }
    }

    /**
     * 第x週目の指定曜日と一致すれば、entityにdateをセットする。
     *
     * @param mWorkingDayDetailDeff mWorkingDayDetailDeffEntity
     * @param mWorkingDayEntity mWorkingDayEntity
     * @param date 日付
     * @param weekIndex 第x週目
     * @param shopHolidayList 休日リスト
     */
    private void checkDayOfWeekInMonth(MWorkingDayDetailDeff mWorkingDayDetailDeff, MWorkingDay mWorkingDayEntity,
            LocalDate date, int weekIndex, List<LocalDate> shopHolidayList) {

        if (mWorkingDayDetailDeff.getSunFlg()) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.SUNDAY)){
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }

        if (mWorkingDayDetailDeff.getMonFlg()) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.MONDAY)){
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }

        if (mWorkingDayDetailDeff.getTueFlg()) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.TUESDAY)){
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }

        if (mWorkingDayDetailDeff.getWebFlg()) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.WEDNESDAY)){
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }

        if (mWorkingDayDetailDeff.getThuFlg()) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.THURSDAY)){
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }

        if (mWorkingDayDetailDeff.getFriFlg()) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.FRIDAY)){
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }

        if (mWorkingDayDetailDeff.getSatFlg()) {
            if(MonthUtil.isValidDayOfWeekInMonth(date, weekIndex, Calendar.SATURDAY)){
                if(mWorkingDayDetailDeff.getWorkingDayFlg()){
                    //営業Flagがtrueの場合、entityに日付をセット。
                    mWorkingDayEntity.setWorkingDate(date);
                    return;

                }else{
                    //営業Flagがfalseの場合、休日リストに日付をセット。
                    shopHolidayList.add(date);
                    return;
                }
            }
        }
    }

    /**
     * 同営業日で時間帯の重複がないかをチェックする。
     *
     * @param mWorkingDayEntity mWorkingDayEntity
     * @param mWorkingDayStoreList 営業日マスタ登録リスト
     * @throws OverlapTimeIntervalException 時間帯重複エラー：入力画面再描写へ
     */
    private void checkOverlapTimeInterval(MWorkingDay mWorkingDayEntity, List<MWorkingDay> mWorkingDayStoreList)
            throws OverlapTimeIntervalException{

        if(mWorkingDayStoreList.size() == 0){
            return;
        }

        for(MWorkingDay targetEntity : mWorkingDayStoreList){
            if((targetEntity.getWorkingDate()).isEqual(mWorkingDayEntity.getWorkingDate())){
                //登録リストに、すでに同じ日がセットされている場合
                if((mWorkingDayEntity.getStartTime()).equals(targetEntity.getStartTime())
                        || (mWorkingDayEntity.getEndTime()).equals(targetEntity.getEndTime())){
                    //開始時間または終了時間が同じであれば、入力エラーとする。
                    loggerService.outLog(LogMessageKeyConstants.Error.E_99_0001, new Object[]{targetEntity.getWorkingDate()});
                    throw new OverlapTimeIntervalException();

                }
                if((mWorkingDayEntity.getStartTime()).isBefore(targetEntity.getEndTime())
                        || mWorkingDayEntity.getEndTime().isAfter(targetEntity.getStartTime())){
                    //mWorkingDayEntityの開始時間がtargetEntityの終了時間より前である、または
                    //mWorkingDayEntityの終了時間がtargetEntityの開始時間より後である場合、入力エラーとする。
                    loggerService.outLog(LogMessageKeyConstants.Error.E_99_0001, new Object[]{targetEntity.getWorkingDate()});
                    throw new OverlapTimeIntervalException();
                }
            }
        }
    }

    /**
     * 毎月指定日選択のプルダウン
     * @return dateList
     */
    public List<LabelValueDto> datePullDown(boolean hasBrank) {

        List<LabelValueDto> dateList = new ArrayList<LabelValueDto>();
        LabelValueDto dto;

        if (hasBrank) {
            //プルダウンの最初のメッセージをセット。
            dto = new LabelValueDto();
            dto.setValue("");
            dto.setLabel(SystemCodeConstants.PLEASE_SELECT_MSG);
            dateList.add(dto);
        }

        dto = new LabelValueDto();
        dto.setLabel("月末");
        dto.setValue("0");
        dateList.add(dto);

        for (int i = 1; i <= 31; i++) {
            dto = new LabelValueDto();
            dto.setLabel(String.valueOf(i));
            dto.setValue(i);
            dateList.add(dto);
        }

        return dateList;
    }

}
