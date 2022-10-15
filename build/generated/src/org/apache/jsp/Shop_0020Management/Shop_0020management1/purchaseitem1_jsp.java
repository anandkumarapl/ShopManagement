package org.apache.jsp.Shop_0020Management.Shop_0020management1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import components.SelectBoxes;
import java.sql.ResultSet;
import database.DbConnect;
import java.sql.PreparedStatement;

public final class purchaseitem1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>PurchaseItems</title>\n");
      out.write("         <style>\n");
      out.write("      div {\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("      }\n");
      out.write("      label {\n");
      out.write("        display: inline-block;\n");
      out.write("        width: 150px;\n");
      out.write("        text-align: right;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>PurchaseItems</h1>\n");
      out.write("        ");

            String check = request.getParameter("check");
            boolean ispostback;
            String receiptno = "";
            if (check == null) 
            {
                receiptno=request.getParameter("receiptno");
                ispostback = false;
            } else {
                ispostback = true;
            }
            String   productid = "", quantity = "", price = "", result = "";
            System.out.println(ispostback);
            if (ispostback) {
                try {
                    
                    receiptno = request.getParameter("reciptno");
                    productid = request.getParameter("productid");
                    quantity = request.getParameter("quantity");
                    price = request.getParameter("price");
                    PreparedStatement ps = database.DbConnect.connect().prepareStatement("insert into PurchaseItems values(?,productseq.nextval,?,?,?)");
                    //ps.setString(1, entryno);
                    ps.setString(1, receiptno);
                    ps.setString(2, productid);
                    ps.setString(3, quantity);
                    ps.setString(4, price);
                    int n = ps.executeUpdate();
                    result = "Inserted" + "records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }
        
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <h3>");
      out.print(result);
      out.write("</h3>\n");
      out.write("           \n");
      out.write("                    <form method=\"post\">\n");
      out.write("                        \n");
      out.write("            <input type=\"hidden\"  name=\"check\" value=\"1\"><br>\n");
      out.write("           \n");
      out.write("            receiptno<input value=\"");
      out.print(receiptno);
      out.write("\" autocomplete=\"off\" name=\"reciptno\" type=\"number\"><br>\n");
      out.write("            productid");
      out.print(SelectBoxes.getProductsList("4", "productid"));
      out.write("<br>\n");
      out.write("            quantity<input value=\"");
      out.print(quantity);
      out.write("\" autocomplete=\"off\" name=\"quantity\" type=\"number\"><br>\n");
      out.write("            price<input value=\"");
      out.print(price);
      out.write("\" autocomplete=\"off\" name=\"price\" type=\"number\"><br>\n");
      out.write("            <input name=\"option\" type=\"submit\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </select>\n");
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
