<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<title>予約管理</title>
<jsp:include page="common/common.jsp"/>

</head>
<body>
<jsp:include page="common/header.jsp" />

  <form id="form" accept-charset="UTF-8" action="${pageContext.request.contextPath}/login"
    method="post">
    <!-- コンテンツエリア -->
    <div class="container-main">
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-md-offset-3" align="center">
            <%@include file="/WEB-INF/fragment/messages.jspf"%>
            <div class="panel panel-default main-border-color">
              <div class="panel-body sub-background-color">
                <div class="col-md-6 col-md-offset-3" align="center">
                  <input type="submit" class="btn btn-success form-control" name="login"
                    value="Googleログイン">
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </form>

  <jsp:include page="common/footer.jsp" />
</body>
</html>