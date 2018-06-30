package com.olympus.hora.constants.code;

/**
 * コードマスタ　コードグループ
 * @author majo_k
 */
public enum CodeGroup {
    /** 性別 */
    SEX(1),
    /** 都道府県 */
    PREFECTURE(2),
    ;
    private final int groupCode;
    CodeGroup(int groupCode) {
        this.groupCode = groupCode;
    }
    /**
     * コードマスタのグループコードを返却
     * @return グループコード
     */
    public int groupCode() { return groupCode; }
}