package com.olympus.hora.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.olympus.hora.dbflute.allcommon.EntityDefinedCommonColumn;
import com.olympus.hora.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The entity of m_company as TABLE. <br>
 * 企業マスタ
 * <pre>
 * [primary-key]
 *     company_id
 *
 * [column]
 *     company_id, company_name, delete_flag, version_no, register_datetime, update_datetime
 *
 * [sequence]
 *     m_company_company_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     m_shop, m_staff
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     mShopList, mStaffList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer companyId = entity.getCompanyId();
 * String companyName = entity.getCompanyName();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * Integer versionNo = entity.getVersionNo();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setCompanyId(companyId);
 * entity.setCompanyName(companyName);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setVersionNo(versionNo);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCompany extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** company_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _companyId;

    /** company_name: {text(2147483647)} */
    protected String _companyName;

    /** delete_flag: {NotNull, bool(1), default=[false]} */
    protected Boolean _deleteFlag;

    /** version_no: {NotNull, int4(10), default=[1]} */
    protected Integer _versionNo;

    /** register_datetime: {NotNull, timestamp(26, 3), default=[now()]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** update_datetime: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "m_company";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_companyId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** m_shop by company_id, named 'MShopList'. */
    protected List<MShop> _mShopList;

    /**
     * [get] m_shop by company_id, named 'MShopList'.
     * @return The entity list of referrer property 'MShopList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MShop> getMShopList() {
        if (_mShopList == null) { _mShopList = newReferrerList(); }
        return _mShopList;
    }

    /**
     * [set] m_shop by company_id, named 'MShopList'.
     * @param mShopList The entity list of referrer property 'MShopList'. (NullAllowed)
     */
    public void setMShopList(List<MShop> mShopList) {
        _mShopList = mShopList;
    }

    /** m_staff by company_id, named 'MStaffList'. */
    protected List<MStaff> _mStaffList;

    /**
     * [get] m_staff by company_id, named 'MStaffList'.
     * @return The entity list of referrer property 'MStaffList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MStaff> getMStaffList() {
        if (_mStaffList == null) { _mStaffList = newReferrerList(); }
        return _mStaffList;
    }

    /**
     * [set] m_staff by company_id, named 'MStaffList'.
     * @param mStaffList The entity list of referrer property 'MStaffList'. (NullAllowed)
     */
    public void setMStaffList(List<MStaff> mStaffList) {
        _mStaffList = mStaffList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMCompany) {
            BsMCompany other = (BsMCompany)obj;
            if (!xSV(_companyId, other._companyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _companyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mShopList != null) { for (MShop et : _mShopList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mShopList")); } } }
        if (_mStaffList != null) { for (MStaff et : _mStaffList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mStaffList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_companyId));
        sb.append(dm).append(xfND(_companyName));
        sb.append(dm).append(xfND(_deleteFlag));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mShopList != null && !_mShopList.isEmpty())
        { sb.append(dm).append("mShopList"); }
        if (_mStaffList != null && !_mStaffList.isEmpty())
        { sb.append(dm).append("mStaffList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MCompany clone() {
        return (MCompany)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] company_id: {PK, ID, NotNull, serial(10)} <br>
     * 企業ID : 企業ID
     * @return The value of the column 'company_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCompanyId() {
        checkSpecifiedProperty("companyId");
        return _companyId;
    }

    /**
     * [set] company_id: {PK, ID, NotNull, serial(10)} <br>
     * 企業ID : 企業ID
     * @param companyId The value of the column 'company_id'. (basically NotNull if update: for the constraint)
     */
    public void setCompanyId(Integer companyId) {
        registerModifiedProperty("companyId");
        _companyId = companyId;
    }

    /**
     * [get] company_name: {text(2147483647)} <br>
     * 企業名 : 企業名
     * @return The value of the column 'company_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getCompanyName() {
        checkSpecifiedProperty("companyName");
        return _companyName;
    }

    /**
     * [set] company_name: {text(2147483647)} <br>
     * 企業名 : 企業名
     * @param companyName The value of the column 'company_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCompanyName(String companyName) {
        registerModifiedProperty("companyName");
        _companyName = companyName;
    }

    /**
     * [get] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * 削除フラグ
     * @return The value of the column 'delete_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDeleteFlag() {
        checkSpecifiedProperty("deleteFlag");
        return _deleteFlag;
    }

    /**
     * [set] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * 削除フラグ
     * @param deleteFlag The value of the column 'delete_flag'. (basically NotNull if update: for the constraint)
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        registerModifiedProperty("deleteFlag");
        _deleteFlag = deleteFlag;
    }

    /**
     * [get] version_no: {NotNull, int4(10), default=[1]} <br>
     * version_no
     * @return The value of the column 'version_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] version_no: {NotNull, int4(10), default=[1]} <br>
     * version_no
     * @param versionNo The value of the column 'version_no'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * 登録日時
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * 登録日時
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] update_datetime: {timestamp(26, 3)} <br>
     * 更新日時
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {timestamp(26, 3)} <br>
     * 更新日時
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }
}
