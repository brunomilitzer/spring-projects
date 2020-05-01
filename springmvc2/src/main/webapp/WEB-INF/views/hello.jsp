<%--
  Created by IntelliJ IDEA.
  User: bruno
  Date: 4/27/2020
  Time: 5:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <%
        Integer id = ( Integer ) request.getAttribute( "id" );
        String name = ( String ) request.getAttribute( "name" );
        Integer salary = ( Integer ) request.getAttribute( "salary" );

        out.println( "ID: " + id);
        out.println( "Name: " + name);
        out.println( "Salary: " + salary);
    %>
    <br />
    ID: <b>${id}</b><br />
    Name: <b>${name}</b><br />
    Salary: <b>${salary}</b><br />
</body>
</html>
