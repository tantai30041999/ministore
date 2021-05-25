<%@page import="bean.User"%>
<%@page import="util.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
      <!-- Brand Logo -->
      <a href="index3.html" class="brand-link">
        <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
          style="opacity: .8">
        <span class="brand-text font-weight-light">AdminLTE 3</span>
      </a>

      <!-- Sidebar -->
      <div class="sidebar">
        <!-- Sidebar user panel (optional) -->
        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
          <div class="image">
            <img src="dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
          </div>
          <% User u =(User) session.getAttribute("user"); 
           %>
          <div class="info">
            <a href=<%=Util.getFullPath("Profile") %> class="d-block"><%= u.getName() %></a>
          </div>
        </div>



        <!-- Sidebar Menu -->
        <nav class="mt-2">
          <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
            <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
            <li class="nav-item menu-open ">
              <a  href="<%=Util.getFullPath("IndexController") %>" class="nav-link active">
                <i class="nav-icon fas fa-home"></i>
                <p>
                 Trang chủ
                </p>
              </a>
            </li>

            <li class="nav-item menu-open">
              <a href="<%=Util.getFullPath("SellProductController") %>" class="nav-link ">
                <i class="nav-icon fas fa-cart-arrow-down"></i>
                <p>
                  Bán hàng
                </p>
              </a>
            </li>


            <li class="nav-item menu-open">
              <a href="<%=Util.getFullPath("ProductController") %>"  class="nav-link ">
                <i class="nav-icon fas fa-list-alt"></i>
                <p>
                  Quản lý sản phẩm
                </p>
              </a>
            </li>
            <li class="nav-item">
              <a href="#" class="nav-link">
                <i class="nav-icon fas fa-cubes"></i>
                <p>
                  Quản lý kho
                  <i class="right fas fa-angle-left"></i>
                </p>
              </a>
              <ul class="nav nav-treeview">
                <li class="nav-item">
                  <a href=<%= Util.getFullPath("StockController") %> class="nav-link">
                    <i class="far fa-circle nav-icon"></i>
                    <p>Xem kho hàng</p>
                  </a>
                </li>
                <li class="nav-item">
                  <a href="" class="nav-link">
                    <i class="far fa-circle nav-icon"></i>
                    <p>Nhập kho</p>
                  </a>
                </li>
                <li class="nav-item">
                  <a href="" class="nav-link">
                    <i class="far fa-circle nav-icon"></i>
                    <p>Xuất kho</p>
                  </a>
                </li>
              </ul>
            </li>
           
            <li class="nav-item menu-open">
              <a href=<%=Util.getFullPath("SuppierController") %> class="nav-link ">
                <i class="nav-icon fas fa-address-book"></i>
                <p>
                  Quản lý nhà cung cấp
                </p>
              </a>
            </li>
           
            <li class="nav-item menu-open">
              <a href="pages/tables/staff.html" class="nav-link ">
                <i class="nav-icon fas  fa-address-card"></i>
                <p>
                  Quản lý nhân viên
                </p>
              </a>
            </li>

      
            <li class="nav-item menu-open">
              <a href="pages/tables/bill.html" class="nav-link ">
                <i class="nav-icon fas fa-file-invoice"></i>
                <p>
                  Quản lý hóa đơn
                </p>
              </a>
            </li>

            <li class="nav-item">
              <a href="#" class="nav-link">
                <i class="nav-icon fas fa-chart-pie"></i>
                <p>
                  Thống kê
                  <i class="right fas fa-angle-left"></i>
                </p>
              </a>
              <ul class="nav nav-treeview">
                <li class="nav-item">
                  <a href="pages/charts/proceeds.html" class="nav-link">
                    <i class="far fa-circle nav-icon"></i>
                    <p>Doanh thu</p>
                  </a>
                </li>
                <li class="nav-item">
                  <a href="<%= Util.getFullPath("InventoryInStockController") %>" class="nav-link">
                    <i class="far fa-circle nav-icon"></i>
                    <p>Hàng tồn kho</p>
                  </a>
                </li>
                
                   <li class="nav-item">
                  <a href="suggest.jsp" class="nav-link">
                    <i class="far fa-circle nav-icon"></i>
                    <p>Combo bán chạy</p>
                  </a>
                </li>

              </ul>
            </li>
          </ul>
        </nav>
        <!-- /.sidebar-menu -->
      </div>
      <!-- /.sidebar -->
    </aside>
    <script>
    
    $(document).ready(function() {
    	$('.nav a').on('click', function(event) {
    		$('.nav a.active').removeClass('active');
    		$(this).addClass('active');
    		
    	})
    })
    
    </script>