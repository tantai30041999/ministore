/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-05-08 10:52:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Product;
import java.util.ArrayList;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bean.Product");
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
      out.write("  <!DOCTYPE html>\r\n");
      out.write(" \r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Sản phẩm</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("    <!-- DataTables -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/datatables-bs4/css/dataTables.bootstrap4.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/datatables-responsive/css/responsive.bootstrap4.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"plugins/datatables-buttons/css/buttons.bootstrap4.min.css\">\r\n");
      out.write("    <!-- Theme style -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/adminlte.min.css\">\r\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"hold-transition sidebar-mini\">\r\n");
      out.write("  <div class=\"wrapper\">\r\n");
      out.write("    <!-- Navbar -->\r\n");
      out.write("    <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\r\n");
      out.write("    \r\n");
      out.write("      <ul class=\"navbar-nav\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\" role=\"button\"><i class=\"fas fa-expand-arrows-alt\"></i></a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("          <a href=\"\" class=\"nav-link\">Quản lý sản phẩm</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <!-- Right navbar links -->\r\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("            <span class=\"navbar-brand\">UserName</span>\r\n");
      out.write("            <a class=\"btn navbar-btn btn-primary navbar-right\" role=\"button\" href=\"#\">Đăng xuất</a>\r\n");
      out.write("          </nav>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Main Sidebar Container -->\r\n");
      out.write("    <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\r\n");
      out.write("      <!-- Brand Logo -->\r\n");
      out.write("      <a href=\"../../index3.html\" class=\"brand-link\">\r\n");
      out.write("        <img src=\"../../dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\" style=\"opacity: .8\">\r\n");
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
      out.write("            <a href=\"#\" class=\"d-block\">Alexander Pierce</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar Menu -->\r\n");
      out.write("            <nav class=\"mt-2\">\r\n");
      out.write("              <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("                <!-- Add icons to the links using the .nav-icon class\r\n");
      out.write("                  with font-awesome or any other icon font library -->\r\n");
      out.write("                <li class=\"nav-item menu-open\">\r\n");
      out.write("                  <a href=\"./index.html\" class=\"nav-link active\">\r\n");
      out.write("                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    Trang chủ\r\n");
      out.write("                    </p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("    \r\n");
      out.write("                <li class=\"nav-item menu-open\">\r\n");
      out.write("                  <a href=\"./index.html\" class=\"nav-link \">\r\n");
      out.write("                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("                    <p>\r\n");
      out.write("                      Bán hàng\r\n");
      out.write("                    </p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("                <li class=\"nav-item menu-open\">\r\n");
      out.write("                  <a href=\"./index.html\" class=\"nav-link \">\r\n");
      out.write("                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("                    <p>\r\n");
      out.write("                      Quản lý sản phẩm\r\n");
      out.write("                    </p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("                    <i class=\"nav-icon fas fa-chart-pie\"></i>\r\n");
      out.write("                    <p>\r\n");
      out.write("                      Quản lý kho\r\n");
      out.write("                      <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("                    </p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <ul class=\"nav nav-treeview\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a href=\"\" class=\"nav-link\">\r\n");
      out.write("                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                        <p>Xem kho hàng</p>\r\n");
      out.write("                      </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a href=\"\" class=\"nav-link\">\r\n");
      out.write("                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                        <p>Nhập kho</p>\r\n");
      out.write("                      </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a href=\"\" class=\"nav-link\">\r\n");
      out.write("                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                        <p>Xuất kho</p>\r\n");
      out.write("                      </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("    \r\n");
      out.write("                <li class=\"nav-item menu-open\">\r\n");
      out.write("                  <a href=\"./index.html\" class=\"nav-link \">\r\n");
      out.write("                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("                    <p>\r\n");
      out.write("                      Quản lý nhà cung cấp\r\n");
      out.write("                    </p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("    \r\n");
      out.write("                <li class=\"nav-item menu-open\">\r\n");
      out.write("                  <a href=\"./index.html\" class=\"nav-link \">\r\n");
      out.write("                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("                    <p>\r\n");
      out.write("                      Quản lý nhân viên\r\n");
      out.write("                    </p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("    \r\n");
      out.write("                <li class=\"nav-item menu-open\">\r\n");
      out.write("                  <a href=\"./index.html\" class=\"nav-link \">\r\n");
      out.write("                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("                    <p>\r\n");
      out.write("                      Quản lý hóa đơn\r\n");
      out.write("                    </p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("    \r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("                    <i class=\"nav-icon fas fa-chart-pie\"></i>\r\n");
      out.write("                    <p>\r\n");
      out.write("                      Thống kê\r\n");
      out.write("                      <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("                    </p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <ul class=\"nav nav-treeview\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a href=\"\" class=\"nav-link\">\r\n");
      out.write("                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                        <p>Doanh thu</p>\r\n");
      out.write("                      </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                      <a href=\"\" class=\"nav-link\">\r\n");
      out.write("                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                        <p>Hàng tồn kho</p>\r\n");
      out.write("                      </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("    \r\n");
      out.write("                  </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("    \r\n");
      out.write("                <li class=\"nav-item menu-open\">\r\n");
      out.write("                  <a href=\"./index.html\" class=\"nav-link \">\r\n");
      out.write("                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("                    <p>\r\n");
      out.write("                      Báo cáo\r\n");
      out.write("                    </p>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("              </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- /.sidebar-menu -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.sidebar -->\r\n");
      out.write("    </aside>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("      <!-- Content Header (Page header) -->\r\n");
      out.write("      <section class=\"content-header\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("              <h2>Danh sách sản phẩm đang bán</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("      </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <!-- Main content -->\r\n");
      out.write("      <section class=\"content\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("              <div class=\"card\">\r\n");
      out.write("                <div class=\"card-header\">\r\n");
      out.write("                  <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#addproduct\">\r\n");
      out.write("                    Thêm sản phẩm từ kho\r\n");
      out.write("                  </button>\r\n");
      out.write("        \r\n");
      out.write("                  <div class=\"input-group rounded col-md-6 float-right\">\r\n");
      out.write("                    <input type=\"search\" class=\"form-control rounded\" placeholder=\"Nhập mã sản phẩm\" aria-label=\"Search\"\r\n");
      out.write("                      aria-describedby=\"search-addon\" />\r\n");
      out.write("                    <span class=\"input-group-text border-0\" id=\"search-addon\">\r\n");
      out.write("                      <i class=\"fas fa-search\"></i>\r\n");
      out.write("                    </span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.card-header -->\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <table id=\"example2\" class=\"table table-bordered table-hover\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <th>#Mã sản phẩm</th>\r\n");
      out.write("                      <th>Tên</th>\r\n");
      out.write("                      <th>Loại</th>\r\n");
      out.write("                      <th>Số lượng</th>\r\n");
      out.write("                      <th>Chức năng</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    ");
ArrayList<Product> listProduct =(ArrayList<Product>) request.getAttribute("listProduct");
                        for(int i = 0; i < listProduct.size(); i++) {
                    
                    
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td>#");
      out.print( listProduct.get(i).getIdProduct() );
      out.write("</td>\r\n");
      out.write("                      <td>");
      out.print( listProduct.get(i).getNameProduct() );
      out.write("</td>\r\n");
      out.write("                      <td>");
      out.print(listProduct.get(i).getTypeProduct() );
      out.write("</td>\r\n");
      out.write("                      <td> ");
      out.print(listProduct.get(i).getQuantitySale() );
      out.write("</td>\r\n");
      out.write("                      <td>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"#\" class=\" btn-primary btn-lg\" role=\"button\" aria-pressed=\"true\" data-toggle=\"modal\" onclick=\"return showDetail('");
      out.print(listProduct.get(i).getIdProduct() );
      out.write("')\" data-target=\"#editproduct\"><i class=\"fas fa-edit\"></i></a>\r\n");
      out.write("                        <a href=\"#\" class=\" btn-danger btn-lg\" role=\"button\" aria-pressed=\"true\" ><i class=\"fas fa-trash-alt\"></i></a>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                      </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("             \r\n");
      out.write("                  \r\n");
      out.write("                    </tfoot>\r\n");
      out.write("                  </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.card-body -->\r\n");
      out.write("              </div>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.col -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container-fluid -->\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- /.content -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("      <!--Modal add new product -->  \r\n");
      out.write("  <div class=\"modal fade\" id=\"addproduct\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalCenterTitle\">Thêm sản phẩm</h5>\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("            <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("          </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <div class=\"col-md-12\">\r\n");
      out.write("            <div class=\"card card-primary\">\r\n");
      out.write("        \r\n");
      out.write("              <div class=\"card-body\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label >Chọn sản phẩm</label>\r\n");
      out.write("                  <select class=\"form-control\">\r\n");
      out.write("                    <option>Chọn sản phẩm</option>\r\n");
      out.write("                    <option>TH true milk</option>\r\n");
      out.write("                    <option>Bánh kẹo</option>\r\n");
      out.write("                    <option>Khăn giấy</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("         \t\r\n");
      out.write("                     <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"edit-quantityProduct\">Số lượng</label>\r\n");
      out.write("                  <input type=\"number\" id=\"edit-quantityProduct\" class=\"form-control\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"edit-quantityProduct\">Số lượng</label>\r\n");
      out.write("                  <input type=\"number\" id=\"edit-quantityProduct\" class=\"form-control\">\r\n");
      out.write("                </div>\r\n");
      out.write("        \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Hủy</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\">Thêm</button>\r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- /.card-body -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.card -->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--Modal edit product -->  \r\n");
      out.write("    <div class=\"modal fade\" id=\"editproduct\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <h5 class=\"modal-title\" id=\"exampleModalCenterTitle\">Chỉnh sửa sản phẩm</h5>\r\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("              <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("              <div class=\"card card-primary\">\r\n");
      out.write("          \r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("          \t  <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"idProduct\">Mã sản phẩm</label>\r\n");
      out.write("                  <input type=\"text\" id=\"idProduct\" class=\"form-control\" readonly=\"readonly\">\r\n");
      out.write("                </div>\r\n");
      out.write("                \t  <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"nameProduct\">Tên sản phẩm</label>\r\n");
      out.write("                  <input type=\"text\" id=\"nameProduct\" class=\"form-control\" readonly=\"readonly\">\r\n");
      out.write("                </div>\r\n");
      out.write("    \r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"quantityProduct\">Số lượng</label>\r\n");
      out.write("                    <input type=\"number\" id=\"quantityProduct\" class=\"form-control\">\r\n");
      out.write("                  </div>\r\n");
      out.write("          \r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"price\">Giá(VND)</label>\r\n");
      out.write("                    <input type=\"number\" id=\"price\" class=\"form-control\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                  <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Hủy</button>\r\n");
      out.write("                  <button type=\"button\" class=\"btn btn-primary\">Cập nhật</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.card-body -->\r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- /.card -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("      <!-- End modal-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Control Sidebar -->\r\n");
      out.write("    <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("      <!-- Control sidebar content goes here -->\r\n");
      out.write("    </aside>\r\n");
      out.write("    <!-- /.control-sidebar -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("  <!-- jQuery -->\r\n");
      out.write("  <script src=\"plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <!-- Bootstrap 4 -->\r\n");
      out.write("  <script src=\"plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  <!-- DataTables  & Plugins -->\r\n");
      out.write("  <script src=\"plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/datatables-bs4/js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/datatables-responsive/js/dataTables.responsive.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/datatables-responsive/js/responsive.bootstrap4.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/datatables-buttons/js/dataTables.buttons.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/datatables-buttons/js/buttons.bootstrap4.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/jszip/jszip.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/pdfmake/pdfmake.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/pdfmake/vfs_fonts.js\"></script>\r\n");
      out.write("  <script src=\"plugins/datatables-buttons/js/buttons.html5.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/datatables-buttons/js/buttons.print.min.js\"></script>\r\n");
      out.write("  <script src=\"plugins/datatables-buttons/js/buttons.colVis.min.js\"></script>\r\n");
      out.write("  <!-- AdminLTE App -->\r\n");
      out.write("  <script src=\"dist/js/adminlte.min.js\"></script>\r\n");
      out.write("  <!-- AdminLTE for demo purposes -->\r\n");
      out.write("  <script src=\"dist/js/demo.js\"></script>\r\n");
      out.write("  <!-- Page specific script -->\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("     function showDetail(idProduct) {\r\n");
      out.write("    \t\r\n");
      out.write("     $.ajax( {\r\n");
      out.write("    \t\t type:'GET',\r\n");
      out.write("    \t\t headers : {\r\n");
      out.write("\t\t\t\t\tAccept : \"application/json; charset=utf-8\",\r\n");
      out.write("\t\t\t\t\t\"Content-Type\" : \"application/json; charset=utf-8\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("    \t\t dataType :'json',\r\n");
      out.write("    \t\t data : {\r\n");
      out.write("    \t\t\t idProduct : idProduct,\r\n");
      out.write("             },\r\n");
      out.write("             url :'ProductDetailController',\r\n");
      out.write("             success : function(jsonProduct) {\r\n");
      out.write("            \tvar idProduct = jsonProduct.idProduct;\r\n");
      out.write("            \tvar nameProduct = jsonProduct.nameProduct;\r\n");
      out.write("            \tvar quantitySale = jsonProduct.quantitySale;\r\n");
      out.write("            \tvar priceSale = jsonProduct.price;\r\n");
      out.write("\r\n");
      out.write("                 $('#idProduct').val(idProduct);\r\n");
      out.write("                 $('#nameProduct').val(nameProduct);\r\n");
      out.write("                 $('#quantityProduct').val(quantitySale);\r\n");
      out.write("                 $('#price').val(priceSale);\r\n");
      out.write("            \t\r\n");
      out.write("             }\r\n");
      out.write("    \t\t \r\n");
      out.write("    \t })\r\n");
      out.write("     }\r\n");
      out.write("    \r\n");
      out.write("  </script>\r\n");
      out.write("  </body>\r\n");
      out.write("  </html>\r\n");
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
