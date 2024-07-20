package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RemovePost extends HttpServlet {

    public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
        try {
            Connection con = XCConnection.initDB();

            PreparedStatement statement  = con.prepareStatement("DELETE FROM public.course WHERE name = ?");

            String CourseName = req.getParameter("Xpost");
            statement.setString(1, CourseName);

            statement.executeUpdate();

            statement.close(); 
            con.close(); 

            PrintWriter out = res.getWriter(); 
            out.println("<html><body><b>Successfully Removed" + "</b></body></html>"); 
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
