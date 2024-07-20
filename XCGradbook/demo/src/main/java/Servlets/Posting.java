package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import CourseDB.*;

public class Posting extends HttpServlet {
   
    XCListings l1 = new XCListings();

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String CourseName = req.getParameter("CourseName");
        int dif = Integer.parseInt(req.getParameter("dif"));
        float dist = Float.parseFloat(req.getParameter("dist"));

        //course newCourse = new course(CourseName, dif, dist);
        //Node newNode = new Node(newCourse);

        //l1.add(newNode);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/postAction.jsp");
        dispatcher.forward(req, res);
    } // service(req, res)
} // class servlet