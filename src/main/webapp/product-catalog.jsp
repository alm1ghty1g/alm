<%@ page import="services.ProductService" %>
<%@ page import="model.Product" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: kirill
  Date: 4/19/2020
  Time: 9:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Product Catalog</title>
</head>
<body>

<jsp:useBean id="ps" class="services.ProductService"/>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/online-cabinet.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    Dropdown
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
            </li>

            <%--            <li class="nav-item">--%>
            <%--                <h5><%=LocalDateTime.now()%></h5>--%>
            <%--            </li>--%>
        </ul>
        <form class="form-inline my-2 my-lg-0">



            <a class="btn btn-outline-success my-2 my-sm-0" href="/add-product.jsp">ADD PRODUCT</a>

        </form>
    </div>
</nav>


<div class="row row-cols-1 row-cols-md-3">

    <c:forEach var="product" items="${ps.allProducts}">

        <div class="col mb-4">
            <div class="card">
                <div class="card-header bg-dark text-light">
                    <h5>
                        <c:out value="${product.name}"/>
                    </h5>
                </div>
                <img src="<c:out value="${product.image}"/>" class="card-img-top">
                <div class="card-body">
                    <div class="col-sm">
                        <div class="col-sm">
                            <h5>Quantity : <c:out value="${product.quantity}"/></h5>
                        </div>
                    </div>
                </div>
                <div class="card-footer">
                    <div class="row">
                        <div class="col-sm">
                            <h5>Price : <c:out value="${product.price}"/></h5>
                        </div>
                        <a class="btn btn-outline-success my-2 my-sm-0" href="/edit-product.jsp?id=${product.id}">EDIT</a>
                        <a class="btn btn-outline-success my-2 my-sm-0" href="/delete-product?id=${product.id}">DELETE</a>
                        <a class="btn btn-outline-success my-2 my-sm-0" href="/add-to-cart?id=${product.name}">ADD TO CART</a>

                            <%--                        <div class="col-sm">--%>
                            <%--                            <span class="fa fa-star text-warning"></span>--%>
                            <%--                            <span class="fa fa-star text-warning"></span>--%>
                            <%--                            <span class="fa fa-star text-warning"></span>--%>
                            <%--                            <span class="fa fa-star"></span>--%>
                            <%--                            <span class="fa fa-star"></span>--%>
                            <%--                        </div>--%>
                    </div>


                </div>
            </div>
        </div>
    </c:forEach>

</div>
</body>
</html>
