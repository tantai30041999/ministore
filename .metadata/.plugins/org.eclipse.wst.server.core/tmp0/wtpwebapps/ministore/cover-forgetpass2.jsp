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
      <a href="../../index2.html" class="h1"><b>Admin</b>LTE</a>
    </div>
    <div class="card-body">

      <form onsubmit="return validateForm()" action="UpdatePassController" method="post">
        <div class="input-group mb-3">
        <% String msg = (String) request.getAttribute("msg") ;
                 if(msg != null) {
        %>
          <input type="password" class="form-control is-invalid" id="newpass" name="newpass" placeholder="Mật khẩu mới">
              <div class="invalid-feedback order-last err1">
                                 <%=msg%>
            </div>
            <% } else {%>
             <input type="password" class="form-control" id="newpass" name="newpass" placeholder="Mật khẩu mới">
              <div class="invalid-feedback order-last err1">

            </div>
            <%} %>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" id="renewpass" name="renewpass"placeholder="Xác nhận mật khẩu">
              <div class="invalid-feedback order-last err2">

            </div>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row d-flex justify-content-center">
          <div class="">
            <button type="submit" class="btn btn-primary btn-block">Đổi mật khẩu</button>
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

<script type="text/javascript">
function validateForm() {
    var countError = 0;
 
    var pass = $('#newpass').val();
    var repass = $('#renewpass').val();
    if (pass.length == 0) {
      countError++;
      showError('#newpass', 'err1', 'Vui lòng nhập mật khẩu!')

    } else {
      if (!checkCorrectPass(pass)) {
        countError++;
        showError('#newpass', 'err1', 'Mật khẩu tối thiểu 6 ký tự!')

      } else {
        removeError('#newpass');
      }

    }

    if (repass.length == 0) {
      countError++;
      showError('#renewpass', 'err2', 'Vui lòng nhập xác nhập mật khẩu!')

    }else {
      if(checkSamePass(pass,repass)) {
       removeError('#renewpass');
       

      }else {
        countError++;
        showError('#renewpass', 'err6', 'Mật khẩu không khớp!')
      }
    }


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

  
  
   
    //  validate onkey up
    $('#newpass, #renewpass').on('keyup', function () {
      //pass

      if ($('#newpass').val().length < 6) {
        showError('#newpass', 'err1', 'Mật khẩu tối thiểu 6 ký tự!');
        showError('#renewpass', 'err2', 'Mật khẩu không khớp!');
      } else {
        $('#newpass').removeClass('is-invalid');
        $('#newpass').addClass('is-valid');

        if (checkSamePass($('#newpass').val(), $('#renewpass').val())) {
            
          $('#renewpass').removeClass('is-invalid');
          $('#renewpass').addClass('is-valid');
        } else {
          showError('#renewpass', 'err2', 'Mật khẩu không khớp!');
        }
      }

    })
  })


</script>
</body>
</html>
    