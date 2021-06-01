package com.springboot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Integer>{

}
