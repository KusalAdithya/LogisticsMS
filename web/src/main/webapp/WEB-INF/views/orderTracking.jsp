<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cargo Tracking</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>

<%
    if (session.getAttribute("login") == null) {
        response.sendRedirect("/web/login");

    } else {
%>

<div class="container-fluid">
    <%--header--%>
    <%@include file="header.jsp"%>
    <!-- header End -->

    <div class="row mt-4">
        <div class="col-12 justify-content-center mb-4">
            <h1 class="text-center">Cargo Tracking</h1>
        </div>

        <div class="col-6 mx-auto mb-3 justify-content-center">
            <div class="row  justify-content-center">
                <div class="col-4">
                    <input type="number" id="YQNum" placeholder="Enter tracking number"
                           class="bg-light col-5 form-control"/>
                </div>
                <div class="col-1">
                    <button onclick="doTrack()" class="btn btn-primary ">Track</button>
                </div>
                <%--                </p>--%>
            </div>
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

<%
    }
%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
<script src="assets/js/script.js"></script>
</body>
</html>
