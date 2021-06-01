package com.springboot.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.model.Vehicle;
import com.springboot.jpa.repository.VehicleRepository;


@Service
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	private VehicleRepository vehicleRepository;
	
	
	@Override
	public List<Vehicle> getAllVehicles() {
		
		return vehicleRepository.findAll();
		
	}


	@Override
	public void saveVehicle(Vehicle vehicle) {
		this.vehicleRepository.save(vehicle);
		
	}


	@Override
	public Vehicle getVehicleById(int id) {
		Optional<Vehicle> optional = vehicleRepository.findById(id);
		Vehicle vehicle = null;
		if(optional.isPresent()) {
			vehicle = optional.get();
		}else {
			throw new RuntimeException("Vehicle not found for id :: "+id);
		}
		
		return vehicle;
	}


	@Override
	public void deleteVehicleById(int id) {
		this.vehicleRepository.deleteById(id);
		
	}
	
	
	
	
	
	

	
}
