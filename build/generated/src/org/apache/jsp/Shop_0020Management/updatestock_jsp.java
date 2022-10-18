package org.apache.jsp.Shop_0020Management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.DbConnect;
import java.sql.PreparedStatement;

public final class updatestock_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <center><title>To Do App: Update</title>\n");
      out.write("        <style>\n");
      out.write("            div {\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            label {\n");
      out.write("                display: inline-block;\n");
      out.write("                width: 150px;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

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
                    PreparedStatement ps = DbConnect.connect().prepareStatement("update productstock set quantity=? where productid=?");                   
                    ps.setString(1, quantity);
                    ps.setString(2, productid);
                   
                    int n = ps.executeUpdate();
                    result = "Update " + n + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1>Update Purchase</h1>\n");
      out.write("        <form>\n");
      out.write("            <h3>");
      out.print(result);
      out.write("</h3>\n");
      out.write("            <input type=\"hidden\" name=\"check\" value=\"1\">\n");
      out.write("            <label>Product Id</label>\n");
      out.write("            <input value=\"");
      out.print(productid);
      out.write("\" name=\"productid\" type=\"number\"min=\"1\"><br>\n");
      out.write("            <label>Quantity</label>\n");
      out.write("            <input name=\"quantity\" value=\"");
      out.print(quantity);
      out.write("\" type=\"text\"><br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label> </label>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("            </center>\n");
      out.write("            </body>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
