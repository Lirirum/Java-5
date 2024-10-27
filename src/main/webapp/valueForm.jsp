<%-- 
    Document   : ValueBean
    Created on : 13 окт. 2024 г., 13:53:09
    Author     : lirir
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.beans.ValueBean" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="valueBean" class="com.example.beans.ValueBean" scope="session" />
<head>
    <title>Set and Get Value</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>


<div class="form-container">

<jsp:setProperty name="valueBean" property="value" param="value"/>
<form action="valueForm.jsp" method="post">
    <label for="value">Enter a value:</label>
    <input type="text" id="value" name="value" />    
    <input type="submit" value="Submit" />
</form>
</div>
  

   

    <h3>Current Message: <jsp:getProperty name="valueBean" property="value" /></h3>
    

</body>
</html>

