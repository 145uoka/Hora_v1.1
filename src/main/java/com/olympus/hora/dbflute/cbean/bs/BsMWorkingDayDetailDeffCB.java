package com.olympus.hora.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import com.olympus.hora.dbflute.allcommon.DBFluteConfig;
import com.olympus.hora.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.hora.dbflute.allcommon.ImplementedInvokerAssistant;
import com.olympus.hora.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.olympus.hora.dbflute.cbean.*;
import com.olympus.hora.dbflute.cbean.cq.*;
import com.olympus.hora.dbflute.cbean.nss.*;

/**
 * The base condition-bean of m_working_day_detail_deff.
 * @author DBFlute(AutoGenerator)
 */
public class BsMWorkingDayDetailDeffCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MWorkingDayDetailDeffCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMWorkingDayDetailDeffCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "m_working_day_detail_deff";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param workingDayDetailDeffId : PK, ID, NotNull, serial(10). (NotNull)
     * @return this. (NotNull)
     */
    public MWorkingDayDetailDeffCB acceptPK(Integer workingDayDetailDeffId) {
        assertObjectNotNull("workingDayDetailDeffId", workingDayDetailDeffId);
        BsMWorkingDayDetailDeffCB cb = this;
        cb.query().setWorkingDayDetailDeffId_Equal(workingDayDetailDeffId);
        return (MWorkingDayDetailDeffCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_WorkingDayDetailDeffId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_WorkingDayDetailDeffId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     *
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     *
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     *
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     *
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     *
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public MWorkingDayDetailDeffCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MWorkingDayDetailDeffCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MWorkingDayDetailDeffCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MWorkingDayDetailDeffCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MWorkingDayDetailDeffCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MWorkingDayDetailDeffCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MWorkingDayDetailDeffCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MWorkingDayDetailDeffCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MWorkingDayDetailDeffCB> unionCBLambda) {
        final MWorkingDayDetailDeffCB cb = new MWorkingDayDetailDeffCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MWorkingDayDetailDeffCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MWorkingDayDetailDeffCB> unionCBLambda) {
        final MWorkingDayDetailDeffCB cb = new MWorkingDayDetailDeffCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MWorkingDayDetailDeffCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MWorkingDayDeffNss _nssMWorkingDayDeff;
    public MWorkingDayDeffNss xdfgetNssMWorkingDayDeff() {
        if (_nssMWorkingDayDeff == null) { _nssMWorkingDayDeff = new MWorkingDayDeffNss(null); }
        return _nssMWorkingDayDeff;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_working_day_deff by my m_working_day_deff_id, named 'MWorkingDayDeff'.
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MWorkingDayDeff()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mWorkingDayDetailDeff</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mWorkingDayDetailDeff</span>.<span style="color: #CC4747">getMWorkingDayDeff()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MWorkingDayDeffNss setupSelect_MWorkingDayDeff() {
        assertSetupSelectPurpose("mWorkingDayDeff");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMWorkingDayDeffId();
        }
        doSetupSelect(() -> query().queryMWorkingDayDeff());
        if (_nssMWorkingDayDeff == null || !_nssMWorkingDayDeff.hasConditionQuery())
        { _nssMWorkingDayDeff = new MWorkingDayDeffNss(query().queryMWorkingDayDeff()); }
        return _nssMWorkingDayDeff;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<MWorkingDayDetailDeffCQ> {
        protected MWorkingDayDeffCB.HpSpecification _mWorkingDayDeff;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MWorkingDayDetailDeffCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * working_day_detail_deff_id: {PK, ID, NotNull, serial(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWorkingDayDetailDeffId() { return doColumn("working_day_detail_deff_id"); }
        /**
         * m_working_day_deff_id: {NotNull, int4(10), FK to m_working_day_deff}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMWorkingDayDeffId() { return doColumn("m_working_day_deff_id"); }
        /**
         * effective_flag: {NotNull, bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEffectiveFlag() { return doColumn("effective_flag"); }
        /**
         * working_day_flg: {NotNull, bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWorkingDayFlg() { return doColumn("working_day_flg"); }
        /**
         * week_1_flag: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWeek1Flag() { return doColumn("week_1_flag"); }
        /**
         * week_2_flag: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWeek2Flag() { return doColumn("week_2_flag"); }
        /**
         * week_3_flag: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWeek3Flag() { return doColumn("week_3_flag"); }
        /**
         * week4_flag: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWeek4Flag() { return doColumn("week4_flag"); }
        /**
         * week5_flag: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWeek5Flag() { return doColumn("week5_flag"); }
        /**
         * mon_flg: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMonFlg() { return doColumn("mon_flg"); }
        /**
         * tue_flg: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTueFlg() { return doColumn("tue_flg"); }
        /**
         * web_flg: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWebFlg() { return doColumn("web_flg"); }
        /**
         * thu_flg: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnThuFlg() { return doColumn("thu_flg"); }
        /**
         * fri_flg: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFriFlg() { return doColumn("fri_flg"); }
        /**
         * sat_flg: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSatFlg() { return doColumn("sat_flg"); }
        /**
         * sun_flg: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSunFlg() { return doColumn("sun_flg"); }
        /**
         * holiday_flg: {bool(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHolidayFlg() { return doColumn("holiday_flg"); }
        /**
         * day_of_month: {int2(5)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDayOfMonth() { return doColumn("day_of_month"); }
        /**
         * specified_day: {date(13)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpecifiedDay() { return doColumn("specified_day"); }
        /**
         * start_time: {time(15, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStartTime() { return doColumn("start_time"); }
        /**
         * end_time: {time(15, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEndTime() { return doColumn("end_time"); }
        /**
         * delete_flag: {NotNull, bool(1), default=[false]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeleteFlag() { return doColumn("delete_flag"); }
        /**
         * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterDatetime() { return doColumn("register_datetime"); }
        /**
         * update_datetime: {timestamp(26, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateDatetime() { return doColumn("update_datetime"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnWorkingDayDetailDeffId(); // PK
            if (qyCall().qy().hasConditionQueryMWorkingDayDeff()
                    || qyCall().qy().xgetReferrerQuery() instanceof MWorkingDayDeffCQ) {
                columnMWorkingDayDeffId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "m_working_day_detail_deff"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_working_day_deff by my m_working_day_deff_id, named 'MWorkingDayDeff'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MWorkingDayDeffCB.HpSpecification specifyMWorkingDayDeff() {
            assertRelation("mWorkingDayDeff");
            if (_mWorkingDayDeff == null) {
                _mWorkingDayDeff = new MWorkingDayDeffCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMWorkingDayDeff()
                                    , () -> _qyCall.qy().queryMWorkingDayDeff())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mWorkingDayDeff.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMWorkingDayDeff()
                      , () -> xsyncQyCall().qy().queryMWorkingDayDeff()));
                }
            }
            return _mWorkingDayDeff;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MWorkingDayDetailDeffCB, MWorkingDayDetailDeffCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MWorkingDayDetailDeffCB> sq, MWorkingDayDetailDeffCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public MWorkingDayDetailDeffCB dreamCruiseCB() {
        MWorkingDayDetailDeffCB cb = new MWorkingDayDetailDeffCB();
        cb.xsetupForDreamCruise((MWorkingDayDetailDeffCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MWorkingDayDetailDeffCB> columnQuery(final SpecifyQuery<MWorkingDayDetailDeffCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MWorkingDayDetailDeffCB xcreateColumnQueryCB() {
        MWorkingDayDetailDeffCB cb = new MWorkingDayDetailDeffCB();
        cb.xsetupForColumnQuery((MWorkingDayDetailDeffCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MWorkingDayDetailDeffCB> orCBLambda) {
        xorSQ((MWorkingDayDetailDeffCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MWorkingDayDetailDeffCB> andCBLambda) {
        xorSQAP((MWorkingDayDetailDeffCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final MWorkingDayDetailDeffCB cb;
        if (mainCB != null) {
            cb = (MWorkingDayDetailDeffCB)mainCB;
        } else {
            cb = new MWorkingDayDetailDeffCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MWorkingDayDetailDeffCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MWorkingDayDetailDeffCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
