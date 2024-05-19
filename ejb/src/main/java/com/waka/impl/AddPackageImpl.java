package com.waka.impl;

import com.waka.dto.PackageDTO;
import com.waka.entity.City;
import com.waka.entity.Package;
import com.waka.remote.AddPackage;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Date;

@Stateless
public class AddPackageImpl implements AddPackage {
    @PersistenceContext(unitName = "logisticsPU")
    private EntityManager em;

    @RolesAllowed({"admin", "officer"})
    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public boolean addPackageData(PackageDTO packageDTO) {

        Package p = new Package();
        p.setPackageId(packageDTO.getPackageId());
        p.setCustomerName(packageDTO.getCustomerName());
        p.setCustomerMobile(packageDTO.getCustomerMobile());
        p.setAddress(packageDTO.getAddress());
        p.setCity(em.find(City.class, packageDTO.getCityId()));
        p.setOrderDate(new Date());
        p.setPackageWeight(packageDTO.getPackageWeight());

        System.out.println("Package Id: " + p.getPackageId());
        System.out.println("Customer Name: " + p.getCustomerName());
        System.out.println("Customer Mobile: " + p.getCustomerMobile());
        System.out.println("Address: " + p.getAddress());
        System.out.println("City: " + p.getCity());
        System.out.println("Order Date: " + p.getOrderDate());
        System.out.println("Package Weight: " + p.getPackageWeight());


        em.persist(p);

        return true;
    }
}
