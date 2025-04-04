package Hierarchical;

public class Vehicle {
	private String vehicleNo;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public void displayDetails() {
		System.out.println(this.vehicleNo);
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.rentalPricePerDay);
		System.out.println(this.isAvailable);
	}
	public void rentVehicle() {
		if(this.isAvailable) {
			System.out.println("Car is Available");
			System.out.println("Price for the available car is:"+this.rentalPricePerDay);
		}
	}
	Vehicle(String vehicleNo,String brand,String model,double rentalPricePerDay,boolean isAvailable){
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;
	}
	

}
