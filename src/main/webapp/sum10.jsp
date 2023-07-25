<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-07-25
  Time: 오전 11:35
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    int total = 0;
    for (int i = 0; i <= 10; i++) {
        total = total + i;
    }
%>

1부터 10까지의 합 : <%=total%>  <%--out.print(total); == <%=%>--%>

</body>
</html>
