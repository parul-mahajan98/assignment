package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.model.Driver;

public interface DriverService {

	List<Driver> getAllDrivers();
	void saveDriver(Driver driver);
	Driver getDriverById(int id);
	void deleteDriverById(int id);
}
