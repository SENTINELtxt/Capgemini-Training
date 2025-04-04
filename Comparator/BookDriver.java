
package Comparator;
import java.util.*;


public class BookDriver {
	public static void main(String[] args) {
		Book[] books = {
				new Book(2,"Harry Potter",899.50),
				new Book(3,"Percy Jackson",699.50),
				new Book(1,"Dan Brown Series",1999.50),
		};
		SortById sortid = new SortById();
		SortByTitle sorttitle = new SortByTitle();
		SortByPrice sortprice = new SortByPrice();
		Arrays.sort(books,sortid);
		for(Book book:books) {
			System.out.println(book);
		}
		
	}

}
