<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: 梅晓辉
  Date: 2024/4/11
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<%@ page import="java.sql.ResultSet" %>
<h1> User List</h1>
<table border=1>
    <tr>
        <td>Id</td><td>Username</td><td>password</td><td>Email</td><td>Gender</td><td>Birthday</td>
    </tr>

    <%
       ResultSet rs=(ResultSet) request.getAttribute("rsname");
       if(rs==null){

    %>
    <tr>
        <td>NO Data!!</td>
    </tr>
    <% }else{
           while (rs.next()){
               out.println("<tr>");
               out.println("<td>"+rs.getString("id")+"</td>");
               out.println("<td>"+rs.getString("username")+"</td>");
               out.println("<td>"+rs.getString("password")+"</td>");
               out.println("<td>"+rs.getString("email")+"</td>");
               out.println("<td>"+rs.getString("gender")+"</td>");
               out.println("<td>"+rs.getString("birthdate")+"</td>");

               out.println("</tr>");

           }

    }

    %>
</table>
<%@include file="footer.jsp"%>

