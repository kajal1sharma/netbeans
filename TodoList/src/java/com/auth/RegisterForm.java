/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.auth;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ashis
 */
public class RegisterForm  extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
        String username= req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        
        PrintWriter obj = res.getWriter();
        obj.println("<h1>"+username+"</h1>");
        obj.println("<h1>"+password+"</h1>");
        obj.println("<h1>"+email+"</h1>");
    }
    
}
