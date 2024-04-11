package com.MeiXiao.week2.demo.HelloWorld;

import javafx.print.Printer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       PrintWriter writer=response.getWriter();
       writer.println("Name:MeiXaoHui");
       writer.println("ID:2022211001000414");
        LocalDateTime now = LocalDateTime.now();
        writer.println("Current Time: " + now);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
