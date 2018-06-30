package  com.olympus.hora.form.user;

import java.io.Serializable;
import java.util.List;

import com.olympus.hora.dbflute.exentity.MCode;

/**
 * ユーザ情報登録画面フォーム。
 *
 * @author majo_k
 * $Id:$
 */
public class UserAddForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** 姓 */
    private String familyName;

    /** 名 */
    private String givenName;

    /** 姓（カナ） */
    private String familyNameKana;

    /** 名（カナ） */
    private String givenNameKana;

    /** 性別 */
    private String sex;

    /** 性別プルダウン */
    private List<MCode> sexList;

    /** 生年月日 */
    private String birthday;

    /** 電話番号1_1 */
    private String phone1_1;

    /** 電話番号1_2 */
    private String phone1_2;

    /** 電話番号1_3 */
    private String phone1_3;

    /** 電話番号2_1 */
    private String phone2_1;

    /** 電話番号2_2 */
    private String phone2_2;

    /** 電話番号2_3 */
    private String phone2_3;

    /** メールアドレス1 */
    private String email1;

    /** メールアドレス2 */
    private String email2;

    /** 郵便番号 */
    private String postalCode;

    /** 都道府県 */
    private String prefecture;

    /** 都道府県プルダウン */
    private List<MCode> prefectureList;

    /** 市区町村 */
    private String city;

    /** その他住所1 */
    private String address1;

    /** その他住所2 */
    private String address2;

    /** 備考 */
    private String remarks;

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
    public String getSex() {
        return this.sex;
    }

    /**
     * 性別を設定。
     *
     * @param sex 性別
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 生年月日の取得。
     *
     * @return 生年月日
     */
    public String getBirthday() {
        return this.birthday;
    }

    /**
     * 生年月日を設定。
     *
     * @param birthday 生年月日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 電話番号1_1の取得。
     *
     * @return 電話番号1_1
     */
    public String getPhone1_1() {
        return this.phone1_1;
    }

    /**
     * 電話番号1_1を設定。
     *
     * @param phone1_1 電話番号1_1
     */
    public void setPhone1_1(String phone1_1) {
        this.phone1_1 = phone1_1;
    }

    /**
     * 電話番号1_2の取得。
     *
     * @return 電話番号1_2
     */
    public String getPhone1_2() {
        return this.phone1_2;
    }

    /**
     * 電話番号1_2を設定。
     *
     * @param phone1_2 電話番号1_2
     */
    public void setPhone1_2(String phone1_2) {
        this.phone1_2 = phone1_2;
    }

    /**
     * 電話番号1_3の取得。
     *
     * @return 電話番号1_3
     */
    public String getPhone1_3() {
        return this.phone1_3;
    }

    /**
     * 電話番号1_3を設定。
     *
     * @param phone1_3 電話番号1_3
     */
    public void setPhone1_3(String phone1_3) {
        this.phone1_3 = phone1_3;
    }

    /**
     * 電話番号2_1の取得。
     *
     * @return 電話番号2_1
     */
    public String getPhone2_1() {
        return this.phone2_1;
    }

    /**
     * 電話番号2_1を設定。
     *
     * @param phone2_1 電話番号2_1
     */
    public void setPhone2_1(String phone2_1) {
        this.phone2_1 = phone2_1;
    }

    /**
     * 電話番号2_2の取得。
     *
     * @return 電話番号2_2
     */
    public String getPhone2_2() {
        return this.phone2_2;
    }

    /**
     * 電話番号2_2を設定。
     *
     * @param phone2_2 電話番号2_2
     */
    public void setPhone2_2(String phone2_2) {
        this.phone2_2 = phone2_2;
    }

    /**
     * 電話番号2_3の取得。
     *
     * @return 電話番号2_3
     */
    public String getPhone2_3() {
        return this.phone2_3;
    }

    /**
     * 電話番号2_3を設定。
     *
     * @param phone2_3 電話番号2_3
     */
    public void setPhone2_3(String phone2_3) {
        this.phone2_3 = phone2_3;
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
    public String getPrefecture() {
        return this.prefecture;
    }

    /**
     * 都道府県を設定。
     *
     * @param prefecture 都道府県
     */
    public void setPrefecture(String prefecture) {
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

    public List<MCode> getSexList() {
        return sexList;
    }

    public void setSexList(List<MCode> sexList) {
        this.sexList = sexList;
    }

    public List<MCode> getPrefectureList() {
        return prefectureList;
    }

    public void setPrefectureList(List<MCode> prefectureList) {
        this.prefectureList = prefectureList;
    }

}
