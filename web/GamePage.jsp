<%-- 
    Document   : rollDice
    Created on : Apr 24, 2018, 8:57:41 AM
    Author     : zpy5045
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Craps</title>
    </head>
    <body>
        
        <h1>Roll the Dice</h1>
        
        <form action = "" method = "">
        
            <label>Die1:</label>
            <input type="text" value="" readonly="true" id="die1"/><br><br>
            <label>Die2:</label>
            <input type="text" value="" readonly="true" id="die2"/><br><br>
            <label>Sum:</label>
            <input type="text" value="" readonly="true" id="sum"/><br><br>
            <label>Point:</label>
            <input type="text" value="" readonly="true" id="point"/><br><br>
            <p>You <span id="winloss"></span>!</p>
            
            <button>Roll</button>&nbsp;&nbsp;
            <button>Exit</button>
        
        </form>
        
    </body>
</html>
