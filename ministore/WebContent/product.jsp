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


  </head>
  <body class="hold-transition sidebar-mini">
  <div class="wrapper">

      <%@ include file="header.jsp" %>
 
    

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
                        <a  onclick="return confirm('Bạn có chắc chắn muốn xóa?')" href=<%= Util.getFullPath("RemoveProductController?idProduct=")+listProduct.get(i).getIdProduct() %> class=" btn-danger btn-lg" role="button" aria-pressed="true" ><i class="fas fa-trash-alt"></i></a>

                   
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
                <form action=<%=Util.getFullPath("AddProductSale") %> method="POST">
                  <label >Chọn sản phẩm</label>
                  <% ArrayList<Product> listProductInStock = (ArrayList)request.getAttribute("listProductInStock"); %>
                 
                  <select class="form-control" name="idProduct" onchange="getDetail(this.value);">
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
                  <input type="number"  id="add-quantityInStock" class="form-control" readonly="readonly" >
                </div>

                <div class="form-group">
                  <label for="edit-quantityProduct">Số lượng</label>
                  <input type="number" id="add-quantityProduct" name="quantityAddSell" class="form-control" min="0" oninput="checkQuantity()">
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
          
          <form action=<%= Util.getFullPath("EditProductSellController") %> method="POST">
                <div class="card-body">
          	  <div class="form-group">
                  <label for="idProduct">Mã sản phẩm</label>
                  <input type="text" id="idProduct"  name="idProductE" class="form-control" readonly="readonly">
                </div>
                	  <div class="form-group">
                  <label for="nameProduct">Tên sản phẩm</label>
                  <input type="text" id="nameProduct" class="form-control" readonly="readonly">
                </div>
     				 <div class="form-group">
                    <label for="quantityProduct">Số lượng tồn kho</label>
                    <input type="hidden" id="save-QuantityInStock" >
                    <input type="number" id="quantityInStock" class="form-control" readonly="readonly">
                  </div>
                  <div class="form-group">
                    <label for="quantityProduct">Số lượng đang bán</label>
                      <input type="hidden" id="save-quantityProduct" >
                    <input type="number" id="quantityProduct" class="form-control" readonly="readonly">
                  </div>
          
               <div class="form-group">
                    <label for="quantityProduct">Số lượng nhập thêm từ kho</label>
                    <input type="number" id="quantityInput" name="quantityInput" class="form-control" oninput=" handleIncreateQuantity()">
                  </div>
                  <div class="form-group">
                    <label for="price">Giá(VND)</label>
                    <input type="number" id="price" class="form-control" readonly="readonly">
                  </div>
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy</button>
                  <input type="submit" class="btn btn-primary" value="Cập nhật">
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
      <!-- End modal-->


    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
      <!-- Control sidebar content goes here -->
    </aside>
    <!-- /.control-sidebar -->
  </div>
  <!-- ./wrapper -->


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
     
     function handleIncreateQuantity() {
    	 
    	 const quantityInStock = $('#save-QuantityInStock').val();
    	 const quantitySale = $('#save-quantityProduct').val();
    	 var inputQuantity = $('#quantityInput').val();
    	 
    	 var tmp = parseInt(quantitySale) + parseInt(inputQuantity);
    	 console.log(tmp)
    	 $('#quantityInStock').val(quantityInStock -  inputQuantity);
    	 $('#quantityProduct').val(tmp);
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
            	var quantityInStock = jsonProduct.quantityInStock;

                 $('#idProduct').val(idProduct);
                 $('#nameProduct').val(nameProduct);
                 $('#quantityProduct').val(quantitySale);
                 $('#price').val(priceSale);
                 $('#quantityInStock').val(quantityInStock);
                 $('#save-QuantityInStock').val(quantityInStock);
                 $('#save-quantityProduct').val(quantitySale);
                 $('#quantityInput').attr({
                	 "min": 0,
                	 "max" : quantityInStock
                 })  
                 
            	
             }
    		 
    	 })
     }
    
  </script>
  </body>
  </html>
    