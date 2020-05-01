<%--
  Created by IntelliJ IDEA.
  User: bruno
  Date: 4/28/2020
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>User Registration Result</title>
</head>
<body>
<h2>User Registered successfully. User Details are:</h2>
<%=request.getAttribute( "user" ) %>
</body>
</html>
