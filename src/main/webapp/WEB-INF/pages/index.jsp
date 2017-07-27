<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>My List to do</title>
  </head>
  <body>
      <div align="center">
          <h1>My list to do</h1>
          <table border="1">
              <tr>
                <th>ID</th>
                <th>Subject</th>
                <th>Description</th>
              </tr>
              <c:forEach var="l" items="${mylist}" varStatus="status">
              <tr>
                 
                  <td>${l.id}</td>
                  <td>${l.subject}</td>
                  <td>${l.description}</td>                            
              </tr>
              </c:forEach>                
          </table>
      </div>
  </body>
</html>