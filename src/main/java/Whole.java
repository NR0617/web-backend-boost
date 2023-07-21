package main.java;

import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;


@WebServlet("/whole")
public class Whole extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        response.getWriter().println("<html><body><h1>a whole new world</h1></body></html>");

    }


}