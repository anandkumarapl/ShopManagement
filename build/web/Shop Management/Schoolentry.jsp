<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            String schoolid = "", schoolname= "", result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    schoolid = request.getParameter("schoolid");
                    schoolname = request.getParameter("schoolname");
                 
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into school values(?,?)");
                    ps.setString(1, schoolid);
                    ps.setString(2, schoolname);
                   
                    int n = ps.executeUpdate();
                    result = "Inserted " + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>


        <h1>coaching</h1>
        <form>
            <h3><%=result%></h3>
            <input type="hidden"  name="check" value="1">
            schoolid<input value="<%=schoolid%>" autocomplete="off" name="schoolid" type="number">
            schoolname<input name="schoolname" autocomplete="off" value="<%=schoolname%>" type="text">
           
            <br>
            <br>
            <input type="submit">
    </body>
</html>