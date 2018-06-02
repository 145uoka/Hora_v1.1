package com.olympus.hora.dbflute.cbean.nss;

import com.olympus.hora.dbflute.cbean.cq.MStaffCQ;

/**
 * The nest select set-upper of m_staff.
 * @author DBFlute(AutoGenerator)
 */
public class MStaffNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MStaffCQ _query;
    public MStaffNss(MStaffCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_company by my company_id, named 'MCompany'.
     */
    public void withMCompany() {
        _query.xdoNss(() -> _query.queryMCompany());
    }
}
