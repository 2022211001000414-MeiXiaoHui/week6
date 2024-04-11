package com.MeiXiaoHui.week3.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    Connection con=null;

    @Override
    public void init() {
//        String driver = getServletContext().getInitParameter("driver");
//        String url = getServletContext().getInitParameter("url");
//        String username = getServletContext().getInitParameter("username");
//        String password = getServletContext().getInitParameter("password");
//
//        try {
//            Class.forName(driver);
//            con = DriverManager.getConnection(url, username, password);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
       con=(Connection) getServletContext().getAttribute("con");
    }



    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id1="1";
        String username1 = "MeiXiaoHui";
        String password1 = "2022211001000414";
        String email1 = "123@qq.com";
        String gender1 = "male";
        String birthdate1 = "2002-01-01";


        try {
            PreparedStatement s = con.prepareStatement("insert into usertable(id,username,password,email,gender,birthdate)  values(?,?,?,?,?,?)");
            s.setString(1, id1);
            s.setString(2, username1);
            s.setString(3, password1);
            s.setString(4, email1);
            s.setString(5, gender1);
            s.setString(6, birthdate1);
            //set other parameters
            s.executeUpdate();
            con.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

        String str = "select * from usertable";
        try {
            ResultSet rs = con.createStatement().executeQuery(str);
            try {
                PrintWriter writer = response.getWriter();
//                writer.println("<html><head><meta charset=\"UTF-8\"><title>User Information</title></head><body>");
//                writer.println("<table border='1'>");
//                writer.println("<tr><th>ID</th><th>Username</th><th>Password</th><th>Email</th><th>Gender</th><th>Birthdate</th></tr>");
//                while (rs.next()) {
//                    String id = rs.getString("id");
//                    String username = rs.getString("username");
//                    String password = rs.getString("password");
//                    String email = rs.getString("email");
//                    String gender = rs.getString("gender");
//                    String birthdate = rs.getString("birthdate");
//                    writer.println("<tr>");
//                    writer.println("<td>" + id + "</td>");
//                    writer.println("<td>" + username + "</td>");
//                    writer.println("<td>" + password + "</td>");
//                    writer.println("<td>" + email + "</td>");
//                    writer.println("<td>" + gender + "</td>");
//                    writer.println("<td>" + birthdate + "</td>");
//                    writer.println("</tr>");


//                }

//                request.setAttribute("rsname",rs);
//                request.getRequestDispatcher("/week2/userList.jsp").forward(request,response);
//                System.out.println("i am RegisterServlet-->doPost()--> after forward()");


//                writer.println("</table>");
//                writer.println("</body></html>");
                response.sendRedirect("/week2/Login.jsp");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) {


    }


    public void destroy() {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
