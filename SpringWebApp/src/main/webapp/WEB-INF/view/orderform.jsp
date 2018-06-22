<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title>Add Order</title>
<link href='https://fonts.googleapis.com/css?family=Dancing Script'
	rel='stylesheet'>
<style>
body {
	font-family: 'Dancing Script';
	font-size: 22px;
	line-height: 50px;
	text-align: center;
}

input {
	height: 60px;
	border-radius: 30px;
	font-family: 'Dancing Script';
	font-size: 22px;
	line-height: 40px;
	margin: 20px;
}

#customer {
	width: 380px;
}

#price {
	width: 200px;
}

#date {
	width: 200px;
}

#save {
	width: 180px;
}

h1, label {
	color: blue;
}

/*Place textholder in center*/
::-webkit-input-placeholder {
	text-align: center;
}

:-moz-placeholder { /* Firefox 18- */
	text-align: center;
}

::-moz-placeholder { /* Firefox 19+ */
	text-align: center;
}

:-ms-input-placeholder {
	text-align: center;
}
</style>
</head>
<body>

	<h1>Add Order</h1>
	<form method="POST" action="save" modelAttribute="order">
	<form:hidden path="id" value="${order.id}"/>
	<label>Customer Name</label>
	<input name="customer" value="${order.customer}"  id="customer" type="text"  placeholder="Name" />
	<br />
	<label>Price </label>
	<input name="price" value="${order.price}" id="price"  placeholder="Price" />
	<br />
	<label>Order date</label>
	<%-- <input name="dateOfOrder" type="date" min="2018-01-01" max="2022-12-31" value="07/29/2012" id="date"
		value="<fmt:formatDate value="${order.dateOfOrder}" pattern="MM/dd/yy" />" /> --%>
	<input name="dateOfOrder" id="date"
		value="<fmt:formatDate value="${order.dateOfOrder}" pattern="MM/dd/yy" />"   />
	<br />
	<input id="save" type="submit" value="Save" />
	</form>
</body>
</html>