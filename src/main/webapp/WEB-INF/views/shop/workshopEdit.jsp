<%@ page contentType="text/html;charset=UTF-8"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%@ taglib
prefix="form" uri="http://www.springframework.org/tags/form"%> <%@
taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%@include
file="/WEB-INF/fragment/taglib-includes.jspf"%>

<html>
<head>
<jsp:include page="/WEB-INF/views/common/common.jsp" />

</head>
<body>
	<jsp:include page="../common/header.jsp" />
	<form:form modelAttribute="form" method="POST" name="form" action="${pageContext.request.contextPath}/shop/workshopEdit/store" class="form-horizontal">

    <%-- コンテンツエリア --%>
    <div class="container">

			<%-- 画面タイトル --%>
			<div class="row">
				<div class="col-md-offset-1 col-md-10">
					<h3>
						<c:out value="${displayTitle}" />
					</h3>
				</div>
			</div>

			<%-- メッセージ領域 --%>
			<div class="row">
				<div class="col-md-offset-1 col-md-10"><%@include
					file="/WEB-INF/fragment/messages.jspf"%></div>
			</div>

			<%-- パネル --%>
			<div class="row">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="panel-title">営業日設定</div>
					</div>

					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">

								<div class="form-group <ext:isErrors path='startDay' value='has-error'/> ">
									<label class="col-md-5 control-label">適応開始日<span
										class="label label-danger" style="margin-left: 10px">必須</span></label>
									<div class="col-md-3">
										<form:input path="startDay" class="form-control" placeholder="yyyy/MM/dd" />
									</div>
									<div style="clear: both;">
										<span class="col-md-5"></span>
										<div class="col-md-3">
											<form:errors path="startDay" element="div" cssClass="text-danger" />
										</div>
									</div>
								</div>

								<!-- テーブル -->
								<table
									class="table table-striped table-bordered table-hover table-condensed">
									<thead style="vertical-align: middle">
										<tr>
											<th rowspan="3">No</th>
											<th rowspan="3">適応</th>
											<th rowspan="3">営業</th>
											<th colspan="13">曜日指定</th>
											<th rowspan="3" colspan="2" class="th-input-size">毎月</th>
											<th rowspan="3" class="th-input-size">指定日</th>
											<th rowspan="3">開始時間</th>
											<th rowspan="3">終了時間</th>
											<th rowspan="3" >備考</th>
										</tr>
										<tr>
											<th colspan="5">第ｘ週</th>
											<th rowspan="2" class="th-checkbox-size">&nbsp;月&nbsp;</th>
											<th rowspan="2" class="th-checkbox-size">&nbsp;火&nbsp;</th>
											<th rowspan="2" class="th-checkbox-size">&nbsp;水&nbsp;</th>
											<th rowspan="2" class="th-checkbox-size">&nbsp;木&nbsp;</th>
											<th rowspan="2" class="th-checkbox-size">&nbsp;金&nbsp;</th>
											<th rowspan="2" class="saturday th-checkbox-size">&nbsp;土&nbsp;</th>
											<th rowspan="2" class="holiday th-checkbox-size">&nbsp;日&nbsp;</th>
											<th rowspan="2" class="holiday th-checkbox-size">&nbsp;祝&nbsp;</th>
										</tr>
										<tr>
											<th class="th-checkbox-size">&nbsp;&nbsp;1&nbsp;&nbsp;</th>
											<th class="th-checkbox-size">&nbsp;&nbsp;2&nbsp;&nbsp;</th>
											<th class="th-checkbox-size">&nbsp;&nbsp;3&nbsp;&nbsp;</th>
											<th class="th-checkbox-size">&nbsp;&nbsp;4&nbsp;&nbsp;</th>
											<th class="th-checkbox-size">&nbsp;&nbsp;5&nbsp;&nbsp;</th>
										</tr>
									</thead>
									<tbody>
									  <c:forEach begin="0" end="9" varStatus="status">
									  <tr>
									    <td><c:out value="${status.count}"/></td>
									    <td><form:checkbox path="effectiveFlag[${status.index}]" class="form-control th-checkbox-s-size" value="1" /></td>
									    <td>
									    <form:checkbox path="workingDayFlg[${status.index}]" class="form-control th-checkbox-s-size" value="1" onclick="switchDisabled(this,'workingDayFlg',${status.index})"/>
									    </td>
									    <td><form:checkbox path="week1Flag[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="week2Flag[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="week3Flag[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="week4Flag[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="week5Flag[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="monFlg[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="tueFlg[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="webFlg[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="thuFlg[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="friFlg[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="satFlg[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="sunFlg[${status.index}]" class="form-control" value="1" /></td>
									    <td><form:checkbox path="holidayFlg[${status.index}]" class="form-control" value="1" /></td>
									    <td>
									    	<div class="<ext:isErrors path='dayOfMonth[${status.index}]' value='has-error'/> ">
									    		<form:select path="dayOfMonth[${status.index}]" class="form-control" items="${dateList}" itemLabel="label" itemValue="value" />
									    	</div>
									    </td>
									    <td>日</td>
										<td>
											<div class="input-group date date-ymd <ext:isErrors path='specifiedDay[${status.index}]' value='has-error'/>">
												<form:input class="form-control" path="specifiedDay[${status.index}]" placeholder="yyyy/MM/dd"/>
												<div class="input-group-addon">
													<i class='glyphicon glyphicon-calendar'></i>
												</div>
											</div>
										</td>

										<td>
											<div class="input-group clockpicker <ext:isErrors path='startTime[${status.index}]' value='has-error'/>">
												<form:input path="startTime[${status.index}]" class="form-control" placeholder="HH:mm" disabled=""/>
												<div class="input-group-addon">
													<i class='glyphicon glyphicon-time'></i>
												</div>
											</div>
										</td>

										<td>
											<div class="input-group clockpicker <ext:isErrors path='endTime[${status.index}]' value='has-error'/>">
												<form:input path="endTime[${status.index}]" class="form-control" placeholder="HH:mm"  disabled=""/>
												<div class="input-group-addon">
													<i class='glyphicon glyphicon-time'></i>
												</div>
											</div>
										</td>
										<%-- <td><form:input path="specifiedDay[${status.index}]" class="form-control" placeholder="yyyy/MM/dd"/></td> --%>
									    <%-- <td><form:input path="startTime[${status.index}]" class="form-control" placeholder="HH:mm"/></td> --%>
									    <%-- <td><form:input path="endTime[${status.index}]" class="form-control" placeholder="HH:mm"/></td> --%>
									    <td><form:input path="remarks[${status.index}]" class="form-control"/></td>
									  <tr>
									  </c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			<form:hidden path="shopId"/>
			<form:hidden path="workingDayDetailDeffId"/>
			<form:hidden path="mWorkingDayDeffId"/>

			<!-- ボタン -->
        <div class="row">
          <div class="col-md-offset-1 col-md-10" align="center">
            <table style="margin-bottom: 20px">
              <tr>
                <td style="vertical-align: middle;">
                  <button type="submit" class="center-block btn btn-primary">
                    <i class="glyphicon glyphicon-floppy-save"></i>&nbsp;&nbsp;&nbsp;設定
                  </button>
                </td>
              </tr>
            </table>
          </div>
        </div>

		</div>
	</form:form>
	<jsp:include page="../common/footer.jsp" />

	<script type="text/javascript">
    function switchDisabled(obj, name, i) {
    	 var form=document.form;
        if(form.elements[name+i].checked==true) {
            /*
                チェックボックスが選択されている場合は、
                テキストボックスを有効化（false）
            */
        	form.elements["startTime"+i].disabled=false;
            form.elements["endTime"+i].disabled=false;
        } else {
                /* 無効化する前に、入力値をクリア */
                if(name=='workingDayFlg'){
                    /* テキストボックスの場合 */
                    form.elements["startTime"+i].value="";
                    form.elements["endTime"+i].value="";
                    /* チェックボックスの場合 */
                   /*  frm.elements[name+i].checked=false; */
                }
                /* 無効化（true） */
                form.elements["startTime"+i].disabled=true;
                form.elements["endTime"+i].disabled=true;
        }
    }
</script>

<%-- <form name="form2" action="#">
    <label for="chk1"><input type="checkbox" id="chk1" name="chk1" value="1" onclick="fchk2(this,'t')" checked="checked" />テキストボックスの無効化・有効化を切替（チェックを外すと無効化）</label><br>
    <input type="text" name="t1" value="テキストA" size="20" />
    <input type="text" name="t2" value="テキストB" size="20" />
    <input type="text" name="t3" value="テキストC" size="20" />
    <hr />
    <label for="chk2"><input type="checkbox" id="chk2" name="chk2" value="1" onclick="fchk2(this,'c')" checked="checked" />チェックボックスの無効化・有効化を切替（チェックを外すと無効化）</label><br>
    <input type="checkbox" name="c1" value="1" />選択肢A<br>
    <input type="checkbox" name="c2" value="1" />選択肢B<br>
    <input type="checkbox" name="c3" value="1" />選択肢C
</form> --%>

</body>
</html>