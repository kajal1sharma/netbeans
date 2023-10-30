/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.second.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ashis
 */
public class MyotherServlet extends HttpServlet {
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        System.out.println("hello world");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is second java Class</h1>");
    }
}
