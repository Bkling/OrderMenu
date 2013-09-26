<%-- 
    Document   : OrderMenuDB
    Created on : Sep 23, 2013, 8:31:31 PM
    Author     : benja_000
--%>

<%@page import="java.util.List"%>
<%@page import="model.MenuItem"%>
<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page (DataBase)</title>
    </head>
    <body>
        <form method="POST" action="OrderMenuDB">
            <h1>Choose What You Would Like To Order:</h1>
            <%
                List<MenuItem> menuList = (List<MenuItem>) request.getAttribute("menuList");
                for (MenuItem menuItem : menuList) {
                    int id = menuItem.getMenuId();
                    String item = menuItem.getMenuItem();
                    double itemPrice = menuItem.getItemPrice();
                    int cat = menuItem.getCategory();
                    String val = menuItem.getMenuValue();
            %>

            <!-- Remember, using the %= notation below is a shortcut for out.print -->
            <input type="checkbox" name="menuItems" value="<%=val%>" /> <%= (item + ", " + itemPrice)%><br/>

            <%
                }

            %>
            <p>Once you have finished your order please click the button below to submit your order.</p>
            <p>Or if you want to cancel your order, please click the link below the button.</p>
            <p><input type="Submit" id="submitOrder" name="submitOrder" value="Submit Order"</p>
            <p><a href="index.html">Back To Welcome Page</a></p>
        </form>
    </body>
</html>
