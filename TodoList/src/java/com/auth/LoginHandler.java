/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.auth;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author ashis
 */
public class LoginHandler extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
        
        String email = req.getParameter("email");
        String password= req.getParameter("password");
        
        
       HttpSession session=req.getSession();
       
       session.setAttribute("email",email);
       
        
        
        PrintWriter out = res.getWriter();
       
       
        out.println("<h1>"+email+"<h1>");
        out.println("<h1>Todo List</h1>");
        out.println("<h2>task 1</h2>");
        out.println("<h2>task 2</h2>");
        out.println("<h2>task 3</h2>");
        out.println("<a href='newPage'>new Page</a>");
        Cookie[] cookies = req.getCookies();
       
        for(Cookie c : cookies){
            out.println(c.getName()+"==="+c.getValue());
            
        }
        
    }

   
}
