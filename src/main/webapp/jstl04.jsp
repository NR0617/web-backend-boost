<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-07-26
  Time: 오후 1:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  List<String> list = new ArrayList<>();
  list.add("Hello");
  list.add("World");
  list.add("!!!!");

  request.setAttribute("list", list);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <c:forEach items="${list}" var="item" begin="1">
    ${item} <br>
  </c:forEach>
</body>
</html>
