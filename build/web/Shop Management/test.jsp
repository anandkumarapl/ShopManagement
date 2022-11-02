<%-- 
    Document   : test
    Created on : Oct 31, 2022, 11:14:11 AM
    Author     : Anand
--%>

<%@page import="components.Utilities"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Page</title>
    </head>
    <body>
        <%
            String output = Utilities.getSelectBox("select productname as text, productid as id from products order by text asc", "23", "products");
            out.println(output);
            
        %>
    </body>
</html>
