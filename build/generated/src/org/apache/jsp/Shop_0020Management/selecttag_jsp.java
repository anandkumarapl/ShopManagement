package org.apache.jsp.Shop_0020Management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import components.SelectBoxes;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory.Result;
import database.DbConnect;
import java.sql.PreparedStatement;

public final class selecttag_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form>\n");
      out.write("            ");

            PreparedStatement ps=DbConnect.connect().prepareStatement("select*from products order by productname");
            ResultSet rs=ps.executeQuery();
            
      out.write("\n");
      out.write("            <select name=\"products\" >\n");
      out.write("                ");

                while(rs.next())
                {
                String productid="" + rs.getObject("productid");
                String productname=""+rs.getObject("productname");
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(productid);
      out.write('"');
      out.write('>');
      out.print(productname);
      out.write("</option>\n");
      out.write("                ");

                        }
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("                ");
      out.print(SelectBoxes.getProductsList("4", "productslist"));
      out.write("\n");
      out.write("        <select name=\"month\">\n");
      out.write("            \n");
      out.write("            <option value=\"1\"> jan</option>\n");
      out.write("            <option value=\"2\"> feb</option>\n");
      out.write("            <option value=\"3\"> mar</option>\n");
      out.write("            <option selected value=\"4\"> apr</option>\n");
      out.write("            <option value=\"5\"> may</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </select>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"buttonwa\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
