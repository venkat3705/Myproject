package CRUDOparation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import CurdOparation.Model;

/**
 * Servlet implementation class ValidatePage
 */
@WebServlet("/ValidatePage")
public class ValidatePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		Model m = new Model();		
		//m2.setpro_id(Integer.parseInt(request.getParameter("pid")));
		m.sete_id(Integer.parseInt(request.getParameter("eid")));
		m.sete_pass(request.getParameter("epass"));
		
		PrintWriter out = response.getWriter();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cred","root","9182998058");
			
			PreparedStatement ps = con.prepareStatement("select * from emp where e_id=? and e_pass=?");
			 
			 ps.setInt(1,m.gete_id());
			 ps.setString(2,m.gete_pass());
			 
			 
		
			 ResultSet rs = ps.executeQuery();
			
			
			if(rs.next()) {
				
				out.print("your login succesfuuly");
				
				response.sendRedirect("product.jsp");
				
			    
			}
			else {
				out.print("incorrect user name password ");
			}	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
