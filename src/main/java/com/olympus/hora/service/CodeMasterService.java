package com.olympus.hora.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.hora.Exception.RecordNotFoundException;
import com.olympus.hora.constants.code.CodeGroup;
import com.olympus.hora.dbflute.cbean.MCodeCB;
import com.olympus.hora.dbflute.exbhv.MCodeBhv;
import com.olympus.hora.dbflute.exentity.MCode;

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
    public List<MCode> searchPulldown(CodeGroup codeGroup, boolean hasBlank) throws RecordNotFoundException{
        MCodeCB cb = new MCodeCB();
        cb.query().setGroupCode_Equal(codeGroup.groupCode());
        cb.query().addOrderBy_Code1_Asc();
        List<MCode> codeList = mCodeBhv.readList(cb);
        if (codeList.size() == 0)
            throw new RecordNotFoundException("group code: " + codeGroup.groupCode() + " has not any codes.");

        List<MCode> pulldown = new ArrayList<MCode>();
        if (hasBlank) pulldown.add(new MCode());
        pulldown.addAll(codeList);
        return pulldown;
    }

}
