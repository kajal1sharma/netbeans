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
public class LoginServlet extends HttpServlet {
    @Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        //hashing 
        //retreive info from db 
        
        
        PrintWriter out  = res.getWriter();
        out.println(email);
        out.println(password);
        out.println("Successfully logged in");
        
        
        
        
        
    }
}
