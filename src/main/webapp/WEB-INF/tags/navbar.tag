<%@ tag pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ attribute name="activeGroup" required="false"
	type="java.lang.String"%>
<nav class="navbar navbar-custom navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${pageContext.request.contextPath}">イベント管理システム</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li <c:if test="${activeGroup == 'search'}"> class="active" </c:if>>
					<a href="${pageContext.request.contextPath}/search">イベント検索</a>
				</li>
				<li <c:if test="${activeGroup == 'add'}"> class="active" </c:if>>
					<a href='${pageContext.request.contextPath}/event-add'>イベント登録</a>
				</li>
				<li class="dropdown <c:if test="${activeGroup == 'sample'}">active</c:if>"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">サンプル集 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href='${pageContext.request.contextPath}/sample-add'>入力画面サンプル</a></li>
						<li><a href='${pageContext.request.contextPath}/sample-list'>一覧画面サンプル</a></li>
					</ul></li>

			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>