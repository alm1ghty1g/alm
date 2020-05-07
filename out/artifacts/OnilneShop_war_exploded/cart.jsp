<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

    <title>User Catalog</title>
</head>
<jsp:useBean id="ps" class="services.ProductService"/>
<jsp:useBean id="li" class="model.LineItem"/>
<jsp:useBean id="sc" class="model.Cart"/>
<body>

<table class="table">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">name</th>
        <th scope="col">price</th>
        <th scope="col">quantity</th>
        <th scope="col">subprice</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${li.}">
        <tr>
            <td><c:out value="${item.}"/></td>
            <td><c:out value="${user.login}"/></td>
            <td><c:out value="${user.password}"/></td>
            <td><c:out value="${user.email}"/></td>
            <td>
                <a class="btn btn-outline-success my-2 my-sm-0" href="/edit-user.jsp?id=${user.id}">EDIT</a>
                <a class="btn btn-outline-success my-2 my-sm-0" href="/delete-user?id=${user.id}">DELETE</a>
            </td>
        </tr>

    </c:forEach>
    <a class="btn btn-outline-success my-2 my-sm-0" href="/signup.html">ADD USER</a>
    </tbody>
</table>


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