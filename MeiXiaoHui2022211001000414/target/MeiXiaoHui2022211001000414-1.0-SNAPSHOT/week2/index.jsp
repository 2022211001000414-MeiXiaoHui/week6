<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@include file="header.jsp"%>

<form>
<h1  style="font-weight: bold;"> welcome to my home page</h1>
    <br/>
    <a href="/hello-servlet">Hello Servlet-week1</a>
    <br/>
    <a href="/MyServlet">Student Info Servlet-week2</a>
    <br/>
    <a href="/life">Life Cycle Servlet-week3</a>
    <br/>
    <a href="/register"> Register-getParameter-week3</a>
    <br/>
    <a href="/config">Config parameter-week4</a>
    <br/>
    <a href="/jdbc"> Register JDBC -week4</a>
    <br/>
    <a href="index.jsp"> include-week5</a>
    <br/>
    <a href="logo.jpg"> Login-week5</a>
</form>
<br>
<form method="get" target="_blank" action="/search">
    <h2>Welcome to My Online Shop Home Page</h2> <br>
    <input type="text" name="txt" size=30/>
    <select name="search">
        <option value="baidu">Baidu</option>
        <option value="bing">Bing</option>
        <option value="google">Google</option>
    </select>
    <input type="submit" value="search"/>
</form>
<%@include file="footer.jsp"%>