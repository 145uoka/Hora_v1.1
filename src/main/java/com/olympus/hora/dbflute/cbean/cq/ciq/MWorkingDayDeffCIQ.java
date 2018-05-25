package com.olympus.hora.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.olympus.hora.dbflute.cbean.*;
import com.olympus.hora.dbflute.cbean.cq.bs.*;
import com.olympus.hora.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of m_working_day_deff.
 * @author DBFlute(AutoGenerator)
 */
public class MWorkingDayDeffCIQ extends AbstractBsMWorkingDayDeffCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMWorkingDayDeffCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MWorkingDayDeffCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMWorkingDayDeffCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueMWorkingDayDeffId() { return _myCQ.xdfgetMWorkingDayDeffId(); }
    public String keepMWorkingDayDeffId_ExistsReferrer_MWorkingDayDetailDeffList(MWorkingDayDetailDeffCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMWorkingDayDeffId_NotExistsReferrer_MWorkingDayDetailDeffList(MWorkingDayDetailDeffCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMWorkingDayDeffId_SpecifyDerivedReferrer_MWorkingDayDetailDeffList(MWorkingDayDetailDeffCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffList(MWorkingDayDetailDeffCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMWorkingDayDeffId_QueryDerivedReferrer_MWorkingDayDetailDeffListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueShopId() { return _myCQ.xdfgetShopId(); }
    protected ConditionValue xgetCValueStartDay() { return _myCQ.xdfgetStartDay(); }
    protected ConditionValue xgetCValueDeleteFlag() { return _myCQ.xdfgetDeleteFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MWorkingDayDeffCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MWorkingDayDeffCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MWorkingDayDeffCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MWorkingDayDeffCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MWorkingDayDeffCB.class.getName(); }
    protected String xinCQ() { return MWorkingDayDeffCQ.class.getName(); }
}
