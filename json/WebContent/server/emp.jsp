<%@page import="json.Emp"%>
<%@page import="com.google.gson.Gson"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String happy = request.getParameter("happy");
	Gson gson = new Gson();
	Emp e = gson.fromJson(happy, Emp.class);
	out.println(e);
%>