/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author studentadmin
 */
public class EduScore1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession ses = request.getSession();
        
   
        int points = Integer.parseInt(ses.getAttribute("Points").toString());
        int degree = Integer.parseInt(request.getParameter("deg"));
        int exper = Integer.parseInt(request.getParameter("exp"));
        
        //english
        if((request.getParameter("engW"))!=null){
            points++;
        }
        if((request.getParameter("engR"))!=null){
            points++;
        }
        if((request.getParameter("engS"))!=null){
            points++;
        }
        if((request.getParameter("engL"))!=null){
            points++;
        }
        
        //french
        if((request.getParameter("freW"))!=null){
            points++;
        }
        if((request.getParameter("freR"))!=null){
            points++;
        }
        if((request.getParameter("freS"))!=null){
            points++;
        }
        if((request.getParameter("freL"))!=null){
            points++;
        }
        
        
        switch(degree){
            case 1:
                points+=10;
                break;
            case 2:
                points+=7;
                break;
            case 3:
                points+=5;
                break;
            case 4:
                points+=3;
                break;
        }
        
        switch(exper){
            case 1:
                points+=0;
                break;
            case 2:
                points+=5;
                break;
            case 3:
                points+=7;
                break;
            case 4:
                points+=10;
                break;
            case 5:
                points+=15;
                break;
        }
        
        ses.setAttribute("page","EduScore1");
        
            if(points>=35){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EduScore1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>Congratulations " + ses.getAttribute("name").toString() + "</h1>");
            out.println("<h1>Your Total Score is " + points + "</h1>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
            }
            else{
                RequestDispatcher rd = request.getRequestDispatcher("invalidScore");
                rd.forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
