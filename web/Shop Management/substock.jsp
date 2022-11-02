<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <center><title>To Do App: Update</title>
                <%@include file="menu.jsp" %>

        <style>
            div {
                margin-bottom: 10px;
            }
            label {
                display: inline-block;
                width: 150px;
                text-align: right;
            }
        </style>
    </head>
    <body>

        <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            String productid = "",quantity="",result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    productid = request.getParameter("productid");
                    quantity = request.getParameter("quantity");
                    PreparedStatement ps = DbConnect.connect().prepareStatement("update productstock set quantity = quantity -?  where productid=?");                   
                    ps.setString(1, quantity);
                    ps.setString(2, productid);
                   
                    int n = ps.executeUpdate();
                    result = "Update " + n + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }
        %>

    <center>
        <h1>Sub Stock</h1>
        <form>
            <h3><%=result%></h3>
            <input type="hidden" name="check" value="1">
            <label>Product Id</label>
            <input value="<%=productid%>" name="productid" type="number"min="1"><br>
            <label>Quantity</label>
            <input name="quantity" value="<%=quantity%>" type="text"><br>
            <br>
            <br>
            <label> </label>
            <input type="submit">
            
            </body>
        </form>
  <iframe style="width: 100%; border-style: none;height: 500px;" src="Allproduct.jsp"></iframe>
  </center>
        </html>
                <%@include file="footer.jsp" %>
