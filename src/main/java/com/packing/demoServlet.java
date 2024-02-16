package com.packing;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/demoServlet")

public class demoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response ) {
		
		String  name = "Navin";
		
		request.setAttribute("label", name);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

} 
