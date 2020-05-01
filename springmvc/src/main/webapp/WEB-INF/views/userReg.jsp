<%--
  Created by IntelliJ IDEA.
  User: bruno
  Date: 4/28/2020
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
<form action="registerUser" method="post">
    ID: <input type="text" name="id"/> <br/>
    Name: <input type="text" name="name"/> <br/>
    Email: <input type="email" name="email"/> <br/>
    <input type="submit" name="register"/>
</form>
</body>
</html>
