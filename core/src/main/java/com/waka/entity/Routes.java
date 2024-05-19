package com.waka.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "routes")
public class Routes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "route_name")
    private String routeName;

    @Column(name = "route_number")
    private String routeNumber;

    @ManyToOne
    @JoinColumn(name = "condition_id")
    private RouteCondition routeCondition;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "route_id")
    private Set<Package> packages = new HashSet<>();

    public Routes() {
    }

    public Routes(Long id, String routeName, String routeNumber, RouteCondition routeCondition, City city, Set<Package> packages) {
        this.id = id;
        this.routeName = routeName;
        this.routeNumber = routeNumber;
        this.routeCondition = routeCondition;
        this.city = city;
        this.packages = packages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public RouteCondition getRouteCondition() {
        return routeCondition;
    }

    public void setRouteCondition(RouteCondition routeCondition) {
        this.routeCondition = routeCondition;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<Package> getPackages() {
        return packages;
    }

    public void setPackages(Set<Package> packages) {
        this.packages = packages;
    }
}
