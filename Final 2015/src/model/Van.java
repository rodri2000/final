package model;

import util.Reader;

public class Van extends Vehicle{
	protected float height;
	protected int weight;
	protected int load;
	protected int wheels;
	
	public Van() {
		super();
	}
	public Van(float height, int weight, int load, int wheels) {
		super();
		this.height = height;
		this.weight = weight;
		this.load = load;
		this.wheels = wheels;
	}
	
	
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getLoad() {
		return load;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void askForData() {
		super.askForData();
		System.out.println("Enter height: ");
		height = Reader.readFloat();
		System.out.println("Enter weight: ");
		weight = Reader.readInt();
		System.out.println("Enter load: ");
		load = Reader.readInt();
		System.out.println("Enter number of wheels: ");
		wheels = Reader.readInt();
	}
}
