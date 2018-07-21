package  com.olympus.hora.dto.user;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * ユーザマスタDTO。
 *
 * @author majo_k
 * $Id:$
 */
public class MUserDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** ユーザID */
    private Integer userId;

    /** 姓 */
    private String familyName;

    /** 名 */
    private String givenName;

    /** 姓（カナ） */
    private String familyNameKana;

    /** 名（カナ） */
    private String givenNameKana;

    /** 性別 */
    private Integer sex;

    /** 生年月日 */
    private LocalDate birthday;

    /** 電話番号1_1 */
    private String phoneFirst1;

    /** 電話番号1_2 */
    private String phoneFirst2;

    /** 電話番号1_3 */
    private String phoneFirst3;

    /** 電話番号2_1 */
    private String phoneSecond1;

    /** 電話番号2_2 */
    private String phoneSecond2;

    /** 電話番号2_3 */
    private String phoneSecond3;

    /** メールアドレス1 */
    private String email1;

    /** メールアドレス2 */
    private String email2;

    /** 郵便番号 */
    private String postalCode;

    /** 都道府県 */
    private Integer prefecture;

    /** 市区町村 */
    private String city;

    /** その他住所1 */
    private String address1;

    /** その他住所2 */
    private String address2;

    /** 備考 */
    private String remarks;

    /** 削除フラグ */
    private Boolean deleteFlag;

    /** version_no */
    private Integer versionNo;

    /** 登録日時 */
    private LocalDate registerDatetime;

    /** 更新日時 */
    private LocalDate updateDatetime;

    /**
     * ユーザIDの取得。
     *
     * @return ユーザID
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * ユーザIDを設定。
     *
     * @param userId ユーザID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 姓の取得。
     *
     * @return 姓
     */
    public String getFamilyName() {
        return this.familyName;
    }

    /**
     * 姓を設定。
     *
     * @param familyName 姓
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * 名の取得。
     *
     * @return 名
     */
    public String getGivenName() {
        return this.givenName;
    }

    /**
     * 名を設定。
     *
     * @param givenName 名
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * 姓（カナ）の取得。
     *
     * @return 姓（カナ）
     */
    public String getFamilyNameKana() {
        return this.familyNameKana;
    }

    /**
     * 姓（カナ）を設定。
     *
     * @param familyNameKana 姓（カナ）
     */
    public void setFamilyNameKana(String familyNameKana) {
        this.familyNameKana = familyNameKana;
    }

    /**
     * 名（カナ）の取得。
     *
     * @return 名（カナ）
     */
    public String getGivenNameKana() {
        return this.givenNameKana;
    }

    /**
     * 名（カナ）を設定。
     *
     * @param givenNameKana 名（カナ）
     */
    public void setGivenNameKana(String givenNameKana) {
        this.givenNameKana = givenNameKana;
    }

    /**
     * 性別の取得。
     *
     * @return 性別
     */
    public Integer getSex() {
        return this.sex;
    }

    /**
     * 性別を設定。
     *
     * @param sex 性別
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 生年月日の取得。
     *
     * @return 生年月日
     */
    public LocalDate getBirthday() {
        return this.birthday;
    }

    /**
     * 生年月日を設定。
     *
     * @param birthday 生年月日
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * 電話番号1_1の取得。
     *
     * @return 電話番号1_1
     */
    public String getPhoneFirst1() {
        return this.phoneFirst1;
    }

    /**
     * 電話番号1_1を設定。
     *
     * @param phoneFirst1 電話番号1_1
     */
    public void setPhoneFirst1(String phoneFirst1) {
        this.phoneFirst1 = phoneFirst1;
    }

    /**
     * 電話番号1_2の取得。
     *
     * @return 電話番号1_2
     */
    public String getPhoneFirst2() {
        return this.phoneFirst2;
    }

    /**
     * 電話番号1_2を設定。
     *
     * @param phoneFirst2 電話番号1_2
     */
    public void setPhoneFirst2(String phoneFirst2) {
        this.phoneFirst2 = phoneFirst2;
    }

    /**
     * 電話番号1_3の取得。
     *
     * @return 電話番号1_3
     */
    public String getPhoneFirst3() {
        return this.phoneFirst3;
    }

    /**
     * 電話番号1_3を設定。
     *
     * @param phoneFirst3 電話番号1_3
     */
    public void setPhoneFirst3(String phoneFirst3) {
        this.phoneFirst3 = phoneFirst3;
    }

    /**
     * 電話番号2_1の取得。
     *
     * @return 電話番号2_1
     */
    public String getPhoneSecond1() {
        return this.phoneSecond1;
    }

    /**
     * 電話番号2_1を設定。
     *
     * @param phoneSecond1 電話番号2_1
     */
    public void setPhoneSecond1(String phoneSecond1) {
        this.phoneSecond1 = phoneSecond1;
    }

    /**
     * 電話番号2_2の取得。
     *
     * @return 電話番号2_2
     */
    public String getPhoneSecond2() {
        return this.phoneSecond2;
    }

    /**
     * 電話番号2_2を設定。
     *
     * @param phoneSecond2 電話番号2_2
     */
    public void setPhoneSecond2(String phoneSecond2) {
        this.phoneSecond2 = phoneSecond2;
    }

    /**
     * 電話番号2_3の取得。
     *
     * @return 電話番号2_3
     */
    public String getPhoneSecond3() {
        return this.phoneSecond3;
    }

    /**
     * 電話番号2_3を設定。
     *
     * @param phoneSecond3 電話番号2_3
     */
    public void setPhoneSecond3(String phoneSecond3) {
        this.phoneSecond3 = phoneSecond3;
    }

    /**
     * メールアドレス1の取得。
     *
     * @return メールアドレス1
     */
    public String getEmail1() {
        return this.email1;
    }

    /**
     * メールアドレス1を設定。
     *
     * @param email1 メールアドレス1
     */
    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    /**
     * メールアドレス2の取得。
     *
     * @return メールアドレス2
     */
    public String getEmail2() {
        return this.email2;
    }

    /**
     * メールアドレス2を設定。
     *
     * @param email2 メールアドレス2
     */
    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    /**
     * 郵便番号の取得。
     *
     * @return 郵便番号
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * 郵便番号を設定。
     *
     * @param postalCode 郵便番号
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 都道府県の取得。
     *
     * @return 都道府県
     */
    public Integer getPrefecture() {
        return this.prefecture;
    }

    /**
     * 都道府県を設定。
     *
     * @param prefecture 都道府県
     */
    public void setPrefecture(Integer prefecture) {
        this.prefecture = prefecture;
    }

    /**
     * 市区町村の取得。
     *
     * @return 市区町村
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 市区町村を設定。
     *
     * @param city 市区町村
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * その他住所1の取得。
     *
     * @return その他住所1
     */
    public String getAddress1() {
        return this.address1;
    }

    /**
     * その他住所1を設定。
     *
     * @param address1 その他住所1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * その他住所2の取得。
     *
     * @return その他住所2
     */
    public String getAddress2() {
        return this.address2;
    }

    /**
     * その他住所2を設定。
     *
     * @param address2 その他住所2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * 備考の取得。
     *
     * @return 備考
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * 備考を設定。
     *
     * @param remarks 備考
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 削除フラグの取得。
     *
     * @return 削除フラグ
     */
    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * 削除フラグを設定。
     *
     * @param deleteFlag 削除フラグ
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * version_noの取得。
     *
     * @return version_no
     */
    public Integer getVersionNo() {
        return this.versionNo;
    }

    /**
     * version_noを設定。
     *
     * @param versionNo version_no
     */
    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    /**
     * 登録日時の取得。
     *
     * @return 登録日時
     */
    public LocalDate getRegisterDatetime() {
        return this.registerDatetime;
    }

    /**
     * 登録日時を設定。
     *
     * @param registerDatetime 登録日時
     */
    public void setRegisterDatetime(LocalDate registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    /**
     * 更新日時の取得。
     *
     * @return 更新日時
     */
    public LocalDate getUpdateDatetime() {
        return this.updateDatetime;
    }

    /**
     * 更新日時を設定。
     *
     * @param updateDatetime 更新日時
     */
    public void setUpdateDatetime(LocalDate updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

}
