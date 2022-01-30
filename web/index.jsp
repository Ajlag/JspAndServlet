<%-- 
    Document   : index
    Author     : Ajla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
           .a
           {
               margin: auto;
               background-color: gray;
               display:flex;
               flex-direction: row;
               
               justify-content: space-around;
               
               align-items: center;
            
                width: 600px;
                height: 500px;
                background-color: pink;
               
           }
 .b
 {    
               display:flex;
               flex-direction: column;
               justify-content: space-around;
               align-items: center;
               height: 80px;
               width: 250px;     
 }
    </style>
    </head>
 
    <div class="a">
   
        
        
        <form action="create" method="post" class="b" >
            <label>Pogodi broj</label>
            <input type="number" name="number" required/>
   
            <input type="submit" name="pogodi"  value="add" style="width:100px;"    />  
            
        </form>
        
        
        
       
        </div>

</html>
