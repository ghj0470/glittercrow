<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<c:if test="${!empty rMap }">
<script>
	
	if(${rMap.cnt}==1){
		alert('11');
		location.href="/ticketMovie/ticketMovieList";
	}else{
		location.href="/ticketMovie/ticketView?tmNum=<%=request.getParameter("tmNum")%>";
	}
</script>
</c:if>