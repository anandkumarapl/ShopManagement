<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <center><title>To Do App: Update</title>
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
            String productid = "", productname = "", price = "", description = "", discount = "", unitofmeasurement = "", productcategory = "", result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    productid = request.getParameter("productid");
                    productname = request.getParameter("productname");
                    price = request.getParameter("price");
                    description = request.getParameter("description");
                    discount = request.getParameter("discount");
                    unitofmeasurement = request.getParameter("unitofmeasurement");
                    productcategory = request.getParameter("productcategory");
                    PreparedStatement ps = DbConnect.connect().prepareStatement("update products set productname=?,price=?,description=?,discount=?,unitofmeasurement=?,productcategory=? where productid=?");
                    
                    ps.setString(1, productname);
                    ps.setString(2, price);
                    ps.setString(3, description);
                    ps.setString(4, discount);
                    ps.setString(5, unitofmeasurement);
                    ps.setString(6, productcategory);
                    ps.setString(7, productid);
                    int n = ps.executeUpdate();
                    result = "Update " + n + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }
        %>

    <center>
        <h1>Update Purchase</h1>
        <form>
            <h3><%=result%></h3>
            <input type="hidden" name="check" value="1">
            <label>Product Id</label>
            <input value="<%=productid%>" name="productid" type="number"min="1"><br>
            <label>Product Name</label>
            <input name="productname" value="<%=productname%>" type="text"><br>
            <label>Price</label>
            <input name="price" value="<%=price%>" type="number"min="1"><br>
            <label>Description</label>
            <input name="description" value="<%=description%>" type="text"><br>
            <label>Discount</label>
            <input name="discount" value="<%=discount%>" type="text"><br>
            <label>UnitOfMeasurement</label>
            <input name="unitofmeasurement" value="<%=unitofmeasurement%>" type="text"><br>
            <label>Product Category</label>
            <input name="productcategory" value="<%=productcategory%>" type="text"><br>
            <br>
            <br>
            <label> </label>
            <input type="submit">
            </center>
            </body>
        </form>

        </html>
