package com.olympus.hora.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.hora.dbflute.exbhv.*;
import com.olympus.hora.dbflute.exentity.*;

/**
 * The referrer loader of system_property_m as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSystemPropertyM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SystemPropertyM> _selectedList;
    protected BehaviorSelector _selector;
    protected SystemPropertyMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSystemPropertyM ready(List<SystemPropertyM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SystemPropertyMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SystemPropertyMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SystemPropertyM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
