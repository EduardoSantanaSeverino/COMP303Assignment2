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
														<li class="nav-item active">
														  <a class="nav-link" href="#">
														  	<i class="fa fa-home"></i> Home <span class="sr-only">(current)</span>
														  </a>
														</li>
														<li class="nav-item">
														  <a class="nav-link" href="${pageContext.request.contextPath}/edit_order.html">Create New Order</a>
														</li>
														<li class="nav-item">
														  <a class="nav-link" href="${pageContext.request.contextPath}/edit_customer.html">View Update Customer</a>
														</li>
														<li class="nav-item">
														  <a class="nav-link" href="#">${model.user.firstname}</a>
														</li>
														
													  </ul>
													</div>
												  </nav>

											<form>
                                            <div class="card order-product" style="display: block;">
                                                <div class="card-body">
                                                    <h5 class="card-title">Create or Update Order</h5>
                                                    <h6 class="card-subtitle mb-2 text-muted">Create or update page is intended to a create new order and manage the created orders.</h6>
                                                    <div class="card-text">
                                                      
															<input hidden type="text" name="orderId" value="0">
															<input hidden type="text" name="customerId" value="0">
															<input hidden type="text" name="orderDate" value="0">
														
															<div class="row">

																<div class="col-md-6">
																	<div class="form-group">
																		<label for="orderDate">Date</label>
																		<input readonly disabled type="text" name="orderDate" class="form-control" id="orderDate" value="2019-01-01">
																	</div>
																</div>
																<div class="col-md-6">
																	<div class="form-group">
																		<label for="Status">Status</label>
																		<input readonly disabled type="text" name="status" class="form-control" id="Status" value="Creating">
																	</div>
																</div>
															
															</div>
														
                                                            <div class="form-group">
                                                                <label for="productId">Select Product</label>
                                                                <select class="form-control" id="productId" name="productId">
                                                                    <option value="1">Drinks \ Coca cola </option>
																	<option value="2" selected>Drinks \ Pepsi </option>
																	<option value="3">Hotfood \ Pizza </option>
                                                                    <option value="4">Hotfood \ Hotdogs </option>
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
																<input readonly disabled type="text" name="amountPaid" class="form-control" id="amountPaid" value="0">
															
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
														  
																<!-- 										
																private String credictCardNumber;
																private String credictCardExpDate;
																private String credictCardCode;
																private String credictCardName; -->
															
																<div class="row">
	
																	<div class="col-md-6">
																		<div class="form-group">
																			<label for="orderDate">Date</label>
																			<input readonly disabled type="text" name="orderDate" class="form-control" id="orderDate" value="2019-01-01">
																		</div>
																	</div>

																	<div class="col-md-6">
																		<div class="form-group">
																			<label for="Status">Status</label>
																			<input readonly disabled type="text" name="status" class="form-control" id="Status" value="Checkout">
																		</div>
																	</div>
																
																</div>
															
																<div class="form-group">

																	<label for="amountPaid">Amount Paid</label>
																	<input readonly disabled type="text" name="amountPaid" class="form-control" id="amountPaid" value="0">
																
																</div>
																
																<div class="form-group">

																	<label for="credictCardName">Credict Card Name</label>
																	<input type="text" name="credictCardName" class="form-control" id="credictCardName" required="" min="1" max="256" placeholder="Credict Card Name">
																
																</div>
																
																<div class="form-group">

																	<label for="credictCardNumber">Credict Card Number</label>
																	<input type="text" name="credictCardNumber" class="form-control" id="credictCardNumber" required="" min="16" max="16" placeholder="Credict Card Number">
																
																</div>
															
																<div class="form-group">

																	<label for="credictCardExpDate">Credict Card Expiration Date</label>
																	<input type="number" name="credictCardExpDate" class="form-control" id="credictCardExpDate" required="" min="4" max="4" placeholder="MMYY" >
																
																</div>
																
																<div class="form-group">

																	<label for="credictCardCode">Credict Card Code</label>
																	<input type="number" name="credictCardCode" class="form-control" id="credictCardCode" required="" min="3" max="3" placeholder="Code">
																
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
			
		});
	
	</script>

</body>

</html>