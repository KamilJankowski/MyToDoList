<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	width: 300px;
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

.dropdown {
	position: absolute;
	display: inline-block;
	right: 100px;
	color: white;
	text-decoration: none;
	top: 10px;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: rgba(249, 249, 249, .3);
	text-decoration: none;
	min-width: 120px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	padding: 12px 16px;
	z-index: 1;
}

.dropdown-content button {
	background: none !important;
	color: inherit;
	border: none;
	padding: 0 !important;
	font: inherit;
	/*border is optional*/
	border-bottom: 1px solid #444;
	cursor: pointer;
	text-decoration: none;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>


</head>
<body>

	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>
	<div class="wrapper">
		<div align="center">
			<h1>My list to do</h1>

			<table border="1">
				<tr>
					<th>ID</th>
					<th>Subject</th>
					<th>Description</th>
					<th>Action Delete</th>
					<th>Action Edit</th>
				</tr>
				<c:forEach var="l" items="${mylist}" varStatus="status">
					<tr>

						<td>${l.id}</td>
						<td>${l.subject}</td>
						<td>${l.description}</td>
						<td><form:form action="/MyToDoList/delTask" method="post"
								modelAttribute="listForm">
								<button type="submit" name="deleteBtnTask" value="${l.id}">Delete</button>
							</form:form></td>
						<td><form:form action="/MyToDoList/editTask" method="post"
								modelAttribute="listForm">
								<button type="submit" name="editBtnTask" value="${l.id}">Edit</button>
							</form:form></td>
					</tr>
				</c:forEach>
			</table>




		</div>
	</div>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>