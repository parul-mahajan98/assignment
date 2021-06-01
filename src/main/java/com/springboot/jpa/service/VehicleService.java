package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.model.Vehicle;

public interface VehicleService {

	List<Vehicle> getAllVehicles();
	void saveVehicle(Vehicle vehicle);
	Vehicle getVehicleById(int id);
	void deleteVehicleById(int id);
}
