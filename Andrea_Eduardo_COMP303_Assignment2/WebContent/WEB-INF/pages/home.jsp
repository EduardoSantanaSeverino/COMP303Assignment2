<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en"><!-- Basic -->
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
 
	<!-- Site Metas -->
	<title>Home - JAVA EE - Andrea - Eduardo</title>  
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
    <link rel="stylesheet" href="css/custom_home.css">

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
					<div class="panel panel-login">
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
														  <a class="nav-link" href="${pageContext.request.contextPath}/create_order.html">Create New Order</a>
														</li>
														<li class="nav-item">
														  <a class="nav-link" href="${pageContext.request.contextPath}/edit_customer.html">View Update Customer</a>
														</li>
														<li class="nav-item">
														  <a class="nav-link" href="#">${model.user.firstname} ${model.user.lastname}</a>
														</li>
														
													  </ul>
													</div>
												  </nav>

										<c:if test="${!empty error_message}">
											<div class="alert alert-danger" role="alert">
												${error_message}
											</div>
										</c:if>
										
										<c:if test="${!empty info_message}">
											<div class="alert alert-success" role="alert">
												${info_message}
											</div>
										</c:if>
										
										<c:if test="${!show_orders}">
											<div class="alert alert-danger" role="alert">
												You don't have orders yet! Please go shopping! from <a href="${pageContext.request.contextPath}/create_order.html">here</a>
											</div>
										</c:if>

										<c:if test="${show_orders}">
												<table class="table table-bordered table-hover table-striped">
												<thead>
												  <tr>
													<th scope="col">#</th>
													<th scope="col">Date</th>
													<th scope="col">Status</th>
													<th scope="col">Amount</th>
													<th scope="col" style="width: 15px;"></th>
												  </tr>
												</thead>
												<tbody>
												
													<c:forEach var="order" items="${model.orderList}">   
													   <tr>  
													   <td>${order.orderId} </td>  
													   <td>${order.orderDate}</td>  
													   <td>${order.status}</td>  
													   <td>${order.amountPaid}</td>  
													   <td>   <a class="btn btn-primary" href="${pageContext.request.contextPath}/edit_order.html?id=${order.orderId}">Edit</a> </td>  
													   </tr>  
													</c:forEach>  
													   
												</tbody>
											  </table>
											
										</c:if>

									
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

</body>
</html>