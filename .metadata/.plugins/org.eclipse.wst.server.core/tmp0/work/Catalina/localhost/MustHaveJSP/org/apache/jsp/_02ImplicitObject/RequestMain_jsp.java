/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-06-07 01:25:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._02ImplicitObject;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class RequestMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>내장 객체 - request</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2>1. 클라이언트와 서버의 환경정보 읽기</h2>\r\n");
      out.write("	\r\n");
      out.write("	<a href=\"./RequestWebInfo.jsp?eng=Hello&han=안녕\">  <!-- 하이퍼링크형태 -->\r\n");
      out.write("	GET 방식 전송\r\n");
      out.write("	</a>\r\n");
      out.write("	<br />\r\n");
      out.write("	<form action=\"RequestWebInfo.jsp\" method=\"post\">\r\n");
      out.write("		영어 : <input type=\"text\" name=\"eng\" value=\"Bye\"/><br/>\r\n");
      out.write("		한글 : <input type=\"text\" name=\"han\" value=\"잘 가\"/><br/>\r\n");
      out.write("		<input type=\"submit\" value=\"POST 방식 전송\"/>\r\n");
      out.write("	</form>\r\n");
      out.write("	\r\n");
      out.write("	<h2>2. 클라이언트의 매개변수 읽기</h2>\r\n");
      out.write("	<form method=\"post\" action=\"RequestParameter.jsp\">\r\n");
      out.write("		아이디 : <input type=\"text\" name=\"id\" value=\"\"/><br/>\r\n");
      out.write("		성별 : \r\n");
      out.write("		<input type=\"Radio\" name=\"sex\" value=\"man\"/>남자\r\n");
      out.write("		<input type=\"Radio\" name=\"sex\" value=\"woman\" checked=\"checked\"/>여자<br/>\r\n");
      out.write("		관심사항 :\r\n");
      out.write("		<input type=\"checkbox\" name=\"favo\" value=\"eco\"/>경제\r\n");
      out.write("		<input type=\"checkbox\" name=\"favo\" value=\"pol\" checked=\"checked\"/>정치\r\n");
      out.write("		<input type=\"checkbox\" name=\"favo\" value=\"ent\"/>연예<br/>\r\n");
      out.write("		자기소개 :\r\n");
      out.write("		<textarea name=\"intro\" cols=\"30\" rows=\"4\" ></textarea>\r\n");
      out.write("		<br/>\r\n");
      out.write("		<input type=\"submit\" value=\"전송하기\"/>\r\n");
      out.write("		\r\n");
      out.write("			\r\n");
      out.write("	</form>\r\n");
      out.write("	\r\n");
      out.write("	<h2>3. HTTP 요청 헤더 정보 읽기</h2>\r\n");
      out.write("	<a href=\"RequestHeader.jsp\">\r\n");
      out.write("	요청 헤더 정보 읽기\r\n");
      out.write("	</a>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
