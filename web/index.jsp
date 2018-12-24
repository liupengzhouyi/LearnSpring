<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-22
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body style="text-align: center">
    欢迎使用Spring

    <h1>hello</h1>
    This is my JSP page. <br>
    <!-- ServletContext == application -->
    在线人数：<%=application.getAttribute("count") %><br/>

  </body>
</html>
