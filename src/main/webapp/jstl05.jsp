<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-07-26
  Time: 오후 1:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<c:import url="http://localhost:8080/demo_war/jstlValue.jsp" var="urlValue1" scope="request" />--%>
<c:import url="https://www.google.com" var="urlValue2" scope="request" />


<html>
<head>
    <title>Title</title>
</head>
<body>
${urlValue1}<br>
${urlValue2}

</body>
</html>
