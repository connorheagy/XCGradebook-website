package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class CourseSearch extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try {
            Connection con = XCConnection.initDB();
            PreparedStatement statement  = con.prepareStatement("INSERT INTO public.course(name, rating, distance, imgLink) VALUES (?,?,?,?); ");

            String CourseName = req.getParameter("CourseName");
            int dif = Integer.parseInt(req.getParameter("dif"));
            float dist = Float.parseFloat(req.getParameter("dist"));
            String imgLink = req.getParameter("imgLink");

            statement.setString(1, CourseName);
            statement.setInt(2, dif);
            statement.setFloat(3, dist);
            statement.setString(dif, imgLink);

            statement.executeUpdate();

            statement.close(); 
            con.close(); 

            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/Browse.jsp");
            dispatcher.forward(req, res);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    } // doGet(req, res)
} // class CourseSearch
