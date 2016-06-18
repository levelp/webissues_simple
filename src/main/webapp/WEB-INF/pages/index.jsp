<%@ page import="ru.spb.petrk.webissues.model.Car" %><%--
  Created by IntelliJ IDEA.
  User: Student-21
  Date: 17.06.2016
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Car car = (Car) request.getSession().getAttribute("car");
%>

<c:set var="car" value="<%= car %>" />

<html>
<head>
    <title></title>
</head>
<body>

<h1>Car ${car.model} has  ${car.maxSpeed} max speed.</h1>

</body>
</html>
