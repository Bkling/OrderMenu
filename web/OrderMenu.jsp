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
            <p><input type="checkbox" id="prime" name ="food" value="PrimeRib/16.99"> Prime Rib, $16.99 <br />
                <input type="checkbox" id="rib" name ="food" value="Ribeye/19.99"> Rib-Eye, $19.99 <br />
                <input type="checkbox" id="burger" name ="food" value="Burger/8.99"> Bacon Cheeseburger, $8.99 <br />
                <input type="checkbox" id="chicken" name ="food" value="Chicken/15.99"> Chicken Alfredo, $15.99 <br />
            </p>
            <p>Choose a Side Course: </p>
            <p><input type="checkbox" id="caesar" name ="food" value="Caesar/6.99"> Caesar Salad, $6.99 <br />
                <input type="checkbox" id="house" name ="food" value="House/6.50"> House Salad, $6.50 <br />
                <input type="checkbox" id="fries" name ="food" value="Fries/5.99"> Waffle Fries, $5.99 <br />
                <input type="checkbox" id="bread" name ="food" value="Bread/5.99"> Bread Sticks, $5.99 <br />
            </p>
            <p>Choose a Dessert: </p>
            <p><input type="checkbox" id="cheese" name ="food" value="Cheese/7.50"> New York Cheesecake, $7.50 <br />
                <input type="checkbox" id="oreo" name ="food" value="Oreo/6.99"> Big Oreo Cookie, $6.99 <br />
                <input type="checkbox" id="ice" name ="food" value="Ice/4.99"> Ice Cream, $4.99 <br />
                <input type="checkbox" id="french" name ="food" value="French/7.50"> French Silk Pie, $7.50 <br />
            </p>
            <p>Choose a Drink:</p>
            <p><input type="checkbox" id="soda" name ="food" value="Soda/2.99"> Soda, $2.99 <br />
                <input type="checkbox" id="tea" name ="food" value="Tea/2.99"> Ice Tea, $2.99 <br />
                <input type="checkbox" id="beer" name ="food" value="Beer/7.00"> Beer, $7.00 <br />
                <input type="checkbox" id="wine" name ="food" value="Wine/7.00"> Wine, $7.00 <br />
            </p>
            <p>Once you have finished your order please click the button below to submit your order.</p>
            <p>Or if you want to cancel your order, please click the link below the button.</p>
            <p><input type="Submit" id="submitOrder" name="submitOrder" value="Submit Order"</p>
            <p><a href="index.html">Back To Welcome Page</a></p>
        </form>
    </body>
</html>
