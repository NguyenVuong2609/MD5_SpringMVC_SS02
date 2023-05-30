<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/26/2023
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
    <input type="checkbox" name="condiment" value="lettuce">
    <label>Lettuce</label><br>
    <input type="checkbox" name="condiment" value="tomato">
    <label>Tomato</label><br>
    <input type="checkbox" name="condiment" value="mustard">
    <label>Mustard</label><br>
    <input type="checkbox" name="condiment" value="sprouts">
    <label>Sprouts</label><br>
    <button type="submit">Save</button>
</form>
</body>
</html>
