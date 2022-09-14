package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class database_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("package database;\n");
      out.write("\n");
      out.write("import java.sql.Connection;\n");
      out.write("import java.sql.DriverManager;\n");
      out.write("import oracle.jdbc.OracleDriver;\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" *\n");
      out.write(" * Author = Amitabh Bachchan\n");
      out.write(" */\n");
      out.write("public class DbConnect {\n");
      out.write("public static Connection connect()\n");
      out.write("{\n");
      out.write("    try\n");
      out.write("    {\n");
      out.write("        String user=\"system\",url=\"jdbc:oracle:thin:@localhost:1521:xe\",password=\"wrong\";\n");
      out.write("        DriverManager.registerDriver(new OracleDriver());\n");
      out.write("        return DriverManager.getConnection(url, user, password);\n");
      out.write("    }\n");
      out.write("    catch(Exception ex)\n");
      out.write("    {\n");
      out.write("        System.out.println(ex);\n");
      out.write("        return null;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("}");
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
