/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-05-05 05:59:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forget_002dpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <title>Qu??n m???t kh???u</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("  <!-- icheck bootstrap -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/icheck-bootstrap/icheck-bootstrap.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"dist/css/adminlte.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition login-page\">\r\n");
      out.write("<div class=\"login-box\">\r\n");
      out.write("  <div class=\"card card-outline card-primary\">\r\n");
      out.write("    <div class=\"card-header text-center\">\r\n");
      out.write("      <a href=\"\" class=\"h1\"><b>Admin</b>LTE</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"card-body\">\r\n");
      out.write("      <p class=\"login-box-msg\">\r\n");
      out.write("        B???n qu??n m???t kh???u c???a m??nh? T???i ????y b???n c?? th??? d??? d??ng l???y l???i m???t kh???u m???i.</p>\r\n");
      out.write("      <form onsubmit=\"return validateForm()\" action=\"ForgetPassController\" method=\"POST\">\r\n");
      out.write("        <div class=\"input-group mb-3\">\r\n");
      out.write("        ");
String msg = (String )request.getAttribute("msg");
                if(msg != null) {
        
      out.write("\r\n");
      out.write("          <input type=\"email\" class=\"form-control is-invalid\" id=\"email\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("           <div class=\"invalid-feedback order-last err\">\r\n");
      out.write("                        ");
      out.print( msg );
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
} else { 
      out.write("\r\n");
      out.write("                      <input type=\"email\" class=\"form-control \" id=\"email\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("                      <div class=\"invalid-feedback order-last err\"></div>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("          <div class=\"input-group-append\">\r\n");
      out.write("            <div class=\"input-group-text\">\r\n");
      out.write("              <span class=\"fas fa-envelope\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row d-flex justify-content-center\">\r\n");
      out.write("          <div class=\"\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block\">L???y m???t kh???u</button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.col -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.login-card-body -->\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.login-box -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 4 -->\r\n");
      out.write("<script src=\"plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"dist/js/adminlte.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function validateForm() {\r\n");
      out.write("    var countError = 0; \r\n");
      out.write("    var email = $('#email').val();\r\n");
      out.write("    if (email.length == 0) {\r\n");
      out.write("      countError++;\r\n");
      out.write("      showError('#email', 'err', 'Vui l??ng nh???p email!')\r\n");
      out.write("\r\n");
      out.write("    } else  if(!validateEmail(email)) {\r\n");
      out.write("  \t  countError++;\r\n");
      out.write("        showError('#email', 'err', 'Sai ?????nh d???ng email!');\r\n");
      out.write("         \r\n");
      out.write("        }\r\n");
      out.write("        }\r\n");
      out.write("    if (countError == 0) {\r\n");
      out.write("  \t \r\n");
      out.write("      return true;\r\n");
      out.write("    }else {\r\n");
      out.write("  \t   return false;  \r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  function showError(element, element2, mes) {\r\n");
      out.write("    $(element).addClass('is-invalid');\r\n");
      out.write("    $('.' + element2).text(mes);\r\n");
      out.write("  }\r\n");
      out.write("  function removeError(element) {\r\n");
      out.write("    $(element).removeClass('is-invalid');\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("    // email \r\n");
      out.write("    $('#email').on('keyup',function() {\r\n");
      out.write("       var email = $('#email').val();\r\n");
      out.write("       if(email.length >0) {\r\n");
      out.write("    \t   removeError('#email');\r\n");
      out.write("       }else {\r\n");
      out.write("         showError('#email','err4','Vui l??ng nh???p email!');\r\n");
      out.write("       }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  })\r\n");
      out.write("  function validateEmail(email) {\r\n");
      out.write("\t\t var emailReg = /^([\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4})?$/;\r\n");
      out.write("\t\t\treturn emailReg.test(email);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
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
