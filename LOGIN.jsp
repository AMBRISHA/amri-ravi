
<!DOCTYPE html>
<html lang="en">
<head>
<title>login page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="jumbotron">
		<h1>login</h1>
	</div>

	<div class="container">
		<form class="form-signin">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label for="inputEmail" class="sr-only">Email address</label> 
			<input type="email" id="inputEmail" class="form-control placeholder="Email address:" required autofocus><br></br>
				 <label for="inputPassword" class="sr-only">Password</label> 
				 <input type="password" id="inputPassword" class="form-control"placeholder="Password:" required><br></br>

			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					Remember me
				</label>

			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
		</form>

	</div>
	<!-- /container -->



	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>


