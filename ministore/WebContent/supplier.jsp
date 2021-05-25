<%@page import="bean.Supplier"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Nhà cung cấp</title>


</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
   <%@include file="header.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h2>Danh sách nhà cung cấp</h2>
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
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#add-supplier">Thêm nhà cung cấp</button>
                <div class="input-group rounded col-md-6 float-right">
                  <input type="search" class="form-control rounded" placeholder="Nhập mã nhà cung cấp" aria-label="Search"
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
                    <th>#Mã nhà cung cấp</th>
                    <th>Tên nhà cung cấp</th>
                    <th>Số lượng SP</th>
                    <th>Email</th>
                    <th>Chức năng</th>
                  </tr>
                  </thead>
                  <tbody>
                  <% ArrayList<Supplier> list =(ArrayList<Supplier>) request.getAttribute("listSupplier");
                  
                    ArrayList<Integer> listCount =(   ArrayList<Integer>) request.getAttribute("listCount");
                  for(int i = 0; i < list.size(); i++)
                  {%>
                  <tr>
                    <td><%= list.get(i).getIdSupplier() %></td>
                    <td><%= list.get(i).getNameSupplier() %></td>
                    <td><%= listCount.get(i) %></td>
                    <td><%= list.get(i).getEmail()%></td>
                    <td>

                      
                      <a href="#" class=" btn-primary btn-lg" role="button" aria-pressed="true" 
                      data-toggle="modal" data-target="#edit-supplier" ><i class="fas fa-edit"></i></a>
                      <a href="#" class=" btn-danger btn-lg" role="button" aria-pressed="true"><i class="fas fa-trash-alt"></i></a>

                    </td>
                  </tr>
                  <%} %>
           
                 
                  </tfoot>
                </table>
              </div>
              <!-- /.card-body -->
            </div>
           
          </div>
          <!-- /.col -->
        </div>
        <!-- /.row -->
      </div>
      <!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->


    <!--Modal add new supplier -->  
<div class="modal fade" id="add-supplier" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalCenterTitle">Tạo nhà cung cấp mới</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <div class="col-md-12">
          <div class="card card-primary">
       
            <div class="card-body">
              <div class="form-group">
                <label for="idSupplier">Tên nhà cung cấp</label>
                <input type="text" id="idSupplier" class="form-control">
              </div>
              <div class="form-group">
                <label for="supplierAddr">Địa chỉ</label>
                <input type="text" id="supplierAddr" class="form-control">
              </div>
              <div class="form-group">
                <label for="phone-supplier">Số điện thoại</label>
                <input type="text" id="phone-supplier" class="form-control">
              </div>

              <div class="form-group">
                <label for="email-supplier">Email</label>
                <input type="text" id="email-supplie" class="form-control">
              </div>
             
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy</button>
              <button type="button" class="btn btn-primary">Thêm</button>
            </div>
            <!-- /.card-body -->
          </div>
          <!-- /.card -->
        </div>
      </div>
   
    </div>
  </div>
</div>


  <!--Modal edit supplier -->  
  <div class="modal fade" id="edit-supplier" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalCenterTitle">Tạo nhà cung cấp mới</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <div class="col-md-12">
            <div class="card card-primary">
         
              <div class="card-body">
                <div class="form-group">
                  <label for="inf-Supplier">Tên nhà cung cấp</label>
                  <input type="text" id="inf-Supplier" class="form-control" value="VinFood">
                </div>
                <div class="form-group">
                  <label for="inf-supplierAddr">Địa chỉ</label>
                  <input type="text" id="inf-supplierAddr" class="form-control" value="TP.HCM">
                </div>
                <div class="form-group">
                  <label for="inf-phone-supplier">Số điện thoại</label>
                  <input type="text" id="inf-phone-supplier" class="form-control" value="0363389166">
                </div>
  
                <div class="form-group">
                  <label for="inf-email-supplier">Email</label>
                  <input type="text" id="inf-email-supplie" class="form-control" value="example@gmail.com">
                </div>
               
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy</button>
                <button type="button" class="btn btn-primary">Thêm</button>
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


<script type="text/javascript">

function 

 function addSupplier() {
	 
 }


</script>
</body>
</html>
    