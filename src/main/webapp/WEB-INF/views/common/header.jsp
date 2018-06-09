<%@ page contentType="text/html;charset=Windows-31J" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
  <!-- ナビゲーションバー -->
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">予約管理</a>
      </div>
      <!-- メニュー -->
<%--       <c:if test="${userInfo.logined}"> --%>
        <ul class="nav navbar-nav">
          <li><a href="${pageContext.request.contextPath}/reservation/add">予約入力</a></li>
          <li><a href="${pageContext.request.contextPath}/reservation/hist">予約履歴</a></li>
          <li><a href="${pageContext.request.contextPath}/user/add">ユーザ情報</a></li>
          <li><a href="${pageContext.request.contextPath}/shop/edit">ショップ編集</a></li>
        </ul>
        <!-- ログアウト -->
        <div class="navbar-form navbar-right">
          <c:if test="${userInfo.logined}">
            <span class="glyphicon glyphicon-user"> <c:out
                value="${userInfo.accountFullName}" />
            </span>
          </c:if>
          <span style="margin-left: 20px"> <a
            href="${pageContext.request.contextPath}/logout" class="btn btn-primary btn-large">
              <i class="glyphicon glyphicon-log-out"></i> Log out
          </a>
          </span>
        </div>
<%--       </c:if> --%>
    </div>
  </nav>
</div>