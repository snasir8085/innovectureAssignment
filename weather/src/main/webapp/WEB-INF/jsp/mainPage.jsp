<!DOCTYPE html>
<html>

<body>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<style>
.margins {
	margin-bottom: 20%;
	margin-top: 20%;
	margin-right: 7%;
	margin-left: 7%;
}

#zipcode {
	background-color: yellow;
}

body {
	padding-top: 40px;
	padding-bottom: 40px;
}

.form-signin {
	max-width: 330px;
	padding: 15px;
	margin: 0 auto;
	border: solid 1px grey;
}

.form-signin-heading {
	text-align: center;
}

.form-signin .form-signin-heading {
	margin-bottom: 10px;
}

.form-signin .form-control {
	position: relative;
	height: auto;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
	padding: 10px;
	font-size: 16px;
}

.form-signin .form-control:focus {
	z-index: 2;
}

label {
	display: block !important;
	text-align: center !important;
	color: #777 !important;
	font-weight: 550 !important;
	font-size: x-large;
}

h2.form-signin-heading {
	margin-bottom: 23% !important;
}
</style>

</head>

<div class="container">
	<form class="form-signin" action="getWeatherDetails" method="GET">
		<h2 class="form-signin-heading">
			Nasir <br /> <small>Weather Check App</small>
		</h2>
		<div class="form-group margins">
			<label for="inputZipcode" class="form-label-text">Zip-Code(With
				in US)</label> <input type="text" name="zipcode" id="zipcode"
				class="form-control">
		</div>
		<div class="form-group text-center margins">
			<button class="btn btn-lg btn-primary" type="submit">Search</button>
		</div>
	</form>
</div>
</body>

</html>

