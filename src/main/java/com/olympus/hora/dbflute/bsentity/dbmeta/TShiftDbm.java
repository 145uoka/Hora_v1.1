package com.olympus.hora.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.olympus.hora.dbflute.allcommon.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The DB meta of t_shift. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TShiftDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TShiftDbm _instance = new TShiftDbm();
    private TShiftDbm() {}
    public static TShiftDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TShift)et).getShiftId(), (et, vl) -> ((TShift)et).setShiftId(cti(vl)), "shiftId");
        setupEpg(_epgMap, et -> ((TShift)et).getWorkingStaffId(), (et, vl) -> ((TShift)et).setWorkingStaffId(cti(vl)), "workingStaffId");
        setupEpg(_epgMap, et -> ((TShift)et).getWorkingDayId(), (et, vl) -> ((TShift)et).setWorkingDayId(cti(vl)), "workingDayId");
        setupEpg(_epgMap, et -> ((TShift)et).getStartTime(), (et, vl) -> ((TShift)et).setStartTime(ctlt(vl)), "startTime");
        setupEpg(_epgMap, et -> ((TShift)et).getEndTime(), (et, vl) -> ((TShift)et).setEndTime(ctlt(vl)), "endTime");
        setupEpg(_epgMap, et -> ((TShift)et).getDeleteFlag(), (et, vl) -> ((TShift)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((TShift)et).getVersionNo(), (et, vl) -> ((TShift)et).setVersionNo(cti(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TShift)et).getRegisterDatetime(), (et, vl) -> ((TShift)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((TShift)et).getUpdateDatetime(), (et, vl) -> ((TShift)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TShift)et).getMWorkingDay(), (et, vl) -> ((TShift)et).setMWorkingDay((OptionalEntity<MWorkingDay>)vl), "MWorkingDay");
        setupEfpg(_efpgMap, et -> ((TShift)et).getMWorkingStaff(), (et, vl) -> ((TShift)et).setMWorkingStaff((OptionalEntity<MWorkingStaff>)vl), "MWorkingStaff");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_shift";
    protected final String _tableDispName = "t_shift";
    protected final String _tablePropertyName = "TShift";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_shift", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShiftId = cci("shift_id", "shift_id", null, null, Integer.class, "shiftId", null, true, true, true, "serial", 10, 0, null, "nextval('t_shift_shift_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkingStaffId = cci("working_staff_id", "working_staff_id", null, null, Integer.class, "workingStaffId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, "MWorkingStaff", null, null, false);
    protected final ColumnInfo _columnWorkingDayId = cci("working_day_id", "working_day_id", null, null, Integer.class, "workingDayId", null, false, false, false, "int4", 10, 0, null, null, false, null, null, "MWorkingDay", null, null, false);
    protected final ColumnInfo _columnStartTime = cci("start_time", "start_time", null, null, java.time.LocalTime.class, "startTime", null, false, false, false, "time", 15, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEndTime = cci("end_time", "end_time", null, null, java.time.LocalTime.class, "endTime", null, false, false, false, "time", 15, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, Integer.class, "versionNo", null, false, false, true, "int4", 10, 0, null, "1", false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShiftId() { return _columnShiftId; }
    /**
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkingStaffId() { return _columnWorkingStaffId; }
    /**
     * working_day_id: {int4(10), FK to m_working_day}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkingDayId() { return _columnWorkingDayId; }
    /**
     * start_time: {time(15, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartTime() { return _columnStartTime; }
    /**
     * end_time: {time(15, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEndTime() { return _columnEndTime; }
    /**
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeleteFlag() { return _columnDeleteFlag; }
    /**
     * version_no: {NotNull, int4(10), default=[1]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * update_datetime: {timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnShiftId());
        ls.add(columnWorkingStaffId());
        ls.add(columnWorkingDayId());
        ls.add(columnStartTime());
        ls.add(columnEndTime());
        ls.add(columnDeleteFlag());
        ls.add(columnVersionNo());
        ls.add(columnRegisterDatetime());
        ls.add(columnUpdateDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnShiftId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * m_working_day by my working_day_id, named 'MWorkingDay'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWorkingDay() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWorkingDayId(), MWorkingDayDbm.getInstance().columnWorkingDayId());
        return cfi("idx_t_shift_fk0", "MWorkingDay", this, MWorkingDayDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "TShiftList", false);
    }
    /**
     * m_working_staff by my working_staff_id, named 'MWorkingStaff'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWorkingStaff() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWorkingStaffId(), MWorkingStaffDbm.getInstance().columnWorkingStaffId());
        return cfi("t_shift_working_staff_id_fkey", "MWorkingStaff", this, MWorkingStaffDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "TShiftList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "t_shift_shift_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.olympus.hora.dbflute.exentity.TShift"; }
    public String getConditionBeanTypeName() { return "com.olympus.hora.dbflute.cbean.TShiftCB"; }
    public String getBehaviorTypeName() { return "com.olympus.hora.dbflute.exbhv.TShiftBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TShift> getEntityType() { return TShift.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TShift newEntity() { return new TShift(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TShift)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TShift)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
