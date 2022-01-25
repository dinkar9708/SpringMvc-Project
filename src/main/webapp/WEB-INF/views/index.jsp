<%--
  Created by IntelliJ IDEA.
  User: dinka
  Date: 23-10-2021
  Time: 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
</head>
<body>
 <h1>This is Home page</h1>
<h1>url home</h1>
<%
    String name = (String)request.getAttribute("name");
%>

<h1>Name is <%=name%></h1>
</body>
</html>
