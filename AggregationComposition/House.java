package AggregationComposition;

public class House {
	private String color;
	private Room room;
	public House(String color,int i) {
		this.color = color;
		this.room = i;
	}
	public String getColor() {
		return color;
	}
	public Room getRoom() {
		return room;
	}

}
