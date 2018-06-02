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
 * The entity of system_property_m as TABLE. <br>
 * システムプロパティ_M
 * <pre>
 * [primary-key]
 *     prop_key
 *
 * [column]
 *     prop_key, prop_group, prop_value, description, delete_flag, version_no, register_datetime, update_datetime
 *
 * [sequence]
 *     
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String propKey = entity.getPropKey();
 * String propGroup = entity.getPropGroup();
 * String propValue = entity.getPropValue();
 * String description = entity.getDescription();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * Integer versionNo = entity.getVersionNo();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setPropKey(propKey);
 * entity.setPropGroup(propGroup);
 * entity.setPropValue(propValue);
 * entity.setDescription(description);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setVersionNo(versionNo);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSystemPropertyM extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** prop_key: {PK, NotNull, text(2147483647)} */
    protected String _propKey;

    /** prop_group: {text(2147483647)} */
    protected String _propGroup;

    /** prop_value: {text(2147483647)} */
    protected String _propValue;

    /** description: {text(2147483647)} */
    protected String _description;

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
        return "system_property_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_propKey == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSystemPropertyM) {
            BsSystemPropertyM other = (BsSystemPropertyM)obj;
            if (!xSV(_propKey, other._propKey)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _propKey);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_propKey));
        sb.append(dm).append(xfND(_propGroup));
        sb.append(dm).append(xfND(_propValue));
        sb.append(dm).append(xfND(_description));
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
        return "";
    }

    @Override
    public SystemPropertyM clone() {
        return (SystemPropertyM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] prop_key: {PK, NotNull, text(2147483647)} <br>
     * プロパティキー : プロパティキー
     * @return The value of the column 'prop_key'. (basically NotNull if selected: for the constraint)
     */
    public String getPropKey() {
        checkSpecifiedProperty("propKey");
        return _propKey;
    }

    /**
     * [set] prop_key: {PK, NotNull, text(2147483647)} <br>
     * プロパティキー : プロパティキー
     * @param propKey The value of the column 'prop_key'. (basically NotNull if update: for the constraint)
     */
    public void setPropKey(String propKey) {
        registerModifiedProperty("propKey");
        _propKey = propKey;
    }

    /**
     * [get] prop_group: {text(2147483647)} <br>
     * プロパティグループ
     * @return The value of the column 'prop_group'. (NullAllowed even if selected: for no constraint)
     */
    public String getPropGroup() {
        checkSpecifiedProperty("propGroup");
        return _propGroup;
    }

    /**
     * [set] prop_group: {text(2147483647)} <br>
     * プロパティグループ
     * @param propGroup The value of the column 'prop_group'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPropGroup(String propGroup) {
        registerModifiedProperty("propGroup");
        _propGroup = propGroup;
    }

    /**
     * [get] prop_value: {text(2147483647)} <br>
     * 値 : 値
     * @return The value of the column 'prop_value'. (NullAllowed even if selected: for no constraint)
     */
    public String getPropValue() {
        checkSpecifiedProperty("propValue");
        return _propValue;
    }

    /**
     * [set] prop_value: {text(2147483647)} <br>
     * 値 : 値
     * @param propValue The value of the column 'prop_value'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPropValue(String propValue) {
        registerModifiedProperty("propValue");
        _propValue = propValue;
    }

    /**
     * [get] description: {text(2147483647)} <br>
     * 説明 : 説明
     * @return The value of the column 'description'. (NullAllowed even if selected: for no constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] description: {text(2147483647)} <br>
     * 説明 : 説明
     * @param description The value of the column 'description'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
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
