/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-06-12 09:34:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.lang.StringUtils;

public final class product_002dtitle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!-- localize.jsp MUST already be included in the calling script -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 if ("API Manager".equals(request.getAttribute("headerTitle"))) { 
      out.write("\n");
      out.write("<div class=\"product-title\">\n");
      out.write("    <div class=\"theme-icon inline auto transparent product-logo\">\n");
      out.write("      <svg viewBox=\"29 -6.639 72 27.639\">\n");
      out.write("            <circle fill=\"#F47B20\" cx=\"82.076\" cy=\"4.192\" r=\"8.691\"></circle>\n");
      out.write("            <path fill=\"#FFF\" d=\"M90.804 3.776l-.01-.115h-3.375l-.035.063c-.402.711-.798 1.425-1.193 2.14l-.348.626c-.601-1.454-1.198-2.908-1.795-4.363-.63-1.535-1.26-3.07-1.895-4.603l-.11-.266-.119.262A631.674 631.674 0 0080.565.541a479.296 479.296 0 01-1.905 4.212c-.897-.008-1.794-.007-2.695-.006-.823.001-1.648.002-2.475-.004l-.128-.001.002.128c.004.278.044.554.083.821l.021.148h.108c1.432-.002 2.863-.002 4.293-.001h1.512l.034-.073c.44-.972.878-1.947 1.316-2.921.421-.938.842-1.875 1.267-2.811.643 1.552 1.279 3.106 1.917 4.661.558 1.359 1.115 2.719 1.677 4.077l.098.237.127-.224c.576-1.025 1.147-2.054 1.719-3.082l.528-.951h2.74l.01-.115c.02-.253.017-.527-.01-.86z\"></path>\n");
      out.write("            <path fill=\"#F47B20\" d=\"M29-6.61c.849.001 1.696-.002 2.545.002 2.065 5.082 4.121 10.169 6.198 15.247 2.069-5.093 4.122-10.194 6.213-15.278 2.067 5.095 4.138 10.188 6.205 15.283 2.068-5.084 4.126-10.172 6.198-15.255.857.001 1.716-.002 2.573.001-2.883 7.122-5.778 14.24-8.658 21.364-.008.103-.157.273-.192.074-2.042-5.053-4.094-10.1-6.127-15.157-2.084 5.111-4.142 10.233-6.216 15.347A14572.55 14572.55 0 0129-6.61zM60.721-5.513c1.362-.97 3.118-1.239 4.751-1.046 1.875.271 3.473 1.576 4.363 3.213-.618.407-1.25.793-1.865 1.205-.329-.36-.55-.802-.893-1.15-.453-.498-1.041-.895-1.709-1.027-1.316-.275-2.805.074-3.734 1.083-.996 1.055-1.006 3.01.193 3.919.841.609 1.756 1.108 2.677 1.586 1.174.532 2.363 1.052 3.429 1.787.741.523 1.531 1.047 2 1.847.684 1.164.755 2.589.537 3.894-.291 1.735-1.421 3.248-2.881 4.192-1.289.842-2.883 1.128-4.401.968-1.382-.108-2.744-.654-3.748-1.624-1.047-.983-1.665-2.335-1.985-3.718.763-.234 1.526-.463 2.288-.698.283 1.176.807 2.364 1.789 3.12.933.742 2.211.893 3.355.68 1.338-.239 2.507-1.217 3.011-2.474.314-.84.416-1.786.158-2.653-.175-.6-.595-1.103-1.111-1.443a23.384 23.384 0 00-3.385-1.869 16.78 16.78 0 01-2.603-1.436c-.654-.453-1.336-.917-1.767-1.604-.69-1.087-.784-2.461-.533-3.698.245-1.244 1.032-2.337 2.064-3.054z\"></path>\n");
      out.write("            <path fill=\"#060709\" d=\"M81.274-6.596c1.743-.113 3.52.152 5.121.864 3.276 1.389 5.746 4.501 6.343 8.011.419 2.347.048 4.832-1.074 6.939-1.465 2.814-4.231 4.91-7.342 5.546-2.047.43-4.217.261-6.168-.498a10.824 10.824 0 01-4.76-3.617 10.718 10.718 0 01-2.128-5.908c-.145-2.528.646-5.1 2.194-7.105 1.841-2.442 4.761-4.027 7.814-4.232zm-1.297 2.449A8.64 8.64 0 0074.488.138c-.785 1.439-1.099 3.101-1.022 4.731h.024c.004.283.047.565.088.846.455 2.707 2.287 5.133 4.77 6.303a8.599 8.599 0 006.453.409c1.752-.574 3.295-1.744 4.35-3.254a8.58 8.58 0 001.538-4.546 5.025 5.025 0 00-.009-.841 8.645 8.645 0 00-1.596-4.581 8.651 8.651 0 00-4.566-3.258 8.568 8.568 0 00-4.541-.094zM93.688 3.447a6.424 6.424 0 013.479.015c1.542.453 2.786 1.721 3.318 3.223.526 1.563.294 3.35-.576 4.747-.709 1.137-1.603 2.146-2.506 3.132-1.461 1.578-2.927 3.152-4.387 4.732 2.661-.004 5.322-.001 7.983-.002-.001.568.001 1.136-.001 1.705-3.943-.004-7.886.003-11.829-.003 2.519-2.731 5.062-5.44 7.571-8.18.917-1.088 1.998-2.181 2.249-3.64.232-1.143-.129-2.387-.985-3.189-1.102-1.147-2.93-1.389-4.359-.759.04-.591.11-1.188.043-1.781z\"></path>\n");
      out.write("        </svg>\n");
      out.write("      </div>\n");
      out.write("      <h1 class=\"product-title-text\">API Manager</h1>\n");
      out.write("</div>\n");
 } else {

    String logoSrc = (String)request.getAttribute("logoSrc");
    String logoHeight = (String)request.getAttribute("logoHeight");
    String logoWidth = (String)request.getAttribute("logoWidth");
    String logoAltText = (String)request.getAttribute("logoAltText");
    if (!StringUtils.isEmpty(logoSrc)) {

      out.write("\n");
      out.write("        <div class=\"product-title box\">\n");
      out.write("            <img src=");
      out.print(logoSrc);
      out.write(" alt=");
      out.print(logoAltText);
      out.write(" height=");
      out.print(logoHeight);
      out.write(" width=");
      out.print(logoWidth);
      out.write(">\n");
      out.write("        </div>\n");
  } else { 
      out.write("\n");
      out.write("        <div class=\"product-title box\">\n");
      out.write("            <h1 class=\"product-title-text\" vertical-align=\"middle\">");
      out.print(request.getAttribute("headerTitle"));
      out.write("</h1>\n");
      out.write("        </div>\n");
  } 
      out.write('\n');
 } 
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
