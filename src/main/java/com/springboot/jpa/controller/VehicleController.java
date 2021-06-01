package com.springboot.jpa.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.jpa.model.Vehicle;
import com.springboot.jpa.service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	
	
	//display list of vehicles
	@GetMapping("/vehicle")
	public String viewHomePage(Model model) {
		model.addAttribute("listVehicles", vehicleService.getAllVehicles());
		return "list_vehicle";
	}
	
	@GetMapping("/showNewVehicleForm")
	public String showNewVehicleForm(Model model) {
		Vehicle vehicle = new Vehicle();
		model.addAttribute("vehicle",vehicle);
		return "new_vehicle";
	}
	
	@PostMapping("/saveVehicle")
	public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle) {
		
		
		vehicleService.saveVehicle(vehicle);
		return "redirect:/vehicle";
	}
	
	@GetMapping("/showFormForUpdateVehicle/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
		Vehicle vehicle=vehicleService.getVehicleById(id);
		model.addAttribute("vehicle",vehicle);
		return "update_vehicle";
	}
	
	@GetMapping("/deleteVehicle/{id}")
	public String deleteVehicle(@PathVariable(value = "id") int id) {
		this.vehicleService.deleteVehicleById(id);
		return "redirect:/vehicle";
	}
	
}
