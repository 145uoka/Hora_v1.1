package com.olympus.hora.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.bsbhv.loader.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.bsentity.dbmeta.*;
import com.olympus.hora.dbflute.cbean.*;

/**
 * The behavior of m_working_day_detail_deff as TABLE. <br>
 * <pre>
 * [primary key]
 *     working_day_detail_deff_id
 *
 * [column]
 *     working_day_detail_deff_id, m_working_day_deff_id, effective_flag, working_day_flg, week_1_flag, week_2_flag, week_3_flag, week4_flag, week5_flag, mon_flg, tue_flg, web_flg, thu_flg, fri_flg, sat_flg, sun_flg, holiday_flg, day_of_month, specified_day, start_time, end_time, delete_flag, version_no, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_day_detail_deff_working_day_detail_deff_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     m_working_day_deff
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mWorkingDayDeff
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMWorkingDayDetailDeffBhv extends AbstractBehaviorWritable<MWorkingDayDetailDeff, MWorkingDayDetailDeffCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MWorkingDayDetailDeffDbm asDBMeta() { return MWorkingDayDetailDeffDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "m_working_day_detail_deff"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MWorkingDayDetailDeffCB newConditionBean() { return new MWorkingDayDetailDeffCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<MWorkingDayDetailDeffCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">mWorkingDayDetailDeff</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">mWorkingDayDetailDeff</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">mWorkingDayDetailDeff</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">mWorkingDayDetailDeff</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MWorkingDayDetailDeff> selectEntity(CBCall<MWorkingDayDetailDeffCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<MWorkingDayDetailDeff> facadeSelectEntity(MWorkingDayDetailDeffCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWorkingDayDetailDeff> OptionalEntity<ENTITY> doSelectOptionalEntity(MWorkingDayDetailDeffCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MWorkingDayDetailDeff <span style="color: #553000">mWorkingDayDetailDeff</span> = <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">mWorkingDayDetailDeff</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MWorkingDayDetailDeff selectEntityWithDeletedCheck(CBCall<MWorkingDayDetailDeffCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param workingDayDetailDeffId : PK, ID, NotNull, serial(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MWorkingDayDetailDeff> selectByPK(Integer workingDayDetailDeffId) {
        return facadeSelectByPK(workingDayDetailDeffId);
    }

    protected OptionalEntity<MWorkingDayDetailDeff> facadeSelectByPK(Integer workingDayDetailDeffId) {
        return doSelectOptionalByPK(workingDayDetailDeffId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWorkingDayDetailDeff> ENTITY doSelectByPK(Integer workingDayDetailDeffId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(workingDayDetailDeffId), tp);
    }

    protected <ENTITY extends MWorkingDayDetailDeff> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer workingDayDetailDeffId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(workingDayDetailDeffId, tp), workingDayDetailDeffId);
    }

    protected MWorkingDayDetailDeffCB xprepareCBAsPK(Integer workingDayDetailDeffId) {
        assertObjectNotNull("workingDayDetailDeffId", workingDayDetailDeffId);
        return newConditionBean().acceptPK(workingDayDetailDeffId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;MWorkingDayDetailDeff&gt; <span style="color: #553000">mWorkingDayDetailDeffList</span> = <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (MWorkingDayDetailDeff <span style="color: #553000">mWorkingDayDetailDeff</span> : <span style="color: #553000">mWorkingDayDetailDeffList</span>) {
     *     ... = <span style="color: #553000">mWorkingDayDetailDeff</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MWorkingDayDetailDeff> selectList(CBCall<MWorkingDayDetailDeffCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;MWorkingDayDetailDeff&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MWorkingDayDetailDeff mWorkingDayDetailDeff : <span style="color: #553000">page</span>) {
     *     ... = mWorkingDayDetailDeff.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MWorkingDayDetailDeff> selectPage(CBCall<MWorkingDayDetailDeffCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @param entityLambda The handler of entity row of MWorkingDayDetailDeff. (NotNull)
     */
    public void selectCursor(CBCall<MWorkingDayDetailDeffCB> cbLambda, EntityRowHandler<MWorkingDayDetailDeff> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MWorkingDayDetailDeffCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * Select the next value as sequence. <br>
     * This method is called when insert() and set to primary-key automatically.
     * So you don't need to call this as long as you need to get next value before insert().
     * @return The next value. (NotNull)
     */
    public Integer selectNextVal() {
        return facadeSelectNextVal();
    }

    protected Integer facadeSelectNextVal() {
        return doSelectNextVal(Integer.class);
    }

    protected <RESULT> RESULT doSelectNextVal(Class<RESULT> tp) {
        return delegateSelectNextVal(tp);
    }

    @Override
    protected Number doReadNextVal() {
        return facadeSelectNextVal();
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param mWorkingDayDetailDeffList The entity list of MWorkingDayDetailDeff. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList, ReferrerLoaderHandler<LoaderOfMWorkingDayDetailDeff> loaderLambda) {
        xassLRArg(mWorkingDayDetailDeffList, loaderLambda);
        loaderLambda.handle(new LoaderOfMWorkingDayDetailDeff().ready(mWorkingDayDetailDeffList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param mWorkingDayDetailDeff The entity of MWorkingDayDetailDeff. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MWorkingDayDetailDeff mWorkingDayDetailDeff, ReferrerLoaderHandler<LoaderOfMWorkingDayDetailDeff> loaderLambda) {
        xassLRArg(mWorkingDayDetailDeff, loaderLambda);
        loaderLambda.handle(new LoaderOfMWorkingDayDetailDeff().ready(xnewLRAryLs(mWorkingDayDetailDeff), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MWorkingDayDeff'.
     * @param mWorkingDayDetailDeffList The list of mWorkingDayDetailDeff. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWorkingDayDeff> pulloutMWorkingDayDeff(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList)
    { return helpPulloutInternally(mWorkingDayDetailDeffList, "mWorkingDayDeff"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key workingDayDetailDeffId.
     * @param mWorkingDayDetailDeffList The list of mWorkingDayDetailDeff. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractWorkingDayDetailDeffIdList(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList)
    { return helpExtractListInternally(mWorkingDayDetailDeffList, "workingDayDetailDeffId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mWorkingDayDetailDeff.setFoo...(value);
     * mWorkingDayDetailDeff.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.set...;</span>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">insert</span>(mWorkingDayDetailDeff);
     * ... = mWorkingDayDetailDeff.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mWorkingDayDetailDeff The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MWorkingDayDetailDeff mWorkingDayDetailDeff) {
        doInsert(mWorkingDayDetailDeff, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * mWorkingDayDetailDeff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingDayDetailDeff.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWorkingDayDetailDeff.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">update</span>(mWorkingDayDetailDeff);
     * </pre>
     * @param mWorkingDayDetailDeff The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MWorkingDayDetailDeff mWorkingDayDetailDeff) {
        doUpdate(mWorkingDayDetailDeff, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * mWorkingDayDetailDeff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingDayDetailDeff.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mWorkingDayDetailDeff);
     * </pre>
     * @param mWorkingDayDetailDeff The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MWorkingDayDetailDeff mWorkingDayDetailDeff) {
        doUpdateNonstrict(mWorkingDayDetailDeff, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mWorkingDayDetailDeff The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MWorkingDayDetailDeff mWorkingDayDetailDeff) {
        doInsertOrUpdate(mWorkingDayDetailDeff, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mWorkingDayDetailDeff The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MWorkingDayDetailDeff mWorkingDayDetailDeff) {
        doInsertOrUpdateNonstrict(mWorkingDayDetailDeff, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * mWorkingDayDetailDeff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWorkingDayDetailDeff.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">delete</span>(mWorkingDayDetailDeff);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mWorkingDayDetailDeff The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MWorkingDayDetailDeff mWorkingDayDetailDeff) {
        doDelete(mWorkingDayDetailDeff, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * mWorkingDayDetailDeff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mWorkingDayDetailDeff);
     * </pre>
     * @param mWorkingDayDetailDeff The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MWorkingDayDetailDeff mWorkingDayDetailDeff) {
        doDeleteNonstrict(mWorkingDayDetailDeff, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     *     mWorkingDayDetailDeff.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWorkingDayDetailDeff.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mWorkingDayDetailDeffList.add(mWorkingDayDetailDeff);
     * }
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">batchInsert</span>(mWorkingDayDetailDeffList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList) {
        return doBatchInsert(mWorkingDayDetailDeffList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     *     mWorkingDayDetailDeff.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWorkingDayDetailDeff.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mWorkingDayDetailDeff.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mWorkingDayDetailDeffList.add(mWorkingDayDetailDeff);
     * }
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mWorkingDayDetailDeffList);
     * </pre>
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList) {
        return doBatchUpdate(mWorkingDayDetailDeffList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     *     mWorkingDayDetailDeff.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWorkingDayDetailDeff.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mWorkingDayDetailDeff.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mWorkingDayDetailDeffList.add(mWorkingDayDetailDeff);
     * }
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mWorkingDayDetailDeffList);
     * </pre>
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList) {
        return doBatchUpdateNonstrict(mWorkingDayDetailDeffList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList) {
        return doBatchDelete(mWorkingDayDetailDeffList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList) {
        return doBatchDeleteNonstrict(mWorkingDayDetailDeffList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MWorkingDayDetailDeff, MWorkingDayDetailDeffCB&gt;() {
     *     public ConditionBean setup(MWorkingDayDetailDeff entity, MWorkingDayDetailDeffCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<MWorkingDayDetailDeff, MWorkingDayDetailDeffCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setPK...(value);</span>
     * mWorkingDayDetailDeff.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mWorkingDayDetailDeff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param mWorkingDayDetailDeff The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MWorkingDayDetailDeff mWorkingDayDetailDeff, CBCall<MWorkingDayDetailDeffCB> cbLambda) {
        return doQueryUpdate(mWorkingDayDetailDeff, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">queryDelete</span>(mWorkingDayDetailDeff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<MWorkingDayDetailDeffCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mWorkingDayDetailDeff.setFoo...(value);
     * mWorkingDayDetailDeff.setBar...(value);
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mWorkingDayDetailDeff, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mWorkingDayDetailDeff.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mWorkingDayDetailDeff The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MWorkingDayDetailDeff mWorkingDayDetailDeff, WritableOptionCall<MWorkingDayDetailDeffCB, InsertOption<MWorkingDayDetailDeffCB>> opLambda) {
        doInsert(mWorkingDayDetailDeff, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * mWorkingDayDetailDeff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingDayDetailDeff.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWorkingDayDetailDeff.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mWorkingDayDetailDeff, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mWorkingDayDetailDeff The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MWorkingDayDetailDeff mWorkingDayDetailDeff, WritableOptionCall<MWorkingDayDetailDeffCB, UpdateOption<MWorkingDayDetailDeffCB>> opLambda) {
        doUpdate(mWorkingDayDetailDeff, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * mWorkingDayDetailDeff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingDayDetailDeff.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mWorkingDayDetailDeff, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mWorkingDayDetailDeff The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MWorkingDayDetailDeff mWorkingDayDetailDeff, WritableOptionCall<MWorkingDayDetailDeffCB, UpdateOption<MWorkingDayDetailDeffCB>> opLambda) {
        doUpdateNonstrict(mWorkingDayDetailDeff, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mWorkingDayDetailDeff The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MWorkingDayDetailDeff mWorkingDayDetailDeff, WritableOptionCall<MWorkingDayDetailDeffCB, InsertOption<MWorkingDayDetailDeffCB>> insertOpLambda, WritableOptionCall<MWorkingDayDetailDeffCB, UpdateOption<MWorkingDayDetailDeffCB>> updateOpLambda) {
        doInsertOrUpdate(mWorkingDayDetailDeff, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mWorkingDayDetailDeff The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MWorkingDayDetailDeff mWorkingDayDetailDeff, WritableOptionCall<MWorkingDayDetailDeffCB, InsertOption<MWorkingDayDetailDeffCB>> insertOpLambda, WritableOptionCall<MWorkingDayDetailDeffCB, UpdateOption<MWorkingDayDetailDeffCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mWorkingDayDetailDeff, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mWorkingDayDetailDeff The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MWorkingDayDetailDeff mWorkingDayDetailDeff, WritableOptionCall<MWorkingDayDetailDeffCB, DeleteOption<MWorkingDayDetailDeffCB>> opLambda) {
        doDelete(mWorkingDayDetailDeff, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mWorkingDayDetailDeff The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MWorkingDayDetailDeff mWorkingDayDetailDeff, WritableOptionCall<MWorkingDayDetailDeffCB, DeleteOption<MWorkingDayDetailDeffCB>> opLambda) {
        doDeleteNonstrict(mWorkingDayDetailDeff, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList, WritableOptionCall<MWorkingDayDetailDeffCB, InsertOption<MWorkingDayDetailDeffCB>> opLambda) {
        return doBatchInsert(mWorkingDayDetailDeffList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList, WritableOptionCall<MWorkingDayDetailDeffCB, UpdateOption<MWorkingDayDetailDeffCB>> opLambda) {
        return doBatchUpdate(mWorkingDayDetailDeffList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList, WritableOptionCall<MWorkingDayDetailDeffCB, UpdateOption<MWorkingDayDetailDeffCB>> opLambda) {
        return doBatchUpdateNonstrict(mWorkingDayDetailDeffList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList, WritableOptionCall<MWorkingDayDetailDeffCB, DeleteOption<MWorkingDayDetailDeffCB>> opLambda) {
        return doBatchDelete(mWorkingDayDetailDeffList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mWorkingDayDetailDeffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MWorkingDayDetailDeff> mWorkingDayDetailDeffList, WritableOptionCall<MWorkingDayDetailDeffCB, DeleteOption<MWorkingDayDetailDeffCB>> opLambda) {
        return doBatchDeleteNonstrict(mWorkingDayDetailDeffList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<MWorkingDayDetailDeff, MWorkingDayDetailDeffCB> manyArgLambda, WritableOptionCall<MWorkingDayDetailDeffCB, InsertOption<MWorkingDayDetailDeffCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MWorkingDayDetailDeff mWorkingDayDetailDeff = <span style="color: #70226C">new</span> MWorkingDayDetailDeff();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setPK...(value);</span>
     * mWorkingDayDetailDeff.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingDayDetailDeff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mWorkingDayDetailDeff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mWorkingDayDetailDeff The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MWorkingDayDetailDeff mWorkingDayDetailDeff, CBCall<MWorkingDayDetailDeffCB> cbLambda, WritableOptionCall<MWorkingDayDetailDeffCB, UpdateOption<MWorkingDayDetailDeffCB>> opLambda) {
        return doQueryUpdate(mWorkingDayDetailDeff, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">mWorkingDayDetailDeffBhv</span>.<span style="color: #CC4747">queryDelete</span>(mWorkingDayDetailDeff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingDayDetailDeff. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<MWorkingDayDetailDeffCB> cbLambda, WritableOptionCall<MWorkingDayDetailDeffCB, DeleteOption<MWorkingDayDetailDeffCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mWorkingDayDetailDeffBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mWorkingDayDetailDeffBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mWorkingDayDetailDeffBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mWorkingDayDetailDeffBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mWorkingDayDetailDeffBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mWorkingDayDetailDeffBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mWorkingDayDetailDeffBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mWorkingDayDetailDeffBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mWorkingDayDetailDeffBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mWorkingDayDetailDeffBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mWorkingDayDetailDeffBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mWorkingDayDetailDeffBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mWorkingDayDetailDeffBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mWorkingDayDetailDeffBhv.outideSql().removeBlockComment().selectList()
     * mWorkingDayDetailDeffBhv.outideSql().removeLineComment().selectList()
     * mWorkingDayDetailDeffBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<MWorkingDayDetailDeffBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends MWorkingDayDetailDeff> typeOfSelectedEntity() { return MWorkingDayDetailDeff.class; }
    protected Class<MWorkingDayDetailDeff> typeOfHandlingEntity() { return MWorkingDayDetailDeff.class; }
    protected Class<MWorkingDayDetailDeffCB> typeOfHandlingConditionBean() { return MWorkingDayDetailDeffCB.class; }
}
