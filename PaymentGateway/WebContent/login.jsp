<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->


<html>
	<head>
		<link rel = "stylesheet" type = "text/css"  href = "login.css" />
 	</head>
	<body id="LoginForm">
		<div class="container">
			<div class="login-form">
				<div class="main-div">
    				<div class="panel">
   						<p>Please enter your email and password</p>
   					</div>
    				<form id="Login">
						<div class="form-group">
							<label for="email">Email Address</label>
							<input type="email" class="form-control" id="inputEmail" >
						</div>
						<div class="form-group">
							<label for="password">Password</label>
							<input type="password" class="form-control" id="inputPassword" placeholder="">
						</div>
        				<div class="forgot">
        					<a href="reset.html">Forgot password?</a>
						</div>
						<div class="form-group row" >
                        	<div class="col-md-6">
                            	<button type="reset" class="btn btn-primary">Cancel</button>
                            </div>
                            <div class="col-md-6">
                            	<button type="submit" class="btn btn-primary">Login</button>
                            </div>
                        </div>
        				
					</form>
    			</div>
			</div>
		</div>
	</body>
</html>
