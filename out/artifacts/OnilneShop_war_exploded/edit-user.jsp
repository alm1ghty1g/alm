<%@ page import="model.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Edit User</title>
</head>

<jsp:useBean id="us" class="services.UserService"/>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    User user = us.readUserById(id);
%>

<body>
<form style="width: 500px; height: 500px; text-align-all: center; margin: 0 auto" action="/update-user" method="post">
    <div class="form-row">

        <input style="display: none" type="number" class="form-control" value="<%=user.getId()%>" name="id">

        <div class="form-group col-md-6">
            <label>login</label>
            <input type="text" class="form-control" value="<%=user.getLogin()%>" name="login">
        </div>
    </div>
    <div class="form-group">
        <label>password</label>
        <input type="text" class="form-control" value="<%=user.getPassword()%>" name="password">
    </div>
    <div class="form-group">
        <label>email</label>
        <input type="text" class="form-control" value="<%=user.getEmail()%>" name="email">
    </div>

    <button type="submit" class="btn btn-primary">submit</button>
</form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</body>
</html>