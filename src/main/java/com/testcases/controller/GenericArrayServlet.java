package com.testcases.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/GenericArrayServlet")
public class GenericArrayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Integer> a;
	private int len , upper;
	private boolean pos , neg;

    public GenericArrayServlet() {

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter p = response.getWriter();
		HttpSession session = request.getSession();
		
		//set session variables
		int upperLimit = (int) session.getAttribute("upperLimit");
		upper = (int) session.getAttribute("upperNum");
		int t = (int) session.getAttribute("test");
		pos = (boolean) session.getAttribute("positive");
		neg = (boolean) session.getAttribute("negative");
		boolean fixed = (boolean) session.getAttribute("fixed");
		
		if(fixed == true)
		{
			len = upperLimit;
			p.println(t + " " + len);
		}
		 	
		Random rand = new Random();
		while(t > 0) {
			if(fixed == false)
			{
				len = rand.nextInt(upperLimit);
				generate();
				p.println(len);
				for(int k : a) p.print(k + " ");
				p.println();
			}
			else 
			{
				
				generate();
				for(int k : a) p.print(k + " ");
				p.println();
			}
			t--;
		}
		
		p.close();
		
	}
	
	private void generate() {
		Random rand = new Random();
		
		a = new ArrayList<Integer>();
		if(neg == true && pos == true) {
			for(int i=0; i<len; i++) {
				boolean rb = rand.nextBoolean();
				int nb = rand.nextInt(upper+1);
				if(rb == true)
					a.add(nb * (-1));
				else a.add(nb);
			}
		}
		else if(neg == true && pos == false) {
			for(int i=0; i<len; i++) {
				int nb = rand.nextInt(upper+1);
					a.add(nb * (-1));
			}
		}
		else {
			for(int i=0; i<len; i++) {
				int nb = rand.nextInt(upper+1);
					a.add(nb);
			}
		}
	}
	
	

}
