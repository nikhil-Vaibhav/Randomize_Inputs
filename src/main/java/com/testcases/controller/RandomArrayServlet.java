package com.testcases.controller;


import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/*
 * This is a normal integer array generating template
 * Changes needed  
 * -> Create generic array features
 * 
 */

@WebServlet("/array")
public class RandomArrayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int upper;
	private boolean pos , neg; 
    public RandomArrayServlet() {}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("array.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int upperLimit = Integer.parseInt(request.getParameter("arraySize"));
		upper = Integer.parseInt(request.getParameter("upperNum"));
		int t = Integer.parseInt(request.getParameter("testCases"));
		pos = true; neg = false;

		String sign1 = request.getParameter("sign1");
		String sign2 = request.getParameter("sign2");
		
		if(sign1 != null) {pos = false; neg = true;}
		if(sign2 != null) neg = true;
		
		
		HttpSession session = request.getSession();
		session.setAttribute("upperLimit", upperLimit);
		session.setAttribute("upperNum", upper);
		session.setAttribute("test", t);
		session.setAttribute("positive", pos);
		session.setAttribute("negative", neg);
		session.setAttribute("fixed", false);
		
		RequestDispatcher rd = request.getRequestDispatcher("GenericArrayServlet");
		rd.forward(request, response);
		
	
	}
	
	

}
