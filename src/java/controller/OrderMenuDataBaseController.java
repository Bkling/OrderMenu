/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CashRegister;
import model.MenuItem;
import model.MenuService;

/**
 *
 * @author benja_000
 */
@WebServlet(name = "OrderMenuDataBaseController", urlPatterns = {"/OrderMenuDB"})
public class OrderMenuDataBaseController extends HttpServlet {

    private static final String ORDER_PAGE = "/OrderResult.jsp";
    private static final String ORDER = "/OrderMenuDB.jsp";

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String orderEvent = request.getParameter("submit");
            String destination = ORDER;
            MenuService ms = new MenuService();

            List<MenuItem> menuList = ms.getMenuList();
            List<MenuItem> orderList = ms.getOrderList();

            if (orderEvent == null) {
                // nothing to do, it's a new order
            } else if (orderEvent.startsWith("Place")) {
                if (false) {
                    System.out.println("*** Selected item from menu ***");
                }
                String[] orderItems = request.getParameterValues("menuItems");
                orderList.clear();
                for (String item : orderItems) {
                    for (MenuItem menuItem : menuList) {
                        if (menuItem.getMenuItem().equals(item)) {
                            orderList.add(menuItem);
                            break;
                        }
                    }
                }

                ms.setOrderList(orderList);
                ms.placeOrder();
                destination = ORDER_PAGE;
            }
            request.setAttribute("menuList", menuList);
            request.setAttribute("orderList", orderList);
            RequestDispatcher view = request.getRequestDispatcher(destination);
            view.forward(request, response);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
