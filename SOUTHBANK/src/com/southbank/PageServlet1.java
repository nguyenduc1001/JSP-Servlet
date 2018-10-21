package com.southbank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page.html")
public class PageServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fn = req.getParameter("u");
		String ln = req.getParameter("p");
		PrintWriter out = resp.getWriter();
		
		if (fn.equals("N") && ln.equals("D")) {
			req.setAttribute("FN", fn);
			req.setAttribute("LN", ln);
			//req.getRequestDispatcher("shoinfo.jswp").forward(req, resp);
			out.println("<script> alert('Ban da nhap dung'); </script>");
		}else
		
		{
			req.setAttribute("sai", "Ban da nhap sai user va pass");
			req.getRequestDispatcher("showinfo.jsp").forward(req, resp);
		};
				
	
	}
}
