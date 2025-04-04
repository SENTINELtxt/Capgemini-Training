package Composition;

import AggregationComposition.House;
import AggregationComposition.Room;

public class RoomDriver {

	public static void main(String[] args) {
		House house = new House("Blue",600);
		System.out.println(house.getColor());
		System.out.println(house.getRoom().getArea());
		house = null;
	}

}
