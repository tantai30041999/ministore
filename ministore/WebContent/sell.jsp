<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Bán hàng</title>

    <!-- Google Font: Source Sans Pro -->
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback"
    />
    <!-- Font Awesome -->
    <link
      rel="stylesheet"
      href="plugins/fontawesome-free/css/all.min.css"
    />
    <!-- DataTables -->
    <link
      rel="stylesheet"
      href="plugins/datatables-bs4/css/dataTables.bootstrap4.min.css"
    />
    <link
      rel="stylesheet"
      href="plugins/datatables-responsive/css/responsive.bootstrap4.min.css"
    />
    <link
      rel="stylesheet"
      href="plugins/datatables-buttons/css/buttons.bootstrap4.min.css"
    />
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/adminlte.min.css" />
    <!-- Bootstrap icon -->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
    />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  </head>
  <body class="hold-transition sidebar-mini">
    <div class="wrapper">
      <!-- Navbar -->
      <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" data-widget="pushmenu" href="#" role="button"
              ><i class="fas fa-expand-arrows-alt"></i
            ></a>
          </li>
          <li class="nav-item d-none d-sm-inline-block">
            <a href="" class="nav-link">Bán hàng</a>
          </li>
        </ul>

        <!-- Right navbar links -->
        <ul class="navbar-nav ml-auto">
          <div class="container">
            <nav class="navbar navbar-default" role="navigation">
              <span class="navbar-brand">UserName</span>
              <a
                class="btn navbar-btn btn-primary navbar-right"
                role="button"
                href="#"
                >Đăng xuất</a
              >
            </nav>
          </div>
        </ul>
      </nav>
      <!-- /.navbar -->

      <!-- Main Sidebar Container -->
      <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="../../index3.html" class="brand-link">
          <img
            src="../../dist/img/AdminLTELogo.png"
            alt="AdminLTE Logo"
            class="brand-image img-circle elevation-3"
            style="opacity: 0.8"
          />
          <span class="brand-text font-weight-light">AdminLTE 3</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
          <!-- Sidebar user panel (optional) -->
          <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
              <img
                src="dist/img/user2-160x160.jpg"
                class="img-circle elevation-2"
                alt="User Image"
              />
            </div>
            <div class="info">
              <a href="#" class="d-block">Alexander Pierce</a>
            </div>
          </div>

          <!-- Sidebar Menu -->
          <nav class="mt-2">
            <ul
              class="nav nav-pills nav-sidebar flex-column"
              data-widget="treeview"
              role="menu"
              data-accordion="false"
            >
              <li class="nav-item menu-open">
                <a href="./index.html" class="nav-link active">
                  <i class="nav-icon fas fa-tachometer-alt"></i>
                  <p>Trang chủ</p>
                </a>
              </li>

              <li class="nav-item menu-open">
                <a href="./index.html" class="nav-link">
                  <i class="nav-icon fas fa-tachometer-alt"></i>
                  <p>Bán hàng</p>
                </a>
              </li>

              <li class="nav-item menu-open">
                <a href="./index.html" class="nav-link">
                  <i class="nav-icon fas fa-tachometer-alt"></i>
                  <p>Quản lý sản phẩm</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="#" class="nav-link">
                  <i class="nav-icon fas fa-chart-pie"></i>
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
                <a href="./index.html" class="nav-link">
                  <i class="nav-icon fas fa-tachometer-alt"></i>
                  <p>Quản lý nhà cung cấp</p>
                </a>
              </li>

              <li class="nav-item menu-open">
                <a href="./index.html" class="nav-link">
                  <i class="nav-icon fas fa-tachometer-alt"></i>
                  <p>Quản lý nhân viên</p>
                </a>
              </li>

              <li class="nav-item menu-open">
                <a href="./index.html" class="nav-link">
                  <i class="nav-icon fas fa-tachometer-alt"></i>
                  <p>Quản lý hóa đơn</p>
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
            </ul>
          </nav>
          <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <div class="container-fluid">
            <div class="card-header">
              <div
                class="input-group rounded col-md-6 float-left"
                style="position: relative"
              >
                <input id="searchProduct" type="search" class="form-control rounded"   placeholder="Nhập tên sản phẩm" aria-label="Search"  aria-describedby="search-addon"/>
             
                 <div
                 id="showListProduct"
                  style="
                    position: absolute;
                    left: 0;
                    top: 100%;
                    width: 100%;
                    background-color: whitesmoke;
                    max-height: 120px;
                    overflow-y: scroll;
                    z-index: 99;
                  "
                >
                </div>
            </div>
          </div>
          <!-- /.container-fluid -->
        </section>
        `

        <!-- Main content -->
        <section class="content">
          <div class="row">
            <div class="col-md-6">
              <div class="card card-primary">
                <div class="card-header">
                  <h3 class="card-title">Sản phẩm</h3>
                </div>
                <div class="card-body">
                  <div class="form-group">
                    <div class="card">
                      <div class="card-body">
                        <span>ST200</span>
                        <img
                          style="width: 40px; height: 40px"
                          src="https://mdbootstrap.com/img/new/standard/nature/184.jpg"
                          class="card-img-top"
                          alt="..."
                        />
                        <span class="col-md-4">Tên sản phẩm</span>
                        <input type="number" style="width: 60px" />
                        <span style="margin-left: 20px">100.000</span>
                        <span>VND</span>
                        <a href="#!" class="btn btn-light float-right"
                          ><i class="far fa-trash-alt"></i
                        ></a>
                      </div>
                    </div>
                  </div>
                  <a href="#!" class="btn btn-danger">Xóa tất cả</a>
                  <a href="#!" class="btn btn-primary float-right">Hoàn tất</a>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="card card-secondary">
                <div class="card-header">
                  <h3 class="card-title">Hóa đơn</h3>
                </div>
                <div class="card-body">
                  <!-- Main content -->
                  <div class="invoice p-3 mb-3">
                    <!-- title row -->
                    <div class="row">
                      <div class="col-12">
                        <h4>
                          <i class="fas fa-globe"></i> AdminLTE, Inc.
                          <small class="float-right">07/04/2021 (Thứ tư)</small>
                        </h4>
                      </div>
                      <!-- /.col -->
                    </div>
                    <!-- info row -->
                    <div class="row invoice-info">
                      <div class="col-sm-4 invoice-col">
                        <address>
                          795 Folsom Ave, Suite 600 San Francisco, CA 94107<br />
                          Tel: (804) 123-5432<br />
                        </address>
                      </div>
                      <!-- /.col -->
                      <div class="col-sm-4 invoice-col">
                        <br />
                        <br />
                        <br />
                        <br />
                        <p><b>HÓA ĐƠN BÁN HÀNG</b></p>
                      </div>
                      <!-- /.col -->
                      <div class="col-sm-4 invoice-col">
                        <b>Mã hóa đơn #007612</b><br />
                      </div>
                      <!-- /.col -->
                    </div>
                    <!-- /.row -->

                    <!-- Table row -->
                    <div class="row">
                      <div class="col-12 table-responsive">
                        <table class="table table-striped">
                          <thead>
                            <tr>
                              <th>STT</th>
                              <th>Mã SP</th>
                              <th>Sản phẩm</th>

                              <th>Số lượng</th>
                              <th>Thành tiền</th>
                            </tr>
                          </thead>
                          <tbody>
                            <tr>
                              <td>1</td>
                              <td>SP100</td>
                              <td>Sting</td>

                              <td>15</td>
                              <td>150.000</td>
                            </tr>
                          </tbody>
                        </table>
                      </div>
                      <!-- /.col -->
                    </div>
                    <!-- /.row -->

                    <div class="row">
                      <!-- accepted payments column -->
                      <div class="col-6">
                        <p class="lead">Phương thức thanh toán:</p>
                        <img src="dist/img/credit/momo.jpg" alt="Momo" />
                        <img
                          src="dist/img/credit/mastercard.png"
                          alt="Credit"
                        />
                        <img
                          src="dist/img/credit/paypal2.png"
                          alt="Paypal"
                        />

                        <p
                          class="text-muted well well-sm shadow-none"
                          style="margin-top: 10px"
                        ></p>
                      </div>
                      <!-- /.col -->
                      <div class="col-6">
                        <div class="table-responsive">
                          <table class="table" id="tableBill">
                            <tr>
                              <th style="width: 50%">Tạm tính:</th>
                              <td>150.000<span>VND</span></td>
                            </tr>

                            <tr>
                              <th>VAT:</th>
                              <td>1%</td>
                            </tr>
                            <tr>
                              <th>Tổng cộng:</th>
                              <td>
                                <span id="total">150000</span><span>VND</span>
                              </td>
                            </tr>

                            <tr id="showDetailCash" style="display: none">
                              <th>Tiền mặt:</th>
                              <td>
                                <span id="valueCash"></span><span>VND</span>
                              </td>
                            </tr>

                            <tr id="showExcessCash" style="display: none">
                              <th>Tiền thừa:</th>
                              <td>
                                <span id="excessValue"></span><span>VND</span>
                              </td>
                            </tr>
                          </table>
                        </div>
                      </div>
                      <p class="col-12">
                        ===================================================================
                      </p>
                      <br />
                      <div class="col-12 float-right">
                        <p class="float-right">Thu ngân #02732</p>
                        <br />
                      </div>
                    </div>
                    <p class="text-center">
                      Cảm ơn bạn đã mua sản phẩm tại cửa hàng của chúng tôi!
                    </p>
                    <!-- /.row -->

                    <!-- this row will not appear when printing -->
                    <div class="row no-print">
                      <div class="col-12">
                        <a
                          href="printBill.html"
                          rel="noopener"
                          target="_blank"
                          class="btn btn-default"
                          ><i class="fas fa-print"></i> Print</a
                        >
                        <button
                          type="button"
                          class="btn btn-success float-right"
                          data-toggle="modal"
                          data-target="#paymentBill"
                        >
                          <i class="far fa-credit-card"></i>Thanh toán
                        </button>
                      </div>
                    </div>
                  </div>
                  <!-- /.invoice -->
                </div>
              </div>
            </div>
          </div>
        </section>
        <!-- /.content -->
      </div>
      <!-- /.content-wrapper -->

      <div
        class="modal fade"
        id="paymentBill"
        role="dialog"
        aria-labelledby="exampleModalCenterTitle"
        aria-hidden="true"
      >
        <div class="modal-dialog modal-dialog-centered" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="exampleModalCenterTitle">
                Chọn hình thức thanh toán
              </h5>
              <button
                type="button"
                class="close"
                data-dismiss="modal"
                aria-label="Close"
              >
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
              <div class="col-md-12">
                <div class="card card-primary">
                  <div class="card-body">
                    <div class="form-group">
                      <span><b>Hình thức</b></span>
                      <select
                        class="form-control"
                        id="typePayment"
                        onchange="hidePayment()"
                      >
                        <option value="paypal">Paypal</option>
                        <option value="cash">Tiền mặt</option>
                      </select>
                    </div>
                    <div class="form-group" id="showCash" style="display: none">
                      <label for="money">Tiền mặt(VND)</label>
                      <input type="number" id="money" class="form-control" />
                    </div>
                  </div>
                  <div class="modal-footer">
                    <button class="btn-primary" data-dismiss="modal">
                      Tiến hành thanh toán
                    </button>
                  </div>
                  <!-- /.card-body -->
                </div>
                <!-- /.card -->
              </div>
            </div>
          </div>
        </div>
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
    <!-- DataTables  & Plugins -->
    <script src="plugins/datatables/jquery.dataTables.min.js"></script>
    <script src="plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
    <script src="plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
    <script src="plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
    <script src="plugins/datatables-buttons/js/dataTables.buttons.min.js"></script>
    <script src="plugins/datatables-buttons/js/buttons.bootstrap4.min.js"></script>
    <script src="plugins/jszip/jszip.min.js"></script>
    <script src="plugins/pdfmake/pdfmake.min.js"></script>
    <script src="plugins/pdfmake/vfs_fonts.js"></script>
    <script src="plugins/datatables-buttons/js/buttons.html5.min.js"></script>
    <script src="plugins/datatables-buttons/js/buttons.print.min.js"></script>
    <script src="plugins/datatables-buttons/js/buttons.colVis.min.js"></script>
    <!-- AdminLTE App -->
    <script src="dist/js/adminlte.min.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="dist/js/demo.js"></script>
    <!-- Page specific script -->
    <script>
    
  
    
    function searchProduct(inputValue) {
        if(inputValue.length> 0) {
		   	  $.ajax ({
		  		 
	    		 type:'GET',
	    		 headers : {
						Accept : "application/json; charset=utf-8",
						"Content-Type" : "application/json; charset=utf-8"
					},
	    		 dataType :'json',
	    		 data : {
	    			 nameProduct : inputValue,
	             },
	             url :'SearchProductController',
	             success : function(jsonProduct) {

	            	for(var i = 0 ; i < jsonProduct.length; i++ ) {
	            	    var productObject =  jsonProduct[i];
	            	    console.log(productObject);
	            	}
	            	
	             }

          }) 
		     }
    }
    $(document).ready(function() {
    	
    
    	  $("#searchProduct").on('keyup', function() {
    			var searchNameProduct = $("#searchProduct").val();
    	            
    			  if($("#searchProduct").val() =="" ) {
    	    		  
    	    			 $('#showListProduct').empty();
    	    	  }
    		   	  $.ajax ({
      		  		 
  		    		 type:'GET',
  		    		 headers : {
  							Accept : "application/json; charset=utf-8",
  							"Content-Type" : "application/json; charset=utf-8"
  						},
  		    		 dataType :'json',
  		    		 data : {
  		    			 nameProduct : searchNameProduct,
  		             },
  		             url :'SearchProductController',
  		             success : function(jsonProduct) {
  		            	 $('#showListProduct').empty();
  		            	
  		            	 if(jsonProduct!= null) {
  		                 	for(var i = 0 ; i < jsonProduct.length; i++ ) {
  	  		            	    var productObject =  jsonProduct[i];
  	                               console.log(productObject)
  	  		            	    $('#showListProduct').append(

  	  		            	        '<div class="card">'+
  	  		            	       ' <div class="card-body">'+
  	  		            	        '<span>'+productObject.idProduct+'</span>'  +
  	  		            	         '<img  style="width: 40px; height: 40px"'+ 'src=dist/'+productObject.image +'class="card-img-top"  alt="..." />'+ 
  	  		            	       '<span class="col-md-4">'+productObject.nameProduct+'</span>' +  
  	  		            	         ' <a href="#!" class="btn btn-light float-right" ><i class="bi bi-plus"></i ></a>'+
  	  		            	      ' </div>' +
  	  		            	      '</div>'


  	  		            	    )
  	  		            	  
  	  		            	}
  		            	 }else {
  		            		 $('#showListProduct').empty(); 
  		            	 }
  		      
  		            	
  		             }

                }) 
    		     
    	
    			
    			 
        		  	
        			  
        		  
    	 
    	  })
 
    })
    


      function hidePayment() {
        var payment = $("#typePayment").val();
        if (payment == "cash") {
          $("#showCash").show();
        } else {
          $("#showCash").hide();
        }
      }

      $("#paymentBill").on("hidden.bs.modal", function () {
        var payment = $("#typePayment").val();

        if (payment == "cash") {
          var cash = $("#money").val();
          var total = $("#total").text();
          var excess = parseInt(cash) - parseInt(total);

          $("#valueCash").html(cash);
          $("#excessValue").html(excess);
          $("#showDetailCash").show();
          $("#showExcessCash").show();
        }
      });
    </script>
  </body>
</html>
    