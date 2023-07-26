<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-07-26
  Time: 오전 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="true" %>
<%request.setAttribute("k", 10);%>
<%request.setAttribute("m", true);%>

<html>
<head>
    <title>Title</title>
</head>
<body>
k: ${k}<br>
k + 5 : ${K + 5} <br>
k - 5 : ${K - 5} <br>
k * 5 : ${K * 5} <br>
k / 5 : ${K div 5} <br>
<%--/는 잘 인식 못할 수 있어서 예약어를 사용--%>
k : ${k}<br>
m : ${m}<br>
</body>
</html>
