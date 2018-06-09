package com.olympus.hora.constants.code;

public enum CodeGroup {
    SEX(1), PREFECTURE(2);
    private final int groupCode;
    private CodeGroup(int groupCode) {
        this.groupCode = groupCode;
    }
    /**
     * コードマスタのグループコードを返却
     * @return グループコード
     */
    public int code() { return groupCode; }
}
