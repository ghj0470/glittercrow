<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="json.Person"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- <%
    String param = request.getParameter("param");
    Gson gson = new Gson();
    Map<String,String> paramMap = gson.fromJson(param,Map.class); //gson 맵으로받아서 알아서 맵을로 보여주도록 만듬
    out.println(paramMap.get("name"));
    out.println(paramMap.get("id"));
    out.println(paramMap.get("pwd"));
    out.println(paramMap.get("trans"));
    out.println(param);
    %>
 --%>    <%
   // String param = request.getParameter("param");
    Gson gson = new Gson();
   // Person p = gson.fromJson(param,Person.class);
    
   
  
    Person p = gson.fromJson(request.getReader(),Person.class); //gson형태로 string만 집어넣으면 알아서 뽑아줌 파라미터도 ~필요없음
   // out.println(p);
    List<Person> pList = new ArrayList<Person>();
    for(int i=1;i<=10;i++){
    	p=new Person();
    	p.setId("id"+i);
    	p.setPwd("비번"+i);
    	p.setName("이름"+i);
    	p.setTrans(((i%2)+1)+"");
    	pList.add(p);
    }
    out.println(gson.toJson(pList));
    %>
{"name":"테스트"}