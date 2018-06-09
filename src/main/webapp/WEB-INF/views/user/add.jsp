<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <form id="form" name="form" action="/RSV" method="post" class="form-horizontal">

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

              <div class="form-group ">
                <label class="col-md-3 control-label">氏名<span class="label label-danger"
                  style="margin-left: 5px">必須</span>
                </label>
                <div class="col-md-6">
                  <input id="familyName" name="familyName" class="form-control form-inline"
                    type="text" value="" maxlength="10" style="width: 45%;" /> <input
                    id="givenName" name="givenName" class="form-control form-inline" type="text"
                    value="" maxlength="10" style="width: 45%;" /> <span class="help-block"></span>
                </div>
              </div>
              <div class="form-group ">
                <label class="col-md-3 control-label">氏名（カナ）<span class="label label-danger"
                  style="margin-left: 5px">必須</span>
                </label>
                <div class="col-md-6">
                  <input id="familyNameKana" name="familyNameKana" class="form-control form-inline"
                    type="text" value="" maxlength="10" style="width: 45%;" /> <input
                    id="givenNameKana" name="givenNameKana" class="form-control form-inline"
                    type="text" value="" maxlength="10" style="width: 45%;" /> <span
                    class="help-block"></span>
                </div>
              </div>
              <div class="form-group ">
                <label class="col-md-3 control-label">生年月日 </label>
                <div class="col-md-3">
                  <div class="input-group date date-ymd" style="width: 180px;">
                    <input id="birthday" name="birthday" class="form-control" type="text" value=""
                      maxlength="10" /> <span class="input-group-addon"> <i
                      class="glyphicon glyphicon-calendar"></i>
                    </span>
                  </div>
                </div>
                <span class="help-block"></span>
              </div>
              <div class="form-group ">
                <label class="col-md-3 control-label">電話番号1 <span class="label label-danger"
                  style="margin-left: 5px">必須</span></label>
                <div class="col-md-5">
                  <input id="phone1_1" name="phone1_1" class="form-control form-inline" type="text"
                    value="" maxlength="4" style="width: 30%;" /> <input id="phone1_2"
                    name="phone1_2" class="form-control form-inline" type="text" value=""
                    maxlength="4" style="width: 30%;" /> <input id="phone1_3" name="phone1_3"
                    class="form-control form-inline" type="text" value="" maxlength="4"
                    style="width: 30%;" /> <span class="help-block"></span>
                </div>
              </div>
              <button type="button" class="btn btn-default btn-s syncer-acdn center-block"
                data-target="syncer-acdn-1" style="margin-bottom: 15px">詳細内容を開く</button>
              <div id="syncer-acdn-1" style="display: none;">
                <!-- アコーディオン -->
                <div class="form-group ">
                  <label class="col-md-3 control-label">電話番号2 </label>
                  <div class="col-md-5">
                    <input id="phone1_1" name="phone1_1" class="form-control form-inline"
                      type="text" value="" maxlength="4" style="width: 30%;" /> <input
                      id="phone1_2" name="phone1_2" class="form-control form-inline" type="text"
                      value="" maxlength="4" style="width: 30%;" /> <input id="phone1_3"
                      name="phone1_3" class="form-control form-inline" type="text" value=""
                      maxlength="4" style="width: 30%;" /> <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">メールアドレス1 </label>
                  <div class="col-md-4">
                    <input id="email1" name="email1" class="form-control" type="text" value=""
                      maxlength="50" /> <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">メールアドレス2 </label>
                  <div class="col-md-4">
                    <input id="email2" name="email2" class="form-control" type="text" value=""
                      maxlength="50" /> <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">郵便番号 </label>
                  <div class="col-md-4">
                    <input id="postalCode" name="postalCode" class="form-control" type="text"
                      value="" maxlength="7" /> <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">都道府県 </label>
                  <div class="col-md-4">
                    <select id="prefecture" name="prefecture" class="form-control">
                      <option value="" selected="selected"></option>
                      <option value="1">北海道</option>
                      <option value="2">青森県</option>
                      <option value="3">岩手県</option>
                      <option value="4">宮城県</option>
                      <option value="5">秋田県</option>
                      <option value="6">山形県</option>
                      <option value="7">福島県</option>
                      <option value="8">茨城県</option>
                      <option value="9">栃木県</option>
                      <option value="10">群馬県</option>
                      <option value="11">埼玉県</option>
                      <option value="12">千葉県</option>
                      <option value="13">東京都</option>
                      <option value="14">神奈川県</option>
                      <option value="15">新潟県</option>
                      <option value="16">富山県</option>
                      <option value="17">石川県</option>
                      <option value="18">福井県</option>
                      <option value="19">山梨県</option>
                      <option value="20">長野県</option>
                      <option value="21">岐阜県</option>
                      <option value="22">静岡県</option>
                      <option value="23">愛知県</option>
                      <option value="24">三重県</option>
                      <option value="25">滋賀県</option>
                      <option value="26">京都府</option>
                      <option value="27">大阪府</option>
                      <option value="28">兵庫県</option>
                      <option value="29">奈良県</option>
                      <option value="30">和歌山県</option>
                      <option value="31">鳥取県</option>
                      <option value="32">島根県</option>
                      <option value="33">岡山県</option>
                      <option value="34">広島県</option>
                      <option value="35">山口県</option>
                      <option value="36">徳島県</option>
                      <option value="37">香川県</option>
                      <option value="38">愛媛県</option>
                      <option value="39">高知県</option>
                      <option value="40">福岡県</option>
                      <option value="41">佐賀県</option>
                      <option value="42">長崎県</option>
                      <option value="43">熊本県</option>
                      <option value="44">大分県</option>
                      <option value="45">宮崎県</option>
                      <option value="46">鹿児島県</option>
                      <option value="47">沖縄県</option>
                    </select> <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">市区町村 </label>
                  <div class="col-md-4">
                    <input id="city" name="city" class="form-control" type="text" value=""
                      maxlength="50" /> <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">その他住所1 </label>
                  <div class="col-md-4">
                    <input id="address1" name="address1" class="form-control" type="text" value=""
                      maxlength="50" /> <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">その他住所2 </label>
                  <div class="col-md-4">
                    <input id="address2" name="address2" class="form-control" type="text" value=""
                      maxlength="50" /> <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">備考 </label>
                  <div class="col-md-7">
                    <input id="remarks" name="remarks" class="form-control" type="text" value=""
                      maxlength="0" /> <span class="help-block"></span>
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
  </form>

  <jsp:include page="../common/footer.jsp" />
  <script src="<c:url value="/resources/js/user/add.js" />"></script>
</body>
</html>
