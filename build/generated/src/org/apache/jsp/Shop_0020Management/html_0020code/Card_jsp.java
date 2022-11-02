package org.apache.jsp.Shop_0020Management.html_0020code;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Card_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card h-100\">\n");
      out.write("      <img src=\"...\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card h-100\">\n");
      out.write("      <img src=\"...\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a short card.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card h-100\">\n");
      out.write("      <img src=\"...\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card h-100\">\n");
      out.write("      <img src=\"...\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("        <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
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
