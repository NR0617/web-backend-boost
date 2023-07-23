package com.example.demo1;

import java.io.*;
import javax.servlet.http.*;


public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Servlet!!!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>" + message + "</h3>");
        out.println("</body></html>");
    }


}