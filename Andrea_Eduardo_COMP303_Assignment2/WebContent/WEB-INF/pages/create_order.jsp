<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<!-- Basic -->

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- Site Metas -->
    <title>Create / Update Product - JAVA EE - Andrea - Eduardo</title>
    <meta name="description" content="Login and Register - JAVA EE">
    <meta name="author" content="Andrea / Eduardo">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

    <!-- Bootstrap CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Site CSS -->
    <link rel="stylesheet" href="css/style.css">
    <!-- Fontawesome CSS -->
    <link rel="stylesheet" href="css/all.min.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/custom_product.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css" integrity="sha256-+N4/V/SbAFiW1MPBCXnfnP9QSN3+Keu+NlB+0ev/YKQ=" crossorigin="anonymous" />

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
    <div id="particles-js" class="main-form-box">
        <div class="md-form">
            <div class="container">
                <div class="row">
                    <div class="col-md-10 offset-md-1">
                        <div class="panel panel-login panel-input">
                            <div class="logo-top">
                                <a href="#"><img src="images/logo.png" alt="" /></a>
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="main-content">
                                          
                                            	<nav class="navbar navbar-expand-lg navbar-light bg-light">
													
												<a class="navbar-brand" href="#"><i class="fa fa-pepper-hot"></i> Java EE - Assig2</a>
													
													<button class="navbar-toggler" 
														type="button" 
														data-toggle="collapse" 
														data-target="#navbarSupportedContent" 
														aria-controls="navbarSupportedContent" 
														aria-expanded="false" 
														aria-label="Toggle navigation">
													  <span class="navbar-toggler-icon"></span>
													</button>
												  
													<div class="collapse navbar-collapse" id="navbarSupportedContent">
													  <ul class="navbar-nav mr-auto">
														<li class="nav-item ">
														  <a class="nav-link" href="${pageContext.request.contextPath}/home.html">
														  	<i class="fa fa-home"></i> Home 
														  </a>
														</li>
														
														<li class="nav-item active">
														  <a class="nav-link" href="#">
														  	Create New Order <span class="sr-only">(current)</span>
														  </a>
														</li>
														
														<li class="nav-item">
														  <a class="nav-link" href="#">${model.user.firstname} ${model.user.lastname} </a>
														</li>
														
													  </ul>
													</div>
												  </nav>

											<form action="${pageContext.request.contextPath}/order/create.html" method="post" role="form" > 
											
                                            <div class="card order-product" style="display: block;">
                                                <div class="card-body">
                                                    <h5 class="card-title">Create New Order</h5>
                                                    <h6 class="card-subtitle mb-2 text-muted">Create order page is intended to a create new order and manage the creations orders.</h6>
                                                    <div class="card-text">
                                                      	
															<input type="hidden" name="customerId" value="${model.user.customerId}">
														
															<div class="row">

																<div class="col-md-6">
																	<div class="form-group">
																		<label for="orderDate">Date</label>
																		<input readonly type="text" name="orderDate" class="form-control orderDate" id="orderDate" value="">
																	</div>
																</div>
																<div class="col-md-6">
																	<div class="form-group">
																		<label for="Status">Status</label>
																		<input readonly type="text" name="status" class="form-control" id="Status" value="Creating">
																	</div>
																</div>
															
															</div>
														
                                                            <div class="form-group">
                                                                <label for="productId">Select Product</label>
                                                                <select class="form-control" id="productId" name="productId">
                                                                    <option value="1" data-price="9" selected>Drinks \ Coca cola \ 9 CAD</option>
																	<option value="2" data-price="16">Drinks \ Pepsi \ 16 CAD </option>
																	<option value="3" data-price="26">Hotfood \ Pizza \ 26 CAD</option>
                                                                    <option value="4" data-price="22">Hotfood \ Hotdogs \ 22 CAD</option>
                                                                </select>
															</div>
															
															<div class="form-group">
																<label for="color">Select Color</label>
																<select class="form-control" id="color" name="color">
																	<option value="Red">Red</option>
																	<option value="Yellow" selected>Yellow</option>
																	<option value="Blue">Blue</option>
																</select>
															</div>
															
                                                            <div class="form-group">
                                                                <label for="comments">Comments</label>
                                                                <textarea class="form-control" id="comments" rows="3" name="comments"></textarea>
															</div>
															
                                                            <div class="form-group">

																<label for="amountPaid">Amount Paid</label>
																<input readonly type="text" name="amountPaid" class="form-control amountPaid" id="amountPaid" value="9">
															
															</div>

															<button type="button" class="btn btn-primary next-to-checkout" style="float:right;">Checkout</button>

															<div class="clearfix"></div>
											
                                                    </div>
                                                </div>
											</div>
											<div class="card order-checkout" style="display: none;">
													<div class="card-body">
														<h5 class="card-title">Create or Update Order</h5>
														<h6 class="card-subtitle mb-2 text-muted">Create or update page is intended to a create new order and manage the created orders.</h6>
														<div class="card-text">
														  
																<div class="row">
	
																	<div class="col-md-6">
																		<div class="form-group">
																			<label for="orderDate">Date</label>
																			<input readonly type="text" class="form-control orderDate">
																		</div>
																	</div>

																	<div class="col-md-6">
																		<div class="form-group">
																			<label for="Status">Status</label>
																			<input readonly type="text" class="form-control" value="Checkout">
																		</div>
																	</div>
																
																</div>
															
																<div class="form-group">

																	<label for="amountPaid">Amount Paid</label>
																	<input readonly type="text" class="form-control amountPaid" value="0">
																
																</div>
																
																<div class="form-group">

																	<label for="credictCardName">Credit Card Name</label>
																	<input type="text" name="credictCardName" class="form-control" id="credictCardName" required="" maxlength="256" placeholder="Credit Card Name">
																
																</div>
																
																<div class="form-group">

																	<label for="credictCardNumber">Credit Card Number</label>
																	<input type="number" name="credictCardNumber" class="form-control" id="credictCardNumber" required="" maxlength="16" placeholder="Credit Card Number">
																
																</div>
															
																<div class="form-group">

																	<label for="credictCardExpDate">Credit Card Expiration Date</label>
																	<input type="number" name="credictCardExpDate" class="form-control" id="credictCardExpDate" required="" maxlength="4" placeholder="MMYY" >
																
																</div>
																
																<div class="form-group">

																	<label for="credictCardCode">Credit Card Code</label>
																	<input type="number" name="credictCardCode" class="form-control" id="credictCardCode" required="" maxlength="3" placeholder="Code">
																
																</div>
																
																<div class="form-group" style="float: right;">
																	<button type="button" class="btn btn-secondary back-to-product">Back</button>
																	<button type="submit" class="btn btn-primary">Place order</button>
																</div>

																<div class="clearfix"></div>
														</div>
													</div>
											</div>
											</form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <p class="footer-company-name">Andrea Eduardo COMP303 Assignment2 - Java EE - Home Page</p>

                    </div>
                </div>
            </div>
        </div>

    </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/particles.min.js"></script>
    <script src="js/index.min.js"></script>

	<script type="text/javascript">
		$(function() {

			
			$('.next-to-checkout').click(function(e) {
				$(".order-checkout").delay(100).fadeIn(100);
				$(".order-product").fadeOut(100);
				e.preventDefault();
			});

			$('.back-to-product').click(function(e) {
				$(".order-product").delay(100).fadeIn(100);
				$(".order-checkout").fadeOut(100);
				e.preventDefault();
			});
			
			$( "#productId" ).change(function() {
			  var productPrice = $("#productId").find(':selected').data('price');
			  $(".amountPaid").val(productPrice);
			});
			
			$(".orderDate").val(getFormatedCurrentDate());
			
			function getFormatedCurrentDate()
			{
				var d = new Date();
				var curr_date = d.getDate();
				var curr_month = d.getMonth();
				curr_month++;
				var curr_year = d.getFullYear();
				var hours = d.getHours();
				var minutes = d.getMinutes();
				var seconds = d.getSeconds();
				return curr_year + "-" + pad(curr_month, 2) + "-" +  pad(curr_date,2) + "  " +  pad(hours,2) + ":" +  pad(minutes,2) + ":" +  pad(seconds,2);
			}
			
			function pad(n, width, z) {
			  z = z || '0';
			  n = n + '';
			  return n.length >= width ? n : new Array(width - n.length + 1).join(z) + n;
			}
		
		});
	
	</script>

</body>

</html>