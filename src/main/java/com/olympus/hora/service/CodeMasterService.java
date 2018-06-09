package com.olympus.hora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.hora.Exception.RecordNotFoundException;
import com.olympus.hora.constants.code.CodeGroup;
import com.olympus.hora.dbflute.cbean.MCodeCB;
import com.olympus.hora.dbflute.exbhv.MCodeBhv;
import com.olympus.hora.dbflute.exentity.MCode;
import com.olympus.hora.form.Pulldown;

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
    public Pulldown searchPulldown(CodeGroup codeGroup) throws RecordNotFoundException{
        MCodeCB cb = new MCodeCB();
        cb.query().setGroupCode_Equal(codeGroup.code());
        cb.query().addOrderBy_Code1_Asc();
        List<MCode> codeList = mCodeBhv.readList(cb);
        if (codeList.size() == 0)
            throw new RecordNotFoundException("group code: " + codeGroup.code() + " has not any codes.");

        Pulldown pulldown = new Pulldown();
        for (MCode code : codeList) {
            Pulldown.Record record = new Pulldown.Record();
            record.setCode(code.getCode1());
            record.setName(code.getName());
        }
        return pulldown;
    }

}
