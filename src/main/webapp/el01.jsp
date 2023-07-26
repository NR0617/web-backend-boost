<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-07-26
  Time: 오전 9:28
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    pageContext.setAttribute("p1", "page scope value");
    request.setAttribute("r1", "request scope value");
    session.setAttribute("s1", "session scope value");
    application.setAttribute("a1", "application scope value");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>el01</title>
</head>
<body>

<h1>EL is working!</h1>

<p>page scope value: ${pageScope.p1}</p>
request scope value: ${r1}<br> <%--만약 변수명이 겹치면 작은 스코프부터 찾는다--%>
<p>session scope value: <%=session.getAttribute("s1")%></p>
application scope value: <%=application.getAttribute("a1")%><br>



</body>
</html>
