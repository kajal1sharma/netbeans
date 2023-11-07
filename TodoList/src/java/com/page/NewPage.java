/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.page;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author ashis
 */
public class NewPage extends HttpServlet{
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        HttpSession session = req.getSession();
        String email=(String)session.getAttribute("email");
        PrintWriter pw = res.getWriter();
        
        pw.println(email);
        
    }
    
}
