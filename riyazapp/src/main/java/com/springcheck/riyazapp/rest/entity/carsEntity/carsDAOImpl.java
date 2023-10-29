package com.springcheck.riyazapp.rest.entity.carsEntity;

import com.springcheck.riyazapp.rest.entity.carsEntity.cars;
import com.springcheck.riyazapp.rest.entity.carsEntity.carsDAO;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class carsDAOImpl implements carsDAO {

    private EntityManager entityManager;
    @Override
    @Transactional
    public void save(cars car) {
        this.entityManager.merge(car);
    }

    @Autowired
    public carsDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
}
