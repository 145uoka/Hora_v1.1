package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of t_reservation_detail as TABLE. <br>
 * <pre>
 * [primary key]
 *     reservation_detail_id
 *
 * [column]
 *     reservation_detail_id, reservation_id, course_id, hist_course_name, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     t_reservation_detail_reservation_detail_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     m_course, t_reservation
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCourse, tReservation
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReservationDetail {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReservationDetail> _selectedList;
    protected BehaviorSelector _selector;
    protected TReservationDetailBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReservationDetail ready(List<TReservationDetail> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReservationDetailBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReservationDetailBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCourse _foreignMCourseLoader;
    public LoaderOfMCourse pulloutMCourse() {
        if (_foreignMCourseLoader == null)
        { _foreignMCourseLoader = new LoaderOfMCourse().ready(myBhv().pulloutMCourse(_selectedList), _selector); }
        return _foreignMCourseLoader;
    }

    protected LoaderOfTReservation _foreignTReservationLoader;
    public LoaderOfTReservation pulloutTReservation() {
        if (_foreignTReservationLoader == null)
        { _foreignTReservationLoader = new LoaderOfTReservation().ready(myBhv().pulloutTReservation(_selectedList), _selector); }
        return _foreignTReservationLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReservationDetail> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
