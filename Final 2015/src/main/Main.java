package main;

import java.util.ArrayList;

import model.Car;
import model.Van;
import util.Reader;

public class Main {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<Van> vans = new ArrayList<Van>();
		int option;
		do {
			System.out.println("1. Introduce a new vehicle");
			System.out.println("2. Delete all vehicles older than 8 years");
			System.out.println("3. Display the van with a wear greater");
			System.out.println("4. Display a list with all different brands of vehicles");
			System.out.println("5. EXIT");
			System.out.print("Enter an option(1-5): ");
			option = Reader.readInt(1, 5);
			
			switch (option) {
			case 1:
				introduceVehicle(cars, vans);
				break;

			case 2:
				deleteVehicle(cars);
				break;
			
			case 3:
				listWear();
				break;
			case 4:
				displayBrand();
				break;
			
			}
		}while(option != 5);

	}

	private static void displayBrand() {
		// TODO Auto-generated method stub
		
	}

	private static void listWear() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteVehicle(ArrayList<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).getBrand());
		}
		
	}

	private static void introduceVehicle(ArrayList<Car> cars, ArrayList<Van> vans) {
		String v_plateNumber;
		System.out.println("Enter a plate number: ");
		v_plateNumber = Reader.readString();
		System.out.println(v_plateNumber);
		boolean found = false;
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getPlateNumber().equalsIgnoreCase(v_plateNumber)) {
				found = true;
				break;
			}
		}
		for (int i = 0; i < vans.size(); i++) {
			if(vans.get(i).getPlateNumber().equalsIgnoreCase(v_plateNumber)) {
				found = true;
				break;
			}
		}
		if(!found) {	
			System.out.println("Do you want to introduce a van(V) or a car(C): ");
			char answer = Reader.readChar();
			if(answer == 'V' || answer == 'v') {
				Van van = new Van();
				van.askForData();
				vans.add(van);
			}else if(answer == 'C' || answer == 'c') {
				Car car = new Car();
				car.askForData();
				cars.add(car);
			}
		}
	}

}
