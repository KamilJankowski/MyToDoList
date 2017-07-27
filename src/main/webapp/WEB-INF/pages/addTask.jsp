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
          <table border="1">
              <tr>
                
                <th>Subject</th>
                <th>Description</th>
              </tr>
              
              <tr>
                 
                  
                  <td>${subject}</td>
                  <td>${description}</td>                            
              </tr>
                            
          </table>
      </div>
  </body>
</html>