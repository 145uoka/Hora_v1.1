package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;
import com.olympus.hora.dbflute.cbean.*;

/**
 * The referrer loader of m_working_staff as TABLE. <br>
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
public class LoaderOfMWorkingStaff {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MWorkingStaff> _selectedList;
    protected BehaviorSelector _selector;
    protected MWorkingStaffBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMWorkingStaff ready(List<MWorkingStaff> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MWorkingStaffBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MWorkingStaffBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TReservation> _referrerTReservation;

    /**
     * Load referrer of TReservationList by the set-upper of referrer. <br>
     * t_reservation by working_staff_id, named 'TReservationList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWorkingStaffList</span>, <span style="color: #553000">staffLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">staffLoader</span>.<span style="color: #CC4747">loadTReservation</span>(<span style="color: #553000">reservationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">reservationCB</span>.setupSelect...
     *         <span style="color: #553000">reservationCB</span>.query().set...
     *         <span style="color: #553000">reservationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">reservationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    reservationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWorkingStaff mWorkingStaff : <span style="color: #553000">mWorkingStaffList</span>) {
     *     ... = mWorkingStaff.<span style="color: #CC4747">getTReservationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWorkingStaffId_InScope(pkList);
     * cb.query().addOrderBy_WorkingStaffId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReservation> loadTReservation(ReferrerConditionSetupper<TReservationCB> refCBLambda) {
        myBhv().loadTReservation(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReservation = refLs);
        return hd -> hd.handle(new LoaderOfTReservation().ready(_referrerTReservation, _selector));
    }

    protected List<TShift> _referrerTShift;

    /**
     * Load referrer of TShiftList by the set-upper of referrer. <br>
     * t_shift by working_staff_id, named 'TShiftList'.
     * <pre>
     * <span style="color: #0000C0">mWorkingStaffBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mWorkingStaffList</span>, <span style="color: #553000">staffLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">staffLoader</span>.<span style="color: #CC4747">loadTShift</span>(<span style="color: #553000">shiftCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shiftCB</span>.setupSelect...
     *         <span style="color: #553000">shiftCB</span>.query().set...
     *         <span style="color: #553000">shiftCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shiftLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shiftLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MWorkingStaff mWorkingStaff : <span style="color: #553000">mWorkingStaffList</span>) {
     *     ... = mWorkingStaff.<span style="color: #CC4747">getTShiftList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWorkingStaffId_InScope(pkList);
     * cb.query().addOrderBy_WorkingStaffId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShift> loadTShift(ReferrerConditionSetupper<TShiftCB> refCBLambda) {
        myBhv().loadTShift(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShift = refLs);
        return hd -> hd.handle(new LoaderOfTShift().ready(_referrerTShift, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMShop _foreignMShopLoader;
    public LoaderOfMShop pulloutMShop() {
        if (_foreignMShopLoader == null)
        { _foreignMShopLoader = new LoaderOfMShop().ready(myBhv().pulloutMShop(_selectedList), _selector); }
        return _foreignMShopLoader;
    }

    protected LoaderOfMStaff _foreignMStaffLoader;
    public LoaderOfMStaff pulloutMStaff() {
        if (_foreignMStaffLoader == null)
        { _foreignMStaffLoader = new LoaderOfMStaff().ready(myBhv().pulloutMStaff(_selectedList), _selector); }
        return _foreignMStaffLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MWorkingStaff> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
