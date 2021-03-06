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
 * The behavior of m_working_staff as TABLE. <br>
 * <pre>
 * [primary key]
 *     working_staff_id
 *
 * [column]
 *     working_staff_id, shop_id, staff_id, delete_flag, version_no, register_datetime, update_datetime
 *
 * [sequence]
 *     m_working_staff_working_staff_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     m_shop, m_staff
 *
 * [referrer table]
 *     t_reservation, t_shift
 *
 * [foreign property]
 *     mShop, mStaff
 *
 * [referrer property]
 *     tReservationList, tShiftList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMWorkingStaffBhv extends AbstractBehaviorWritable<MWorkingStaff, MWorkingStaffCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MWorkingStaffDbm asDBMeta() { return MWorkingStaffDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "m_working_staff"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MWorkingStaffCB newConditionBean() { return new MWorkingStaffCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<MWorkingStaffCB> cbLambda) {
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
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">mWorkingStaff</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">mWorkingStaff</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">mWorkingStaff</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">mWorkingStaff</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MWorkingStaff> selectEntity(CBCall<MWorkingStaffCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<MWorkingStaff> facadeSelectEntity(MWorkingStaffCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWorkingStaff> OptionalEntity<ENTITY> doSelectOptionalEntity(MWorkingStaffCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MWorkingStaff <span style="color: #553000">mWorkingStaff</span> = <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">mWorkingStaff</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MWorkingStaff selectEntityWithDeletedCheck(CBCall<MWorkingStaffCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param workingStaffId : PK, ID, NotNull, serial(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MWorkingStaff> selectByPK(Integer workingStaffId) {
        return facadeSelectByPK(workingStaffId);
    }

    protected OptionalEntity<MWorkingStaff> facadeSelectByPK(Integer workingStaffId) {
        return doSelectOptionalByPK(workingStaffId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MWorkingStaff> ENTITY doSelectByPK(Integer workingStaffId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(workingStaffId), tp);
    }

    protected <ENTITY extends MWorkingStaff> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer workingStaffId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(workingStaffId, tp), workingStaffId);
    }

    protected MWorkingStaffCB xprepareCBAsPK(Integer workingStaffId) {
        assertObjectNotNull("workingStaffId", workingStaffId);
        return newConditionBean().acceptPK(workingStaffId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;MWorkingStaff&gt; <span style="color: #553000">mWorkingStaffList</span> = <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (MWorkingStaff <span style="color: #553000">mWorkingStaff</span> : <span style="color: #553000">mWorkingStaffList</span>) {
     *     ... = <span style="color: #553000">mWorkingStaff</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MWorkingStaff> selectList(CBCall<MWorkingStaffCB> cbLambda) {
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
     * PagingResultBean&lt;MWorkingStaff&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MWorkingStaff mWorkingStaff : <span style="color: #553000">page</span>) {
     *     ... = mWorkingStaff.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MWorkingStaff> selectPage(CBCall<MWorkingStaffCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @param entityLambda The handler of entity row of MWorkingStaff. (NotNull)
     */
    public void selectCursor(CBCall<MWorkingStaffCB> cbLambda, EntityRowHandler<MWorkingStaff> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MWorkingStaffCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param mWorkingStaffList The entity list of MWorkingStaff. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MWorkingStaff> mWorkingStaffList, ReferrerLoaderHandler<LoaderOfMWorkingStaff> loaderLambda) {
        xassLRArg(mWorkingStaffList, loaderLambda);
        loaderLambda.handle(new LoaderOfMWorkingStaff().ready(mWorkingStaffList, _behaviorSelector));
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
     * @param mWorkingStaff The entity of MWorkingStaff. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MWorkingStaff mWorkingStaff, ReferrerLoaderHandler<LoaderOfMWorkingStaff> loaderLambda) {
        xassLRArg(mWorkingStaff, loaderLambda);
        loaderLambda.handle(new LoaderOfMWorkingStaff().ready(xnewLRAryLs(mWorkingStaff), _behaviorSelector));
    }

    /**
     * Load referrer of TReservationList by the set-upper of referrer. <br>
     * t_reservation by working_staff_id, named 'TReservationList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">loadTReservation</span>(<span style="color: #553000">mWorkingStaffList</span>, <span style="color: #553000">reservationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reservationCB</span>.setupSelect...
     *     <span style="color: #553000">reservationCB</span>.query().set...
     *     <span style="color: #553000">reservationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWorkingStaff mWorkingStaff : <span style="color: #553000">mWorkingStaffList</span>) {
     *     ... = mWorkingStaff.<span style="color: #CC4747">getTReservationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWorkingStaffId_InScope(pkList);
     * cb.query().addOrderBy_WorkingStaffId_Asc();
     * </pre>
     * @param mWorkingStaffList The entity list of MWorkingStaff. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReservation> loadTReservation(List<MWorkingStaff> mWorkingStaffList, ReferrerConditionSetupper<TReservationCB> refCBLambda) {
        xassLRArg(mWorkingStaffList, refCBLambda);
        return doLoadTReservation(mWorkingStaffList, new LoadReferrerOption<TReservationCB, TReservation>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReservationList by the set-upper of referrer. <br>
     * t_reservation by working_staff_id, named 'TReservationList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">loadTReservation</span>(<span style="color: #553000">mWorkingStaff</span>, <span style="color: #553000">reservationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reservationCB</span>.setupSelect...
     *     <span style="color: #553000">reservationCB</span>.query().set...
     *     <span style="color: #553000">reservationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWorkingStaff</span>.<span style="color: #CC4747">getTReservationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWorkingStaffId_InScope(pkList);
     * cb.query().addOrderBy_WorkingStaffId_Asc();
     * </pre>
     * @param mWorkingStaff The entity of MWorkingStaff. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReservation> loadTReservation(MWorkingStaff mWorkingStaff, ReferrerConditionSetupper<TReservationCB> refCBLambda) {
        xassLRArg(mWorkingStaff, refCBLambda);
        return doLoadTReservation(xnewLRLs(mWorkingStaff), new LoadReferrerOption<TReservationCB, TReservation>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<TReservation> doLoadTReservation(List<MWorkingStaff> mWorkingStaffList, LoadReferrerOption<TReservationCB, TReservation> option) {
        return helpLoadReferrerInternally(mWorkingStaffList, option, "tReservationList");
    }

    /**
     * Load referrer of TShiftList by the set-upper of referrer. <br>
     * t_shift by working_staff_id, named 'TShiftList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">loadTShift</span>(<span style="color: #553000">mWorkingStaffList</span>, <span style="color: #553000">shiftCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shiftCB</span>.setupSelect...
     *     <span style="color: #553000">shiftCB</span>.query().set...
     *     <span style="color: #553000">shiftCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MWorkingStaff mWorkingStaff : <span style="color: #553000">mWorkingStaffList</span>) {
     *     ... = mWorkingStaff.<span style="color: #CC4747">getTShiftList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWorkingStaffId_InScope(pkList);
     * cb.query().addOrderBy_WorkingStaffId_Asc();
     * </pre>
     * @param mWorkingStaffList The entity list of MWorkingStaff. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShift> loadTShift(List<MWorkingStaff> mWorkingStaffList, ReferrerConditionSetupper<TShiftCB> refCBLambda) {
        xassLRArg(mWorkingStaffList, refCBLambda);
        return doLoadTShift(mWorkingStaffList, new LoadReferrerOption<TShiftCB, TShift>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShiftList by the set-upper of referrer. <br>
     * t_shift by working_staff_id, named 'TShiftList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">loadTShift</span>(<span style="color: #553000">mWorkingStaff</span>, <span style="color: #553000">shiftCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shiftCB</span>.setupSelect...
     *     <span style="color: #553000">shiftCB</span>.query().set...
     *     <span style="color: #553000">shiftCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mWorkingStaff</span>.<span style="color: #CC4747">getTShiftList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWorkingStaffId_InScope(pkList);
     * cb.query().addOrderBy_WorkingStaffId_Asc();
     * </pre>
     * @param mWorkingStaff The entity of MWorkingStaff. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShift> loadTShift(MWorkingStaff mWorkingStaff, ReferrerConditionSetupper<TShiftCB> refCBLambda) {
        xassLRArg(mWorkingStaff, refCBLambda);
        return doLoadTShift(xnewLRLs(mWorkingStaff), new LoadReferrerOption<TShiftCB, TShift>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<TShift> doLoadTShift(List<MWorkingStaff> mWorkingStaffList, LoadReferrerOption<TShiftCB, TShift> option) {
        return helpLoadReferrerInternally(mWorkingStaffList, option, "tShiftList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MShop'.
     * @param mWorkingStaffList The list of mWorkingStaff. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShop> pulloutMShop(List<MWorkingStaff> mWorkingStaffList)
    { return helpPulloutInternally(mWorkingStaffList, "mShop"); }

    /**
     * Pull out the list of foreign table 'MStaff'.
     * @param mWorkingStaffList The list of mWorkingStaff. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStaff> pulloutMStaff(List<MWorkingStaff> mWorkingStaffList)
    { return helpPulloutInternally(mWorkingStaffList, "mStaff"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key workingStaffId.
     * @param mWorkingStaffList The list of mWorkingStaff. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractWorkingStaffIdList(List<MWorkingStaff> mWorkingStaffList)
    { return helpExtractListInternally(mWorkingStaffList, "workingStaffId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mWorkingStaff.setFoo...(value);
     * mWorkingStaff.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.set...;</span>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">insert</span>(mWorkingStaff);
     * ... = mWorkingStaff.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mWorkingStaff The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MWorkingStaff mWorkingStaff) {
        doInsert(mWorkingStaff, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * mWorkingStaff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingStaff.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWorkingStaff.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">update</span>(mWorkingStaff);
     * </pre>
     * @param mWorkingStaff The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MWorkingStaff mWorkingStaff) {
        doUpdate(mWorkingStaff, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * mWorkingStaff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingStaff.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mWorkingStaff);
     * </pre>
     * @param mWorkingStaff The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MWorkingStaff mWorkingStaff) {
        doUpdateNonstrict(mWorkingStaff, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mWorkingStaff The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MWorkingStaff mWorkingStaff) {
        doInsertOrUpdate(mWorkingStaff, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mWorkingStaff The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MWorkingStaff mWorkingStaff) {
        doInsertOrUpdateNonstrict(mWorkingStaff, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * mWorkingStaff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWorkingStaff.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">delete</span>(mWorkingStaff);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mWorkingStaff The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MWorkingStaff mWorkingStaff) {
        doDelete(mWorkingStaff, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * mWorkingStaff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mWorkingStaff);
     * </pre>
     * @param mWorkingStaff The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MWorkingStaff mWorkingStaff) {
        doDeleteNonstrict(mWorkingStaff, null);
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
     *     MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     *     mWorkingStaff.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWorkingStaff.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mWorkingStaffList.add(mWorkingStaff);
     * }
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">batchInsert</span>(mWorkingStaffList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MWorkingStaff> mWorkingStaffList) {
        return doBatchInsert(mWorkingStaffList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     *     mWorkingStaff.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWorkingStaff.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mWorkingStaff.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mWorkingStaff.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mWorkingStaffList.add(mWorkingStaff);
     * }
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mWorkingStaffList);
     * </pre>
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MWorkingStaff> mWorkingStaffList) {
        return doBatchUpdate(mWorkingStaffList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     *     mWorkingStaff.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mWorkingStaff.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mWorkingStaff.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mWorkingStaff.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mWorkingStaffList.add(mWorkingStaff);
     * }
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mWorkingStaffList);
     * </pre>
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MWorkingStaff> mWorkingStaffList) {
        return doBatchUpdateNonstrict(mWorkingStaffList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MWorkingStaff> mWorkingStaffList) {
        return doBatchDelete(mWorkingStaffList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MWorkingStaff> mWorkingStaffList) {
        return doBatchDeleteNonstrict(mWorkingStaffList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MWorkingStaff, MWorkingStaffCB&gt;() {
     *     public ConditionBean setup(MWorkingStaff entity, MWorkingStaffCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MWorkingStaff, MWorkingStaffCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setPK...(value);</span>
     * mWorkingStaff.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mWorkingStaff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param mWorkingStaff The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MWorkingStaff mWorkingStaff, CBCall<MWorkingStaffCB> cbLambda) {
        return doQueryUpdate(mWorkingStaff, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">queryDelete</span>(mWorkingStaff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<MWorkingStaffCB> cbLambda) {
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
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mWorkingStaff.setFoo...(value);
     * mWorkingStaff.setBar...(value);
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mWorkingStaff, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mWorkingStaff.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mWorkingStaff The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MWorkingStaff mWorkingStaff, WritableOptionCall<MWorkingStaffCB, InsertOption<MWorkingStaffCB>> opLambda) {
        doInsert(mWorkingStaff, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * mWorkingStaff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingStaff.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mWorkingStaff.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mWorkingStaff, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mWorkingStaff The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MWorkingStaff mWorkingStaff, WritableOptionCall<MWorkingStaffCB, UpdateOption<MWorkingStaffCB>> opLambda) {
        doUpdate(mWorkingStaff, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * mWorkingStaff.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mWorkingStaff.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mWorkingStaff, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mWorkingStaff The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MWorkingStaff mWorkingStaff, WritableOptionCall<MWorkingStaffCB, UpdateOption<MWorkingStaffCB>> opLambda) {
        doUpdateNonstrict(mWorkingStaff, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mWorkingStaff The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MWorkingStaff mWorkingStaff, WritableOptionCall<MWorkingStaffCB, InsertOption<MWorkingStaffCB>> insertOpLambda, WritableOptionCall<MWorkingStaffCB, UpdateOption<MWorkingStaffCB>> updateOpLambda) {
        doInsertOrUpdate(mWorkingStaff, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mWorkingStaff The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MWorkingStaff mWorkingStaff, WritableOptionCall<MWorkingStaffCB, InsertOption<MWorkingStaffCB>> insertOpLambda, WritableOptionCall<MWorkingStaffCB, UpdateOption<MWorkingStaffCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mWorkingStaff, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mWorkingStaff The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MWorkingStaff mWorkingStaff, WritableOptionCall<MWorkingStaffCB, DeleteOption<MWorkingStaffCB>> opLambda) {
        doDelete(mWorkingStaff, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mWorkingStaff The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MWorkingStaff mWorkingStaff, WritableOptionCall<MWorkingStaffCB, DeleteOption<MWorkingStaffCB>> opLambda) {
        doDeleteNonstrict(mWorkingStaff, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MWorkingStaff> mWorkingStaffList, WritableOptionCall<MWorkingStaffCB, InsertOption<MWorkingStaffCB>> opLambda) {
        return doBatchInsert(mWorkingStaffList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MWorkingStaff> mWorkingStaffList, WritableOptionCall<MWorkingStaffCB, UpdateOption<MWorkingStaffCB>> opLambda) {
        return doBatchUpdate(mWorkingStaffList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MWorkingStaff> mWorkingStaffList, WritableOptionCall<MWorkingStaffCB, UpdateOption<MWorkingStaffCB>> opLambda) {
        return doBatchUpdateNonstrict(mWorkingStaffList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MWorkingStaff> mWorkingStaffList, WritableOptionCall<MWorkingStaffCB, DeleteOption<MWorkingStaffCB>> opLambda) {
        return doBatchDelete(mWorkingStaffList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mWorkingStaffList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MWorkingStaff> mWorkingStaffList, WritableOptionCall<MWorkingStaffCB, DeleteOption<MWorkingStaffCB>> opLambda) {
        return doBatchDeleteNonstrict(mWorkingStaffList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MWorkingStaff, MWorkingStaffCB> manyArgLambda, WritableOptionCall<MWorkingStaffCB, InsertOption<MWorkingStaffCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MWorkingStaff mWorkingStaff = <span style="color: #70226C">new</span> MWorkingStaff();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setPK...(value);</span>
     * mWorkingStaff.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mWorkingStaff.setVersionNo(value);</span>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mWorkingStaff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mWorkingStaff The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MWorkingStaff mWorkingStaff, CBCall<MWorkingStaffCB> cbLambda, WritableOptionCall<MWorkingStaffCB, UpdateOption<MWorkingStaffCB>> opLambda) {
        return doQueryUpdate(mWorkingStaff, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #CC4747">queryDelete</span>(mWorkingStaff, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MWorkingStaff. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<MWorkingStaffCB> cbLambda, WritableOptionCall<MWorkingStaffCB, DeleteOption<MWorkingStaffCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mWorkingStaffBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mWorkingStaffBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mWorkingStaffBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mWorkingStaffBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mWorkingStaffBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mWorkingStaffBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mWorkingStaffBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mWorkingStaffBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mWorkingStaffBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mWorkingStaffBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mWorkingStaffBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mWorkingStaffBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mWorkingStaffBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mWorkingStaffBhv.outideSql().removeBlockComment().selectList()
     * mWorkingStaffBhv.outideSql().removeLineComment().selectList()
     * mWorkingStaffBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<MWorkingStaffBhv> outsideSql() {
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
    protected Class<? extends MWorkingStaff> typeOfSelectedEntity() { return MWorkingStaff.class; }
    protected Class<MWorkingStaff> typeOfHandlingEntity() { return MWorkingStaff.class; }
    protected Class<MWorkingStaffCB> typeOfHandlingConditionBean() { return MWorkingStaffCB.class; }
}
