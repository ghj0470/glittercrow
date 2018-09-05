<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<c:if test="${!empty rMap }">
<script>
	
	if(${rMap.cnt}==1){
		location.href="/ticketMovie/tocketMocieList";
	}
</script>
</c:if>
<div id="wrapper">
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<table class="table table-bordered">
			<tr>
				<th>번호</th>
				<td>${tm.tmNum}</td>
			</tr>
			<tr>
				<th>영화명</th>
				<td>${tm.tmName}</td>
			</tr>
			<tr>
				<th>표가격</th>
				<td>${tm.tmPrice}</td>
			</tr>
			<tr>
				<th>상영시작일</th>
				<td>${tm.tmStartdat}</td>
			</tr>
			<tr>
				<th>상영종료일</th>
				<td>${tm.tmEnddat}</td>
			</tr>
			<tr>
				<th>개봉일</th>
				<td>${tm.tmCredat}</td>
			</tr>
			<tr>
				<th>설명</th>
				<td>${tm.tmDesc}</td>
			</tr>
			<tr>
				<th>이미지</th>
				<td>${tm.tmImg}</td>
			</tr>
			<tr>
				<td colspan="2">
					<form action="/ticketMovie/ticketDelete" method="post">
						<button data-page="/ticketMovie/ticketUpdate?tmNum=${tm.tmNum}">영화 수정</button>
						<button>영화삭제</button>
						<input type="hidden" name="tmNum" value="${tm.tmNum}">
					</form>
				</td>
			</tr>
		</table>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />