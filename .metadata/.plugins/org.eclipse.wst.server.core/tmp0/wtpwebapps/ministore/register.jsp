<%@page import="util.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Đăng ký</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet"
    href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/adminlte.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

<body class="hold-transition register-page">
  <div class="register-box">


    <div class="card card-outline card-primary">
      <div class="card-header text-center">
        <a href="" class="h1"><b>Admin</b>LTE</a>
      </div>
      <div class="card-body register-card-body">


        <form onsubmit="return validateForm()" action="OTPController" method="post" id="form-register" >
          <div class="input-group mb-3">
            <input type="text" class="form-control " id="fullName" name="fullName" placeholder="Họ và tên">
            <div class="invalid-feedback order-last err1">

            </div>
            <div class="input-group-append">
              <div class="input-group-text">
                <span class="fas fa-user"></span>
              </div>

            </div>

          </div>
          <div class="input-group mb-3">
            <input type="text" class="form-control " id="storeName" name="storeName" placeholder="Tên cửa hàng của bạn">
            <div class="invalid-feedback order-last err2">

            </div>
            <div class="input-group-append">
              <div class="input-group-text">
                <span class="fas fa-store"></span>
              </div>
            </div>
          </div>
          <div class="input-group mb-3">
            <input type="text" class="form-control " id="dayofbirth" name="dayOfBirth" placeholder="Ngày sinh"
              onfocus="(this.type='date')">
            <div class="invalid-feedback order-last err3">

            </div>
            <div class="input-group-append">
              <div class="input-group-text">

                <span class="fas fa-birthday-cake"></span>
              </div>
            </div>
          </div>
          <div class="input-group mb-3">
            <input type="email" class="form-control " id="email" name="userName" placeholder="Email">
            <div class="invalid-feedback order-last err4">

            </div>
            <div class="input-group-append">
              <div class="input-group-text">
                <span class="fas fa-envelope"></span>
              </div>
            </div>
          </div>
          <div class="input-group mb-3">
            <input type="password" class="form-control" id="password" name="password" placeholder="Mật khẩu" minlength="6">
            <div class="invalid-feedback order-last err5">

            </div>
            <div class="input-group-append">
              <div class="input-group-text">
                <span class="fas fa-lock"></span>
              </div>
            </div>
          </div>
          <div class="input-group mb-3">
            <input type="password" class="form-control " id="repassword" name="repassword"
              placeholder="Nhập lại mật khẩu" minlength="6">
            <div class="invalid-feedback order-last err6">

            </div>
            <div class="input-group-append">
              <div class="input-group-text">
                <span class="fas fa-lock"></span>
              </div>
            </div>
          </div>

   
      
          <br>
          <div class="col-6 justify-content-center mx-auto text-center">

            <input type="submit" class="btn btn-block btn-primary" value="Đăng ký">
                 
            </input>
            <br>

          </div>
        </form>

        <p style="text-align: center;">Nếu bạn có tài khoản vui lòng? <a href="" class="text-center text-danger">Đăng
            nhập</a></p>

      </div>
      <!-- /.form-box -->
    </div><!-- /.card -->
  </div>
  <!-- /.register-box -->

  <!-- jQuery -->
  <script src="plugins/jquery/jquery.min.js"></script>
  <!-- Bootstrap 4 -->
  <script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- AdminLTE App -->
  <script src="dist/js/adminlte.min.js"></script>


  <script type="text/javascript">

    var existEmail = false;
    function validateForm() {
      var countError = 0;
      var fullName = $('#fullName').val();
      var storeName = $('#storeName').val();
      var date = $('#dayofbirth').val();
      var email = $('#email').val();
      var pass = $('#password').val();
      var repass = $('#repassword').val();
      var otp = $('#otpcode').val();
 
      if (fullName.length == 0) {
        countError++;
        showError('#fullName', 'err1', 'Vui lòng nhập họ và tên!');

      } else removeError('#fullName');

      if (storeName.length == 0) {
        countError++;
        showError('#storeName', 'err2', 'Vui lòng nhập tên cửa hàng!')

      } else removeError('#storeName');
      if (date.length == 0) {
        countError++;
        showError('#dayofbirth', 'err3', 'Vui lòng nhập ngày sinh!')

      } else removeError('#dayofbirth');
      if (email.length == 0) {
        countError++;
        showError('#email', 'err4', 'Vui lòng nhập email!')

      } else  if(!validateEmail(email)) {
    	  countError++;
          showError('#email', 'err4', 'Sai định dạng email!');
           
          }else {
        	  if(!existEmail) {
        		  removeError('#email');
        	  }else {
        		  countError++;
                  showError('#email', 'err4', 'Email đã tồn tại!');
        	  }
        	
          }
      
 
      if (pass.length == 0) {
        countError++;
        showError('#password', 'err5', 'Vui lòng nhập mật khẩu!')

      } else {
        if (!checkCorrectPass(pass)) {
          countError++;
          showError('#password', 'err5', 'Mật khẩu tối thiểu 6 ký tự!')

        } else {
          removeError('#password');
        }

      }

      if (repass.length == 0) {
        countError++;
        showError('#repassword', 'err6', 'Vui lòng nhập xác nhập mật khẩu!')

      }else {
        if(checkSamePass(pass,repass)) {
         removeError('#repassword');
         

        }else {
          countError++;
          showError('#repassword', 'err6', 'Mật khẩu không khớp!')
        }
      }
 
      console.log(countError);
      if (countError == 0) {
    	 
        return true;
      }else {
    	   return false;  
      }
    }

