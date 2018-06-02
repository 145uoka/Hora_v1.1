package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of t_shift as TABLE. <br>
 * <pre>
 * [primary key]
 *     shift_id
 *
 * [column]
 *     shift_id, working_staff_id, working_day_id, start_time, end_time, delete_flag, version_no, register_datetime, update_datetime
 *
 * [sequence]
 *     t_shift_shift_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     m_working_day, m_working_staff
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mWorkingDay, mWorkingStaff
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShift {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShift> _selectedList;
    protected BehaviorSelector _selector;
    protected TShiftBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShift ready(List<TShift> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShiftBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShiftBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMWorkingDay _foreignMWorkingDayLoader;
    public LoaderOfMWorkingDay pulloutMWorkingDay() {
        if (_foreignMWorkingDayLoader == null)
        { _foreignMWorkingDayLoader = new LoaderOfMWorkingDay().ready(myBhv().pulloutMWorkingDay(_selectedList), _selector); }
        return _foreignMWorkingDayLoader;
    }

    protected LoaderOfMWorkingStaff _foreignMWorkingStaffLoader;
    public LoaderOfMWorkingStaff pulloutMWorkingStaff() {
        if (_foreignMWorkingStaffLoader == null)
        { _foreignMWorkingStaffLoader = new LoaderOfMWorkingStaff().ready(myBhv().pulloutMWorkingStaff(_selectedList), _selector); }
        return _foreignMWorkingStaffLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShift> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
