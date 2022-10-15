<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <center><title>To Do App: Insert</title>
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
        String check=request.getParameter("check");
       boolean ispostback;
        if(check==null)
        ispostback=false;
        else
        ispostback=true;
        String name="",age="",address="",result="";
        System.out.println(ispostback);
       
        if(ispostback)
        {
            try
            {
            name=request.getParameter("name");
            age=request.getParameter("age");
             address=request.getParameter("address");
            PreparedStatement ps=DbConnect.connect().prepareStatement("insert into p values(?,?,?)");
            ps.setString(1, name);
             ps.setString(2, age);
               ps.setString(3, address);
                    int n=ps.executeUpdate();
                    result="Inserted " + n + " records";
            }
            catch(Exception ex)
            {
                System.out.println(ex);
                result=ex.getMessage();
            }
        }
        %>
       
       <center>
        <form>
            <h3><%=result%></h3>
            <input type="hidden" name="check" value="1">
            <label>name</label>
            <input value="<%=name%>" name="name"type="text"><br>
            <label>age</label>
            <input name="age" value="<%=age%>" type="number"><br>
            <label>address</label>
            <input name="address" value="<%=address%>" type="text"><br>
        <br>
        <br>
        <label> </label>
        <input type="submit">
        </center>
    </body>
        </form>
</html>