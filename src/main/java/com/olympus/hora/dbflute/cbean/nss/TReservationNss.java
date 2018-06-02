package com.olympus.hora.dbflute.cbean.nss;

import com.olympus.hora.dbflute.cbean.cq.TReservationCQ;

/**
 * The nest select set-upper of t_reservation.
 * @author DBFlute(AutoGenerator)
 */
public class TReservationNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TReservationCQ _query;
    public TReservationNss(TReservationCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_shop by my shop_id, named 'MShop'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MShopNss withMShop() {
        _query.xdoNss(() -> _query.queryMShop());
        return new MShopNss(_query.queryMShop());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_user by my user_id, named 'MUser'.
     */
    public void withMUser() {
        _query.xdoNss(() -> _query.queryMUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_working_staff by my working_staff_id, named 'MWorkingStaff'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MWorkingStaffNss withMWorkingStaff() {
        _query.xdoNss(() -> _query.queryMWorkingStaff());
        return new MWorkingStaffNss(_query.queryMWorkingStaff());
    }
}
