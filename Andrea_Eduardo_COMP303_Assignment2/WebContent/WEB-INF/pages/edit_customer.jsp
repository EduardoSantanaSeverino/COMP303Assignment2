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
														  <a class="nav-link" href="${pageContext.request.contextPath}/home.html">
														  	<i class="fa fa-home"></i> Home <span class="sr-only">(current)</span>
														  </a>
														</li>
														
														<li class="nav-item">
														  <a class="nav-link" href="#">${model.user.firstname} ${model.user.lastname}</a>
														</li>
														
													  </ul>
													</div>
												  </nav>

											<form action="${pageContext.request.contextPath}/customer/create.html" method="post" role="form" > 
											
                                            <div class="card order-product" style="display: block;">
                                                <div class="card-body">
                                                    <h5 class="card-title">Update Customer</h5>
                                                    <h6 class="card-subtitle mb-2 text-muted">Update customer information.</h6>
                                                    <div class="card-text">
                                                      	
															<input type="hidden" name="customerId" value="666">
															<input type="hidden" class="orderDate" name="orderDate" value="666">
															<input type="hidden" class="status" name="status" value="666">
															<input type="hidden" class="amountPaid" name="amountPaid" value="666">
																																		
															<div class="form-group">

																	<label for="firstName">First Name</label>
																	<input type="text" name="firstName" class="form-control" id="firstName" required="" maxlength="256" placeholder="First Name">
																
																</div>
															
															<div class="form-group">

																	<label for="lastName">Last Name</label>
																	<input type="text" name="lastName" class="form-control" id="lastName" required="" maxlength="256" placeholder="Last Name">
																
																</div>
																
                                                           <div class="form-group">

																	<label for="address"> Address </label>
																	<input type="text" name="address" class="form-control" id="address" required="" maxlength="256" placeholder="Address">
																
																</div>
																
																<div class="form-group">

																	<label for="city">City</label>
																	<input type="text" name="city" class="form-control" id="city" required="" maxlength="256" placeholder="City">
																
																</div>

																<div class="form-group">

																	<label for="postalCode">Postal Code</label>
																	<input type="text" name="postalCode" class="form-control" id="postalCode" required="" maxlength="256" placeholder="Postal Code">
																
																</div>
																
																<div class="form-group">

																	<label for="userName">Username</label>
																	<input type="text" name="userName" class="form-control" id="userName" required="" maxlength="256" placeholder="User Name">
																
																</div>
																
																<div class="form-group">

																	<label for="credictCardName">Password</label>
																	<input type="text" name="password" class="form-control" id="password" required="" maxlength="256" placeholder="Password">
																
																</div>
																
															<button type="button" class="btn btn-primary next-to-checkout" style="float:right;">Update</button>

															<div class="clearfix"></div>
											
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
				return curr_year + "/" + curr_month + "/" + curr_date;
			}
		});
	
	</script>

</body>

</html>