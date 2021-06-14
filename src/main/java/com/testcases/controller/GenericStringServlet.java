
package com.testcases.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/GenericStringServlet")
public class GenericStringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int upperLimit , len , N = 0;
	private boolean lower , upper;
	private String s , extra;
	private char []characters;

    public GenericStringServlet() {}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	
	private void createCharacterArray() {
			
		String lc = "" , uc = "";
			
		char c = 'a';
		while(c <= 'z') { lc += c; c++; }
		
		c = 'A';
		while(c <= 'Z') { uc += c; c++; }
		
		String p = "";
		
		if(lower == true) p = p + lc;
		if(upper == true) p = p + uc;
		p = p + extra;
		characters = p.toCharArray();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		upperLimit = (int) session.getAttribute("upperLimit");
		int t = (int) session.getAttribute("test" );
		upper = (boolean) session.getAttribute("upper");
		lower = (boolean) session.getAttribute("lower");
		extra = (String) session.getAttribute("extra");
		boolean fixed = (boolean) session.getAttribute("fixed");
		createCharacterArray();
		
		PrintWriter p = response.getWriter();
		if(fixed == true)
		{
			len = upperLimit;
			p.println(t + " " + len);
		}
		
		
		N = characters.length;
		Random rand = new Random();
		
		while(t > 0) {
			if(fixed == false)
			{
				len = rand.nextInt(upperLimit);
				generate();
				p.println(len);
				p.print(s);
				p.println();
			}
			else 
			{
				generate();
				p.print(s);
				p.println();
			}
			t--;
		}
		
		p.close();
	}
	private void generate() {
		
		s = "";
		Random r = new Random();
		
		for(int i=0; i<len; i++) {
			int x = r.nextInt(N);
			s = s + characters[x];
		}
		
	}

}
