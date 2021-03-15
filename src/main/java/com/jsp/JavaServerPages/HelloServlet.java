package com.jsp.JavaServerPages;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World! This is a Servlet Demo class";
    }

    /**
     * Whenever we make a get request to "helloServlet", this method will be called
     *
     * @param request  a Http Servlet request
     * @param response a Http Servlet response
     * @throws IOException a possible IO Exception.
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        System.out.println("The GET request has been made to /hello-servlet");
    }

    public void destroy() {
    }
}