package com.springcheck.riyazapp.rest.entity.carsEntity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Entity
@Table(name="cars")
public class cars {


    public cars(int i, String hello_enfield) {
        this.car_id = i;
        this.brand_name = hello_enfield;
    }

    @Override
    public String toString() {
        return "cars{" +
                "car_id=" + car_id +
                ", brand_name='" + brand_name + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="car_id")
    private int car_id;

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }
    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }


    @Column(name="brand_name")
    private String brand_name;

    public cars()
    {

    }
}
