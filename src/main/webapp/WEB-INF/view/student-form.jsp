<%--
  Created by IntelliJ IDEA.
  User: BS995
  Date: 9/5/2022
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student REgistration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First Name: <form:input path="firstName" />
    <br><br>
    Second Name: <form:input path="lastName" />
    <br><br>
    <form:select path="country">
            <form:options items ="${student.countryOptions}"/>

    </form:select>

    Favourite Language
    <hr>
    PHP<form:checkbox path="favouriteLanguage" value="PHP"/>
    Java<form:checkbox path="favouriteLanguage" value="Java"/>
    C++<form:checkbox path="favouriteLanguage" value="C++"/>
    Perl<form:checkbox path="favouriteLanguage" value="Perl"/>
    <br><br>
    <input type="submit" value="Submit">
    <br><br>
</form:form>

</body>
</html>