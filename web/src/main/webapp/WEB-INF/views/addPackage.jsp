<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Package</title>

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
    <%@include file="header.jsp" %>
    <!-- header End -->

    <div class="row justify-content-center mt-5">
        <div class="col-11 col-lg-5">
            <h1 class="text-center">Add Package</h1>

            <div class="mb-3 mt-3">
                <label for="package_id" class="form-label">Package Id</label>
                <input type="text" class="form-control bg-light" id="package_id" placeholder="00XXXX">
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
                <label for="address" class="form-label">Dropping Address</label>
                <textarea class="form-control bg-light" id="address" rows="3"></textarea>
            </div>
            <div class="mb-3">
                <label class="form-label">City</label>
                <select class="form-select bg-light" aria-label="Default select example" id="city">
                    <option selected>Select City</option>
                    <c:forEach var="city" items="${allCities}">
                        <option value="<c:out value='${city.id}'/>"><c:out value='${city.name}'/></option>
                    </c:forEach>
                </select>
            </div>
            <div class="mb-3">
                <label for="package_weight" class="form-label bg-light">Package Weight</label>
                <input class="form-control bg-light" id="package_weight" type="number" placeholder="LKR 500 for 1Kg">
            </div>

            <div class="form__field mx-auto form login w-25">
                <input type="submit" value="Add Package" onclick="addPackage()">
            </div>
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
