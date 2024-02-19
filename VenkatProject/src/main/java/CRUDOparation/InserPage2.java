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
 * Servlet implementation class InserPage2
 */
@WebServlet("/InserPage2")
public class InserPage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		
		Model2 m2 = new Model2();
		m2.setpro_id(Integer.parseInt(request.getParameter("pid")));
		m2.setpro_name(request.getParameter("pname"));
		m2.setpro_price(Integer.parseInt(request.getParameter("pprice")));
		m2.sete_id(Integer.parseInt(request.getParameter("eid")));
		
		
		PrintWriter out= response.getWriter();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cred","root","9182998058");
			//out.println("working");
			PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)");
			
			ps.setInt(1, m2.getpro_id());
			 ps.setString(2,m2.getpro_name());
			 ps.setInt(3,m2.getpro_price() );
			 ps.setInt(4, m2.gete_id());
			 
			 
		
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
