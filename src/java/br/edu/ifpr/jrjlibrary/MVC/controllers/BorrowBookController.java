/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.jrjlibrary.MVC.controllers;

import br.edu.ifpr.jrjlibrary.MVC.models.BookModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BorrowBookController", urlPatterns = {"/BorrowBookController"})
public class BorrowBookController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int userIndex = Integer.parseInt(request.getParameter("userIndex"));
        int bookIndex = Integer.parseInt(request.getParameter("bookIndex"));
        
        BookModel model = new BookModel();
        
        model.updateBorrowedBook(bookIndex, true);
        
        response.sendRedirect("ListBooksController");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
