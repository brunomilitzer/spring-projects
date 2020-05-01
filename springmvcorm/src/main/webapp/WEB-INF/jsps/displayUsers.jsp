<%--
  Created by IntelliJ IDEA.
  User: bruno
  Date: 4/28/2020
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>List of Users</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID:</th>
        <th>Name:</th>
        <th>E-mail:</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
        </tr>
</c:forEach>
</table>
</body>
</html>
