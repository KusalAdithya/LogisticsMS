
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Route Data</title>

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

    <div class="row text-center align-content-center justify-content-center mt-5">
        <div class="col-6">
            <h1 class="text-center">Routes Data</h1>
        </div>

        <div class="col-7 mt-4">
            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Route</th>
                    <th scope="col">City</th>
                    <th scope="col">Condition</th>
                    <th scope="col">Total Orders</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                </tr>
                </tbody>
            </table>
        </div>

    </div>
</div>

<%
    }
%>

<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
<script src="assets/js/script.js"></script>
</body>
</html>
