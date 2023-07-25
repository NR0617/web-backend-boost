<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-07-25
  Time: 오후 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello!!
<%
    System.out.println("jspService()");
%>

<%!
    public void jspInit() {
        System.out.println("jsp init()");
    }

    public void jspDestroy() {
        System.out.println("jsp destroy()");
    }
%>

</body>
</html>
