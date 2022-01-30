/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ajla
 */
@WebServlet(urlPatterns = {"/create"})
public class User extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             String p=  request.getParameter("number");
             String pag="index2.jsp";
        
     // if (request.getParameter("add") != null) {
    // Invoke FirstServlet's job here.
        Random num = new Random();
        int broj = num.nextInt(10-1)+1;
        
        if(p==null || p.length()==0){
        request.setAttribute("poruka", "Ulazni parametar nije dobar");
        RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
        disp.forward(request, response);
        }
        
        if(!isNumeric(p)){
        request.setAttribute("poruka","Ulazni parametar nije dobar. Dozvoljene su samo cifre.");
        RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
        disp.forward(request, response); 
        }
        if(Integer.parseInt(p)==broj)
        {
          request.setAttribute("num","Bravo pogodili ste broj :"+broj);
          request.setAttribute("number1", "Green");
        }
        else 
        {
        request.setAttribute("num","Greškaa zamisljeni broj je "+broj);
         request.setAttribute("number1", "red");
        }
        
        
        RequestDispatcher dis=request.getRequestDispatcher(pag);
        dis.forward(request, response);
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
  
    }
    
    public static boolean isNumeric(String str){
    for(char c : str.toCharArray()){
        if(!Character.isDigit(c)){
            return false;
        }
    }
    return true;
    }
}
