package com.codingdojo.web.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Home() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
		view.forward(request, response);	
		Random r = new Random();
		int randomInt = r.nextInt(100) + 1;
		 HttpSession session = request.getSession();
		 session.setAttribute("random",randomInt);
		 Integer randomNum = (Integer) session.getAttribute("random");
		 System.out.println(randomNum);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String guess = request.getParameter("num");
		Integer guessNumber = Integer.parseInt(guess);
		HttpSession session = request.getSession();
        Integer randomNum = (Integer) session.getAttribute("random");
		 		
				if(guessNumber < randomNum) {
					String result = "too low!";
					request.setAttribute("result", result);
				} else if( guessNumber > randomNum) {
					String result = "too high!";
					request.setAttribute("result", result);
				} else if (guessNumber == randomNum){
					String result = "you guesses the number";
					request.setAttribute("result", result);
				}
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
				view.forward(request, response);
				
			
		 }
		

}
