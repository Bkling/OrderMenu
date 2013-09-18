<%-- 
    Document   : OrderResult
    Created on : Sep 11, 2013, 8:57:59 PM
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
        <h1>This is what you ordered below: </h1>
        <%
            Object ordered = request.getAttribute("ItemsOrdered");
            String answer = "";
            if (ordered != null) {
                answer = ordered.toString();
            }
            out.print(answer);

        %>
        <p><a href="OrderMenu.jsp">Click Here To Go Back to Order</a></p>
    </body>
</html>
