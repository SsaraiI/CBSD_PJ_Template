<%-- 
    Document   : ShowComfirmation
    Created on : Oct 27, 2023, 9:16:51 AM
    Author     : iarsk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your Order is confirmed!</h1>
        <h1>The total amout is <%= request.getParameter("BTHidden") %></h1>
    </body>
</html>
