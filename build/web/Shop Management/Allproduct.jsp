<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Courses</title>

    </head>
    <body>
    <center>
        <h1>All Producrt</h1>
        <%
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from productstock order by productid");
            ResultSet rs = ps.executeQuery();
        %>
        <table border="1">
            <tr><th>Product id</th><th>Product Quantity</th></tr>



            <%
                while (rs.next()) {
                    String productid = "" + rs.getObject("productid");
                    String quantity = "" + rs.getObject("quantity");
            %>
            <tr><td><%=productid%></td><td><a href="Allproduct.jsp?productid=<%=productid%>" target="productstock"><%=quantity%></a></td></tr>

            <%
                }
            %>
        </table>
    </center>
</body>
</html>
