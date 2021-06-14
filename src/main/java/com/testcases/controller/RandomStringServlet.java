package com.testcases.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/string")
public class RandomStringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int upperLimit ;
	private boolean lower , upper;
	private String extra;

	
    public RandomStringServlet() {}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("string.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		upperLimit = Integer.parseInt(request.getParameter("stringLength"));
		lower = false; upper = false;
		extra = request.getParameter("extra");
		int t = Integer.parseInt(request.getParameter("testCases"));
		String typeL = request.getParameter("caseL");
		String typeU = request.getParameter("caseU");
		
		
		if(typeL != null && typeL.equals("lowerCase")) { lower = true ;}
		if(typeU != null && typeU.equals("upperCase")) { upper = true;}
		
		
		HttpSession session = request.getSession();
		session.setAttribute("upperLimit", upperLimit);
		session.setAttribute("test" , t);
		session.setAttribute("upper", upper);
		session.setAttribute("lower", lower);
		session.setAttribute("extra", extra);
		session.setAttribute("fixed", false);
		
		RequestDispatcher rd = request.getRequestDispatcher("GenericStringServlet");
		rd.forward(request, response);
		
	}
	

}
