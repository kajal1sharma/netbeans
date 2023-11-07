/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.auth;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import com.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import com.utility.PasswordHashing;

/**
 *
 * @author ashis
 */
public class LoginHandler  extends HttpServlet{
     protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        password = PasswordHashing.doHash(password);
        
        //password checking
        HttpSession session = req.getSession();
        User user= (User)(session.getAttribute("user"));
        String  Hashedpassword = user.getPassword();
        if(Hashedpassword.equals(password)){
            RequestDispatcher rd = req.getRequestDispatcher("Home.html");
            rd.forward(req, res);
        }
        else{
            RequestDispatcher rd = req.getRequestDispatcher("Error.html");
            rd.forward(req, res);
        }
        
        
        
        
        
       
    }
}
