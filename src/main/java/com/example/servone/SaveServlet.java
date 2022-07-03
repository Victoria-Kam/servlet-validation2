package com.example.servone;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/save-servlet")
public class SaveServlet extends HttpServlet {
    private String firstName;
    private String lastName;
    private String email;
    private String number;

    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        firstName = request.getParameter("firstName");
        lastName = request.getParameter("lastName");
        email = request.getParameter("email");
        number = request.getParameter("number");

        if (!CheckData.checkNames(firstName) || !CheckData.checkNames(lastName)
                || !CheckData.checkEmail(email) || !CheckData.checkNumber(number)) {
            request.setAttribute("message", "неправильно указаны данные");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "все Ваша заявка принята!");
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }
    }

    public void destroy() {
    }
}