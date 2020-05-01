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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#id").change(
                function () {
                    $.ajax({
                        url: 'validateEmail',
                        data: {id: $("#id").val()},
                        success: function (responseText) {
                            $("#errMsg").text(responseText)

                            if (responseText != "") {
                                $("#id").focus();
                            }
                        }
                    });
                });
        });
    </script>

</head>
<body>
<form action="registerUser" method="post">
    ID: <input type="text" name="id" id="id" /> <span id="errMsg"></span> <br/>
    Name: <input type="text" name="name"/> <br/>
    Email: <input type="email" name="email"/> <br/>
    <input type="submit" name="register"/>
</form>

<br/>${result}

</body>
</html>