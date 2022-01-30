<%-- 
    Document   : index2
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
               display:flex;
               flex-direction: column;
               justify-content: space-around;
               align-items: center;
               width: 600px;
               height: 500px;
               position: relative; 
           }        
 .p
 {
     width: 120px;
       height: 60px;
       display: flex;
       flex-direction: row;
       align-items: center;
       justify-content: center; 
       
 }         
 
 
 
        </style>
    </head>
 
    <div class="a">        
       
         <div class="p">
           ${num}
         </div>
  
   
     </div>
</html>
