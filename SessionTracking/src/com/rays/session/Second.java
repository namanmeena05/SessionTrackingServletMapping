package com.rays.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/second")
public class Second extends HttpServlet {

	
	//getSession(true) - This creates a new session if one does not exist.
	//getSession(false) - This returns the current session if one exists, but returns null if no session exists.
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(true );
		System.out.println("second = " + session.getId());
	}
}
