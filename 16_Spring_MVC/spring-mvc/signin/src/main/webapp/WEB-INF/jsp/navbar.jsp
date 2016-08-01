<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Static navbar -->
<nav class="navbar navbar-default navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value="/"/>">Web Fundamentals</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="<c:url value="/"/>">Home</a></li>
                <li><a href="<c:url value="/dashboard"/>">Dashboard</a></li>
                <li><a href="<c:url value="/user/list"/>">Users</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="<c:url value="/user/login"/>">Login</a></li>
                <li><a href="<c:url value="/user/register"/>">Register</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>