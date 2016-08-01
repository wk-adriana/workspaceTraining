<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="header.jsp" />

<div class="container">
    <div class="row">
        <div class="col-md-offset-1 col-md-4">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <td>Username</td>
                    <td>Parola</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.username}</td>
                        <td>${user.password}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>
</div>

<jsp:include page="footer.jsp" />