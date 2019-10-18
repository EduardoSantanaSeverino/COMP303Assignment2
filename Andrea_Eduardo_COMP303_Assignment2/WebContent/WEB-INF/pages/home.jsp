<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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

										<div class="alert alert-danger" role="alert">
											You don't have orders jet! Please go shopping! from <a href="#">here</a>
										</div>

										<table class="table table-bordered table-hover table-striped">
											<thead>
											  <tr>
												<th scope="col">#</th>
												<th scope="col">First</th>
												<th scope="col">Last</th>
												<th scope="col">Handle</th>
											  </tr>
											</thead>
											<tbody>
											  <tr>
												<th scope="row">1</th>
												<td>
													
												</td>
												<td>Otto</td>
												<td>@mdo</td>
											  </tr>
											  <tr>
												<th scope="row">2</th>
												<td>Jacob</td>
												<td>Thornton</td>
												<td>@fat</td>
											  </tr>
											  <tr>
												<th scope="row">3</th>
												<td colspan="2">Larry the Bird</td>
												<td>@twitter</td>
											  </tr>
											</tbody>
										  </table>

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