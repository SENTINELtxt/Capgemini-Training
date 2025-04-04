package Hierarchical;

public class Car extends Vehicle {

	Car(String vehicleNo, String brand, String model, double rentalPricePerDay, boolean isAvailable) {
		super(vehicleNo, brand, model, rentalPricePerDay, isAvailable);
		
	}
	private int numberOfDoors;
	public void displayDetails() {
		System.out.println(this.hasGear);
	}

}
