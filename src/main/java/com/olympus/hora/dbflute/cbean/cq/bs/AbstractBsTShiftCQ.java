package com.olympus.hora.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.olympus.hora.dbflute.allcommon.*;
import com.olympus.hora.dbflute.cbean.*;
import com.olympus.hora.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of t_shift.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTShiftCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTShiftCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "t_shift";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param shiftId The value of shiftId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiftId_Equal(Integer shiftId) {
        doSetShiftId_Equal(shiftId);
    }

    protected void doSetShiftId_Equal(Integer shiftId) {
        regShiftId(CK_EQ, shiftId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param shiftId The value of shiftId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiftId_NotEqual(Integer shiftId) {
        doSetShiftId_NotEqual(shiftId);
    }

    protected void doSetShiftId_NotEqual(Integer shiftId) {
        regShiftId(CK_NES, shiftId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param shiftId The value of shiftId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiftId_GreaterThan(Integer shiftId) {
        regShiftId(CK_GT, shiftId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param shiftId The value of shiftId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiftId_LessThan(Integer shiftId) {
        regShiftId(CK_LT, shiftId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param shiftId The value of shiftId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiftId_GreaterEqual(Integer shiftId) {
        regShiftId(CK_GE, shiftId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param shiftId The value of shiftId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiftId_LessEqual(Integer shiftId) {
        regShiftId(CK_LE, shiftId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of shiftId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shiftId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setShiftId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setShiftId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of shiftId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shiftId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setShiftId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShiftId(), "shift_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param shiftIdList The collection of shiftId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiftId_InScope(Collection<Integer> shiftIdList) {
        doSetShiftId_InScope(shiftIdList);
    }

    protected void doSetShiftId_InScope(Collection<Integer> shiftIdList) {
        regINS(CK_INS, cTL(shiftIdList), xgetCValueShiftId(), "shift_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     * @param shiftIdList The collection of shiftId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiftId_NotInScope(Collection<Integer> shiftIdList) {
        doSetShiftId_NotInScope(shiftIdList);
    }

    protected void doSetShiftId_NotInScope(Collection<Integer> shiftIdList) {
        regINS(CK_NINS, cTL(shiftIdList), xgetCValueShiftId(), "shift_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     */
    public void setShiftId_IsNull() { regShiftId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * shift_id: {PK, ID, NotNull, serial(10)}
     */
    public void setShiftId_IsNotNull() { regShiftId(CK_ISNN, DOBJ); }

    protected void regShiftId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiftId(), "shift_id"); }
    protected abstract ConditionValue xgetCValueShiftId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param workingStaffId The value of workingStaffId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_Equal(Integer workingStaffId) {
        doSetWorkingStaffId_Equal(workingStaffId);
    }

    protected void doSetWorkingStaffId_Equal(Integer workingStaffId) {
        regWorkingStaffId(CK_EQ, workingStaffId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param workingStaffId The value of workingStaffId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_NotEqual(Integer workingStaffId) {
        doSetWorkingStaffId_NotEqual(workingStaffId);
    }

    protected void doSetWorkingStaffId_NotEqual(Integer workingStaffId) {
        regWorkingStaffId(CK_NES, workingStaffId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param workingStaffId The value of workingStaffId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_GreaterThan(Integer workingStaffId) {
        regWorkingStaffId(CK_GT, workingStaffId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param workingStaffId The value of workingStaffId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_LessThan(Integer workingStaffId) {
        regWorkingStaffId(CK_LT, workingStaffId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param workingStaffId The value of workingStaffId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_GreaterEqual(Integer workingStaffId) {
        regWorkingStaffId(CK_GE, workingStaffId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param workingStaffId The value of workingStaffId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingStaffId_LessEqual(Integer workingStaffId) {
        regWorkingStaffId(CK_LE, workingStaffId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param minNumber The min number of workingStaffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workingStaffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setWorkingStaffId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setWorkingStaffId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param minNumber The min number of workingStaffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workingStaffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setWorkingStaffId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkingStaffId(), "working_staff_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param workingStaffIdList The collection of workingStaffId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkingStaffId_InScope(Collection<Integer> workingStaffIdList) {
        doSetWorkingStaffId_InScope(workingStaffIdList);
    }

    protected void doSetWorkingStaffId_InScope(Collection<Integer> workingStaffIdList) {
        regINS(CK_INS, cTL(workingStaffIdList), xgetCValueWorkingStaffId(), "working_staff_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * working_staff_id: {NotNull, int4(10), FK to m_working_staff}
     * @param workingStaffIdList The collection of workingStaffId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkingStaffId_NotInScope(Collection<Integer> workingStaffIdList) {
        doSetWorkingStaffId_NotInScope(workingStaffIdList);
    }

    protected void doSetWorkingStaffId_NotInScope(Collection<Integer> workingStaffIdList) {
        regINS(CK_NINS, cTL(workingStaffIdList), xgetCValueWorkingStaffId(), "working_staff_id");
    }

    protected void regWorkingStaffId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkingStaffId(), "working_staff_id"); }
    protected abstract ConditionValue xgetCValueWorkingStaffId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param workingDayId The value of workingDayId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayId_Equal(Integer workingDayId) {
        doSetWorkingDayId_Equal(workingDayId);
    }

    protected void doSetWorkingDayId_Equal(Integer workingDayId) {
        regWorkingDayId(CK_EQ, workingDayId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param workingDayId The value of workingDayId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayId_NotEqual(Integer workingDayId) {
        doSetWorkingDayId_NotEqual(workingDayId);
    }

    protected void doSetWorkingDayId_NotEqual(Integer workingDayId) {
        regWorkingDayId(CK_NES, workingDayId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param workingDayId The value of workingDayId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayId_GreaterThan(Integer workingDayId) {
        regWorkingDayId(CK_GT, workingDayId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param workingDayId The value of workingDayId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayId_LessThan(Integer workingDayId) {
        regWorkingDayId(CK_LT, workingDayId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param workingDayId The value of workingDayId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayId_GreaterEqual(Integer workingDayId) {
        regWorkingDayId(CK_GE, workingDayId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param workingDayId The value of workingDayId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkingDayId_LessEqual(Integer workingDayId) {
        regWorkingDayId(CK_LE, workingDayId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param minNumber The min number of workingDayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workingDayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setWorkingDayId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setWorkingDayId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param minNumber The min number of workingDayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workingDayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setWorkingDayId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkingDayId(), "working_day_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param workingDayIdList The collection of workingDayId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkingDayId_InScope(Collection<Integer> workingDayIdList) {
        doSetWorkingDayId_InScope(workingDayIdList);
    }

    protected void doSetWorkingDayId_InScope(Collection<Integer> workingDayIdList) {
        regINS(CK_INS, cTL(workingDayIdList), xgetCValueWorkingDayId(), "working_day_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     * @param workingDayIdList The collection of workingDayId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkingDayId_NotInScope(Collection<Integer> workingDayIdList) {
        doSetWorkingDayId_NotInScope(workingDayIdList);
    }

    protected void doSetWorkingDayId_NotInScope(Collection<Integer> workingDayIdList) {
        regINS(CK_NINS, cTL(workingDayIdList), xgetCValueWorkingDayId(), "working_day_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     */
    public void setWorkingDayId_IsNull() { regWorkingDayId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * working_day_id: {int4(10), FK to m_working_day}
     */
    public void setWorkingDayId_IsNotNull() { regWorkingDayId(CK_ISNN, DOBJ); }

    protected void regWorkingDayId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkingDayId(), "working_day_id"); }
    protected abstract ConditionValue xgetCValueWorkingDayId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_Equal(java.time.LocalTime startTime) {
        regStartTime(CK_EQ,  startTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_GreaterThan(java.time.LocalTime startTime) {
        regStartTime(CK_GT,  startTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_LessThan(java.time.LocalTime startTime) {
        regStartTime(CK_LT,  startTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_GreaterEqual(java.time.LocalTime startTime) {
        regStartTime(CK_GE,  startTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     * @param startTime The value of startTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStartTime_LessEqual(java.time.LocalTime startTime) {
        regStartTime(CK_LE, startTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     */
    public void setStartTime_IsNull() { regStartTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * start_time: {time(15, 6)}
     */
    public void setStartTime_IsNotNull() { regStartTime(CK_ISNN, DOBJ); }

    protected void regStartTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStartTime(), "start_time"); }
    protected abstract ConditionValue xgetCValueStartTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_Equal(java.time.LocalTime endTime) {
        regEndTime(CK_EQ,  endTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_GreaterThan(java.time.LocalTime endTime) {
        regEndTime(CK_GT,  endTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_LessThan(java.time.LocalTime endTime) {
        regEndTime(CK_LT,  endTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_GreaterEqual(java.time.LocalTime endTime) {
        regEndTime(CK_GE,  endTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     * @param endTime The value of endTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndTime_LessEqual(java.time.LocalTime endTime) {
        regEndTime(CK_LE, endTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     */
    public void setEndTime_IsNull() { regEndTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * end_time: {time(15, 6)}
     */
    public void setEndTime_IsNotNull() { regEndTime(CK_ISNN, DOBJ); }

    protected void regEndTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEndTime(), "end_time"); }
    protected abstract ConditionValue xgetCValueEndTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @param deleteFlag The value of deleteFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeleteFlag_Equal(Boolean deleteFlag) {
        regDeleteFlag(CK_EQ, deleteFlag);
    }

    protected void regDeleteFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeleteFlag(), "delete_flag"); }
    protected abstract ConditionValue xgetCValueDeleteFlag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param versionNo The value of versionNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_NotEqual(Integer versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Integer versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param versionNo The value of versionNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param versionNo The value of versionNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param versionNo The value of versionNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param versionNo The value of versionNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "version_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param versionNoList The collection of versionNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "version_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @param versionNoList The collection of versionNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "version_no");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "version_no"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNotNull() { regUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShiftCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TShiftCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShiftCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TShiftCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShiftCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TShiftCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShiftCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TShiftCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShiftCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TShiftCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TShiftCB&gt;() {
     *     public void query(TShiftCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShiftCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TShiftCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TShiftCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TShiftCQ sq);

    protected TShiftCB xcreateScalarConditionCB() {
        TShiftCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TShiftCB xcreateScalarConditionPartitionByCB() {
        TShiftCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TShiftCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShiftCB cb = new TShiftCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "shift_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TShiftCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TShiftCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TShiftCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShiftCB cb = new TShiftCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "shift_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TShiftCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TShiftCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShiftCB cb = new TShiftCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TShiftCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected TShiftCB newMyCB() {
        return new TShiftCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TShiftCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
