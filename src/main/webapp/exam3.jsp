<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-07-25
  Time: 오후 1:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- JSP 주석입니다!
 여러줄로 사용 가능합니다
 --%>
<!--HTML 주석입니다-->
<%
    //자바 주석입니다
    /*
    * 여러 줄도 가능합니다
    * */
    for(int i = 1 ; i <= 5; i++) {


  %>
<H<%=i%>> 한글 한글 </H<%=i%>>

<%
}
%>
</body>
</html>
