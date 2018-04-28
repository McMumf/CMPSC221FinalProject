/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import GameEngine.User;
import GameEngine.CrapsSimple;
import GameEngine.CrapsQuery;

/**
 *
 * @author Alex Conway
 */
public class control extends HttpServlet {

    User user = new User();
    CrapsSimple game = new CrapsSimple();
    CrapsQuery db = new CrapsQuery();
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("FirstName");
        String last = request.getParameter("LastName");
        String url = null;

        
        url = "/GamePage.jsp";
        
        getServletContext().getRequestDispatcher(url).forward(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
