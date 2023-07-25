<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-07-25
  Time: 오후 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
id: <%= getId()%>
<%!
  String id = "u001"; //멤버 변수 선언
  public String getId() { //메소드 선언
    return id;
  }
%>

</body>
</html>
