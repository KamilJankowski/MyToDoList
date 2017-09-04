<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My to do list</title>
<style>
@import
	url('https://fonts.googleapis.com/css?family=Karla:400,400i,700,700i|Oxygen:300,400,700')
	;

* {
	margin: 0;
	padding: 0;
}

body {
	font-family: 'Karla';
	padding: 0;
	margin: 0;
	color: yelllow;
}

.wrapper img {
	display: block;
}

.wrapper table {
	border-collapse: collapse;
}

.wrapper table tr:hover {
	background-color: #ff3333;
}

.wrapper table tr th {
	padding-left: 10px;
	padding-right: 10px;
	background-color: #dddddd;
	margin: 0;
}

.wrapper table tr td {
	padding-left: 10px;
	padding-right: 10px;
	font-size: 14px;
}

header {
	height: 50px;
	background-color: #3385ff;
	display: block;
	margin: 0;
	width: 100%;
}

.wrapper {
	padding: 10px;
	min-height:
}

header h1 {
	padding: 10px;
	font-size: 22px;
	color: #f8f8f8;
	font-family: 'Oxygen';
	font-style: italic;
}

nav {
	background-color: #171717;
	height: 30px;
	color: #f5f5f5;
	width: 100%;
	padding-top: 10px;
	display: block;
	padding-left: 20px;
}

nav ul li {
	display: inline-block;
	color: #f5f5f5;
}

nav ul li a {
	color: #f5f5f5;
	padding-left: 10px;
	padding-right: 10px;
	text-decoration: none;
}

nav ul li a:hover {
	color: #ff3333;
}

footer {
	height: 30px;
	background-color: #d2d2d2;
	display: block;
}

footer p {
	font-size: 14px;
	padding: 5px;
	text-align: center;
}
</style>
</head>
<body>

	<jsp:include page="_header1.jsp"></jsp:include>
	
	<div class="wrapper">
		<div align="center">
			<h2>Login to My To Do List</h2>
			<form method="POST" action="/MyToDoList/loginresult">
				<table border="1">

					<tr>
						<td><label>login</label></td>
						<td><input type="text" name="login" /></td>
					</tr>
					<tr>
						<td><label>password</label></td>
						<td><input type="password" name="password" /></td>
					</tr>
				</table>

				<button type="submit" name="submitLogin" value="submit" >Login</button>
			</form>
		</div>
	</div>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>