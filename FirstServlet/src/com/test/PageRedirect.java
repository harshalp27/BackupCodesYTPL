package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PageRedirect extends HttpServlet {
    
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

	   HttpSession session = request.getSession();
	//   Session session1 = request.getSession();
	   session.isNew();
	   PrintWriter out = response.getWriter();
      // Set response content type
      response.setContentType("text/html");

      // New location to be redirected
      String site = new String("http://www.google.com");

      response.setStatus(response.SC_MOVED_TEMPORARILY);
      response.setHeader("Location", site);    
   }
} 