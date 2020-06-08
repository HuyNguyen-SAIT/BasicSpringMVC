package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/login")
public class login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        String action= request.getParameter("action");
        if(action.equals("validate"))
        {
            String pnum = (String) request.getParameter("pnum");
            if(pnum.matches("(0/91)?[7-9][0-9]{9}"))
            {
                response.getWriter().write("Correct format!");
            }
            else
            {
                response.getWriter().write("Incorrect format!");
            }
        }
        else
        {
            String name = (String)request.getParameter("name");
            String number = (String) request.getParameter("pnumber");
            String regex = "(0/91)?[7-9][0-9]{9}";

            if(number.matches(regex))
            {
                request.setAttribute("welcome_name",name);
                getServletContext().getRequestDispatcher("/WEB-INF/view/hello.jsp").forward(request,response);
            }
            else
            {
                request.setAttribute("info","Wrong phone number format!");
                getServletContext().getRequestDispatcher("/WEB-INF/view/hi.jsp").forward(request,response);
            }
        }

    }
}
