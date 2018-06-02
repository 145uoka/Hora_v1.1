<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>

<html>
<head>
<jsp:include page="/WEB-INF/views/common/common.jsp" />

<title>基本情報登録（詳細情報）</title>

<link href='<c:url value="/resources/css/shop/edit.css"/>' rel="stylesheet">
<script type="text/javascript" src='<c:url value="/resources/js/shop/edit.js"/>'></script>
</head>

<body>
  <jsp:include page="../common/header.jsp" />
  <form id="form" name="form" action="/RSV" method="post" class="form-horizontal">

    <div class="container">

      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <h3>ショップ情報編集</h3>
        </div>
      </div>

      <!-- パネル -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <div class="panel panel-default main-border-color">
            <div class="panel-body sub-background-color">

              <div class="form-group ">
                <label class="col-md-3 control-label">店舗名<span class="label label-danger" style="margin-left: 5px">必須</span>
                </label>
                <div class="col-md-6">
                  <input id="shop_name" name="shop_name"
                    class="form-control form-inline" type="text" value="ほげほげ店舗" />
                </div>
              </div>
              <div class="form-group ">
                <label class="col-md-3 control-label">店舗略名</label>
                <div class="col-md-6">
                  <input id="shop_abbreviated_name" name="shop_abbreviated_name"
                    class="form-control form-inline" type="text" value="ほげほげ"/>
                </div>
              </div>

                 <div class="form-group ">
                <label class="col-md-3 control-label">電話番号1</label>
                <div class="col-md-5">
                  <input id="phone1_1" name="phone1_1" class="form-control  form-inline" type="text" value="999" maxlength="4" style="width: 30%;" />
                  <input id="phone1_2" name="phone1_2" class="form-control form-inline" type="text" value="999" maxlength="4" style="width: 30%;" />
                  <input id="phone1_3" name="phone1_3" class="form-control form-inline" type="text" value="999" maxlength="4" style="width: 30%;" />
                  <span class="help-block"></span>
                </div>
              </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">電話番号2 </label>
                  <div class="col-md-5">
                    <input id="phone1_1" name="phone1_1" class="form-control form-inline" type="text" value="123" maxlength="4" style="width: 30%;" />
                    <input id="phone1_2" name="phone1_2" class="form-control form-inline" type="text" value="456" maxlength="4" style="width: 30%;" />
                    <input id="phone1_3" name="phone1_3" class="form-control form-inline" type="text" value="789" maxlength="4" style="width: 30%;" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">FAX </label>
                  <div class="col-md-5">
                    <input id="fax_1" name="fax_1" class="form-control form-inline" type="text" value="999" maxlength="4" style="width: 30%;" />
                    <input id="fax_2" name="fax_2" class="form-control form-inline" type="text" value="999" maxlength="4" style="width: 30%;" />
                    <input id="phone1_3" name="fax_3" class="form-control form-inline" type="text" value="999" maxlength="4" style="width: 30%;" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">メールアドレス1</label>
                  <div class="col-md-4">
                    <input id="email1" name="email1" class="form-control" type="text" value="hogehoge@hoge.jp" maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">メールアドレス2</label>
                  <div class="col-md-4">
                    <input id="email2" name="email2" class="form-control" type="text" value="hogehoge2@hoge.jp" maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">URL </label>
                  <div class="col-md-4">
                    <input id="postalCode" name="postalCode" class="form-control" type="text" value="http://hoge/hoge/hoge.html" maxlength="7" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">都道府県 </label>
                  <div class="col-md-4">
                    <select id="prefecture" name="prefecture"
                      class="form-control">
                      <option value="1" selected="selected">北海道</option>
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
                    <input id="city" name="city" class="form-control"type="text" value="hoge市hoge区hoge町hoge村" maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">その他住所1 </label>
                  <div class="col-md-4">
                    <input id="address1" name="address1" class="form-control" type="text" value="hoge市hoge区hoge町hoge2村"maxlength="50" />
                    <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">その他住所2 </label>
                  <div class="col-md-4">
                    <input id="address2" name="address2" class="form-control" type="text" value="hoge市hoge区hoge町hoge3村" maxlength="50" />
                      <span class="help-block"></span>
                  </div>
                </div>
                <div class="form-group ">
                  <label class="col-md-3 control-label">備考 </label>
                  <div class="col-md-7">
                    <input id="remarks" name="remarks" class="form-control" type="text" value="hogehoge" maxlength="0" />
                    <span class="help-block"></span>
                  </div>
                </div>
                 <div class="form-group ">
                <label class="col-md-3 control-label">予約可能期限日 </label>
                <div class="col-md-3">
                  <select id="effectiveFlag" name="effectiveFlag" class="form-control">
                  <option value="1" selected="selected">2018/05/11</option>
                  <option value="0">2018/05/12</option>
                  <option value="2">2018/05/24</option>
                  </select>
                </div>
              </div>
                 <div class="form-group ">
                  <label class="col-md-3 control-label">メンテナンスモード </label>
                  <div class="col-md-7">
                    <input type="checkbox" class="toggle_button" data-off-label="OFF" data-on-label="ON"><label for="toggleButton"></label>
                    <span class="help-block"></span>
                  </div>
                </div>
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
              <button type="submit" class="btn btn-info" id="correct">修正</button>
            </td>
          </tr>

        </table>
        <table style="margin-bottom: 20px">
         <tr>
           <td><label class="space" style="width: 30px;"></label></td>
           <td style="vertical-align: middle;">
              <button type="submit" class="btn btn-info" id="register">営業日設定</button>
            </td>
            <td><label class="space" style="width: 30px;"></label></td>
            <td style="vertical-align: middle;">
              <button type="submit" class="btn btn-info" id="register">スタッフ設定</button>
            </td>
            <td><label class="space" style="width: 30px;"></label></td>
            <td style="vertical-align: middle;">
              <button type="submit" class="btn btn-info" id="register">シフト設定</button>
            </td>
            <td><label class="space" style="width: 30px;"></label></td>
            <td style="vertical-align: middle;">
              <button type="submit" class="btn btn-info" id="register">コース設定</button>
            </td>
            <td><label class="space" style="width: 30px;"></label></td>
          </tr>
          <table style="margin-bottom: 20px">
        </table>
      </div>
    </div>
  </form>

  <jsp:include page="../common/footer.jsp" />
</body>
</html>
