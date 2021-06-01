package com.springboot.jpa.service;



import java.io.IOException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.jpa.model.Driver;
import com.springboot.jpa.repository.DriverRepository;


@Service
public class DriverServiceImpl implements DriverService{

	@Autowired
	private DriverRepository driverRepository;
	
	public void saveLicenseToDB(String firstname,String lastname,String dob,String address,MultipartFile file,String license_Number,String license_expiry_date,String vehicle_Assigned) {
		Driver driver = new Driver();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains("..")) {
			System.out.println("Not a valid file");
		}
		try {
			driver.setUpload_License(file.getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}
		driver.setFirstname(firstname);
		driver.setLastname(lastname);
		driver.setDob(dob);
		driver.setAddress(address);
		driver.setLicense_Number(license_Number);
		driver.setLicense_expiry_date(license_expiry_date);
		driver.setVehicle_Assigned(vehicle_Assigned);
		
		driverRepository.save(driver);
		
		}
	
	@Override
	public List<Driver> getAllDrivers() {
		
		return driverRepository.findAll();
		
	}


	@Override
	public void saveDriver(Driver driver) {
		this.driverRepository.save(driver);
		
	}


	@Override
	public Driver getDriverById(int id) {
		Optional<Driver> optional = driverRepository.findById(id);
		Driver driver = null;
		if(optional.isPresent()) {
			driver = optional.get();
		}else {
			throw new RuntimeException("Driver not found for id :: "+id);
		}
		
		return driver;
	}


	@Override
	public void deleteDriverById(int id) {
		this.driverRepository.deleteById(id);
		
	}
	
	
	
	
	
	

	
}
