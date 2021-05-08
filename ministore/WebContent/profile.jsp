<%@page import="bean.User"%>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Thông tin cá nhân</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">


  
    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
      <!-- Left navbar links -->
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
        </li>
        <li class="nav-item d-none d-sm-inline-block">
          <a href="index3.html" class="nav-link">Thông tin cá nhân</a>
        </li>

      </ul>

      <!-- Right navbar links -->
      <ul class="navbar-nav ml-auto">

        <div class="container">
          <nav class="navbar navbar-default" role="navigation">
              <span class="navbar-brand">UserName</span>
              <a class="btn navbar-btn btn-primary navbar-right" role="button" href="#">Đăng xuất</a>
          </nav>
          
      </div>
      <div class="dropdown" style="display: inline-block;">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink78" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Ngôn ngữ</a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink78"> 
            <a class="dropdown-item" href="#"><span class="flag-icon flag-icon-us"></span> English</a> 
            <a class="dropdown-item" href="#"><span class="flag-icon flag-icon-fr"></span> Tiếng Việt</a> 
            <a class="dropdown-item" href="#"><span class="flag-icon flag-icon-de"></span> Japan</a> 
        </div>
    </div>
      


      </ul>
    </nav>
    <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="../../index3.html" class="brand-link">
      <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
      <span class="brand-text font-weight-light">AdminLTE 3</span>
    </a>
  <!-- Sidebar Menu -->
  <nav class="mt-2">
    <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
      <!-- Add icons to the links using the .nav-icon class
         with font-awesome or any other icon font library -->
      <li class="nav-item menu-open">
        <a href="./index.html" class="nav-link active">
          <i class="nav-icon fas fa-home"></i>
          <p>
           Trang chủ
          </p>
        </a>
      </li>

      <li class="nav-item menu-open">
        <a href="" class="nav-link ">
          <i class="nav-icon fas fa-cart-arrow-down"></i>
          <p>
            Bán hàng
          </p>
        </a>
      </li>


      <li class="nav-item menu-open">
        <a href="pages/tables/product.html" class="nav-link ">
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
            <a href="" class="nav-link">
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
        <a href="./index.html" class="nav-link ">
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
        <a href="./index.html" class="nav-link ">
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
            <a href="" class="nav-link">
              <i class="far fa-circle nav-icon"></i>
              <p>Doanh thu</p>
            </a>
          </li>
          <li class="nav-item">
            <a href="" class="nav-link">
              <i class="far fa-circle nav-icon"></i>
              <p>Hàng tồn kho</p>
            </a>
          </li>

        </ul>
      </li>

      <li class="nav-item menu-open">
        <a href="./index.html" class="nav-link ">
          <i class="nav-icon fas fa-file-export"></i>
          <p>
            Báo cáo
          </p>
        </a>
      </li>




    </ul>
  </nav>
  <!-- /.sidebar-menu -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
           
          </div>
          <div class="col-sm-6">
            
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-md-3">


           <%User user = (User) session.getAttribute("user") ;
             String name  = user.getName();
           %>
            <!-- Profile Image -->
            <div class="card card-primary card-outline">
              <div class="card-body box-profile">
                <div class="text-center">
                  <img class="profile-user-img img-fluid img-circle"
                       src="dist/img/user4-128x128.jpg"
                       alt="User profile picture">
                </div>

                <h3 class="profile-username text-center"><%= name%></h3>
                <ul class="list-group list-group-unbordered mb-3">
                  <li class="list-group-item">
                    <b>Ngày sinh</b> <a class="float-right"><%=user.getBirthDay() %></a>
                  </li>
                
                  <li class="list-group-item">
                    <b>Số điện thoại</b> <a class="float-right"><%= user.getPhoneNumber() %></a>
                  </li>
                </ul>

              
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->

            
          </div>
          <!-- /.col -->
          <div class="col-md-9">
            <div class="card">
              <div class="card-header p-2">
                <ul class="nav nav-pills">
                   <li class="nav-item"><a class="nav-link active" href="#settings" data-toggle="tab">Thông tin</a></li>
                  <li class="nav-item"><a class="nav-link " href="#activity" data-toggle="tab">Đổi mật khẩu</a></li>
                  <li class="nav-item"><a class="nav-link" href="#timeline" data-toggle="tab">Lịch sử làm việc</a></li>
               
                </ul>
              </div><!-- /.card-header -->
              <div class="card-body">
                <div class="tab-content">
                  <div class=" tab-pane" id="activity">
                    <div class="card-body col-md-12 ">
                  
                      <form action="" method="post" >
                        <div class="input-group mb-3 ">
                          <input type="password" class="form-control" placeholder="Mật khẩu hiện tại">
                          <div class="input-group-append">
                            <div class="input-group-text">
                              <span class="fas fa-lock"></span>
                            </div>
                          </div>
                        </div>
                        <div class="input-group mb-3">
                          <input type="password" class="form-control" placeholder="Mật khẩu mới">
                          <div class="input-group-append">
                            <div class="input-group-text">
                              <span class="fas fa-lock"></span>
                            </div>
                          </div>
                        </div>
                        <div class="input-group mb-3">
                          <input type="password" class="form-control" placeholder="Xác nhận mật khẩu mới">
                          <div class="input-group-append">
                            <div class="input-group-text">
                              <span class="fas fa-lock"></span>
                            </div>
                          </div>
                        </div>
                        <div class="row  d-flex justify-content-center">
                          <div class="">
                            <button type="submit" class="btn btn-primary btn-block">Cập nhật</button>
                          </div>
                     
                        </div>
                      </form>
              
                    </div>
               
                    
                  </div>
              

                  <div class="active tab-pane" id="settings">
                    <form class="form-horizontal">
                      <div class="form-group row">
                        <label  class="col-sm-2 col-form-label">Tên</label>
                        <div class="col-sm-10">
                      
                          <input type="text" class="form-control" id="name"  placeholder="Tên"  value=<%= user.getName() %> >
                        </div>
                      </div>
                      <div class="form-group row">
                        <label for="inputEmail" class="col-sm-2 col-form-label">Ngày sinh</label>
                        <div class="col-sm-10">
                          <input type="date" class="form-control" id="date"  value=<%= user.getBirthDay() %>>
                        </div>
                      </div>
                      <div class="form-group row">
                        <label for="inputName2" class="col-sm-2 col-form-label">Số điện thoại</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" id="phone" placeholder="Số điện thoại"  value=<%= user.getPhoneNumber() %> >
                        </div>
                      </div>
                      <div class="form-group row">
                        <label for="inputName2" class="col-sm-2 col-form-label">Ảnh</label>
                        <div class="col-sm-10">
                          <input type="file"  >
                        </div>
                      </div>
                      
                      
                      <div class="form-group row d-flex justify-content-center">
                        <div class="">
                          <button type="submit" class="btn btn-primary">Cập nhật</button>
                        </div>
                      </div>
                    </form>
                  </div>
                  <!-- /.tab-pane -->
                </div>
                <!-- /.tab-content -->
              </div><!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
          <!-- /.col -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>


  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="dist/js/demo.js"></script>
</body>
</html>
    