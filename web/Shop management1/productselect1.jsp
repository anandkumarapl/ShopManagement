
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Seletct</title>
    </head>
    <body>
    <center>
        <%
            PreparedStatement statement = DbConnect.connect().prepareStatement("select productid,productname from products  order by productid");
            ResultSet rs = statement.executeQuery();
        %>
        <form>
            <input type="hidden" name="check">
            <%
                String check = "",result="";
                check = request.getParameter("check");
                boolean ispostback = true;
                if (check == null) {
                    ispostback = false;
                }
            %>
            <select name="product">
                <option>Select</option>
                <%while (rs.next()) {
                        String productid = "" + rs.getObject("productid");
                        String productname = "" + rs.getObject("productname");
                %>
                <option value="<%=productid%>"><%=productname%></option>
                <%
                    }
                %>
                Quantity<input name="quantity" value="1" type="number" min="1">
                <input type="submit" value="Submit">
            </select>
                <%
                if(ispostback)
                {
                    try{                       
                  
                    String productid=request.getParameter("productid");
                    String quantity=request.getParameter("quantity");
                    PreparedStatement ps=DbConnect.connect().prepareStatement("insert into productstock values(?,?)");
                    ps.setString(2, productid);
                    ps.setString(1, quantity);
                    int n=ps.executeUpdate();
                    result="Inserted " + n + " records";
                    }
                    catch(Exception ex)
                    {
                System.out.println(ex);
              result= ex.getMessage();
                }
                }
               %>
        <%
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from productstock ");
                rs=ps.executeQuery();
        %>
        <table border="1">
            <tr><th>Product id</th><th>Product Quantity</th></tr>
            <%
                while (rs.next()) {
                    String productid = "" + rs.getObject("productid");
                    String quantity = "" + rs.getObject("quantity");
            %>
              <tr><td><%=productid%></td><td><%=quantity%></td></tr>

            <%
                }
            %>
           
        </form>
    </center>
</body>
</html>
