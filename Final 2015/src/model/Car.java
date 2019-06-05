package model;

import util.Reader;

public class Car extends Vehicle {
	protected boolean convertible;

	public Car() {
		super();
	}

	public Car(boolean convertible) {
		super();
		this.convertible = convertible;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
	
	public void askForData() {
		super.askForData();
		System.out.println("Enter if it is convertible or nor: ");
		convertible = Reader.readBoolean();
	}
}
