package com.MeiXiaoHui.week4.demo;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="ConfigDemoServlet",
        value="/cofig",
        initParams={
                @WebInitParam(name = "name1", value = "MeiXiaoHui"),
                @WebInitParam(name = "studentId1", value = "2022211001000414")
        })
public class ConfigDemoServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletConfig config = getServletConfig();

        String name = config.getInitParameter("YourName");
        String id = config.getInitParameter("studentId");

        System.out.println("Name: " + name);
        System.out.println("Id: " + id);

        String name1 = config.getInitParameter("name1");
        String studentId1 = config.getInitParameter("studentId1");

        System.out.println("name: " + name1);
        System.out.println("studentid: " + studentId1);

        // Write output to the HTTP response
        response.setContentType("text/plain");
        response.getWriter().println("name: " + name);
        response.getWriter().println("studentid: " + id);
        response.getWriter().println("name1: " + name1);
        response.getWriter().println("studentid1: " + studentId1);
    }
}