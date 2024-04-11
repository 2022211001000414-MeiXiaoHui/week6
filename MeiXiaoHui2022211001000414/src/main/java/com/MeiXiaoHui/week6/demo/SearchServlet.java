package com.MeiXiaoHui.week6.demo;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

@WebServlet(name = "SearchServlet", value = "/search")
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processSearchRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processSearchRequest(request, response);
    }

    private void processSearchRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        String txt = request.getParameter("txt");
        String searchEngine = request.getParameter("search");

        if (txt == null || txt.trim().isEmpty()) {
            // Redirect to home page (index.jsp) if the text input is empty
            response.sendRedirect(request.getContextPath() + "/week2/index.jsp");
            return;
        }

        if ("baidu".equals(searchEngine)) {
            response.sendRedirect("https://www.baidu.com?q=" + encodeURL(txt));
        } else if ("bing".equals(searchEngine)) {
            response.sendRedirect("https://cn.bing.com/search?q=" + encodeURL(txt));
        } else if ("google".equals(searchEngine)) {
            response.sendRedirect("https://www.google.com/search?q=" + encodeURL(txt));
        } else {
            // Handle invalid search engine selection or redirect to a default search engine
            response.sendRedirect("https://www.google.com/search?q=" + encodeURL(txt));
        }
    }

    private String encodeURL(String urlComponent) {
        try {
            return URLEncoder.encode(urlComponent, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding not supported", e);
        }
    }
}








//get parameter -<input type ="text" size=30/>and
//get parameter -<select name ="search">
//check is txt null
//if(txt is null){
//redirect to homr page--index.jsp

// }else if(search == baidu){
// redirect to baidu
// reponse.sendRedirect("https://www.baidu.com/s?wd="+txt);
// }else if(search==bing){
//response.sendRedirect("https://cn.bing.com/search?q="+txt);
// }else if(search== google)
// reponse.sendRedirect("https://www.google.com/search?q="+txt);
//}
//}