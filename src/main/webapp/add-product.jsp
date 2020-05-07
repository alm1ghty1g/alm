<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Add product</title>
</head>
<body>
<div class="container">
    <form action="/add-product" method="post">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Image</span>
            </div>
            <input type="text" class="form-control" aria-label="Sizing example input"
                   aria-describedby="inputGroup-sizing-default" name="image">
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Name</span>
            </div>
            <input type="text" class="form-control" aria-label="Sizing example input"
                   aria-describedby="inputGroup-sizing-default" name="name">
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Price</span>
            </div>
            <input type="text" class="form-control" aria-label="Sizing example input"
                   aria-describedby="inputGroup-sizing-default" name="price">
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Quantity</span>
            </div>
            <input type="text" class="form-control" aria-label="Sizing example input"
                   aria-describedby="inputGroup-sizing-default" name="quantity">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
    <a class="btn btn-outline-success my-2 my-sm-0" href="/product-catalog.jsp">BACK</a>
</div>

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