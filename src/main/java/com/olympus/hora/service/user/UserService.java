package com.olympus.hora.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.hora.dbflute.exbhv.MUserBhv;
import com.olympus.hora.dbflute.exentity.MUser;
import com.olympus.hora.dto.user.MUserDto;
import com.olympus.hora.service.LoggerService;

/**
 * ユーザ情報のサービスクラス
 * @author majo_k
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    MUserBhv userBhv;

    @Autowired
    LoggerService loggerService;

    /**
     * ユーザ登録
     * @param dto DTO
     */
    public void registerUser(MUserDto dto) {
        int newId = userBhv.selectNextVal();
        userBhv.insert(toEntity(newId, dto));
    }

    /**
     * DTOをエンティティに変換
     * @param id ID
     * @param dto DTO
     * @return エンティティ
     */
    public static MUser toEntity(int id, MUserDto dto) {
        MUser entity = new MUser();
        entity.setUserId(id);
        entity.setFamilyName(dto.getFamilyName());
        entity.setGivenName(dto.getGivenName());
        entity.setFamilyNameKana(dto.getFamilyNameKana());
        entity.setGivenNameKana(dto.getGivenNameKana());
        entity.setSex(dto.getSex());
        entity.setBirthday(dto.getBirthday());
        entity.setPhoneFirst1(dto.getPhoneFirst1());
        entity.setPhoneFirst2(dto.getPhoneFirst2());
        entity.setPhoneFirst3(dto.getPhoneFirst3());
        entity.setPhoneSecond1(dto.getPhoneSecond1());
        entity.setPhoneSecond2(dto.getPhoneSecond2());
        entity.setPhoneSecond3(dto.getPhoneSecond3());
        entity.setEmail1(dto.getEmail1());
        entity.setPostalCode(dto.getPostalCode());
        entity.setPrefecture(dto.getPrefecture());
        entity.setCity(dto.getCity());
        entity.setAddress1(dto.getAddress1());
        entity.setAddress2(dto.getAddress2());
        entity.setRemarks(dto.getRemarks());
        entity.setDeleteFlag(dto.getDeleteFlag());
        return entity;
    }
}
