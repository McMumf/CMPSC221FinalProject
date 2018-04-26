<%-- 
    Document   : result
    Created on : Apr 24, 2018, 8:44:46 AM
    Author     : zpy5045
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Playing Record</title>
    </head>
    <body>
        <h1>Thanks for Playing!</h1>
        
        <form action = "" method = "">
        
            <p>Here is your playing summary:</p>

            <label>First Name:</label>
            <span id="firstName"></span><br><br>
            <label>Last Name:</label>
            <span id="lastName"></span><br>
            <p>You have played <span id="totalGames"></span> games.</p>
            <p>You won <span id="wins"></span> times, and you lost <span id="losses"></span> times.</p>
        
        </form>
        
    </body>
</html>
