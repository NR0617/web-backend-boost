package main.java;

import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;


@WebServlet("/example")
public class Example extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        response.getWriter().println("<html><body><h1>Example!</h1></body></html>");
    }

}