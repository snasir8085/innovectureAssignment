<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

body {
	padding-top: 40px;
	padding-bottom: 40px;
}

.form-signin {
	max-width: 400px;
	padding: 15px;
	margin: 0 auto;
	border: solid 1px grey;
}

.form-signin .form-signin-heading {
	margin-bottom: 10px;
	margin-bottom: 23% !important;
	text-align: center;
}
</style>

</head>

<div class="container">
	<c:if test="${!empty(error)}">
		<form class="form-signin" action="" method="GET">
			<h2 class="form-signin-heading">
				Nasir <br /> <small>Weather Check App</small>
			</h2>
			<div class="form-group text-center margins">
				<label for="inputZipcode" class="form-label-text">Error in
					Request :<c:out value="${error}" />
				</label> <input type="hidden" name="zipcode" id="zipcode"
					class="form-control">
				<button class="btn btn-lg btn-primary" type="submit">Back</button>
			</div>
		</form>
	</c:if>
	<c:if test="${empty(error)}">
		<form class="form-signin" action="" method="GET">
			<h2 class="form-signin-heading">
				Nasir <br /> <small>Weather Check App</small>
			</h2>
			<div class="form-group margins">
				<table border="1">
					<tbody>
						<tr>
							<td style="width: 150px;">Zip Code:-</td>
							<td style="width: 150px;"><c:out value="${zipcode}" /></td>
						</tr>
						<tr>
							<td style="width: 150px;">City Name:-</td>
							<td style="width: 150px;"><c:out
									value="${weatherListData.city.cityName}" /></td>
						</tr>
						<tr>
							<td style="width: 150px;">Current Temperature:-</td>
							<td style="width: 150px;"><c:out
									value="${weatherListData.temp.curTemp}" /></td>
						</tr>
						<tr>
							<td style="width: 150px;">Minimum temperature of day:-</td>
							<td style="width: 150px;"><c:out
									value="${weatherListData.temp.minTemp}" /></td>
						</tr>
						<tr>
							<td style="width: 150px;">Maximum temperature of day:-</td>
							<td style="width: 150px;"><c:out
									value="${weatherListData.temp.maxTemp}" /></td>
						</tr>
						<tr>
							<td style="width: 300px;" colspan="2">All Values are in degree Celcius</td>
						</tr>
						<tr>
							<td style="width: 150px;">Sunrise Time:-</td>
							<td style="width: 150px;"><c:out
									value="${weatherListData.city.sunObj.sunRise}" /></td>
						</tr>
						<tr>
							<td style="width: 150px;">Sunset Time:-</td>
							<td style="width: 150px;"><c:out
									value="${weatherListData.city.sunObj.sunSet}" /></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="form-group text-center margins">
				<input type="hidden" name="zipcode" id="zipcode"
					class="form-control">
				<button class="btn btn-lg btn-primary" type="submit">Back</button>
			</div>
		</form>
	</c:if>
</div>
</body>

</html>

