package com.waka.dto;

import com.waka.entity.PackageStatus;
import com.waka.entity.Routes;

import java.util.Date;

public class PackageDTO {
    private Long id;
    private String packageId;
    private String customerName;
    private String customerMobile;
    private String address;
    private Long cityId;
    private Routes routes;
    private Date orderDate;
    private Date deliveredDate;
    private PackageStatus packageStatus;
    private Double packageWeight;

    public PackageDTO() {
    }

    public PackageDTO(Long id, String packageId, String customerName, String customerMobile, String address, Long cityId, Routes routes, Date orderDate, Date deliveredDate, PackageStatus packageStatus, Double packageWeight) {
        this.id = id;
        this.packageId = packageId;
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.address = address;
        this.cityId = cityId;
        this.routes = routes;
        this.orderDate = orderDate;
        this.deliveredDate = deliveredDate;
        this.packageStatus = packageStatus;
        this.packageWeight = packageWeight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Routes getRoutes() {
        return routes;
    }

    public void setRoutes(Routes routes) {
        this.routes = routes;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public PackageStatus getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus;
    }

    public Double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(Double packageWeight) {
        this.packageWeight = packageWeight;
    }
}
