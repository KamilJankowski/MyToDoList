<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>My  to do list</title>
      <link rel="stylesheet" href="style.css" type="text/css">
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
                <th>Action</th>
              </tr>
              <c:forEach var="l" items="${mylist}" varStatus="status">
              <tr>
                 
                  <td>${l.id}</td>
                  <td>${l.subject}</td>
                  <td>${l.description}</td>  
                  <td><button value="l.id"></button></td>                          
              </tr>
              </c:forEach>                
          </table>
      </div>
      </div>
      <jsp:include page="_footer.jsp"></jsp:include>
  </body>
</html>