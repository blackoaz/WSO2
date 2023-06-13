/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-06-12 08:06:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.identity.application.authentication.endpoint.util.Constants;
import java.io.File;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.HashMap;

public final class samlsso_005fnotification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 private static final String INVALID_MESSAGE_MESSAGE =
        "The message was not recognized by the SAML 2.0 SSO Provider. Please check the logs for more details";
    private static final String EXCEPTION_MESSAGE = "Please try login again.";
    private static final String INVALID_MESSAGE_STATUS = "Not a valid SAML 2.0 Request Message!";
    private static final String EXCEPTION_STATUS = "Error when processing the authentication request!";

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1685965501586L));
    _jspx_dependants.put("/WEB-INF/lib/org.wso2.identity.apps.taglibs.layout.controller-1.5.0.jar", Long.valueOf(1685965516361L));
    _jspx_dependants.put("jar:file:/D:/APIM_HOME/repository/deployment/server/webapps/authenticationendpoint/WEB-INF/lib/org.wso2.identity.apps.taglibs.layout.controller-1.5.0.jar!/META-INF/taglib.tld", Long.valueOf(1667223724000L));
    _jspx_dependants.put("/includes/layout-resolver.jsp", Long.valueOf(1685965501194L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.Constants");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName;

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
    _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata.release();
    _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    String layout = "default";

      out.write('\n');
      out.write('\n');
      out.write('\n');

    if (config.getServletContext().getResource("extensions/layouts/custom/body.html") != null) {
        layout = "custom";
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');

    String layoutFileRelativePath;
    Map<String, Object> layoutData = new HashMap<String, Object>();

    if (!layout.equals("custom")) {
        if (layout.equals("default")) {
            layoutFileRelativePath = "includes/layouts/" + layout + "/body.html";
        } else {
            layoutFileRelativePath = "extensions/layouts/" + layout + "/body.html";
            if (config.getServletContext().getResource(layoutFileRelativePath) == null) {
                layout = "default";
                layoutFileRelativePath = "includes/layouts/default/body.html";
            }
        }
    } else {
        layoutFileRelativePath = "extensions/layouts/custom/body.html";
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

    String stat = request.getParameter(Constants.STATUS);
    String statusMessage = request.getParameter(Constants.STATUS_MSG);

    String errorStat = stat;
    String errorMsg = statusMessage;

    boolean unrecognizedStatus = true;
    if (EXCEPTION_STATUS.equals(stat) || INVALID_MESSAGE_STATUS.equals(stat)) {
        errorStat = "error.when.processing.authentication.request";
        unrecognizedStatus = false;
    }

    boolean unrecognizedStatusMsg = true;
    if (EXCEPTION_MESSAGE.equals(statusMessage) || INVALID_MESSAGE_MESSAGE.equals(statusMessage)) {
        errorMsg = "please.try.login.again";
        unrecognizedStatusMsg = false;
    }

    if (stat == null || statusMessage == null || unrecognizedStatus || unrecognizedStatusMsg) {
        errorStat = "authentication.error";
        errorMsg = "something.went.wrong.during.authentication";
    }
    session.invalidate();

      out.write('\n');
      out.write('\n');
      out.write('\n');

    layoutData.put("containerSize", "large");

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <!-- header -->\n");
      out.write("    ");

        File headerFile = new File(getServletContext().getRealPath("extensions/header.jsp"));
        if (headerFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"login-portal layout authentication-portal-layout\">\n");
      out.write("    ");
      //  layout:main
      org.wso2.identity.apps.taglibs.layout.controller.MainTagHandler _jspx_th_layout_005fmain_005f0 = (org.wso2.identity.apps.taglibs.layout.controller.MainTagHandler) _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata.get(org.wso2.identity.apps.taglibs.layout.controller.MainTagHandler.class);
      boolean _jspx_th_layout_005fmain_005f0_reused = false;
      try {
        _jspx_th_layout_005fmain_005f0.setPageContext(_jspx_page_context);
        _jspx_th_layout_005fmain_005f0.setParent(null);
        // /samlsso_notification.jsp(79,4) name = layoutName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_layout_005fmain_005f0.setLayoutName( layout );
        // /samlsso_notification.jsp(79,4) name = layoutFileRelativePath type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_layout_005fmain_005f0.setLayoutFileRelativePath( layoutFileRelativePath );
        // /samlsso_notification.jsp(79,4) name = data type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_layout_005fmain_005f0.setData( layoutData );
        int _jspx_eval_layout_005fmain_005f0 = _jspx_th_layout_005fmain_005f0.doStartTag();
        if (_jspx_eval_layout_005fmain_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("        ");
            //  layout:component
            org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler _jspx_th_layout_005fcomponent_005f0 = (org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler) _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.get(org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler.class);
            boolean _jspx_th_layout_005fcomponent_005f0_reused = false;
            try {
              _jspx_th_layout_005fcomponent_005f0.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fmain_005f0);
              // /samlsso_notification.jsp(80,8) name = componentName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_layout_005fcomponent_005f0.setComponentName("ProductHeader");
              int _jspx_eval_layout_005fcomponent_005f0 = _jspx_th_layout_005fcomponent_005f0.doStartTag();
              if (_jspx_eval_layout_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <!-- product-title -->\n");
                  out.write("            ");

                File productTitleFile = new File(getServletContext().getRealPath("extensions/product-title.jsp"));
                if (productTitleFile.exists()) {
            
                  out.write("\n");
                  out.write("                ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-title.jsp", out, false);
                  out.write("\n");
                  out.write("            ");
 } else { 
                  out.write("\n");
                  out.write("                ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-title.jsp", out, false);
                  out.write("\n");
                  out.write("            ");
 } 
                  out.write("\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_layout_005fcomponent_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.reuse(_jspx_th_layout_005fcomponent_005f0);
              _jspx_th_layout_005fcomponent_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_layout_005fcomponent_005f0, _jsp_getInstanceManager(), _jspx_th_layout_005fcomponent_005f0_reused);
            }
            out.write("\n");
            out.write("        ");
            //  layout:component
            org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler _jspx_th_layout_005fcomponent_005f1 = (org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler) _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.get(org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler.class);
            boolean _jspx_th_layout_005fcomponent_005f1_reused = false;
            try {
              _jspx_th_layout_005fcomponent_005f1.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fcomponent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fmain_005f0);
              // /samlsso_notification.jsp(91,8) name = componentName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_layout_005fcomponent_005f1.setComponentName("MainSection");
              int _jspx_eval_layout_005fcomponent_005f1 = _jspx_th_layout_005fcomponent_005f1.doStartTag();
              if (_jspx_eval_layout_005fcomponent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <div class=\"ui segment\">\n");
                  out.write("                <h2>");
                  out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "saml.sso"));
                  out.write("</h2>\n");
                  out.write("                <h4>");
                  out.print(AuthenticationEndpointUtil.i18n(resourceBundle, errorStat));
                  out.write("</h4>\n");
                  out.write("                <p>");
                  out.print(AuthenticationEndpointUtil.i18n(resourceBundle, errorMsg));
                  out.write("</p>\n");
                  out.write("                ");
 if (new File(getServletContext().getRealPath("includes/error-tracking-reference.jsp")).exists()) { 
                  out.write("\n");
                  out.write("                    <div class=\"ui divider hidden\"></div>\n");
                  out.write("                    ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/error-tracking-reference.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("align", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("centered", request.getCharacterEncoding()), out, false);
                  out.write("\n");
                  out.write("                ");
 } 
                  out.write("\n");
                  out.write("            </div>\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_layout_005fcomponent_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fcomponent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.reuse(_jspx_th_layout_005fcomponent_005f1);
              _jspx_th_layout_005fcomponent_005f1_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_layout_005fcomponent_005f1, _jsp_getInstanceManager(), _jspx_th_layout_005fcomponent_005f1_reused);
            }
            out.write("\n");
            out.write("        ");
            //  layout:component
            org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler _jspx_th_layout_005fcomponent_005f2 = (org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler) _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.get(org.wso2.identity.apps.taglibs.layout.controller.ComponentTagHandler.class);
            boolean _jspx_th_layout_005fcomponent_005f2_reused = false;
            try {
              _jspx_th_layout_005fcomponent_005f2.setPageContext(_jspx_page_context);
              _jspx_th_layout_005fcomponent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_layout_005fmain_005f0);
              // /samlsso_notification.jsp(104,8) name = componentName type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_layout_005fcomponent_005f2.setComponentName("ProductFooter");
              int _jspx_eval_layout_005fcomponent_005f2 = _jspx_th_layout_005fcomponent_005f2.doStartTag();
              if (_jspx_eval_layout_005fcomponent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <!-- product-footer -->\n");
                  out.write("            ");

                File productFooterFile = new File(getServletContext().getRealPath("extensions/product-footer.jsp"));
                if (productFooterFile.exists()) {
            
                  out.write("\n");
                  out.write("                ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-footer.jsp", out, false);
                  out.write("\n");
                  out.write("            ");
 } else { 
                  out.write("\n");
                  out.write("                ");
                  org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-footer.jsp", out, false);
                  out.write("\n");
                  out.write("            ");
 } 
                  out.write("\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_layout_005fcomponent_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_layout_005fcomponent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005flayout_005fcomponent_0026_005fcomponentName.reuse(_jspx_th_layout_005fcomponent_005f2);
              _jspx_th_layout_005fcomponent_005f2_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_layout_005fcomponent_005f2, _jsp_getInstanceManager(), _jspx_th_layout_005fcomponent_005f2_reused);
            }
            out.write("\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_layout_005fmain_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_layout_005fmain_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005flayout_005fmain_0026_005flayoutName_005flayoutFileRelativePath_005fdata.reuse(_jspx_th_layout_005fmain_005f0);
        _jspx_th_layout_005fmain_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_layout_005fmain_005f0, _jsp_getInstanceManager(), _jspx_th_layout_005fmain_005f0_reused);
      }
      out.write("\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    ");

        File footerFile = new File(getServletContext().getRealPath("extensions/footer.jsp"));
        if (footerFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
