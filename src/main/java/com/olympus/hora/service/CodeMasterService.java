package com.olympus.hora.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.hora.Exception.RecordNotFoundException;
import com.olympus.hora.constants.SystemCodeConstants;
import com.olympus.hora.constants.code.CodeGroup;
import com.olympus.hora.dbflute.cbean.MCodeCB;
import com.olympus.hora.dbflute.exbhv.MCodeBhv;
import com.olympus.hora.dbflute.exentity.MCode;
import com.olympus.hora.dto.CodeDto;

/**
 * コードマスタ操作用サービスクラス
 * @author majo_k
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CodeMasterService {

    @Autowired
    MCodeBhv mCodeBhv;

    /**
     * コードグループに紐づくコード・名称リストを取得
     * @return コードリスト
     * @throws RecordNotFoundException
     */
    public List<CodeDto> searchPulldown(CodeGroup codeGroup, boolean hasBlank) throws RecordNotFoundException{
        MCodeCB cb = new MCodeCB();
        cb.query().setGroupCode_Equal(codeGroup.groupCode());
        cb.query().addOrderBy_Code1_Asc();
        List<MCode> codeList = mCodeBhv.readList(cb);
        if (codeList.size() == 0)
            throw new RecordNotFoundException("group code: " + codeGroup.groupCode() + " has not any codes.");

        List<CodeDto> pulldown = toDtoList(codeList);
        if (hasBlank) pulldown.add(0, new CodeDto());
        return pulldown;
    }

    private static List<CodeDto> toDtoList(List<MCode> codeList) {
        return codeList.stream().map(CodeMasterService::toDto).collect(Collectors.toList());
    }
    private static CodeDto toDto(MCode entity) {
        CodeDto dto = new CodeDto();
        dto.setCodeId(entity.getCodeId().toString());
        dto.setGroupCode(entity.getGroupCode().toString());
        dto.setCode1(entity.getCode1().toString());
        if (entity.getCode2() != null)
            dto.setCode2(entity.getCode2().toString());
        if (entity.getDeleteFlag() != null)
            dto.setDeleteFlag(SystemCodeConstants.Flag.getFlagByBooleanValue(entity.getDeleteFlag())
                    .orElseThrow(IllegalStateException::new).string());
        dto.setName(entity.getName());
        if (entity.getVersionNo() != null)
            dto.setVersionNo(entity.getVersionNo());
        return dto;
    }
}
