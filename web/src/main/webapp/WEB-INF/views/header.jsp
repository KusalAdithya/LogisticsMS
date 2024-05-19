<%--
  Created by IntelliJ IDEA.
  User: perer
  Date: 5/19/2024
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="row">
    <div class="col-12 justify-content-center align-content-center">
        <div class="row">
            <nav class="navbar navbar-expand-lg bg-body-tertiary">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Logistics Management System</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                            aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav">
                            <%
                                if (session.getAttribute("userType").equals("admin")) {
                            %>
                            <li class="nav-item">
                                <a class="nav-link" aria-current="page" href="/web/orders">Orders</a>
                            </li>
                            <%
                                }
                            %>
                            <li class="nav-item">
                                <a class="nav-link" href="/web/addPackage">Add Package</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/web/">Cargo Tracking</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="signout">Sign Out</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</div>
