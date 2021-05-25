<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Bán hàng</title>

  </head>
  <body class="hold-transition sidebar-mini">
    <div class="wrapper">
    <%@ include file="header.jsp" %>
   
   
   
   
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
                    <div class="card" id="containerListProduct">
           
           
             <!-- TODO -->
           
           
           
                    </div>
                  </div>
                  <div id="removeProduct">
                  
                  </div>
                 
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
                          <small class="float-right"><span style="font-size: 15px" id="bill-at"></span></small>
                        </h4>
                      </div>
                      <!-- /.col -->
                    </div>
                    <!-- info row -->
                    <div class="row invoice-info">
                      <div class="col-sm-4 invoice-col">
                        <address>
                         KTX khu B, DHQG.TPHCM, Dĩ An- Bình Dương<br />
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
                        <b id="idBill" style="float: right;"></b><br />
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
                          <tbody id="bodyBill">
                         
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
                              <td ><span id="totalTmp"></span><span>VND</span></td>
                            </tr>

                            <tr>
                              <th>VAT:</th>
                              <td></td>
                            </tr>
                            <tr>
                              <th>Tổng cộng:</th>
                              <td>
                                <span id="total"></span><span>VND</span>
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
                       <% User use = (User) session.getAttribute("user"); %>
                        <p class="float-right">Thu ngân:&nbsp <b><%=use.getEmail() %></b> </p>
                        <br />
                      </div>
                    </div>
                    <p class="text-center">
                      Cảm ơn bạn đã mua sản phẩm tại cửa hàng của chúng tôi!
                    </p>
                    <!-- /.row -->

                    <!-- this row will not appear when printing -->
                    <div class="row no-print">
                      <div class="col-12" id="div-option">
                   
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
                      <select class="form-control" id="typePayment"  onchange="hidePayment()">
                        <option value="paypal">Paypal</option>
                        <option value="cash">Tiền mặt</option>
                      </select>
                    </div>
                    <span id="totalPayment" style="display: none"></span>
                    <div class="form-group" id="showCash" style="display: none">
                      <label for="money">Tiền mặt(VND)</label>
                      <input type="number" id="money" class="form-control" />
                      <p id="err"></p>
                    </div>
                  </div>
                  <div class="modal-footer">
                    <button class="btn-primary" id="btnPayment" onclick="checkValidation()">
                    
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

    <script charset="UTF-8">
    
    function paymentSubmit() {
    	var totalBill = $('#savePriceBill').text();
    	
    	$('#totalPayment').text(totalBill);
    	
    }
    
    function checkValidation() {
    	
    	var typePayment =$('#typePayment').val();
    	if(typePayment =="cash") {
   
    		  var numberOfMoney = $('#money').val();
    		
    	     console.log(numberOfMoney);
    		
    	     if(numberOfMoney == "") {
    	    	$('#err').css('color','red');
      		   $('#err').text('Tiền nhận phải >= số tiền nợ trong hóa đơn!')
    	     }else {
    	    	  var totalBill =$('#totalPayment').text();
    	    	    var tmp = parseInt(numberOfMoney) - parseInt(totalBill);
    	    		if(tmp < 0) {
    	    			
    	    			
    	        		   $('#err').css('color','red');
    	        		   $('#err').text('Tiền nhận phải >= số tiền nợ trong hóa đơn!')
    	        	}else {
    	        		if(tmp >= 0) {
    	        			createBill();
    	        			 $('#err').text('')
    	             		$('#btnPayment').attr("data-dismiss","modal");	
    	        			 
    	        			  $('#btnStartPayment').remove();
    	              		  $('#div-option').append(
    	             				   
    	               				'<a class="btn btn-primary float-right" href="SellProductController" role="button">Hoàn tất</a>'
    	               		   
    	               		   )
    	        		}
    		
    	        	}
    	     }
    
    	}
    
    }
    
    function checkQuantity(inputUser, maxQuantity, priceDf, priceProduct) {
        var input = $('#'+inputUser).val();
        const price = $('#'+priceDf).text();
     
        
       $('#'+priceProduct).text(price*input);
    	var max = $("#"+maxQuantity).text();
    
         $('#'+inputUser).attr({
        	 "max": max
         })
    }
    /*
    
    
    */
    function addProduct(idProduct) {
    	$.ajax ({
    		type:'GET',
    			headers : {
				 	Accept : "application/json; charset=utf-8",
					"Content-Type" : "application/json; charset=utf-8"
				},
				
 		 		dataType :'json',
 		 		data : {
 		 			idProduct : idProduct
 		 		},
 		 		url :'AddProductBillCurrent',
 		 		success : function(jsonData) {
 		 			
 		 			$('#containerListProduct').empty();
 		 			loadProductBill();
 		 		}
			
    		
    	})
    	
    
    }
    
    function randomIdBill() {
    	 var idBill="" ;
         for(let i = 0; i < 7; i++) {
           var x = Math.floor((Math.random() * 10));
           idBill+=x;
         }
         return idBill;
    }
    function removeAllProduct() {
		  $.ajax ({
		  		 
	    		 type:'GET',
	    		 headers : {
						Accept : "application/json; charset=utf-8",
						"Content-Type" : "application/json; charset=utf-8"
					},
	    		 dataType :'json',
	    		 data : {
	    			statusProduct : "removeAll",
	             },
	             url :'RemoveProductBill',
	             success : function(jsonProduct) {
	            	loadProductBill() ;
                
	            	
	             }		
 	})
    }
    function removeProduct(status) {
    		  $.ajax ({
 		  		 
 	    		 type:'GET',
 	    		 headers : {
 						Accept : "application/json; charset=utf-8",
 						"Content-Type" : "application/json; charset=utf-8"
 					},
 	    		 dataType :'json',
 	    		 data : {
 	    			statusProduct : status,
 	             },
 	             url :'RemoveProductBill',
 	             success : function(jsonProduct) {
 	            	loadProductBill() ;
                   
 	            	
 	             }		
    	})
   
    }
    function createBill() {
    	
    	var idBill = $('#idBill').text();
    	var typePayment = $('#typePayment').val();
    	
    	$.ajax ({
	  		 
   		 type:'GET',
   		 headers : {
					Accept : "application/json; charset=utf-8",
					"Content-Type" : "application/json; charset=utf-8"
				},
   		 dataType :'json',
   		 data : {
   			idBill : idBill,
   			typePayment :typePayment ,
   			
            },
            url :'CreateBillController',
            success : function(jsonProduct) {
            	
            }
    	
    })
    }
  
    

    function loadProductBill() {
    	  $.ajax ({
		  		 
	    		 type:'GET',
	    		 headers : {
						Accept : "application/json; charset=utf-8",
						"Content-Type" : "application/json; charset=utf-8"
					},
	    		 dataType :'json',
	    		 data : {
	    			status : "getData",
	             },
	             url :'LoadProductBill',
	             success : function(jsonProduct) {
	            		$('#containerListProduct').empty();
	            		$('#removeProduct').empty();
	            	        if(jsonProduct =="") {
	            	        	$('#containerListProduct').empty();
	            	        }
	            		for(var i = 0 ; i < jsonProduct.length; i++ ) {
		            	    var product =  jsonProduct[i];
		            	 	$('#containerListProduct').append(
	 	 		 	    			' <div class="card-body">'+
	 	 		 	    			' <span>'+product.idProduct+'</span>'+
	 	 		 	    		 '<img  style="width: 40px; height: 40px"'+ 'src=dist/'+product.image +' class="card-img-top"  alt="..." />'+
	 	 		 	    	         ' <span class="col-md-4">'+product.nameProduct+'</span>'+
	 	 		 	    	         ' <input type="number" style="width: 60px"  min="1" value='+product.quantityPurchase+' id="'+product.idProduct+'" oninput=" return checkQuantity('+"'"+product.idProduct+"','maxProduct"+i+"',"+
	 	 		 	    	        		 "'priceDf"+i+"',"+"'priceProduct"+i+"'"+')">'+
	 	 		 	    	         
	 	 		 	    	          '<p '+'id='+'"maxProduct'+i+'"'+' hidden>'+product.quantitySale+'</p>'+
	 	 		 	    	        '<p '+'id="priceDf'+i+'"'+'  hidden>'+product.price+'</p>'+
	 	 		 	    	         '  <span style="margin-left: 20px" id="priceProduct'+i+'">'+product.price+'</span>'+
	 	 		 	    	         '<span>VND</span>'+
	 	 		 	    	         ' <a href="#!" class="btn btn-light float-right"'+ 'onclick="return removeProduct('+"'"+product.idProduct+"')"+'"'+
	 	 		 	    	         '><i class="far fa-trash-alt"></i></a>'+
	 	 		 	                 '</div>'
	 	 		 	                )
		            	    
		            	}
	            		$('#removeProduct').append(
	            				'<a href="#!" class="btn btn-danger" onclick="return removeAllProduct() ">Xóa tất cả</a>'+
	            				'<a href="#!" class="btn btn-primary float-right" onclick="return submitBill()">Hoàn tất</a>'
	            		)
	            	
	            	
	             }		
 	})
    }  
  function submitBill() {
	  var sqlDatetime = new Date(new Date().getTime() - new Date().getTimezoneOffset() * 60 * 1000).toJSON().slice(0, 19).replace('T', ' ');
	  $('#bill-at').text(sqlDatetime);
	  
	  $.ajax ({
	  		 
 		 type:'GET',
 		 headers : {
					Accept : "application/json; charset=utf-8",
					"Content-Type" : "application/json; charset=utf-8"
				},
 		 dataType :'json',
 		 data : {
 			status : "getData",
          },
          url :'LoadProductBill',
          success : function(jsonProduct) {
         		$('#bodyBill').empty();
         	        if(jsonProduct =="") {
         	        	$('#bodyBill').empty();
         	        }else {
         	       
         	        	
         	        	 var totolCost  = 0;
              			for(var i = 0 ; i < jsonProduct.length; i++ ) {
     	            	    var product =  jsonProduct[i];
     	            	    totolCost+= (product.price);
     	            	    
     	            	    $('#bodyBill').append(
     	            	    		
     	            	    	   ' <tr>'+
     	                           ' <td>'+(i+1)+'</td>'+
     	                           '<td>'+product.idProduct+'</td>' +
     	                           '<td>'+product.nameProduct+'</td>' +
     	                           ' <td>'+product.quantityPurchase+'</td>'+
     	                           ' <td id="savePriceBill">'+product.price+'</td>'+
     	                         '</tr>' 
     	            	    )
     	            	}

              			$('#totalTmp').text(totolCost);
              			$('#total').text(totolCost);
              			var idBill = "#"+randomIdBill();
              		   $('#idBill').text(idBill);
              		   $('#div-option').append(
     '<a href="printBill.html"  rel="noopener"   target="_blank"   class="btn btn-default" ><i class="fas fa-print"></i> Print</a  >'+ 
         '<button type="button" id="btnStartPayment" class="btn btn-success float-right" data-toggle="modal" data-target="#paymentBill" onclick="paymentSubmit()">'    +
                   '<i class="far fa-credit-card"></i>Thanh toán  </button>'     
              		   
              		   
              		   
              		   )
              		 
          }		
}
          
	
 

}  )
	  $('#containerListProduct').empty();
	  
  }
  
  
  
    $(document).ready(function() {
    	
    	  $('#money').on('input',function() {
    		  var numberOfMoney = $('#money').val();
    		  var totalBill =$('#totalPayment').text();
    	     var tmp = parseInt(numberOfMoney) - parseInt(totalBill);
    	     if(tmp >= 0) {
    	    	
    	    	$('#err').text('');
    	    	
    	     }else {
    	    	 $('#err').css('color','red');
    	    	 $('#err').text('Tiền nhận phải >= số tiền nợ trong hóa đơn!'); 
    	     }
    	   
    	    
    	  })
    	
    	
    	  $("#searchProduct").on('input', function() {
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
  	                             
  	  		            	    $('#showListProduct').append(

  	  		            	        '<div class="card">'+
  	  		            	       ' <div class="card-body">'+
  	  		            	        '<span>'+productObject.idProduct+'</span>'  +
  	  		            	         '<img  style="width: 40px; height: 40px"'+ 'src=dist/'+productObject.image +' class="card-img-top"  alt="..." />'+ 
  	  		            	       '<span class="col-md-4">'+productObject.nameProduct+'</span>' +  
  	  		            	         ' <a href="#!" class="btn btn-light float-right "  onclick = "return addProduct('+"'"+productObject.idProduct+"'"+')"><i class="fas fa-plus"></i ></a>'+
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
    