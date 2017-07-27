<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>My  to do list</title>
      <link rel="stylesheet" href="CSS/style.css" type="text/css">
  </head>
  <body>
      <div align="center">
          <h1>My to do list</h1>
          <form:form method ="POST" action = "/MyToDoList/" >
          <table border="1">
              <tr>
                <th>Subject</th>
                <th>Description</th>
                <th>Action</th>
              </tr>
             
              <tr>
                  <td><form:input path="subject"/></td>
                  <td><form:input path="description"/></td>
                  <td><input type = "submit" value="Submit"/></td>                            
             </tr>
                       
          </table>
          </form:form>
      </div>
  </body>
</html>