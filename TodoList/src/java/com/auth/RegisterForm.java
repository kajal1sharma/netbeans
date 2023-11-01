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
        
        //password hashing
        //store into database
        PrintWriter obj = res.getWriter();
        
        
        
        String a="abcd";
        a=a+"pqrs";
        
        
        String s="<h1 style='text-align: center'>Login</h1>";
        s=s+"<form action='login' method='post' >";
            
            s=s+"<p>";
              s=s+ " <input type='email' name='email' placeholder='email'/>";
            s+="</p>";
             s+="<p>";
               s+=" <input type='password' name='password' placeholder='password'/>";
            s+="</p>";
            s+="<p>";
               s+= "<input type='submit'/>";
                s+="<input type='reset'/>";
            s+="</p>";
        s+="</form>";
        s+="abcdefgh";
        obj.println(s);
//        obj.println("<h1>"+username+"</h1>");
//        obj.println("<h1>"+password+"</h1>");
//        obj.println("<h1>"+email+"</h1>");
    }
    
}
