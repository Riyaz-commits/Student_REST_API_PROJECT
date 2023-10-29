package com.springcheck.riyazapp.rest.controllers;

import com.springcheck.riyazapp.rest.entity.carsEntity.cars;
import com.springcheck.riyazapp.rest.entity.carsEntity.carsDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class CrudDBApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDBApplication.class, args);
    }

    @Bean
    @GetMapping("/cars")
    public CommandLineRunner commandLineRunner(carsDAO carsDAO )
    {
        return runner-> {
            carsUpdate(carsDAO);
        };
    }

    private cars carsUpdate(carsDAO carsDAO) {

        cars cars = new cars(9, "PORSCHE");
//        carsDAO.save(cars);
        //   System.out.println("data stored to db  "+cars.getBrand_name());
        return cars;
    }

  //  @GetMapping("/cars")
    @DeleteMapping("/cars")
    public List<cars> getCars(carsDAO carsDAO)
    {
        List<cars> cars = new ArrayList<>();

        cars.add(new cars(9,"PORSCHE"));
        cars.add(new cars(10,"RANGE ROVER"));

        return cars;
    }

    @GetMapping("/cars/{carId}")
    @DeleteMapping("/cars/{carId}")
    public cars getCars(@PathVariable int carId)
    {
        List<cars> cars = new ArrayList<>();

        cars.add(new cars(9,"PORSCHE"));
        cars.add(new cars(10,"RANGE ROVER"));

        return cars.get(carId);
    }


}
