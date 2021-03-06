<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Quên mật khẩu</title>

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
      <p class="login-box-msg">
        Bạn quên mật khẩu của mình? Tại đây bạn có thể dễ dàng lấy lại mật khẩu mới.</p>
      <form onsubmit="return validateForm()" action="ForgetPassController" method="POST">
        <div class="input-group mb-3">
        <%String msg = (String )request.getAttribute("msg");
                if(msg != null) {
        %>
          <input type="email" class="form-control is-invalid" id="email" name="email" placeholder="Email">
           <div class="invalid-feedback order-last err">
                        <%= msg %>
            </div>
            <%} else { %>
                      <input type="email" class="form-control " id="email" name="email" placeholder="Email">
                      <div class="invalid-feedback order-last err"></div>
            <%} %>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="row d-flex justify-content-center">
          <div class="">
            <button type="submit" class="btn btn-primary btn-block">Lấy mật khẩu</button>
          </div>
          <!-- /.col -->
        </div>
      </form>
    
    </div>
    <!-- /.login-card-body -->
  </div>
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>

<script>
function validateForm() {
    var countError = 0; 
    var email = $('#email').val();
    if (email.length == 0) {
      countError++;
      showError('#email', 'err', 'Vui lòng nhập email!')

    } else  if(!validateEmail(email)) {
  	  countError++;
        showError('#email', 'err', 'Sai định dạng email!');
         
        }
        }
    if (countError == 0) {
  	 
      return true;
    }else {
  	   return false;  
    }
  }


  function showError(element, element2, mes) {
    $(element).addClass('is-invalid');
    $('.' + element2).text(mes);
  }
  function removeError(element) {
    $(element).removeClass('is-invalid');
  }



  $(document).ready(function () {

    // email 
    $('#email').on('keyup',function() {
       var email = $('#email').val();
       if(email.length >0) {
    	   removeError('#email');
       }else {
         showError('#email','err4','Vui lòng nhập email!');
       }
    })


  })
  function validateEmail(email) {
		 var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
			return emailReg.test(email);
}
</script>
 
</body>
</html>
    