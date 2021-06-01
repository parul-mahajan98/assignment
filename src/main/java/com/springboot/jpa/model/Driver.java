package com.springboot.jpa.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "driverinfo")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Firstname")
	private String firstname;
	@Column(name="Lastname")
	private String lastname;
	@Column(name="Dob")
	private String dob;
	@Column(name="Address")
	private String address;
	@Lob
	@Column(name="Upload_License")
	private byte[] upload_License;
	@Column(name="License_Number")
	private String license_Number;
	@Column(name="License_Expiry_Date")
	private String license_expiry_date;
	
	
	
	public Driver() {
		super();
	}
	public Driver(int id, String firstname, String lastname, String dob, String address, byte[] upload_License,
			String license_Number, String license_expiry_date, String vehicle_Assigned) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.address = address;
		this.upload_License = upload_License;
		this.license_Number = license_Number;
		this.license_expiry_date = license_expiry_date;
		this.vehicle_Assigned = vehicle_Assigned;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public byte[] getUpload_License() {
		return upload_License;
	}
	public void setUpload_License(byte[] upload_License) {
		this.upload_License = upload_License;
	}
	public String getLicense_Number() {
		return license_Number;
	}
	public void setLicense_Number(String license_Number) {
		this.license_Number = license_Number;
	}
	public String getLicense_expiry_date() {
		return license_expiry_date;
	}
	public void setLicense_expiry_date(String license_expiry_date) {
		this.license_expiry_date = license_expiry_date;
	}
	public String getVehicle_Assigned() {
		return vehicle_Assigned;
	}
	public void setVehicle_Assigned(String vehicle_Assigned) {
		this.vehicle_Assigned = vehicle_Assigned;
	}
	@Column(name="Vehicle_Assigned")
	private String vehicle_Assigned;
	
	
	
}