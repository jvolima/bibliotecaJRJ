/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.jrjlibrary.MVC.controllers;

import br.edu.ifpr.jrjlibrary.MVC.entities.User;
import br.edu.ifpr.jrjlibrary.MVC.models.UserModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author jvolima
 */
@WebServlet(name = "EditUserController", urlPatterns = {"/EditUserController"})
public class EditUserController extends HttpServlet {
    int index;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int index = Integer.parseInt(request.getParameter("index"));
        
        UserModel model = new UserModel();
        User user = model.findByIndex(index);
        
        this.index = index;
        
        request.setAttribute("user", user);
        request.getRequestDispatcher("editarUsuario.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        String newName = request.getParameter("name");
        String newEmail = request.getParameter("email");
        String newCourse = request.getParameter("course");
        String newPassword = request.getParameter("password");
        int newAge = Integer.parseInt(request.getParameter("age"));
        User userEdited = new User(newName, newEmail, newPassword, newCourse, newAge);
            
        UserModel model = new UserModel();
        
        model.edit(index, userEdited);
        response.sendRedirect("ListUsersController");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
