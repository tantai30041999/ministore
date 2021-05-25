<%@page import="bean.User"%>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Thông tin cá nhân</title>


</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">

     <%@ include file="header.jsp" %>
  
    
  
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


           <%User us = (User) session.getAttribute("user") ;
             String name  = us.getName();
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
                      
                          <input type="text" class="form-control" id="name"  placeholder="Tên"  value=<%= us.getName() %> >
                        </div>
                      </div>
                      <div class="form-group row">
                        <label for="inputEmail" class="col-sm-2 col-form-label">Ngày sinh</label>
                        <div class="col-sm-10">
                          <input type="date" class="form-control" id="date"  value=<%= us.getBirthDay() %>>
                        </div>
                      </div>
                      <div class="form-group row">
                        <label for="inputName2" class="col-sm-2 col-form-label">Số điện thoại</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" id="phone" placeholder="Số điện thoại"  value=<%= us.getPhoneNumber() %> >
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
    