package com.pucminas.carofour;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/produtos")
public class ProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ProdutosServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("produtos", "Lista com produtos aqui");
		RequestDispatcher dispatcher = request.getRequestDispatcher("produtos.jsp"); 
	    dispatcher.forward(request, response);
	}
}
