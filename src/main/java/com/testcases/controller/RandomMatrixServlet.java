package com.testcases.controller;


import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/matrix")
public class RandomMatrixServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RandomMatrixServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("matrix.jsp");
		rd.forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("typeOfMatrix");
		int row = Integer.parseInt(request.getParameter("rows"));
		int col = Integer.parseInt(request.getParameter("column"));
		int upper = Integer.parseInt(request.getParameter("upperNum"));
		
		if(type.equals("numMat")) {
		
			boolean pos = true , neg = false;
			
			String sign1 = request.getParameter("sign1");
			String sign2 = request.getParameter("sign2");
			
			if(sign1 != null) {pos = false; neg = true;}
			if(sign2 != null) neg = true;
			
			HttpSession session = request.getSession();
			session.setAttribute("upperLimit", col);
			session.setAttribute("upperNum", upper);
			session.setAttribute("test", row);
			session.setAttribute("positive", pos);
			session.setAttribute("negative", neg);
			session.setAttribute("fixed", true);
			
			RequestDispatcher rd = request.getRequestDispatcher("GenericArrayServlet");
			rd.forward(request, response);
		}
		
	}

}
