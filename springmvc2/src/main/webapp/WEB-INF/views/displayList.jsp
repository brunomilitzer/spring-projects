<%--
  Created by IntelliJ IDEA.
  User: bruno
  Date: 4/28/2020
  Time: 8:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" import="br.com.brunomilitzer.trainings.spring.springmvc.dto.Employee, java.util.List" %>
<html>
<head>
    <title>Object Details</title>
</head>
<body>
<%
    List<Employee> employees = ( List<Employee> ) request.getAttribute( "employees" );

    for ( Employee e: employees) {
        out.println(e.getId());
        out.println(e.getName());
        out.println(e.getSalary());
    }
%>
</body>
</html>
