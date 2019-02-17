<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GREAT NUMBER GAME</title>
</head>
<body>
<h1>Welcome to the great number game!</h1>
<h3>I am thinking of a number between 1 and 100</h3>
<h3>Take a guess</h3>
<p> ${result} </p>
<form action="/GreatNumberGame/Home" method="POST">
<input type="text" name="num">
<input type="submit" value="SUBMIT">
</form>
</body>
</html>