/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-05-08 07:42:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.Util;
import bean.User;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bean.User");
    _jspx_imports_classes.add("util.Util");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <title>Trang chủ</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link rel=\"stylesheet\"\r\n");
      out.write("    href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Tempusdominus Bootstrap 4 -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css\">\r\n");
      out.write("  <!-- iCheck -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/icheck-bootstrap/icheck-bootstrap.min.css\">\r\n");
      out.write("  <!-- JQVMap -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/jqvmap/jqvmap.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"dist/css/adminlte.min.css\">\r\n");
      out.write("  <!-- overlayScrollbars -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/overlayScrollbars/css/OverlayScrollbars.min.css\">\r\n");
      out.write("  <!-- Daterange picker -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("  <!-- summernote -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/summernote/summernote-bs4.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/2.3.1/css/flag-icon.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("  <script>\r\n");
      out.write("    window.onload = function () {\r\n");
      out.write("    \r\n");
      out.write("    var chart = new CanvasJS.Chart(\"chartContainer\", {\r\n");
      out.write("      animationEnabled: true,\r\n");
      out.write("      theme: \"light2\",\r\n");
      out.write("      title:{\r\n");
      out.write("        text: \"Simple Line Chart\"\r\n");
      out.write("      },\r\n");
      out.write("      data: [{        \r\n");
      out.write("        type: \"line\",\r\n");
      out.write("            indexLabelFontSize: 16,\r\n");
      out.write("        dataPoints: [\r\n");
      out.write("          { y: 450 },\r\n");
      out.write("          { y: 414},\r\n");
      out.write("          { y: 520, indexLabel: \"\\u2191 highest\",markerColor: \"red\", markerType: \"triangle\" },\r\n");
      out.write("          { y: 460 },\r\n");
      out.write("          { y: 450 },\r\n");
      out.write("          { y: 500 },\r\n");
      out.write("          { y: 480 },\r\n");
      out.write("          { y: 480 },\r\n");
      out.write("          { y: 410 , indexLabel: \"\\u2193 lowest\",markerColor: \"DarkSlateGrey\", markerType: \"cross\" },\r\n");
      out.write("          { y: 500 },\r\n");
      out.write("          { y: 480 },\r\n");
      out.write("          { y: 510 }\r\n");
      out.write("        ]\r\n");
      out.write("      }]\r\n");
      out.write("    });\r\n");
      out.write("    chart.render();\r\n");
      out.write("    \r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"hold-transition sidebar-mini layout-fixed\">\r\n");
      out.write("  <div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Navbar -->\r\n");
      out.write("  <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\r\n");
      out.write("  \r\n");
      out.write("    <ul class=\"navbar-nav\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\" role=\"button\"><i class=\"fas fa-expand-arrows-alt\"></i></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"\" class=\"nav-link\">Trang chủ</a>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <!-- Right navbar links -->\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("          ");
 User user = (User) session.getAttribute("user"); 
                 if(user != null) {
          
      out.write("\r\n");
      out.write("          <span class=\"navbar-brand\">");
      out.print( user.getEmail() );
      out.write("</span>\r\n");
      out.write("          <a class=\"btn navbar-btn btn-primary navbar-right\" role=\"button\" href=");
      out.print(Util.getFullPath("Logout") );
      out.write(">Đăng xuất</a>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"dropdown\" style=\"display: inline-block;\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink78\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Ngôn ngữ</a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink78\"> \r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\"><span class=\"flag-icon flag-icon-us\"></span> English</a> \r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\"><span class=\"flag-icon flag-icon-vn\"></span> Tiếng Việt</a> \r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\"><span class=\"flag-icon flag-icon-jp\"></span> Japan</a> \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("  <!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Main Sidebar Container -->\r\n");
      out.write("    <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\r\n");
      out.write("      <!-- Brand Logo -->\r\n");
      out.write("      <a href=\"index3.html\" class=\"brand-link\">\r\n");
      out.write("        <img src=\"dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\"\r\n");
      out.write("          style=\"opacity: .8\">\r\n");
      out.write("        <span class=\"brand-text font-weight-light\">AdminLTE 3</span>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar -->\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        <!-- Sidebar user panel (optional) -->\r\n");
      out.write("        <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\r\n");
      out.write("          <div class=\"image\">\r\n");
      out.write("            <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle elevation-2\" alt=\"User Image\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"info\">\r\n");
      out.write("            <a href=");
      out.print(Util.getFullPath("Profile") );
      out.write(" class=\"d-block\">");
      out.print( user.getName() );
      out.write("</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidebar Menu -->\r\n");
      out.write("        <nav class=\"mt-2\">\r\n");
      out.write("          <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("            <!-- Add icons to the links using the .nav-icon class\r\n");
      out.write("               with font-awesome or any other icon font library -->\r\n");
      out.write("            <li class=\"nav-item menu-open\">\r\n");
      out.write("              <a href=\"./index.html\" class=\"nav-link active\">\r\n");
      out.write("                <i class=\"nav-icon fas fa-home\"></i>\r\n");
      out.write("                <p>\r\n");
      out.write("                 Trang chủ\r\n");
      out.write("                </p>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li class=\"nav-item menu-open\">\r\n");
      out.write("              <a href=\"\" class=\"nav-link \">\r\n");
      out.write("                <i class=\"nav-icon fas fa-cart-arrow-down\"></i>\r\n");
      out.write("                <p>\r\n");
      out.write("                  Bán hàng\r\n");
      out.write("                </p>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <li class=\"nav-item menu-open\">\r\n");
      out.write("              <a href=\"ProductController\" class=\"nav-link \">\r\n");
      out.write("                <i class=\"nav-icon fas fa-list-alt\"></i>\r\n");
      out.write("                <p>\r\n");
      out.write("                  Quản lý sản phẩm\r\n");
      out.write("                </p>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("                <i class=\"nav-icon fas fa-cubes\"></i>\r\n");
      out.write("                <p>\r\n");
      out.write("                  Quản lý kho\r\n");
      out.write("                  <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("                </p>\r\n");
      out.write("              </a>\r\n");
      out.write("              <ul class=\"nav nav-treeview\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a href=\"\" class=\"nav-link\">\r\n");
      out.write("                    <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                    <p>Xem kho hàng</p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a href=\"\" class=\"nav-link\">\r\n");
      out.write("                    <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                    <p>Nhập kho</p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a href=\"\" class=\"nav-link\">\r\n");
      out.write("                    <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                    <p>Xuất kho</p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("           \r\n");
      out.write("            <li class=\"nav-item menu-open\">\r\n");
      out.write("              <a href=\"pages/tables/supplier.html\" class=\"nav-link \">\r\n");
      out.write("                <i class=\"nav-icon fas fa-address-book\"></i>\r\n");
      out.write("                <p>\r\n");
      out.write("                  Quản lý nhà cung cấp\r\n");
      out.write("                </p>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("           \r\n");
      out.write("            <li class=\"nav-item menu-open\">\r\n");
      out.write("              <a href=\"pages/tables/staff.html\" class=\"nav-link \">\r\n");
      out.write("                <i class=\"nav-icon fas  fa-address-card\"></i>\r\n");
      out.write("                <p>\r\n");
      out.write("                  Quản lý nhân viên\r\n");
      out.write("                </p>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("            <li class=\"nav-item menu-open\">\r\n");
      out.write("              <a href=\"pages/tables/bill.html\" class=\"nav-link \">\r\n");
      out.write("                <i class=\"nav-icon fas fa-file-invoice\"></i>\r\n");
      out.write("                <p>\r\n");
      out.write("                  Quản lý hóa đơn\r\n");
      out.write("                </p>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("                <i class=\"nav-icon fas fa-chart-pie\"></i>\r\n");
      out.write("                <p>\r\n");
      out.write("                  Thống kê\r\n");
      out.write("                  <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("                </p>\r\n");
      out.write("              </a>\r\n");
      out.write("              <ul class=\"nav nav-treeview\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a href=\"pages/charts/proceeds.html\" class=\"nav-link\">\r\n");
      out.write("                    <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                    <p>Doanh thu</p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a href=\"pages/charts/productChart.html\" class=\"nav-link\">\r\n");
      out.write("                    <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                    <p>Hàng tồn kho</p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- /.sidebar-menu -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.sidebar -->\r\n");
      out.write("    </aside>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("      <!-- Content Header (Page header) -->\r\n");
      out.write("      <div class=\"content-header\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"row mb-2\">\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("              <h1 class=\"m-0\">Tổng quan</h1>\r\n");
      out.write("            </div><!-- /.col -->\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.content-header -->\r\n");
      out.write("\r\n");
      out.write("      <!-- Main content -->\r\n");
      out.write("      <section class=\"content\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <!-- Small boxes (Stat box) -->\r\n");
      out.write("          \r\n");
      out.write("          ");
 ArrayList<Integer> listCount = (ArrayList) request.getAttribute("listCount"); 
      out.write("\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-3 col-6\">\r\n");
      out.write("              <!-- small box -->\r\n");
      out.write("              <div class=\"small-box bg-info\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                  <h3> ");
      out.print( listCount.get(0));
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("                  <p>Loại hàng hóa</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                  <i class=\"ion ion-bag\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"#\" class=\"small-box-footer\">Xem thêm<i class=\"fas fa-arrow-circle-right\"></i></a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- ./col -->\r\n");
      out.write("            <div class=\"col-lg-3 col-6\">\r\n");
      out.write("              <!-- small box -->\r\n");
      out.write("              <div class=\"small-box bg-success\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                  <h3>");
      out.print( listCount.get(1));
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("                  <p>Nhà cung cấp</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                  <i class=\"ion ion-stats-bars\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"#\" class=\"small-box-footer\">Xem thêm<i class=\"fas fa-arrow-circle-right\"></i></a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- ./col -->\r\n");
      out.write("            <div class=\"col-lg-3 col-6\">\r\n");
      out.write("              <!-- small box -->\r\n");
      out.write("              <div class=\"small-box bg-warning\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                  <h3>");
      out.print( listCount.get(2));
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("                  <p>Nhân viên</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                  <i class=\"ion ion-person-add\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"#\" class=\"small-box-footer\">Xem thêm<i class=\"fas fa-arrow-circle-right\"></i></a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- ./col -->\r\n");
      out.write("            <div class=\"col-lg-3 col-6\">\r\n");
      out.write("              <!-- small box -->\r\n");
      out.write("              <div class=\"small-box bg-danger\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                  <h3>");
      out.print( listCount.get(3));
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("                  <p>Sản phẩm tồn kho</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                  <i class=\"ion ion-pie-graph\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"#\" class=\"small-box-footer\">Xem thêm<i class=\"fas fa-arrow-circle-right\"></i></a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- ./col -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.row -->\r\n");
      out.write("          <!-- Main row -->\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <!-- Left col -->\r\n");
      out.write("         \r\n");
      out.write("            <section class=\"col-lg-7 connectedSortable\">\r\n");
      out.write("              <!-- Custom tabs (Charts with tabs)-->\r\n");
      out.write("              <div class=\"col-sm-6\">\r\n");
      out.write("                <h2 class=\"m-0\">Sản phẩm bán chạy</h2>\r\n");
      out.write("              </div><!-- /.col -->\r\n");
      out.write("\r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <div class=\"tab-content p-0\">\r\n");
      out.write("                 \r\n");
      out.write("\r\n");
      out.write("                  <div id=\"chartContainer\" style=\"height: 370px; width: 100%;\"></div>\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("      </section>\r\n");
      out.write("      <!-- /.Left col -->\r\n");
      out.write("      <!-- right col (We are only adding the ID to make the widgets sortable)-->\r\n");
      out.write("\r\n");
      out.write("      <!-- right col -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.row (main row) -->\r\n");
      out.write("  </div><!-- /.container-fluid -->\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- /.content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.content-wrapper -->\r\n");
      out.write("  <footer class=\"main-footer\">\r\n");
      out.write("  \r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Control sidebar content goes here -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("  <!-- jQuery -->\r\n");
      out.write("  <script src=\"plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <!-- jQuery UI 1.11.4 -->\r\n");
      out.write("  <script src=\"plugins/jquery-ui/jquery-ui.min.js\"></script>\r\n");
      out.write("  <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("  <script>\r\n");
      out.write("    $.widget.bridge('uibutton', $.ui.button)\r\n");
      out.write("  </script>\r\n");
      out.write("  <!-- Bootstrap 4 -->\r\n");
      out.write("  <script src=\"plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  <!-- ChartJS -->\r\n");
      out.write("  <script src=\"plugins/chart.js/Chart.min.js\"></script>\r\n");
      out.write("  <!-- Sparkline -->\r\n");
      out.write("  <script src=\"plugins/sparklines/sparkline.js\"></script>\r\n");
      out.write("  <!-- JQVMap -->\r\n");
      out.write("  <script src=\"plugins/jqvmap/jquery.vmap.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/jqvmap/maps/jquery.vmap.usa.js\"></script>\r\n");
      out.write("  <!-- jQuery Knob Chart -->\r\n");
      out.write("  <script src=\"plugins/jquery-knob/jquery.knob.min.js\"></script>\r\n");
      out.write("  <!-- daterangepicker -->\r\n");
      out.write("  <script src=\"plugins/moment/moment.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("  <!-- Tempusdominus Bootstrap 4 -->\r\n");
      out.write("  <script src=\"plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("  <!-- Summernote -->\r\n");
      out.write("  <script src=\"plugins/summernote/summernote-bs4.min.js\"></script>\r\n");
      out.write("  <!-- overlayScrollbars -->\r\n");
      out.write("  <script src=\"plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js\"></script>\r\n");
      out.write("  <!-- AdminLTE App -->\r\n");
      out.write("  <script src=\"dist/js/adminlte.js\"></script>\r\n");
      out.write("  <!-- AdminLTE for demo purposes -->\r\n");
      out.write("  <script src=\"dist/js/demo.js\"></script>\r\n");
      out.write("  <!-- AdminLTE dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("  <script src=\"dist/js/pages/dashboard.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://canvasjs.com/assets/script/canvasjs.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
