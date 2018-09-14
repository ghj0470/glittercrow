<%@page import="json.Test"%>
<%@page import="java.util.List"%>
<%@page import="process.TestD"%>
<%@page import="com.google.gson.Gson"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="false"%>
<!-- map형태 list(익스플로러6이하엔 map이 없다)-->
    
    
<%
Gson gson = new Gson();

TestD td = new TestD();

List<Test> tList = td.getTest();

out.println(gson.toJson(tList));
%>