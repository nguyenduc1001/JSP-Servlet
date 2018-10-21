<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>Car ID</th>
				<th>Maker</th>
				<th>Model</th>
				<th>Manufacture Year</th>
				<th>Color</th>
				<th>Note</th>
			</tr>
		</thead>
		<c:forEach var="car" items="${listCar }">
			<tr>
				<td>${car.getCarID() }</td>
				<td>${car.getMaker() }</td>
				<td>${car.getModel() }</td>
				<td>${car.getManufactureYear() }</td>
				<td>${car.getColor() }</td>
				<td>${car.getNote() }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>