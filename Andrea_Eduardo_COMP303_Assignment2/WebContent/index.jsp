<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en"><!-- Basic -->
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
 
     <!-- Site Metas -->
    <title>Login and Register - JAVA EE - Andrea - Eduardo</title>  
    <meta name="description" content="Login and Register - JAVA EE">
    <meta name="author" content="Andrea / Eduardo">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/images/apple-touch-icon.png">

    <!-- Bootstrap CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
	<!-- Site CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"> 
	<!-- Fontawesome CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.min.css">  	
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/responsive.css">

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
				<div class="layout1 col-md-6 offset-md-3">
					<div class="panel panel-login">
						<div class="logo-top">
							<a href="#"><img src="images/logo.png" alt="" /></a>
						</div>
						<div class="panel-heading">
							<div class="row">
								<div class="col-lg-6 col-sm-6 col-xl-6">
									<a href="#" class="active" id="login-form-link">Login</a>
								</div>
								<div class="col-lg-6 col-sm-6 col-xl-6">
									<a href="#" id="register-form-link">Register</a>
								</div>
								<div class="or">OR</div>
							</div>
						</div>
					
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
									<form id="login-form" action="${pageContext.request.contextPath}/accounts/login.html" method="post" role="form" style="display: block;">
										
										<div class="form-group">
											<label class="icon-lp"><i class="fas fa-user-tie"></i></label>
											<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="" required="">
										</div>
										<div class="form-group">
											<label class="icon-lp"><i class="fas fa-key"></i></label>
											<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password" required="">
										</div>
										<div class="che-box">
											<label class="checkbox-in">
												<input name="checkbox" type="checkbox" tabindex="3" id="remember"> <span></span>
												Remember Me
											</label>
										</div>

										<div class="form-group">
											<div class="row">
												<div class="col-sm-6 offset-sm-3">
													<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
												</div>
											</div>
										</div>

										<div class="form-group">
											<div class="row">
												<div class="col-lg-12">
													<div class="text-center">
														<a href="#" tabindex="5" class="forgot-password">Forgot Password?</a>
													</div>
												</div>
											</div>
										</div>
									</form>
									
									<form id="register-form" action="${pageContext.request.contextPath}/accounts/register.html" method="post" role="form" style="display: none;">
										
										<div class="row">
											<div class="col-md-6">
											<div class="form-group">
												<label class="icon-lp"><i class="fas fa-user-tie"></i></label>
												<input type="text" name="firstname" id="firstname" tabindex="1" class="form-control" placeholder="Firstname" value="" required="">
											</div>
											</div>
											<div class="col-md-6">
											<div class="form-group">
												<label class="icon-lp"><i class="fas fa-user-tie"></i></label>
												<input type="text" name="lastname" id="lastname" tabindex="1" class="form-control" placeholder="Lastname" value="" required="">
											</div>
											</div>
										</div>
										
										<div class="row">
											<div class="col-md-6">
												<div class="form-group">
													<label class="icon-lp"><i class="fas fa-envelope"></i></label>
													<input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="" required="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<label class="icon-lp"><i class="fas fa-map-marked-alt"></i></label>
													<input type="text" name="address" id="address" tabindex="1" class="form-control" placeholder="Address" value="" required="">
												</div>
											</div>
										</div>
										
										<div class="row">
											<div class="col-md-6">
												<div class="form-group">
													<label class="icon-lp"><i class="fas fa-building"></i></label>
													<input type="text" name="city" id="city" tabindex="1" class="form-control" placeholder="City" value="" required="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<label class="icon-lp"><i class="fas fa-qrcode"></i></label>
													<input type="text" name="postalCode" id="postalCode" tabindex="1" class="form-control" placeholder="Postal Code" value="" required="">
												</div>
											</div>
										</div>
										
										<div class="form-group">
											<label class="icon-lp"><i class="fas fa-user-tie"></i></label>
											<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="" required="">
										</div>
										<div class="form-group">
											<label class="icon-lp"><i class="fas fa-key"></i></label>
											<input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password" required="">
										</div>
										<div class="form-group">
											<label class="icon-lp"><i class="fas fa-key"></i></label>
											<input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password" required="">
										</div>

										<div class="che-box">
											<label class="checkbox-in"> 
												<input name="checkbox" type="checkbox"> <span></span>I agree to the  Terms and Conditions  and Privacy Policy 
											</label>
										</div>
										
										<div class="form-group">
											<div class="row">
												<div class="col-sm-6 offset-sm-3">
													<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
												</div>
											</div>
										</div>										
									</form>
								</div>
							</div>
						</div>
					</div>
					
					<p class="footer-company-name">Andrea Eduardo COMP303 Assignment2 - Java EE - Home Page </p>
					
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

			$('#login-form-link').click(function(e) {
				$("#login-form").delay(100).fadeIn(100);
				$("#register-form").fadeOut(100);
				$('#register-form-link').removeClass('active');
				$('.or').removeClass('add-to-or');
				$(this).addClass('active');
				$('.layout1').removeClass('col-md-10');
				$('.layout1').removeClass('offset-md-1');
				$('.layout1').addClass('col-md-6');
				$('.layout1').addClass('offset-md-3');
				e.preventDefault();
			});

			$('#register-form-link').click(function(e) {
				$("#register-form").delay(100).fadeIn(100);
				$("#login-form").fadeOut(100);
				$('#login-form-link').removeClass('active');
				$('.or').addClass('add-to-or');
				$('.layout1').addClass('col-md-10');
				$('.layout1').addClass('offset-md-1');
				$('.layout1').removeClass('col-md-6');
				$('.layout1').removeClass('offset-md-3');
				$(this).addClass('active');
				e.preventDefault();
			});
		});
		
		$('.form-group input').focus(function () {
			$(this).parent().addClass('addcolor');
		}).blur(function () {
			$(this).parent().removeClass('addcolor');
		});
		
	</script>
</body>
</html>
