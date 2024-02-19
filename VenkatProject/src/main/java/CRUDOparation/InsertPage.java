package CRUDOparation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertPage
 */
@WebServlet("/InsertPage")
public class InsertPage extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		Model m = new Model();
		m.sete_id(Integer.parseInt(request.getParameter("eid")));
		m.sete_name(request.getParameter("ename"));
		m.sete_pass(request.getParameter("epass"));
		
		
		PrintWriter out= response.getWriter();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cred","root","9182998058");
			//out.println("working");
			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
			
			ps.setInt(1, m.gete_id());
			 ps.setString(2,m.gete_name());
			 ps.setString(3,m.gete_pass());
			 
			 
		
			 // create statement
			
			 int integer = ps.executeUpdate(); 
			
			
			if(integer>0) {
				out.print("your data is inserted succesfuuly");
			    //response.sendRedirect("Login.jsp");
			}
			else {
				out.print("data is not inserted");
			}

			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
