<%-- 
    Document   : OrderMenuDB
    Created on : Sep 23, 2013, 8:31:31 PM
    Author     : benja_000
--%>

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
        <%
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            for (MenuItem menuItem : menuList) {
                String item = menuItem.getMenuItem();
                double itemPrice = menuItem.getItemPrice();
        %>

        <!-- Remember, using the %= notation below is a shortcut for out.print -->
        <input type="checkbox" name="menuItems" value="<%= item%>" /> <%= (item + ", " + nf.format(itemPrice))%><br/>

        <%
            }

        %>
    </body>
</html>
