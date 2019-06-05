package model;

import java.time.LocalDate;

import util.Reader;

public class Vehicle {
	protected String plateNumber;
	protected String brand;
	protected String model;
	protected LocalDate registrationDate;
	protected Double rent_price;
	
	//Constructor
	public Vehicle() {
		super();
	}
	public Vehicle(String plateNumber, String brand, String model, LocalDate registrationDate, Double rent_price) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.model = model;
		this.registrationDate = registrationDate;
		this.rent_price = rent_price;
	}
	
	//Getters and Setters
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Double getRent_price() {
		return rent_price;
	}
	public void setRent_price(Double rent_price) {
		this.rent_price = rent_price;
	}
	
	public  void askForData() {
		System.out.println("Enter plate number: ");
		plateNumber = Reader.readString();
		System.out.print("Enter the brand: ");
		brand = Reader.readString();
		System.out.print("Enter model: ");
		model = Reader.readString();
		System.out.println("Enter the date of registration(dd-mm-yyy)");
		registrationDate = Reader.readDate("dd-MM-yyyy");
		System.out.println("Enter the rent price per day: ");
		rent_price = Reader.readDouble();
		
	}
	
}
