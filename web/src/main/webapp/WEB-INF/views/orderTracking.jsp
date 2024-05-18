
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cargo Tracking</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>

<div class="container-fluid">
    <div class="row">

        <%--header--%>
        <div class="col-12 justify-content-center align-content-center">
            <div class="row">
                <nav class="navbar navbar-expand-lg bg-body-tertiary">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="#">Cargo Tracking</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                                data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                                aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Features</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Pricing</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
        <!-- Navbar End -->
    </div>

    <div class="row mt-4">
        <div class="col-6 mx-auto bg-light-subtle">
            <span>Enter your Order Tracking Number</span>
            <p style="text-align: center;">
                <input type="text" id="YQNum" maxlength="50" placeholder="Enter tracking number" class="col-7 mt-2"/>
                <input type="button" value="TRACK" onclick="doTrack()" class="btn-primary"/>
            </p>
        </div>

        <%--        <div id="YQContainer"></div>--%>

        <div class="card card-timeline px-2 border-none mt-4">
            <ul class="bs4-order-tracking">
                <li class="step active">
                    <div><i class="bi bi-check fs-3"></i></div>
                    Order Placed
                </li>
                <li class="step ">
                    <div><i class="bi bi-check fs-3"></i></div>
                    In transit
                </li>
                <li class="step ">
                    <div><i class="bi bi-check fs-3"></i></div>
                    Out for delivery
                </li>
                <li class="step ">
                    <div><i class="bi bi-check fs-3"></i></div>
                    Delivered
                </li>
            </ul>
<%--            <h5 class="text-center">--%>
<%--                <b>In transit</b>. The order has been shipped!--%>
<%--            </h5>--%>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
<script src="assets/js/script.js"></script>
</body>
</html>
