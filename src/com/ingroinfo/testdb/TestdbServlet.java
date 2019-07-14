package com.ingroinfo.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestdbServlet
 */
@WebServlet("/TestdbServlet")
public class TestdbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// setup Connection variablr

		String user = "springstudent";
		String pass = "springstudent";
		String jdbcUrl = "jdbc:mysql://localhost:3307/web_customer_tracker?userSSL=false";
		String driver = "com.mysql.jdbc.Driver";

		// get Connection to database

		try {

			PrintWriter out = response.getWriter();
			out.println("conecting to database" + jdbcUrl);
			Class.forName(driver);
			Connection myCon=DriverManager.getConnection(jdbcUrl,user,pass);
			out.println("SUCCESS");
			myCon.close();
			

		} catch (Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);

		}

	}

}
