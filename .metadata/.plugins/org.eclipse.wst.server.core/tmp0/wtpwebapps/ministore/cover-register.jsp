<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Xác nhận OTP</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/adminlte.min.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="card card-outline card-primary">
    <div class="card-header text-center">
      <a href="" class="h1"><b>Admin</b>LTE</a>
    </div>
    <div class="card-body">
             
      <form action="OTPConfirmController" method="post">
        <div class="input-group mb-3">
        
        <% String msg = (String) request.getAttribute("msg");
             if(msg != null) {
        %>
          <input type="text" class="form-control is-invalid" name="otpCode" placeholder="Mã OTP">
          <% } else { %>
           <input type="text" class="form-control" name="otpCode" placeholder="Mã OTP">
          <%} %>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-shield-alt"></span>
            </div>
          </div>
          <div class="invalid-feedback order-last">
              Mã OTP không hợp lệ 
        </div>
        </div>
        <div class="row d-flex justify-content-center">
          <div class="floa">
            <button type="submit" class="btn btn-primary btn-block">Xác nhận</button>
         
          </div>
        
        </div>
     
      </form>
    
    </div>
 
  </div>
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>
</body>
</html>
    