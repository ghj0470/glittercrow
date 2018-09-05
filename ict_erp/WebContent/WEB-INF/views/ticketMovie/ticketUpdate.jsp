<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<c:if test="${!empty rMap }">
<script>
	
	if(${rMap.cnt}==1){
		alert('완료');
		location.href="/ticektMovie/ticketMovieList";
	}
</script>
</c:if>
<div id="wrapper">
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<form action="/ticketMovie/ticketUpdate" method="post">
		<table class="table table-bordered">
			<tr>
				<th>번호</th>
				<td>${tm.tmNum}</td>
			</tr>
			<tr>
				<th>영화명</th>
				<td><input type="text" name="tmName" value="${tm.tmName}"></td>
			</tr>
			<tr>
				<th>표가격</th>
				<td><input type="text" name="tmPrice" value="${tm.tmPrice}"></td>
			</tr>
			<tr>
				<th>상영시작일</th>
				<td><input type="date" name="tmStartdat" value="${tm.tmStartdat}"></td>
			</tr>
			<tr>
				<th>상영종료일</th>
				<td><input type="date" name="tmEnddat" value="${tm.tmEnddat}"></td>
			</tr>
			<tr>
				<th>개봉일</th>
				<td><input type="text" name="tmCredat" value="${tm.tmCredat}"></td>
			</tr>
			<tr>
				<th>설명</th>
				<td><input type="text" name="tmDesc" value="${tm.tmDesc}"></td>
			</tr>
			<tr>
				<th>포스터</th>
				<td><input type="file" name="tmImg" value="${tm.tmImg}"></td>
			</tr>
			
			<tr>
				<td colspan="2"><button>부서수정</button></td>
			</tr>
		</table>
			<input type="hidden" name="tmName"  value="${tm.tmName}">
		</form>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />