<%@page import="util.Util"%>
<%@page import="bean.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <!DOCTYPE html>
 
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sản phẩm</title>

    <!-- Google Font: Source Sans Pro -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
    <!-- DataTables -->
    <link rel="stylesheet" href="plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
    <link rel="stylesheet" href="plugins/datatables-buttons/css/buttons.bootstrap4.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/adminlte.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  </head>
  <body class="hold-transition sidebar-mini">
  <div class="wrapper">
    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-expand-arrows-alt"></i></a>
        </li>
        <li class="nav-item d-none d-sm-inline-block">
          <a href="" class="nav-link">Quản lý sản phẩm</a>
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
      </ul>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
      <!-- Brand Logo -->
      <a href="../../index3.html" class="brand-link">
        <img src="../../dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
        <span class="brand-text font-weight-light">AdminLTE 3</span>
      </a>

      <!-- Sidebar -->
      <div class="sidebar">
        <!-- Sidebar user panel (optional) -->
        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
          <div class="image">
            <img src="dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
          </div>
          <div class="info">
            <a href="#" class="d-block">Alexander Pierce</a>
          </div>
        </div>

    

            <!-- Sidebar Menu -->
            <nav class="mt-2">
              <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                <!-- Add icons to the links using the .nav-icon class
                  with font-awesome or any other icon font library -->
                <li class="nav-item menu-open">
                  <a href="./index.html" class="nav-link active">
                    <i class="nav-icon fas fa-tachometer-alt"></i>
                    <p>
                    Trang chủ
                    </p>
                  </a>
                </li>
    
                <li class="nav-item menu-open">
                  <a href="./index.html" class="nav-link ">
                    <i class="nav-icon fas fa-tachometer-alt"></i>
                    <p>
                      Bán hàng
                    </p>
                  </a>
                </li>
    
    
                <li class="nav-item menu-open">
                  <a href="./index.html" class="nav-link ">
                    <i class="nav-icon fas fa-tachometer-alt"></i>
                    <p>
                      Quản lý sản phẩm
                    </p>
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
                  <a href="./index.html" class="nav-link ">
                    <i class="nav-icon fas fa-tachometer-alt"></i>
                    <p>
                      Quản lý nhà cung cấp
                    </p>
                  </a>
                </li>
    
                <li class="nav-item menu-open">
                  <a href="./index.html" class="nav-link ">
                    <i class="nav-icon fas fa-tachometer-alt"></i>
                    <p>
                      Quản lý nhân viên
                    </p>
                  </a>
                </li>
    
                <li class="nav-item menu-open">
                  <a href="./index.html" class="nav-link ">
                    <i class="nav-icon fas fa-tachometer-alt"></i>
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
                    <i class="nav-icon fas fa-tachometer-alt"></i>
                    <p>
                      Báo cáo
                    </p>
                  </a>
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
          <div class="row">
            <div class="col-sm-6">
              <h2>Danh sách sản phẩm đang bán</h2>
            </div>
      </div>
        
        </div>
      </section>

      <!-- Main content -->
      <section class="content">
        <div class="container-fluid">
          <div class="row">
            <div class="col-12">
              <div class="card">
                <div class="card-header">
                  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addproduct">
                    Thêm sản phẩm từ kho
                  </button>
        
                  <div class="input-group rounded col-md-6 float-right">
                    <input type="search" class="form-control rounded" placeholder="Nhập mã sản phẩm" aria-label="Search"
                      aria-describedby="search-addon" />
                    <span class="input-group-text border-0" id="search-addon">
                      <i class="fas fa-search"></i>
                    </span>
                  </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                  <table id="example2" class="table table-bordered table-hover">
                    <thead>
                    <tr>
                      <th>#Mã sản phẩm</th>
                      <th>Tên</th>
                      <th>Loại</th>
                      <th>Số lượng</th>
                      <th>Chức năng</th>
                    </tr>
                    </thead>
                    <tbody>
                    <%
                   
                    ArrayList<Product> listProduct =(ArrayList<Product>) request.getAttribute("listProduct");
                    		
                        for(int i = 0; i < listProduct.size(); i++) {
                    
                    %>
                    <tr>
                      <td>#<%= listProduct.get(i).getIdProduct() %></td>
                      <td><%= listProduct.get(i).getNameProduct() %></td>
                      <td><%=listProduct.get(i).getTypeProduct() %></td>
                      <td> <%=listProduct.get(i).getQuantitySale() %></td>
                      <td>

                        <a href="#" class=" btn-primary btn-lg" role="button" aria-pressed="true" data-toggle="modal" onclick="return showDetail('<%=listProduct.get(i).getIdProduct() %>')" data-target="#editproduct"><i class="fas fa-edit"></i></a>
                        <a href="#" class=" btn-danger btn-lg" role="button" aria-pressed="true" ><i class="fas fa-trash-alt"></i></a>

                    
                      </td>
                    </tr>
                    <% } %>
             
                  
                    </tfoot>
                  </table>
                </div>
                       <nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
  
   
     <% 
     int[] pageLimit = (int[])request.getAttribute("pageLimit");
     int totalPage = Integer.parseInt(request.getAttribute("totalPage").toString());
     int pageShow = Integer.parseInt(request.getAttribute("pageShow").toString());
     %>
     
     <%
     if(pageShow - 1 == 0) { 
   	  
     %>
     <li class="page-item disabled"> <a class="page-link" href="#" tabindex="-1">Trước</a></li>
     <%}else {%>
     
       <li class="page-item "> <a class="page-link" href=<%=Util.getFullPath("ProductController?page=")+(pageShow-1) %> tabindex="-1">Trước</a></li>
     <%} %>
     
     <% if(pageShow <= totalPage && pageShow > 1) { %>
         <li class="page-item "><a  class="page-link">...</a></li>
     <%} %>
      <% for(int i = 0 ; i < pageLimit.length ; i++) {
              if((pageLimit[i]) == pageShow) {
   %>
   
    <li class="page-item active"><a   href=<%=Util.getFullPath("ProductController?page=")+(pageLimit[i]) %> class="page-link"><%=pageLimit[i] %></a></li>
    <%}else { %>
        <li class="page-item "><a   href=<%=Util.getFullPath("ProductController?page=")+(pageLimit[i]) %> class="page-link"><%=pageLimit[i] %></a></li>
    <%} %>
    <%} %>
    <% if(pageShow >=1){ %>
     <li class="page-item "><a  class="page-link">...</a></li>
   <%} %>
   <% if(pageShow + 1 <= totalPage) { %>
     <li class="page-item"> <a class="page-link" href=<%=Util.getFullPath("ProductController?page=")+(pageShow+1) %>>Tiếp</a></li>
   <%} else { %>
    <li class="page-item disabled"> <a class="page-link" href="#">Tiếp</a></li>
   <%} %>
  
  </ul>
</nav>
              </div>
            
            </div>
      
          </div>

        </div>
  
      </section>



      <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

      <!--Modal add new product -->  
  <div class="modal fade" id="addproduct" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalCenterTitle">Thêm sản phẩm bán</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <div class="col-md-12">
            <div class="card card-primary">
        
              <div class="card-body">
               
                <div class="form-group">
                <form>
                  <label >Chọn sản phẩm</label>
                  <% ArrayList<Product> listProductInStock = (ArrayList)request.getAttribute("listProductInStock"); %>
                  <select class="form-control" onchange="getDetail(this.value);">
                   <option value="default" selected="selected">Chọn tên sản phẩm</option>
                  <% 
                   for(int i = 0; i< listProductInStock.size(); i++) {
                  %>
                    <option value=<%=listProductInStock.get(i).getIdProduct()%>><%= listProductInStock.get(i).getNameProduct() %></option>
                    <% } %>
                   
                  </select>
                </div>
         	
                     <div class="form-group">
                  <label for="edit-quantityProduct">Số lượng tồn kho</label>
                  <input type="number" id="saveQuantityInStock" style="visibility: hidden;" >
                  <input type="number" id="add-quantityInStock" class="form-control" readonly="readonly" >
                </div>

                <div class="form-group">
                  <label for="edit-quantityProduct">Số lượng</label>
                  <input type="number" id="add-quantityProduct" class="form-control" min="0" oninput="checkQuantity()">
                </div>
        
          

              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy</button>
                <input type="submit" class="btn btn-primary" value="Thêm">
              </div>
              </form>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
        </div>
    
      </div>
    </div>
  </div>


    <!--Modal edit product -->  
    <div class="modal fade" id="editproduct" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
      <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalCenterTitle">Chỉnh sửa sản phẩm</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <div class="col-md-12">
              <div class="card card-primary">
          
                <div class="card-body">
          	  <div class="form-group">
                  <label for="idProduct">Mã sản phẩm</label>
                  <input type="text" id="idProduct" class="form-control" readonly="readonly">
                </div>
                	  <div class="form-group">
                  <label for="nameProduct">Tên sản phẩm</label>
                  <input type="text" id="nameProduct" class="form-control" readonly="readonly">
                </div>
    
                  <div class="form-group">
                    <label for="quantityProduct">Số lượng</label>
                    <input type="number" id="quantityProduct" class="form-control">
                  </div>
          
                  <div class="form-group">
                    <label for="price">Giá(VND)</label>
                    <input type="number" id="price" class="form-control">
                  </div>
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy</button>
                  <button type="button" class="btn btn-primary">Cập nhật</button>
                </div>
                <!-- /.card-body -->
              </div>
              <!-- /.card -->
            </div>
          </div>
      
        </div>
      </div>
    </div>
      <!-- End modal-->


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
  <script type="text/javascript">
  
 
    
    function checkQuantity() {
 
    	 const quantityInStock = $('#saveQuantityInStock').val();
    	 
    	 var inputQuantity = $('#add-quantityProduct').val();
    	 $('#add-quantityInStock').val(quantityInStock -  inputQuantity);
    	 
    	 
    		 $('#add-quantityProduct').attr({
    			 "max": quantityInStock
    		 })
    	 
    	  
    }
  
     function getDetail(valueOption) {
         $.ajax( {
    		 type:'GET',
    		 headers : {
					Accept : "application/json; charset=utf-8",
					"Content-Type" : "application/json; charset=utf-8"
				},
    		 dataType :'json',
    		 data : {
    			 idProduct : valueOption,
             },
             url :'ProductDetailController',
             success : function(jsonProduct) {
            
            	var quantityInStock = jsonProduct.quantityInStock;
                $('#add-quantityInStock').val(quantityInStock);
                $('#saveQuantityInStock').val(quantityInStock);
            
               
            	
             }
    		 
    	 })
     }
   
    
     function showDetail(idProduct) {
    	
     $.ajax( {
    		 type:'GET',
    		 headers : {
					Accept : "application/json; charset=utf-8",
					"Content-Type" : "application/json; charset=utf-8"
				},
    		 dataType :'json',
    		 data : {
    			 idProduct : idProduct,
             },
             url :'ProductDetailController',
             success : function(jsonProduct) {
            	var idProduct = jsonProduct.idProduct;
            	var nameProduct = jsonProduct.nameProduct;
            	var quantitySale = jsonProduct.quantitySale;
            	var priceSale = jsonProduct.price;

                 $('#idProduct').val(idProduct);
                 $('#nameProduct').val(nameProduct);
                 $('#quantityProduct').val(quantitySale);
                 $('#price').val(priceSale);
            	
             }
    		 
    	 })
     }
    
  </script>
  </body>
  </html>
    