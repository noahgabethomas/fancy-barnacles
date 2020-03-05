package com.noah.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest resq, HttpServletResponse resp) throws ServletException, IOException	{
		resp.getWriter().write("Leeroyyyyy... JAAAAAAAAYNNNNNNNKAEHHHHHNS!!!!!!!!!!!!!!!");
		}
	
}
