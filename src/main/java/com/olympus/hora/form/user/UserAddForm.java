package com.olympus.hora.form.user;

import java.io.Serializable;
import java.util.List;

import com.olympus.hora.form.Pulldown;

/**
 * ユーザ情報登録画面フォーム
 * @author majo_k
 */
public class UserAddForm implements Serializable {
    private String familyName;
    private String givenName;
    private String familyNameKana;
    private String givenNameKana;
    private String sex;
    private String birthday;
    private String phone1_1;
    private String phone1_2;
    private String phone1_3;
    private String phone2_1;
    private String phone2_2;
    private String phone2_3;
    private String email1;
    private String email2;
    private String postalCode;
    private String prefecture;
    private String city;
    private String address1;
    private String address2;
    private String remarks;
    /** 性別リスト */
    private List<Pulldown> sexList;
    /** 都道府県リスト */
    private List<Pulldown> prefectureList;
    /**
     * @return familyName
     */
    public String getFamilyName() {
        return familyName;
    }
    /**
     * @param familyName セットする familyName
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    /**
     * @return givenName
     */
    public String getGivenName() {
        return givenName;
    }
    /**
     * @param givenName セットする givenName
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    /**
     * @return familyNameKana
     */
    public String getFamilyNameKana() {
        return familyNameKana;
    }
    /**
     * @param familyNameKana セットする familyNameKana
     */
    public void setFamilyNameKana(String familyNameKana) {
        this.familyNameKana = familyNameKana;
    }
    /**
     * @return givenNameKana
     */
    public String getGivenNameKana() {
        return givenNameKana;
    }
    /**
     * @param givenNameKana セットする givenNameKana
     */
    public void setGivenNameKana(String givenNameKana) {
        this.givenNameKana = givenNameKana;
    }
    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }
    /**
     * @param sex セットする sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }
    /**
     * @param birthday セットする birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    /**
     * @return phone1_1
     */
    public String getPhone1_1() {
        return phone1_1;
    }
    /**
     * @param phone1_1 セットする phone1_1
     */
    public void setPhone1_1(String phone1_1) {
        this.phone1_1 = phone1_1;
    }
    /**
     * @return phone1_2
     */
    public String getPhone1_2() {
        return phone1_2;
    }
    /**
     * @param phone1_2 セットする phone1_2
     */
    public void setPhone1_2(String phone1_2) {
        this.phone1_2 = phone1_2;
    }
    /**
     * @return phone1_3
     */
    public String getPhone1_3() {
        return phone1_3;
    }
    /**
     * @param phone1_3 セットする phone1_3
     */
    public void setPhone1_3(String phone1_3) {
        this.phone1_3 = phone1_3;
    }
    /**
     * @return phone2_1
     */
    public String getPhone2_1() {
        return phone2_1;
    }
    /**
     * @param phone2_1 セットする phone2_1
     */
    public void setPhone2_1(String phone2_1) {
        this.phone2_1 = phone2_1;
    }
    /**
     * @return phone2_2
     */
    public String getPhone2_2() {
        return phone2_2;
    }
    /**
     * @param phone2_2 セットする phone2_2
     */
    public void setPhone2_2(String phone2_2) {
        this.phone2_2 = phone2_2;
    }
    /**
     * @return phone2_3
     */
    public String getPhone2_3() {
        return phone2_3;
    }
    /**
     * @param phone2_3 セットする phone2_3
     */
    public void setPhone2_3(String phone2_3) {
        this.phone2_3 = phone2_3;
    }
    /**
     * @return email1
     */
    public String getEmail1() {
        return email1;
    }
    /**
     * @param email1 セットする email1
     */
    public void setEmail1(String email1) {
        this.email1 = email1;
    }
    /**
     * @return email2
     */
    public String getEmail2() {
        return email2;
    }
    /**
     * @param email2 セットする email2
     */
    public void setEmail2(String email2) {
        this.email2 = email2;
    }
    /**
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }
    /**
     * @param postalCode セットする postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    /**
     * @return prefecture
     */
    public String getPrefecture() {
        return prefecture;
    }
    /**
     * @param prefecture セットする prefecture
     */
    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }
    /**
     * @return city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city セットする city
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return address1
     */
    public String getAddress1() {
        return address1;
    }
    /**
     * @param address1 セットする address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    /**
     * @return address2
     */
    public String getAddress2() {
        return address2;
    }
    /**
     * @param address2 セットする address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }
    /**
     * @param remarks セットする remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
