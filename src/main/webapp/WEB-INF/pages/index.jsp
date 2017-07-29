<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <!DOCTYPE html>
 <html>
  <head>
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
	color:yelllow;
}

.wrapper img {
	display: block;
}

.wrapper table {
	border-collapse: collapse;
}

.wrapper table tr:hover{
	background-color: #ff3333;
}
.wrapper table tr th {
	padding-left: 10px;
	padding-right: 10px;
	background-color: #dddddd;
	margin: 0;
}

.wrapper table tr td{
	padding-left: 10px;
	padding-right: 10px;
	font-size:14px;
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
      <meta charset="UTF-8">
      <title>My  to do list</title>

      

  </head>
  <body>
  	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>
	<div class="wrapper">
      <div align="center">
          <h1>My list to do</h1>
         <form:form action="/MyToDoList/delTask" method="post" modelAttribute="listForm">
          <table border="1">
              <tr>
                <th>ID</th>
                <th>Subject</th>
                <th>Description</th>
                <th>Action</th>
              </tr>
              <c:forEach var="l" items="${mylist}" varStatus="status">
              <tr>
                 
                  <td>${l.id}</td>
                  <td>${l.subject}</td>
                  <td>${l.description}</td>  
                  <td><button type="submit" name="deleteBtnTask" value="${l.id}">Delete</button></td>                          
              </tr>
              </c:forEach>                
          </table>
          
          </form:form>
         
          
      </div>
      </div>
      <jsp:include page="_footer.jsp"></jsp:include>
  </body>
</html>