package Comparator;
import java.util.*;

public class SortByPrice {
	public int compare(Book b1,Book b2) {
		return Double.compare(b1.price,b2.price);
	}

}
