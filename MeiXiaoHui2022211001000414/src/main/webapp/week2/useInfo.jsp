<%--
  Created by IntelliJ IDEA.
  User: 梅晓辉
  Date: 2024/4/11
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp"%>

<h1>User Info</h1>
<table>
    <tr>
        <td>Username:</td><td><%=request.getAttribute("username")%></td>
        <td>Password:</td><td><%=request.getAttribute("password")%></td>
        <td>Email:</td><td><%=request.getAttribute("email")%></td>
        <td>Gender:</td><td><%=request.getAttribute("gender")%></td>
        <td>birthdate:</td><td><%=request.getAttribute("birthdate")%></td>
    </tr>
</table>
<%@include file="footer.jsp"%>
