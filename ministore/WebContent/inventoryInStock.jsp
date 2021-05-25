<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Hàng tồn kho</title>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

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
            <h2>Hàng tồn kho</h2>
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
              <div class="card-header col-md-2">
              <%ArrayList<Integer> listFilter = (ArrayList<Integer>) request.getAttribute("listFilter"); %>
               <select class="form-control " id="filterChart" style="font-weight: bold;">
                <option selected value="empty">Top sản phẩm tồn kho</option>
               <% for(int i = 0; i < listFilter.size(); i++) { %>
     						 <option value=<%= listFilter.get(i) %>><%= listFilter.get(i) %></option>
     						 
     						 <%} %>
      						
  
    </select>
                 </div>
              <!-- /.card-header -->
              <div class="card-body" class="col-sm-6" id="containerChart">
                 
               <!--  <canvas id="myChart"></canvas> -->
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
  <footer class="main-footer">
   
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>

<script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>

<!-- Page specific script -->
<script>

</script>

<!--Column chart js-->
<script>


   $(document).ready(function() {
	   
	   loadChart();

	   $('#filterChart').change(function() {
		   $('#myChart').remove();
			 var filter = $('#filterChart').val();
			
			  $.ajax ({
	 		  		 
	 	    		 type:'GET',
	 	    		 headers : {
	 						Accept : "application/json; charset=utf-8",
	 						"Content-Type" : "application/json; charset=utf-8"
	 					},
	 	    		 dataType :'json',
	 	    		 data : {
	 	    			filterStock : filter,
	 	             },
	 	             url :'FilterStockController',
	 	             success : function(jsonProduct) {
	 	            	
	 	            	 console.log(jsonProduct);
	 	        
	 	            	 var lables =[];
	 	            	 
	 	            	 var   datasets= [
	 	            	        {
	 	            	            label: "Tồn kho",
	 	            	            backgroundColor: "red",
	 	            	            data: []
	 	            	        },
	 	            	        {
	 	            	            label: "Bán",
	 	            	            backgroundColor: "blue",
	 	            	            data: []
	 	            	        },
	 	            	       
	 	            	    ]
	 	            	 for(let i = 0; i < jsonProduct.length; i++) {
	 	            		 var object = jsonProduct[i];
	 	            		 
	 	            		 lables.push(object.nameProduct);
	 	            		 datasets[0].data.push(object.quantityInStock);
	 	            		 datasets[1].data.push(object.quantitySale);
	 	            	 }
	 	          
	 	            	 $('#containerChart').append('<canvas id="myChart"></canvas> ')
	 	            	createChart(lables,datasets) ;
	 	       
	                   
	 	            	
	 	             }		
	    	})
	    	 
		
		   
		   
	   })
	   
	   
	
	     function loadChart() {
	
				
			  $.ajax ({
	 		  		 
	 	    		 type:'GET',
	 	    		 headers : {
	 						Accept : "application/json; charset=utf-8",
	 						"Content-Type" : "application/json; charset=utf-8"
	 					},
	 	    		 dataType :'json',
	 	    		 data : {
	 	    			filterStock : "empty",
	 	             },
	 	             url :'FilterStockController',
	 	             success : function(jsonProduct) {
	 	            	
	 	            	 console.log(jsonProduct);
	 	        
	 	            	 var lables =[];
	 	            	 
	 	            	 var   datasets= [
	 	            	        {
	 	            	            label: "Tồn kho",
	 	            	            backgroundColor: "red",
	 	            	            data: []
	 	            	        },
	 	            	        {
	 	            	            label: "Bán",
	 	            	            backgroundColor: "blue",
	 	            	            data: []
	 	            	        },
	 	            	       
	 	            	    ]
	 	            	 for(let i = 0; i < jsonProduct.length; i++) {
	 	            		 var object = jsonProduct[i];
	 	            		 
	 	            		 lables.push(object.nameProduct);
	 	            		 datasets[0].data.push(object.quantityInStock);
	 	            		 datasets[1].data.push(object.quantitySale);
	 	            	 }
	 	          
	 	            	 $('#containerChart').append('<canvas id="myChart"></canvas> ')
	 	            	createChart(lables,datasets) ;
	 	       
	                   
	 	            	
	 	             }		
	    	})
	    	 
		
			 
	   }
	  
	  

	
   })
 

   function createChart(lables,datasets) {
 	   var canvas = document.getElementById('myChart');
  	   var ctx = canvas.getContext("2d")

  	   var data = {
  	       labels: lables,
  	       datasets: datasets,
  	   };

  	   var myBarChart = new Chart(ctx, {
  	       type: 'bar',
  	       data: data,
  	       options: {
  	           barValueSpacing: 10,
  	           scales: {
  	               yAxes: [{
  	                   ticks: {
  	                       min: 0,
  	                   }
  	               }]
  	           }
  	       }
  	   }); 
   }

  </script>
    
    <!--End column chart js-->
</body>
</html>
    