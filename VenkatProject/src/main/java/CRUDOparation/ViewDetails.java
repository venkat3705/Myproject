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

/**
 * Servlet implementation class ViewDetails
 */
@WebServlet("/ViewDetails")
public class ViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String name = request.getParameter("eid");
			String pass = request.getParameter("epass");
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cred","root","9182998058");
			//out.print("working");
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM emp e LEFT JOIN product p ON e.e_id = p.e_id");
			
			//PreparedStatement ps = con.prepareStatement("select * from emp e LEFT JOIN product p ON e.e_id = p.e_id where e.e_id=?");
			//ps.setString(1, name);
           // ps.setString(2, pass);
			
            
			Model m=new Model();
			Model2 m2=new Model2();
			
			 ps.setInt(1, m.gete_id());
			 
			 
	//		 ps.setString(2,m.gete_name());
	//		 ps.setString(3,m.gete_pass());
			 ps.setInt(4, m2.getpro_id());
	//		 ps.setString(5,m2.getpro_name());
	//		 ps.setInt(6,m2.getpro_price() );  
			 
			 ResultSet rs = ps.executeQuery(); 
			 
			 
				
				out.print("<table border='1' style='border-collapse:collapse';>");
	            out.print("<tr><th>e_id</th><th>e_name</th><th>e_pass</th><th>pro_id</th><th>pro_name</th><th>pro_price</th></tr>");

	           while (rs.next()) {
	        	   
	                int e_id = rs.getInt("e.e_id");
	               String e_name = rs.getString("e.e_name");
	                String e_pass = rs.getString("e.e_pass");
	                int pro_id = rs.getInt("p.pro_id");
	                String pro_name = rs.getString("p.pro_name");
	                int pro_price = rs.getInt("p.pro_price"); 

	                out.print("<tr><td>" + e_id + "</td><td>" + e_name + "</td><td>" + e_pass + "</td><td>" + pro_id + "</td><td>" + pro_name + "</td><td>" + pro_price + "</td></tr>");

	            }
	         
	            out.print("</table>");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

	
}
