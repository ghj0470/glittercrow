<%@page import="com.google.gson.Gson"%>
<%@page import="json.Depart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String happy = request.getParameter("happy");
	Gson gson = new Gson();
	Depart d = gson.fromJson(happy, Depart.class);
	out.println(d);
%>