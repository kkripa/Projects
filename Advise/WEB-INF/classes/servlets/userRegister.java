/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.Login;
import beans.Student;
import database.StudentDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sourabh
 */
public class userRegister extends HttpServlet {

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
        //processRequest(request, response);
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
        System.out.println("We entered userRegister");
        Student s= new Student();
        Login l= new Login();
        StudentDB sdb= new StudentDB();
        String firstname= request.getParameter("firstname");
        String lastname= request.getParameter("lastname");
        String phonenumber= request.getParameter("phonenumber");
        String address= request.getParameter("address");
        String email= request.getParameter("email");
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        //String university = request.getParameter("hidden");
        s.setFirstName(firstname);
        s.setLastName(lastname);
        s.setPhoneNumber(phonenumber);
        s.setAddress(address);
        s.seteMail(email);
        l.setUserName(username);
        l.setPassword(password);
        System.out.println("About to execute adduser");
        try {
            
            sdb.addUser(s);
            System.out.println("Executed and gonna do addlogin");
            sdb.addLogin(l);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(userRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }

    /**
     
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
