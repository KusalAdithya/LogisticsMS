<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Package</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
<div class="container-fluid">
    <div class="row justify-content-center mt-5">
        <div class="col-5">
            <h1 class="text-center">Add Package</h1>

            <div class="mb-3 mt-3">
                <label for="id" class="form-label">Package Id</label>
                <input type="text" class="form-control bg-light" id="id" placeholder="00XXXX">
            </div>
            <div class="mb-3">
                <label for="customer_name" class="form-label">Customer Name</label>
                <input class="form-control bg-light" id="customer_name">
            </div>
            <div class="mb-3">
                <label for="customer_mobile" class="form-label">Customer Mobile Number</label>
                <input class="form-control bg-light" id="customer_mobile" type="number">
            </div>
            <div class="mb-3">
                <label for="customer_address" class="form-label">Customer Address</label>
                <textarea class="form-control bg-light" id="customer_address" rows="3"></textarea>
            </div>
            <div class="mb-3">
                <label class="form-label">City</label>
                <select class="form-select bg-light" aria-label="Default select example">
                    <option selected>Select City</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="price" class="form-label bg-light">Delivery Price</label>
                <input class="form-control bg-light" id="price" type="number">
            </div>

            <div class="form__field mx-auto form login w-25">
                <input type="submit" value="Add Package" >
            </div>
        </div>
    </div>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
<script src="assets/js/script.js"></script>
</body>
</html>
