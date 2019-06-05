package model;

public class Wheel {
	protected int wear;
	protected boolean spare_wheel;
	
	//Constructor
	public Wheel() {
		super();
	}
	public Wheel(int wear, boolean spare_wheel) {
		super();
		this.wear = wear;
		this.spare_wheel = spare_wheel;
	}
	
	
	//Getters and setters
	public int getWear() {
		return wear;
	}
	public void setWear(int wear) {
		this.wear = wear;
	}
	public boolean isSpare_wheel() {
		return spare_wheel;
	}
	public void setSpare_wheel(boolean spare_wheel) {
		this.spare_wheel = spare_wheel;
	}
	
	
}
