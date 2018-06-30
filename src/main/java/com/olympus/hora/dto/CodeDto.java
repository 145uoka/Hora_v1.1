package  com.olympus.hora.dto;

import java.io.Serializable;

/**
 * コード・名称DTO。
 *
 * @author majo_k
 * $Id:$
 */
public class CodeDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** コードID */
    private String codeId;

    /** グループコード */
    private String groupCode;

    /** コード1 */
    private String code1;

    /** コード2 */
    private String code2;

    /** 名称 */
    private String name;

    /** 削除フラグ */
    private String deleteFlag;

    /** バージョンNo. */
    private int versionNo;

    /**
     * コードIDの取得。
     *
     * @return コードID
     */
    public String getCodeId() {
        return this.codeId;
    }

    /**
     * コードIDを設定。
     *
     * @param codeId コードID
     */
    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    /**
     * グループコードの取得。
     *
     * @return グループコード
     */
    public String getGroupCode() {
        return this.groupCode;
    }

    /**
     * グループコードを設定。
     *
     * @param groupCode グループコード
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * コード1の取得。
     *
     * @return コード1
     */
    public String getCode1() {
        return this.code1;
    }

    /**
     * コード1を設定。
     *
     * @param code1 コード1
     */
    public void setCode1(String code1) {
        this.code1 = code1;
    }

    /**
     * コード2の取得。
     *
     * @return コード2
     */
    public String getCode2() {
        return this.code2;
    }

    /**
     * コード2を設定。
     *
     * @param code2 コード2
     */
    public void setCode2(String code2) {
        this.code2 = code2;
    }

    /**
     * 名称の取得。
     *
     * @return 名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 名称を設定。
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 削除フラグの取得。
     *
     * @return 削除フラグ
     */
    public String getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * 削除フラグを設定。
     *
     * @param deleteFlag 削除フラグ
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * バージョンNo.の取得。
     *
     * @return バージョンNo.
     */
    public int getVersionNo() {
        return this.versionNo;
    }

    /**
     * バージョンNo.を設定。
     *
     * @param versionNo バージョンNo.
     */
    public void setVersionNo(int versionNo) {
        this.versionNo = versionNo;
    }

}
