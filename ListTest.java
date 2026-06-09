//ListTest.java, this java file defines a generic linked data structure
//Generic Linked List Practice
//Brennan McCabe 6/8

import java.util.NoSuchElementException;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new List<>();
		
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(0);
		list.print();
		list.insertAtBack(1);
		list.print();
		list.insertAtBack(5);
		list.print();
		
		try {
			int removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
		}
			catch (NoSuchElementException noSuchElementException) {
				noSuchElementException.printStackTrace();			}
	}
}
