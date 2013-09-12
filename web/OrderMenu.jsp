<%-- 
    Document   : OrderMenuDDM
    Created on : Sep 11, 2013, 8:23:57 PM
    Author     : benja_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page</title>
    </head>
    <body>
        <form id="menu1" name="menu1" method="POST" action="OrderControl">
            <p>Choose a Main Course: </p>
                
            <p>Choose a Side Course: </p>
                
            <p>Choose a Dessert: </p>
                
            <p>Choose a Drink:</p>
                
            <p>Once you have finished your order please click the button below to submit your order.</p>
            <p>Or if you want to cancel your order, please click the link below the button.</p>
            <p><input type="Submit" id="submitOrder" name="submitOrder" value="Submit Order"</p>
            <p><a href="index.html">Back To Welcome Page</a></p>
        </form>
    </body>
</html>
