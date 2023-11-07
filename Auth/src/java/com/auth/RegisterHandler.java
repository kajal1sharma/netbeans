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
import com.utility.PasswordHashing;
import com.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author ashis
 */
public class RegisterHandler extends HttpServlet {
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
       
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            String email = req.getParameter("email");
            password = PasswordHashing.doHash(password);
            User user = new User(username, email, password);
            
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            
            RequestDispatcher rd = req.getRequestDispatcher("Login.html");
            rd.forward(req, res);
    }
    
}
