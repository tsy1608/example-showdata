/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-05-04 14:21:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("   <head>\r\n");
      out.write("      <!-- BEGIN META -->\r\n");
      out.write("\t  <meta charset=\"utf-8\">\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("      <meta name=\"description\" content=\"\">\r\n");
      out.write("      <meta name=\"author\" content=\"Custom Theme\">\r\n");
      out.write("\t  <!-- END META -->\r\n");
      out.write("     \r\n");
      out.write("      <!-- BEGIN SHORTCUT ICON -->\r\n");
      out.write("\t  <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("\t  <!-- END SHORTCUT ICON -->\r\n");
      out.write("\t  \r\n");
      out.write("      <title>404</title>\r\n");
      out.write("\t  \r\n");
      out.write("\t  <!-- BEGIN STYLESHEET --> \r\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"><!-- BOOTSTRAP CSS -->\r\n");
      out.write("\t\t<link href=\"css/bootstrap-reset.css\" rel=\"stylesheet\"><!-- BOOTSTRAP CSS -->\r\n");
      out.write("\t\t<link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\"><!-- FONT AWESOME ICON STYLESHEET -->\r\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\"><!-- THEME BASIC CSS -->\r\n");
      out.write("\t\t<link href=\"css/style-responsive.css\" rel=\"stylesheet\"><!-- THEME BASIC RESPONSIVE  CSS -->\r\n");
      out.write("      <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("      <![endif]-->\r\n");
      out.write("\t  <!-- END STYLESHEET --> \r\n");
      out.write("   </head>\r\n");
      out.write("   <body class=\"body-404\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("\t     <!-- BEGIN MAIN CONTENT --> \r\n");
      out.write("         <section class=\"error-wrapper\">\r\n");
      out.write("            <h1>404</h1>\r\n");
      out.write("            <h2>page not found</h2>\r\n");
      out.write("            <p class=\"page-404\">Something went wrong or that page doesn’t exist yet. <a href=\"index.html\">Return Home</a></p>\r\n");
      out.write("         </section>\r\n");
      out.write("\t\t <!-- END MAIN CONTENT --> \r\n");
      out.write("      </div>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
