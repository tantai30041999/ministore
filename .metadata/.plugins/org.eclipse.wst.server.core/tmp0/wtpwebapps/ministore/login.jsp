<%@page import="util.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Đăng nhập</title>

   <%@include file="font.jsp" %>
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <!-- /.login-logo -->
  <div class="card card-outline card-primary">
    <div class="card-header text-center">
      <a href="../../index2.html" class="h1"><b>Admin</b>LTE</a>
    </div>
    <div class="card-body">
    

      <form action="SignInController" method="POST">
        <div class="input-group mb-3">
        <% String msg = (String) request.getAttribute("msg");
             if(msg != null) {
        %>
          <input type="email" class="form-control is-invalid" name="email" placeholder="Email">
           <div class="invalid-feedback order-last">
                   <%= msg %>
            </div>
        <%} else {%>
         <input type="email" class="form-control " name="email" placeholder="Email">
        <%} %>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" name="password" placeholder="Password">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="col-6 justify-content-center mx-auto text-center">

          <input type="submit" class="btn btn-block btn-primary" value="Đăng nhập">
               
          </input>
          <br>

        </div>
      </form>
   

      <p class="mb-1 " style="text-align: center;">
        <a href="<%=Util.getFullPath("forget-password.jsp") %>" >Quên mật khẩu?</a> &nbsp
        <a href="<%=Util.getFullPath("register.jsp") %>" class="text-danger">Đăng ký ngay</a>
      </p>


     
    <!-- /.card-body -->
  </div>
  <!-- /.card -->
</div>

<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>
</body>
</html>
