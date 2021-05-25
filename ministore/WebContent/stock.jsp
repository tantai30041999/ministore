<%@page import="bean.Supplier"%>
<%@page import="bean.TypeProduct"%>
<%@page import="bean.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Kho hàng</title>


</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">
   <%@include file="header.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row">
          <div class="col-sm-6">
            <h2>Danh sách hàng tồn kho</h2>
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
                <a class="btn btn-primary" href="#" role="button">Nhập hàng</a>
                <button type="button" class="btn btn-secondary">Xuất file(.xls)</button>
                <div class="input-group rounded col-md-6 float-right">
                  <input type="search" class="form-control rounded" placeholder="Search" aria-label="Search"
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
                  <% ArrayList<Product> listProduct =( ArrayList<Product> ) request.getAttribute("listProductInStock") ;
                     for(int i = 0 ; i < listProduct.size(); i++) {
                  
                  %>
                  <tr>
                    <td><%= listProduct.get(i).getIdProduct() %></td>
                    <td><%= listProduct.get(i).getNameProduct() %></td>
                    <td><%= listProduct.get(i).getTypeProduct() %></td>
                    <td> <%= listProduct.get(i).getQuantityInStock() %></td>
                    <td>

                      <a href="#" class=" btn-primary btn-lg" role="button" onclick="return showDetail('<%=listProduct.get(i).getIdProduct() %>')" aria-pressed="true" data-toggle="modal" data-target="#editproduct"><i class="fas fa-edit"></i></a>
                      <a  onclick="return confirm('Bạn có chắc chắn muốn xóa?')"      href=<%=Util.getFullPath("DelProductStockController?idProduct=")+listProduct.get(i).getIdProduct() %> class=" btn-danger btn-lg" role="button" aria-pressed="true" ><i class="fas fa-trash-alt"></i></a>

                  
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
                  <label for="nameProduct">Tên sản phẩm</label>
                  <input type="text" id="nameProduct" class="form-control">
                </div>
                <div class="form-group">
                  <label for="priceProduct">Giá(VND)</label>
                  <input type="number" id="priceProduct" class="form-control">
                </div>
                <div class="form-group">
                  <label for="saleProduct">Khuyến mãi(%)</label>
                  <input type="number" id="saleProduct" class="form-control">
                </div>
  
                <div class="form-group">
                  <label for="quantityProduct">Số lượng</label>
                  <input type="number" id="quantityProduct" class="form-control" readonly="readonly">
                </div>
  
  
                <div class="form-group">
                  <label for="taxes">Thuế(VAT)</label>
                  <input type="number" id="taxes" class="form-control">
                </div>
                <div class="form-group">
                  <label for="imageProduct">Hình ảnh</label>
                  <input type="file" id="imageProduct" class="form-control">
                </div>
                <div class="form-group">
                  <label for="inputClientCompany">Loại</label>
                  
                  <%ArrayList<TypeProduct> listType =(ArrayList<TypeProduct>) request.getAttribute("listType");
                		 ArrayList<Supplier> listSp = ( ArrayList<Supplier>)request.getAttribute("listSupplier") ;
                		  %>
                  <select class="form-control">
                  
                  <%  for( int i = 0; i < listType.size(); i++) { %>
                    <option value=<%= listType.get(i).getIdType()  %>> <%= listType.get(i).getNameType() %></option>
                    <%} %>
                  </select>
                </div>
  
                <div class="form-group">
                  <label >Nhà cung cấp</label>
                   <select class="form-control">
                   <%  for( int i = 0; i < listSp.size(); i++) { %>
                    <option value=<%= listSp.get(i).getIdSupplier()  %>> <%= listSp.get(i).getNameSupplier() %></option>
                    <%} %>
                     </select>
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

<script>




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
        	console.log(jsonProduct)
       	var idProduct = jsonProduct.idProduct;
       	var nameProduct = jsonProduct.nameProduct;
       	var priceSale = jsonProduct.price;
       	var sale = jsonProduct.sale;
       	var quantityInStock = jsonProduct.quantityInStock;
        var expirtation = jsonProduct.expiration;
        var taxes = jsonProduct.VAT;
        var img = jsonProduct.imageProduct;
        
            $('#nameProduct').val(nameProduct);
            $('#priceProduct').val(priceSale);
            $('#saleProduct').val(sale);
            $('#quantityProduct').val(quantityInStock);
            $('#expirtation').val(expirtation);
           // $('#imageProduct').val(img);
           
       	
        }
		 
	 })
}
</script>
</body>
</html>
    