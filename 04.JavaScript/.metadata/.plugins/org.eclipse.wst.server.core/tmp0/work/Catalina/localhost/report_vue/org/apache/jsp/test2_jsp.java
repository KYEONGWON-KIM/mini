/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-09-05 07:09:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("application/json; \r\ncharset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 response.setHeader("Access-Control-Allow-Origin", "*"); 
      out.write("\r\n");
      out.write("  [\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"China\",\r\n");
      out.write("    \"Java\": 28,\r\n");
      out.write("  \r\n");
      out.write("    \"Country\": \"Saint Helena\",\r\n");
      out.write("    \"Java\": 33,\r\n");
      out.write(" \r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Madagascar\",\r\n");
      out.write("    \"Java\": 51,\r\n");
      out.write("\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"cameroon\",\r\n");
      out.write("    \"Java\": 68,\r\n");
      out.write("\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Burundi\",\r\n");
      out.write("    \"Java\": 82,\r\n");
      out.write("\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Bangladesh\",\r\n");
      out.write("    \"Java\": 62,\r\n");
      out.write("\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Ethiopia\",\r\n");
      out.write("    \"Java\": 64,\r\n");
      out.write("\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Korea\",\r\n");
      out.write("    \"Java\": 32,\r\n");
      out.write("\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"togo\",\r\n");
      out.write("    \"Java\": 59,\r\n");
      out.write("\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Sierra Leone\",\r\n");
      out.write("    \"Java\": 73,\r\n");
      out.write("\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Benin\",\r\n");
      out.write("    \"Java\": 63,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"israel\",\r\n");
      out.write("    \"Java\": 18,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Nigeria\",\r\n");
      out.write("    \"Java\": 64,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Zambia\",\r\n");
      out.write("    \"Java\": 72,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Armenia\",\r\n");
      out.write("    \"Java\": 17,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"malawi\",\r\n");
      out.write("    \"Java\": 60,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Singapore\",\r\n");
      out.write("    \"Java\": 25,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Congo-Kinshasa\",\r\n");
      out.write("    \"Java\": 64,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"guinea\",\r\n");
      out.write("    \"Java\": 77,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"India\",\r\n");
      out.write("    \"Java\": 37,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Central African Republic\",\r\n");
      out.write("    \"Java\": 100,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Botswana\",\r\n");
      out.write("    \"Java\": 56,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Samoa\",\r\n");
      out.write("    \"Java\": 100,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"san marino\",\r\n");
      out.write("    \"Java\": 30,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Sri Lanka\",\r\n");
      out.write("    \"Java\": 42,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Hong Kong\",\r\n");
      out.write("    \"Java\": 27,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"lesotho\",\r\n");
      out.write("    \"Java\": 61,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Rwanda\",\r\n");
      out.write("    \"Java\": 31,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Uganda\",\r\n");
      out.write("    \"Java\": 51,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"chad\",\r\n");
      out.write("    \"Java\": 67,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Iceland\",\r\n");
      out.write("    \"Java\": 19,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"niger\",\r\n");
      out.write("    \"Java\": 56,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Ivory Coast\",\r\n");
      out.write("\t]\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Laos\",\r\n");
      out.write("    \"Java\": 42,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Burkina Faso\",\r\n");
      out.write("    \"Java\": 72,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"angola\",\r\n");
      out.write("    \"Java\": 51,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Myanmar\",\r\n");
      out.write("    \"Java\": 37,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Taiwan\",\r\n");
      out.write("    \"Java\": 20,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Belarus\",\r\n");
      out.write("    \"Java\": 34,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Nepal\",\r\n");
      out.write("    \"Java\": 24,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Congo-Brazzaville\",\r\n");
      out.write("    \"Java\": 67,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"cuba\",\r\n");
      out.write("    \"Java\": 26,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Luxembourg\",\r\n");
      out.write("    \"Java\": 35,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Liechtenstein\",\r\n");
      out.write("    \"Java\": 20,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"switzerland\",\r\n");
      out.write("    \"Java\": 29,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Mozambique\",\r\n");
      out.write("    \"Java\": 65,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"St. Kitts and Nevis\",\r\n");
      out.write("    \"Java\": 100,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Djibouti\",\r\n");
      out.write("    \"Java\": 47,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"somali\",\r\n");
      out.write("    \"Java\": 22,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Ukraine\",\r\n");
      out.write("    \"Java\": 27,\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Moldova\",\r\n");
      out.write("  },\r\n");
      out.write("  {\r\n");
      out.write("    \"Country\": \"Estonia\",\r\n");
      out.write("    \"Java\": 35,");
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
