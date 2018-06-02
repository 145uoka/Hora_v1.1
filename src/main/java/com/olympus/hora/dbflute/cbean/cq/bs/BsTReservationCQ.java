package com.olympus.hora.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.olympus.hora.dbflute.cbean.cq.ciq.*;
import com.olympus.hora.dbflute.cbean.*;
import com.olympus.hora.dbflute.cbean.cq.*;

/**
 * The base condition-query of t_reservation.
 * @author DBFlute(AutoGenerator)
 */
public class BsTReservationCQ extends AbstractBsTReservationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TReservationCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReservationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_reservation) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TReservationCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TReservationCIQ xcreateCIQ() {
        TReservationCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TReservationCIQ xnewCIQ() {
        return new TReservationCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_reservation on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TReservationCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TReservationCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _reservationId;
    public ConditionValue xdfgetReservationId()
    { if (_reservationId == null) { _reservationId = nCV(); }
      return _reservationId; }
    protected ConditionValue xgetCValueReservationId() { return xdfgetReservationId(); }

    public Map<String, TReservationDetailCQ> xdfgetReservationId_ExistsReferrer_TReservationDetailList() { return xgetSQueMap("reservationId_ExistsReferrer_TReservationDetailList"); }
    public String keepReservationId_ExistsReferrer_TReservationDetailList(TReservationDetailCQ sq) { return xkeepSQue("reservationId_ExistsReferrer_TReservationDetailList", sq); }

    public Map<String, TReservationDetailCQ> xdfgetReservationId_NotExistsReferrer_TReservationDetailList() { return xgetSQueMap("reservationId_NotExistsReferrer_TReservationDetailList"); }
    public String keepReservationId_NotExistsReferrer_TReservationDetailList(TReservationDetailCQ sq) { return xkeepSQue("reservationId_NotExistsReferrer_TReservationDetailList", sq); }

    public Map<String, TReservationDetailCQ> xdfgetReservationId_SpecifyDerivedReferrer_TReservationDetailList() { return xgetSQueMap("reservationId_SpecifyDerivedReferrer_TReservationDetailList"); }
    public String keepReservationId_SpecifyDerivedReferrer_TReservationDetailList(TReservationDetailCQ sq) { return xkeepSQue("reservationId_SpecifyDerivedReferrer_TReservationDetailList", sq); }

    public Map<String, TReservationDetailCQ> xdfgetReservationId_QueryDerivedReferrer_TReservationDetailList() { return xgetSQueMap("reservationId_QueryDerivedReferrer_TReservationDetailList"); }
    public String keepReservationId_QueryDerivedReferrer_TReservationDetailList(TReservationDetailCQ sq) { return xkeepSQue("reservationId_QueryDerivedReferrer_TReservationDetailList", sq); }
    public Map<String, Object> xdfgetReservationId_QueryDerivedReferrer_TReservationDetailListParameter() { return xgetSQuePmMap("reservationId_QueryDerivedReferrer_TReservationDetailList"); }
    public String keepReservationId_QueryDerivedReferrer_TReservationDetailListParameter(Object pm) { return xkeepSQuePm("reservationId_QueryDerivedReferrer_TReservationDetailList", pm); }

    /**
     * Add order-by as ascend. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_ReservationId_Asc() { regOBA("reservation_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * reservation_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_ReservationId_Desc() { regOBD("reservation_id"); return this; }

    protected ConditionValue _shopId;
    public ConditionValue xdfgetShopId()
    { if (_shopId == null) { _shopId = nCV(); }
      return _shopId; }
    protected ConditionValue xgetCValueShopId() { return xdfgetShopId(); }

    /**
     * Add order-by as ascend. <br>
     * shop_id: {int4(10), FK to m_shop}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_ShopId_Asc() { regOBA("shop_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * shop_id: {int4(10), FK to m_shop}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_ShopId_Desc() { regOBD("shop_id"); return this; }

    protected ConditionValue _workingStaffId;
    public ConditionValue xdfgetWorkingStaffId()
    { if (_workingStaffId == null) { _workingStaffId = nCV(); }
      return _workingStaffId; }
    protected ConditionValue xgetCValueWorkingStaffId() { return xdfgetWorkingStaffId(); }

    /**
     * Add order-by as ascend. <br>
     * working_staff_id: {int4(10), FK to m_working_staff}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_WorkingStaffId_Asc() { regOBA("working_staff_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * working_staff_id: {int4(10), FK to m_working_staff}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_WorkingStaffId_Desc() { regOBD("working_staff_id"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * user_id: {int4(10), FK to m_user}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_id: {int4(10), FK to m_user}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _histStaffFamilyName;
    public ConditionValue xdfgetHistStaffFamilyName()
    { if (_histStaffFamilyName == null) { _histStaffFamilyName = nCV(); }
      return _histStaffFamilyName; }
    protected ConditionValue xgetCValueHistStaffFamilyName() { return xdfgetHistStaffFamilyName(); }

    /**
     * Add order-by as ascend. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_HistStaffFamilyName_Asc() { regOBA("hist_staff_family_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * hist_staff_family_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_HistStaffFamilyName_Desc() { regOBD("hist_staff_family_name"); return this; }

    protected ConditionValue _histShopName;
    public ConditionValue xdfgetHistShopName()
    { if (_histShopName == null) { _histShopName = nCV(); }
      return _histShopName; }
    protected ConditionValue xgetCValueHistShopName() { return xdfgetHistShopName(); }

    /**
     * Add order-by as ascend. <br>
     * hist_shop_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_HistShopName_Asc() { regOBA("hist_shop_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * hist_shop_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_HistShopName_Desc() { regOBD("hist_shop_name"); return this; }

    protected ConditionValue _histShopAbbreviatedName;
    public ConditionValue xdfgetHistShopAbbreviatedName()
    { if (_histShopAbbreviatedName == null) { _histShopAbbreviatedName = nCV(); }
      return _histShopAbbreviatedName; }
    protected ConditionValue xgetCValueHistShopAbbreviatedName() { return xdfgetHistShopAbbreviatedName(); }

    /**
     * Add order-by as ascend. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_HistShopAbbreviatedName_Asc() { regOBA("hist_shop_abbreviated_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * hist_shop_abbreviated_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_HistShopAbbreviatedName_Desc() { regOBD("hist_shop_abbreviated_name"); return this; }

    protected ConditionValue _histStaffGivenName;
    public ConditionValue xdfgetHistStaffGivenName()
    { if (_histStaffGivenName == null) { _histStaffGivenName = nCV(); }
      return _histStaffGivenName; }
    protected ConditionValue xgetCValueHistStaffGivenName() { return xdfgetHistStaffGivenName(); }

    /**
     * Add order-by as ascend. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_HistStaffGivenName_Asc() { regOBA("hist_staff_given_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * hist_staff_given_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_HistStaffGivenName_Desc() { regOBD("hist_staff_given_name"); return this; }

    protected ConditionValue _reservationDate;
    public ConditionValue xdfgetReservationDate()
    { if (_reservationDate == null) { _reservationDate = nCV(); }
      return _reservationDate; }
    protected ConditionValue xgetCValueReservationDate() { return xdfgetReservationDate(); }

    /**
     * Add order-by as ascend. <br>
     * reservation_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_ReservationDate_Asc() { regOBA("reservation_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * reservation_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_ReservationDate_Desc() { regOBD("reservation_date"); return this; }

    protected ConditionValue _reservationTime;
    public ConditionValue xdfgetReservationTime()
    { if (_reservationTime == null) { _reservationTime = nCV(); }
      return _reservationTime; }
    protected ConditionValue xgetCValueReservationTime() { return xdfgetReservationTime(); }

    /**
     * Add order-by as ascend. <br>
     * reservation_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_ReservationTime_Asc() { regOBA("reservation_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * reservation_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_ReservationTime_Desc() { regOBD("reservation_time"); return this; }

    protected ConditionValue _totalAmount;
    public ConditionValue xdfgetTotalAmount()
    { if (_totalAmount == null) { _totalAmount = nCV(); }
      return _totalAmount; }
    protected ConditionValue xgetCValueTotalAmount() { return xdfgetTotalAmount(); }

    /**
     * Add order-by as ascend. <br>
     * total_amount: {int4(10)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_TotalAmount_Asc() { regOBA("total_amount"); return this; }

    /**
     * Add order-by as descend. <br>
     * total_amount: {int4(10)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_TotalAmount_Desc() { regOBD("total_amount"); return this; }

    protected ConditionValue _remarks;
    public ConditionValue xdfgetRemarks()
    { if (_remarks == null) { _remarks = nCV(); }
      return _remarks; }
    protected ConditionValue xgetCValueRemarks() { return xdfgetRemarks(); }

    /**
     * Add order-by as ascend. <br>
     * remarks: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_Remarks_Asc() { regOBA("remarks"); return this; }

    /**
     * Add order-by as descend. <br>
     * remarks: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_Remarks_Desc() { regOBD("remarks"); return this; }

    protected ConditionValue _status;
    public ConditionValue xdfgetStatus()
    { if (_status == null) { _status = nCV(); }
      return _status; }
    protected ConditionValue xgetCValueStatus() { return xdfgetStatus(); }

    /**
     * Add order-by as ascend. <br>
     * status: {int4(10)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_Status_Asc() { regOBA("status"); return this; }

    /**
     * Add order-by as descend. <br>
     * status: {int4(10)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_Status_Desc() { regOBD("status"); return this; }

    protected ConditionValue _deleteFlag;
    public ConditionValue xdfgetDeleteFlag()
    { if (_deleteFlag == null) { _deleteFlag = nCV(); }
      return _deleteFlag; }
    protected ConditionValue xgetCValueDeleteFlag() { return xdfgetDeleteFlag(); }

    /**
     * Add order-by as ascend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * version_no: {NotNull, int4(10), default=[1]}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsTReservationCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTReservationCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTReservationCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TReservationCQ bq = (TReservationCQ)bqs;
        TReservationCQ uq = (TReservationCQ)uqs;
        if (bq.hasConditionQueryMShop()) {
            uq.queryMShop().reflectRelationOnUnionQuery(bq.queryMShop(), uq.queryMShop());
        }
        if (bq.hasConditionQueryMUser()) {
            uq.queryMUser().reflectRelationOnUnionQuery(bq.queryMUser(), uq.queryMUser());
        }
        if (bq.hasConditionQueryMWorkingStaff()) {
            uq.queryMWorkingStaff().reflectRelationOnUnionQuery(bq.queryMWorkingStaff(), uq.queryMWorkingStaff());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_shop by my shop_id, named 'MShop'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShopCQ queryMShop() {
        return xdfgetConditionQueryMShop();
    }
    public MShopCQ xdfgetConditionQueryMShop() {
        String prop = "mShop";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShop()); xsetupOuterJoinMShop(); }
        return xgetQueRlMap(prop);
    }
    protected MShopCQ xcreateQueryMShop() {
        String nrp = xresolveNRP("t_reservation", "mShop"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShopCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShop", nrp);
    }
    protected void xsetupOuterJoinMShop() { xregOutJo("mShop"); }
    public boolean hasConditionQueryMShop() { return xhasQueRlMap("mShop"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_user by my user_id, named 'MUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public MUserCQ queryMUser() {
        return xdfgetConditionQueryMUser();
    }
    public MUserCQ xdfgetConditionQueryMUser() {
        String prop = "mUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMUser()); xsetupOuterJoinMUser(); }
        return xgetQueRlMap(prop);
    }
    protected MUserCQ xcreateQueryMUser() {
        String nrp = xresolveNRP("t_reservation", "mUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mUser", nrp);
    }
    protected void xsetupOuterJoinMUser() { xregOutJo("mUser"); }
    public boolean hasConditionQueryMUser() { return xhasQueRlMap("mUser"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_working_staff by my working_staff_id, named 'MWorkingStaff'.
     * @return The instance of condition-query. (NotNull)
     */
    public MWorkingStaffCQ queryMWorkingStaff() {
        return xdfgetConditionQueryMWorkingStaff();
    }
    public MWorkingStaffCQ xdfgetConditionQueryMWorkingStaff() {
        String prop = "mWorkingStaff";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMWorkingStaff()); xsetupOuterJoinMWorkingStaff(); }
        return xgetQueRlMap(prop);
    }
    protected MWorkingStaffCQ xcreateQueryMWorkingStaff() {
        String nrp = xresolveNRP("t_reservation", "mWorkingStaff"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWorkingStaffCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWorkingStaff", nrp);
    }
    protected void xsetupOuterJoinMWorkingStaff() { xregOutJo("mWorkingStaff"); }
    public boolean hasConditionQueryMWorkingStaff() { return xhasQueRlMap("mWorkingStaff"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TReservationCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TReservationCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TReservationCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TReservationCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TReservationCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TReservationCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TReservationCQ> _myselfExistsMap;
    public Map<String, TReservationCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TReservationCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TReservationCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TReservationCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TReservationCB.class.getName(); }
    protected String xCQ() { return TReservationCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
