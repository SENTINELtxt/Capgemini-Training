package Comparator;
import java.util.*;

public class SortByTitle {
	public int compare(Book b1,Book b2) {
		return b1.title.compareTo(b2.title);
	}

}
