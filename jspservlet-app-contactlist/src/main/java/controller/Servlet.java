package controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("Servlet")
public class Servlet extends HttpServlet{
    private static final long serialVersionUID=1L;

    protected void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=null;
        try{
            out=response.getWriter();
            String contactName;
            int n=Integer.parseInt(request.getParameter(contactName);
            out.println("<center>");
        }
        catch(Exception e){
            out.println("Error:"+e.getMessage());
        }
        finally{
            out.println("<br><br>");
            out.println("<a href=index.html></a>");
        }
    }
}
