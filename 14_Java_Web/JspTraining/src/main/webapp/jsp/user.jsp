<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/user" method="POST" role="form">
    <input type="hidden" id="action" name="action" value="${param["action"]}">
    <input type="hidden" id="userId" name="id" value="${user.id}">

    <div>
        <label>First name: </label>
        <input type="text" name="firstName" id="firstName"  value="${user.firstName}" />
    </div>
    <div>
        <label>Last name: </label>
        <input type="text" name="lastName" id="lastName"  value="${user.lastName}" />
    </div>
    <div>
        <label>E-mail: </label>
        <input type="text" name="email" id="email"  value="${user.email}" />
    </div>
    <div>
        <label>Username: </label>
        <input type="text" name="userName" id="userName"  value="${user.userName}" />
    </div>
    <div>
        <label>Password: </label>
        <input type="password" name="password" id="password"  value="${user.password}" />
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

</body>
</html>
