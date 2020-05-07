<%@ page import="model.Product" %>
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

    <title>Edit Product</title>
</head>

<jsp:useBean id="ps" class="services.ProductService"/>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    Product product = ps.readProductById(id);
%>

<body>
<form style="width: 500px; height: 500px; text-align-all: center; margin: 0 auto" action="/update-product" method="post">
    <div class="form-row">
        <div class="form-group col-md-6">
            <label>id</label>
            <input type="text" class="form-control" value="<%=product.getId()%>" name="id">
        </div>
        <div class="form-group col-md-6">
            <label>name</label>
            <input type="text" class="form-control" value="<%=product.getName()%>" name="name">
        </div>
    </div>
    <div class="form-group">
        <label>price</label>
        <input type="text" class="form-control" value="<%=product.getPrice()%>" name="price">
    </div>
    <div class="form-group">
        <label>image</label>
        <input type="text" class="form-control" value="<%=product.getImage()%>" name="image">
    </div>
    <div class="form-group">
        <label>quantity</label>
        <input type="text" class="form-control" value="<%=product.getQuantity()%>" name="quantity">
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