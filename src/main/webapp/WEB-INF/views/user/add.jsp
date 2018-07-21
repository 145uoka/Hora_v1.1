<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>

<html>
<head>
<jsp:include page="/WEB-INF/views/common/common.jsp" />

<!-- CSS Glue-net -->
<link href='<c:url value="/resources/css/user/add.css"/>' rel="stylesheet">

<title>基本情報登録（詳細情報）</title>

<!-- JS Glue-net -->
<script type="text/javascript" src='../../js/common/common.js'></script>

<script src="../../js/common/commonGrid.js"></script>
</head>

<body>
  <jsp:include page="../common/header.jsp" />
  <form:form modelAttribute="form" method="post" name="form" action="${pageContext.request.contextPath}" class="form-horizontal">

    <div class="container">

      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <h3>ユーザ情報登録</h3>
        </div>
      </div>

      <!-- パネル -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <div class="panel panel-default main-border-color">
            <div class="panel-body sub-background-color">

              <div class="form-group <ext:isErrors path='familyName' value='has-error'/>">
                <label class="col-md-3 control-label">氏名<span class="label label-danger" style="margin-left: 5px">必須</span>
                </label>
                <div class="col-md-6">
                  <form:input path="familyName" class="form-control form-inline" maxlength="10" style="width: 45%;" />
                  <form:input path="givenName" class="form-control form-inline" maxlength="10" style="width: 45%;" />
                  <span class="help-block">
                    <form:errors path="familyName" element="div" cssClass="text-danger" />
                    <form:errors path="givenName" element="div" cssClass="text-danger" />
                  </span>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='familyNameKana' value='has-error'/>">
                <label class="col-md-3 control-label">氏名（カナ）<span class="label label-danger" style="margin-left: 5px">必須</span>
                </label>
                <div class="col-md-6">
                  <form:input path="familyNameKana" class="form-control form-inline" maxlength="30" style="width: 45%;" />
                  <form:input path="givenNameKana" class="form-control form-inline" maxlength="30" style="width: 45%;" />
                  <span class="help-block">
                    <form:errors path="familyNameKana" element="div" cssClass="text-danger" />
                    <form:errors path="givenNameKana" element="div" cssClass="text-danger" />
                  </span>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='sex' value='has-error'/>">
                <label class="col-md-3 control-label">性別 </label>
                <div class="col-md-2">
                  <form:select path="sex" class="form-control" items="${form.sexPulldown}" itemLabel="name" itemValue="code1" />
                  <span class="help-block"><form:errors path="sex" element="div" cssClass="text-danger" /></span>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='birthday' value='has-error'/>">
                <label class="col-md-3 control-label">生年月日 </label>
                <div class="col-md-3">
                  <div class="input-group date date-ymd" style="width: 180px;">
                    <form:input path="birthday" class="form-control" maxlength="10" />
                    <span class="input-group-addon"> <i class="glyphicon glyphicon-calendar"></i>
                    </span>
                  </div>
                </div>
                <span class="help-block"><form:errors path="birthday" element="div" cssClass="text-danger" /></span>
              </div>
              <div class="form-group <ext:isErrors path='phone1_1' value='has-error'/>">
                <label class="col-md-3 control-label">電話番号1 <span class="label label-danger" style="margin-left: 5px">必須</span></label>
                <div class="col-md-5">
                  <form:input path="phone1_1" class="form-control form-inline" maxlength="4" style="width: 30%;" />
                  <form:input path="phone1_2" class="form-control form-inline" maxlength="4" style="width: 30%;" />
                  <form:input path="phone1_3" class="form-control form-inline" maxlength="4" style="width: 30%;" />
                  <span class="help-block"><form:errors path="phone1_1" element="div" cssClass="text-danger" /></span>
                </div>
              </div>
              <button type="button" class="btn btn-default btn-s syncer-acdn center-block" data-target="syncer-acdn-1" style="margin-bottom: 15px">詳細内容を開く</button>
              <div id="syncer-acdn-1" style="display: none;">
                <!-- アコーディオン -->
                <div class="form-group ">
                  <label class="col-md-3 control-label">電話番号2 </label>
                  <div class="col-md-5">
                    <form:input path="phone2_1" class="form-control form-inline" maxlength="4" style="width: 30%;" />
                    <form:input path="phone2_2" class="form-control form-inline" maxlength="4" style="width: 30%;" />
                    <form:input path="phone2_3" class="form-control form-inline" maxlength="4" style="width: 30%;" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">メールアドレス1 </label>
                  <div class="col-md-4">
                    <form:input path="email1" class="form-control" maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">メールアドレス2 </label>
                  <div class="col-md-4">
                    <form:input path="email2" class="form-control" maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">郵便番号 </label>
                  <div class="col-md-4">
                    <form:input path="postalCode" class="form-control" maxlength="7" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">都道府県 </label>
                  <div class="col-md-4">
                    <form:select path="prefecture" class="form-control" items="${form.prefecturePulldown}" itemLabel="name" itemValue="code1" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">市区町村 </label>
                  <div class="col-md-4">
                    <form:input path="city" class="form-control" maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">その他住所1 </label>
                  <div class="col-md-4">
                    <form:input path="address1" class="form-control" maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">その他住所2 </label>
                  <div class="col-md-4">
                    <form:input path="address2" class="form-control" maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">備考 </label>
                  <div class="col-md-7">
                    <form:input path="remarks" class="form-control" maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
              </div>
              <!-- アコーディオン -->
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- ボタン -->
    <div class="row">
      <div class="col-md-offset-1 col-md-10" align="center">
        <table style="margin-bottom: 20px">
          <tr>
            <td style="vertical-align: middle;">
              <button type="submit" class="btn btn-info" id="register">登録</button>
            </td>
          </tr>
        </table>
      </div>
    </div>
  </form:form>

  <jsp:include page="../common/footer.jsp" />
  <script src="<c:url value="/resources/js/user/add.js" />"></script>
</body>
</html>
