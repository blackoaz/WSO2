/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-06-12 08:05:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.services.refresh;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import java.net.URI;
import org.wso2.carbon.apimgt.impl.dto.SystemApplicationDTO;
import org.wso2.carbon.apimgt.impl.dao.SystemApplicationDAO;
import java.util.HashMap;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import org.wso2.carbon.apimgt.ui.admin.Util;
import java.util.Map;

public final class refresh_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/services/refresh/../constants.jsp", Long.valueOf(1685965442814L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.wso2.carbon.apimgt.impl.dto.SystemApplicationDTO");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("com.google.gson.GsonBuilder");
    _jspx_imports_classes.add("java.net.http.HttpRequest");
    _jspx_imports_classes.add("java.util.Base64");
    _jspx_imports_classes.add("org.wso2.carbon.apimgt.impl.dao.SystemApplicationDAO");
    _jspx_imports_classes.add("org.wso2.carbon.apimgt.ui.admin.Util");
    _jspx_imports_classes.add("com.google.gson.Gson");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("java.net.http.HttpClient");
    _jspx_imports_classes.add("org.apache.commons.logging.Log");
    _jspx_imports_classes.add("org.apache.commons.logging.LogFactory");
    _jspx_imports_classes.add("java.net.URI");
    _jspx_imports_classes.add("java.net.http.HttpResponse");
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


    //  TODO: Wrap these consts with an object and do `require` when needed ~tmkb
    String SETTINGS_REST_API_URL_SUFFIX = "/api/am/admin/v4/settings";
    String DCR_URL_SUFFIX = "/client-registration/v0.17/register";
    String AUTHORIZE_ENDPOINT_SUFFIX = "/oauth2/authorize";
    String OIDC_LOGOUT_ENDPOINT_SUFFIX = "/oidc/logout";
    String TOKEN_URL_SUFFIX = "/oauth2/token";
    String REVOKE_URL_SUFFIX = "/oauth2/revoke";
    String LOGIN_CALLBACK_URL_SUFFIX = "/services/auth/callback/login";
    String LOGOUT_CALLBACK_URL_SUFFIX = "/services/auth/callback/logout";

    String ADMIN_CLIENT_APP_NAME = "apim_admin_portal";
    String SUPER_TENANT_DOMAIN = "carbon.super";

    Log log = LogFactory.getLog(this.getClass());
    Map settings = Util.readJsonFile("/site/public/conf/settings.json", request.getServletContext());
    String context = (String) Util.readJsonObj(settings, "app.context");

    Cookie[] cookies = request.getCookies();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String cookieToken = "";
    for (int i = 0; i < cookies.length; i++) {
        String cookieName = cookies[i].getName();
        if ("AM_REF_TOKEN_DEFAULT_P2".equals(cookieName)) {
            cookieToken = cookies[i].getValue();
            break;
        }
    }
    String tokenParam = request.getParameter("refresh_token");
    if (cookieToken.isEmpty() || tokenParam == null) {
        log.error("Token request with no AM_REF_TOKEN_DEFAULT_P2 HTTP only cookie or no tokenParam received!!");
        response.setStatus(400);
        response.setContentType("application/json");
        HashMap<String, Object> res = new HashMap();
        res.put("error", true);
        res.put("message", "Cookie and/or param token part is missing!");
        out.println(gson.toJson(res));
    } else {
        HashMap<String, Object> tokenRequestData = new HashMap();
        tokenRequestData.put("grant_type", "refresh_token");
        tokenRequestData.put("refresh_token", tokenParam + cookieToken);

        SystemApplicationDAO systemApplicationDAO = new SystemApplicationDAO();
        SystemApplicationDTO systemApplicationDTO = systemApplicationDAO.getClientCredentialsForApplication(ADMIN_CLIENT_APP_NAME,
                SUPER_TENANT_DOMAIN);
        if (systemApplicationDTO == null) {
            log.error("Oauth application details not found for 'admin portal'");
            response.setStatus(401);
            response.setContentType("application/json");
            HashMap<String, Object> res = new HashMap();
            res.put("error", true);
            res.put("message", "Oauth application details not found for 'admin portal'");
            out.println(gson.toJson(res));
        } else {
            String clientId = systemApplicationDTO.getConsumerKey();
            String clientSecret = systemApplicationDTO.getConsumerSecret();
            String concatenatedCredential = clientId + ":" + clientSecret;
            byte[] byteValue = concatenatedCredential.getBytes();
            String base64encoded = Base64.getEncoder().encodeToString(byteValue);
            String tokenEndpoint = Util.getLoopbackOrigin((String) Util.readJsonObj(settings, "app.origin.host")) + TOKEN_URL_SUFFIX;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest post = HttpRequest.newBuilder()
                    .uri(URI.create(tokenEndpoint))
                    .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(tokenRequestData)))
                    .header("Authorization", "Basic " + base64encoded)
                    .build();
            HttpResponse<String> result = client.send(post, HttpResponse.BodyHandlers.ofString());
            if (result.statusCode() == 200) {
                response.setContentType("application/json");
                Map tokenResponse;
                try {
                    tokenResponse = gson.fromJson(result.body(), Map.class);
                    if (tokenResponse.get("access_token") == null) {
                        log.error("Could not retrieve access token. Response: " + result.body());
                        return;
                    }
                } catch (Exception e) {
                    log.error("Error while generating token", e);
                    return;
                }

                String accessToken = (String) tokenResponse.get("access_token");
                int tokenLength = accessToken.length();

                String idToken = (String) tokenResponse.get("id_token");
                int idTokenLength = idToken.length();

                String idTokenPart1 = idToken.substring(0, idTokenLength / 2);
                String idTokenPart2 = idToken.substring(idTokenLength / 2, idTokenLength);

                String accessTokenPart1 = accessToken.substring(0, tokenLength / 2);
                String accessTokenPart2 = accessToken.substring(tokenLength / 2, tokenLength);

                String refreshToken = (String) tokenResponse.get("refresh_token");
                tokenLength = refreshToken.length();
                String refreshTokenPart1 = refreshToken.substring(0, tokenLength / 2);
                String refreshTokenPart2 = refreshToken.substring(tokenLength / 2, tokenLength);

                double expiresIn = (double) tokenResponse.get("expires_in");

                // Setting access token part 1 as secured HTTP only cookie, Can't restrict the path to /api/am/publisher
                // because partial HTTP only cookie is required for get the user information from access token,
                // hence setting the HTTP only access token path to App context
                Cookie cookie = new Cookie("AM_ACC_TOKEN_DEFAULT_P2", accessTokenPart2);
                cookie.setPath(context + "/");
                cookie.setHttpOnly(true);
                cookie.setSecure(true);
                cookie.setMaxAge((int) expiresIn);
                response.addCookie(cookie);

                cookie = new Cookie("AM_ACC_TOKEN_DEFAULT_P2", accessTokenPart2);
                cookie.setPath("/api/am/admin/");
                cookie.setHttpOnly(true);
                cookie.setSecure(true);
                cookie.setMaxAge((int) expiresIn);
                response.addCookie(cookie);

                cookie = new Cookie("AM_REF_TOKEN_DEFAULT_P2", refreshTokenPart2);
                cookie.setPath(context + "/");
                cookie.setHttpOnly(true);
                cookie.setSecure(true);
                cookie.setMaxAge(86400); // TODO: Default value a day, need to get this from idn configs ~tmkb
                response.addCookie(cookie);

                cookie = new Cookie("WSO2_AM_TOKEN_1_Default", accessTokenPart1);
                cookie.setPath(context + "/");
                cookie.setSecure(true);
                cookie.setMaxAge((int) expiresIn);
                response.addCookie(cookie);

                cookie = new Cookie("WSO2_AM_REFRESH_TOKEN_1_Default", refreshTokenPart1);
                cookie.setPath(context + "/");
                cookie.setSecure(true);
                cookie.setMaxAge(86400); // TODO: Default value a day, need to get this from idn configs ~tmkb
                response.addCookie(cookie);

                cookie = new Cookie("AM_ID_TOKEN_DEFAULT_P2", idTokenPart2);
                cookie.setPath(context + "/services/logout");
                cookie.setSecure(true);
                cookie.setMaxAge((int) expiresIn);
                response.addCookie(cookie);

                cookie = new Cookie("AM_ID_TOKEN_DEFAULT_P1", idTokenPart1);
                cookie.setPath(context + "/services/logout");
                cookie.setSecure(true);
                cookie.setMaxAge((int) expiresIn);
                response.addCookie(cookie);
                out.println("{}");
            } else {
                log.warn("Something went wrong while refreshing the token");
                log.error(response);
                response.setStatus(500);
                response.setContentType("application/json");
                HashMap<String, Object> res = new HashMap();
                res.put("error", true);
                res.put("message", "Something went wrong while refreshing the token!!");
                out.println(gson.toJson(res));
            }
        }
    }

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
