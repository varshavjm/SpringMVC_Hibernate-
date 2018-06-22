<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Orders Page</title>
<link href='https://fonts.googleapis.com/css?family=Dancing Script'
	rel='stylesheet'>
<style>
body {
	font-family: 'Dancing Script';
	font-size: 22px;
	line-height: 50px;
	text-align: center;
}

th {
	font-size: 30px;
	font-weight: bold;
}

td {
	margin-left: 20px;
}
</style>
</head>
<body>
	<table>

		<tr>
			<th>Customer Name</th>
			<th>Price</th>
			<th>Date of order</th>
		</tr>

		<c:forEach var="varorder" items="${order}">
			<tr>
				<td>${varorder.customer}</td>
				<td>${varorder.price}</td>
				<td>${varorder.dateOfOrder}</td>
				<td><a style="margin-left: 50px;"
					href="./viewOrder?orderId=${varorder.id}">Update Order</a> | <a
					href="./delete?orderId=${varorder.id}"
					onclick="if(!(confirm('Are you sure to delete?')) return false; )">Delete
						Order</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>