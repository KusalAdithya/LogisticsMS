package com.waka.impl;

import com.waka.remote.City;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class CityImpl implements City {
    @PersistenceContext(unitName = "logisticsPU")
    private EntityManager em;

    @Override
    public List<City> getAllCities() {
        return em.createQuery("SELECT c FROM City c", City.class).getResultList();
    }
}
