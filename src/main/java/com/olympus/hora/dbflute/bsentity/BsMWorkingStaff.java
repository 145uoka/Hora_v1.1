package com.olympus.hora.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.olympus.hora.dbflute.allcommon.EntityDefinedCommonColumn;
import com.olympus.hora.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The entity of m_working_staff as TABLE. <br>
 * 所属スタッフマスタ
 * <pre>
 * [primary-key]
 *     working_staff_id
 *
 * [column]
 *     working_staff_id, shop_id, staff_id, delete_flag, version_no, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_staff_working_staff_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     m_shop, m_staff
 *
 * [referrer table]
 *     t_reservation, t_shift
 *
 * [foreign property]
 *     mShop, mStaff
 *
 * [referrer property]
 *     tReservationList, tShiftList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer workingStaffId = entity.getWorkingStaffId();
 * Integer shopId = entity.getShopId();
 * Integer staffId = entity.getStaffId();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * Integer versionNo = entity.getVersionNo();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setWorkingStaffId(workingStaffId);
 * entity.setShopId(shopId);
 * entity.setStaffId(staffId);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setVersionNo(versionNo);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMWorkingStaff extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** working_staff_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _workingStaffId;

    /** shop_id: {int4(10), FK to m_shop} */
    protected Integer _shopId;

    /** staff_id: {int4(10), FK to m_staff} */
    protected Integer _staffId;

    /** delete_flag: {NotNull, bool(1), default=[false]} */
    protected Boolean _deleteFlag;

    /** version_no: {NotNull, int4(10), default=[1]} */
    protected Integer _versionNo;

    /** register_datetime: {NotNull, timestamp(26, 3), default=[now()]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** update_datetime: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "m_working_staff";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_workingStaffId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** m_shop by my shop_id, named 'MShop'. */
    protected OptionalEntity<MShop> _mShop;

    /**
     * [get] m_shop by my shop_id, named 'MShop'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'MShop'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MShop> getMShop() {
        if (_mShop == null) { _mShop = OptionalEntity.relationEmpty(this, "MShop"); }
        return _mShop;
    }

    /**
     * [set] m_shop by my shop_id, named 'MShop'.
     * @param mShop The entity of foreign property 'MShop'. (NullAllowed)
     */
    public void setMShop(OptionalEntity<MShop> mShop) {
        _mShop = mShop;
    }

    /** m_staff by my staff_id, named 'MStaff'. */
    protected OptionalEntity<MStaff> _mStaff;

    /**
     * [get] m_staff by my staff_id, named 'MStaff'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'MStaff'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MStaff> getMStaff() {
        if (_mStaff == null) { _mStaff = OptionalEntity.relationEmpty(this, "MStaff"); }
        return _mStaff;
    }

    /**
     * [set] m_staff by my staff_id, named 'MStaff'.
     * @param mStaff The entity of foreign property 'MStaff'. (NullAllowed)
     */
    public void setMStaff(OptionalEntity<MStaff> mStaff) {
        _mStaff = mStaff;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_reservation by working_staff_id, named 'TReservationList'. */
    protected List<TReservation> _tReservationList;

    /**
     * [get] t_reservation by working_staff_id, named 'TReservationList'.
     * @return The entity list of referrer property 'TReservationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TReservation> getTReservationList() {
        if (_tReservationList == null) { _tReservationList = newReferrerList(); }
        return _tReservationList;
    }

    /**
     * [set] t_reservation by working_staff_id, named 'TReservationList'.
     * @param tReservationList The entity list of referrer property 'TReservationList'. (NullAllowed)
     */
    public void setTReservationList(List<TReservation> tReservationList) {
        _tReservationList = tReservationList;
    }

    /** t_shift by working_staff_id, named 'TShiftList'. */
    protected List<TShift> _tShiftList;

    /**
     * [get] t_shift by working_staff_id, named 'TShiftList'.
     * @return The entity list of referrer property 'TShiftList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShift> getTShiftList() {
        if (_tShiftList == null) { _tShiftList = newReferrerList(); }
        return _tShiftList;
    }

    /**
     * [set] t_shift by working_staff_id, named 'TShiftList'.
     * @param tShiftList The entity list of referrer property 'TShiftList'. (NullAllowed)
     */
    public void setTShiftList(List<TShift> tShiftList) {
        _tShiftList = tShiftList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMWorkingStaff) {
            BsMWorkingStaff other = (BsMWorkingStaff)obj;
            if (!xSV(_workingStaffId, other._workingStaffId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _workingStaffId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mShop != null && _mShop.isPresent())
        { sb.append(li).append(xbRDS(_mShop, "mShop")); }
        if (_mStaff != null && _mStaff.isPresent())
        { sb.append(li).append(xbRDS(_mStaff, "mStaff")); }
        if (_tReservationList != null) { for (TReservation et : _tReservationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tReservationList")); } } }
        if (_tShiftList != null) { for (TShift et : _tShiftList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShiftList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_workingStaffId));
        sb.append(dm).append(xfND(_shopId));
        sb.append(dm).append(xfND(_staffId));
        sb.append(dm).append(xfND(_deleteFlag));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mShop != null && _mShop.isPresent())
        { sb.append(dm).append("mShop"); }
        if (_mStaff != null && _mStaff.isPresent())
        { sb.append(dm).append("mStaff"); }
        if (_tReservationList != null && !_tReservationList.isEmpty())
        { sb.append(dm).append("tReservationList"); }
        if (_tShiftList != null && !_tShiftList.isEmpty())
        { sb.append(dm).append("tShiftList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MWorkingStaff clone() {
        return (MWorkingStaff)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] working_staff_id: {PK, ID, NotNull, serial(10)} <br>
     * 所属スタッフID : 所属スタッフID
     * @return The value of the column 'working_staff_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWorkingStaffId() {
        checkSpecifiedProperty("workingStaffId");
        return _workingStaffId;
    }

    /**
     * [set] working_staff_id: {PK, ID, NotNull, serial(10)} <br>
     * 所属スタッフID : 所属スタッフID
     * @param workingStaffId The value of the column 'working_staff_id'. (basically NotNull if update: for the constraint)
     */
    public void setWorkingStaffId(Integer workingStaffId) {
        registerModifiedProperty("workingStaffId");
        _workingStaffId = workingStaffId;
    }

    /**
     * [get] shop_id: {int4(10), FK to m_shop} <br>
     * 店舗ID : 店舗ID
     * @return The value of the column 'shop_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getShopId() {
        checkSpecifiedProperty("shopId");
        return _shopId;
    }

    /**
     * [set] shop_id: {int4(10), FK to m_shop} <br>
     * 店舗ID : 店舗ID
     * @param shopId The value of the column 'shop_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShopId(Integer shopId) {
        registerModifiedProperty("shopId");
        _shopId = shopId;
    }

    /**
     * [get] staff_id: {int4(10), FK to m_staff} <br>
     * スタッフID : スタッフID
     * @return The value of the column 'staff_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getStaffId() {
        checkSpecifiedProperty("staffId");
        return _staffId;
    }

    /**
     * [set] staff_id: {int4(10), FK to m_staff} <br>
     * スタッフID : スタッフID
     * @param staffId The value of the column 'staff_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStaffId(Integer staffId) {
        registerModifiedProperty("staffId");
        _staffId = staffId;
    }

    /**
     * [get] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * 削除フラグ
     * @return The value of the column 'delete_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDeleteFlag() {
        checkSpecifiedProperty("deleteFlag");
        return _deleteFlag;
    }

    /**
     * [set] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * 削除フラグ
     * @param deleteFlag The value of the column 'delete_flag'. (basically NotNull if update: for the constraint)
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        registerModifiedProperty("deleteFlag");
        _deleteFlag = deleteFlag;
    }

    /**
     * [get] version_no: {NotNull, int4(10), default=[1]} <br>
     * version_no
     * @return The value of the column 'version_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] version_no: {NotNull, int4(10), default=[1]} <br>
     * version_no
     * @param versionNo The value of the column 'version_no'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * 登録日時
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * 登録日時
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] update_datetime: {timestamp(26, 3)} <br>
     * 更新日時
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {timestamp(26, 3)} <br>
     * 更新日時
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }
}
