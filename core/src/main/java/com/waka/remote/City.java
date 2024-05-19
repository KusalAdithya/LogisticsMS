package com.waka.remote;

import jakarta.ejb.Remote;

import java.util.List;

@Remote
public interface City {
     List<City> getAllCities();
}