function checkCorrectPass(pass) {
  return (pass.length > 5) ? true : false;
}
    function showError(element, element2, mes) {
      $(element).addClass('is-invalid');
      $('.' + element2).text(mes);
    }
    function removeError(element) {
      $(element).removeClass('is-invalid');
    }

    function checkSamePass(pass,repass) {
      return (pass == repass) ? true: false;
    }


    $(document).ready(function () {

      // fulName
      $('#fullName').on('keyup', function () {

        if ($('#fullName').val().length > 0) {
          $('#fullName').removeClass('is-invalid');
        } else {
          $('#fullName').addClass('is-invalid');
        }
      })

      // email 
      $('#email').on('keyup',function() {
         var email = $('#email').val();
         if(email.length >0) {
             $.ajax ({
                 type: 'POST',
                 dataType :'html',
                 data : {
                     userName : email,
                 },
                 url :'AjaxUser',
                 success: function(result) {
                   if(result =='valid') {
                	   removeError('#email');
                	   $('#email').addClass('is-valid');
                	   existEmail = false;
                	   
                   }else {
                     if(result =='invalid') {
                    	  showError('#email', 'err4', 'Email đã tồn tại!');
                    	  existEmail = true;
                    	  
                     }
                   }
                 }

             })

         }else {
           showError('#email','err4','Vui lòng nhập email!');
         }
      })

      // storeName
      $('#storeName').on('keyup', function () {

        if ($('#storeName').val().length > 0) {
          $('#storeName').removeClass('is-invalid');
        } else {
          $('#storeName').addClass('is-invalid');
        }
      })
      // validate date
      $('#dayofbirth').change(function () {
        $('#dayofbirth').removeClass('is-invalid');
      })
      //  validate onkey up
      $('#password, #repassword').on('keyup', function () {
        //pass

        if ($('#password').val().length < 6) {
          showError('#password', 'err5', 'Mật khẩu tối thiểu 6 ký tự!');
          showError('#repassword', 'err6', 'Mật khẩu không khớp!');
        } else {
          $('#password').removeClass('is-invalid');
          $('#password').addClass('is-valid');

          if ( checkSamePass( $('#password').val(),$('#repassword').val())) {

            $('#repassword').removeClass('is-invalid');
            $('#repassword').addClass('is-valid');
          } else {
            showError('#repassword', 'err6', 'Mật khẩu không khớp!');
          }
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