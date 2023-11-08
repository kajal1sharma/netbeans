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
import java.io.IOException;

/**
 *
 * @author ashis
 */
public class LogoutHandler extends HttpServlet{
    protected void  doGet(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException{
        HttpSession session = req.getSession();
        session.invalidate();
        RequestDispatcher rd = req.getRequestDispatcher("Register.html");
         rd.forward(req, res);
    }
}
