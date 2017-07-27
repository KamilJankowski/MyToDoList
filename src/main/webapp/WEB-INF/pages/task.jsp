<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>My List to do</title>
  </head>
  <body>
      <div align="center">
          <h1>My list to do</h1>
          <form:form method ="POST" action = "/myListToDo/addtask" >
          <table border="1">
              <tr>
                <th>Subject</th>
                <th>Description</th>
                <th>Add</th>
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