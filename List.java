//list.java, this java file defines a generic linked data structure
//Generic Linked List Practice
//Brennan McCabe 6/8

import java.util.NoSuchElementException;

class ListNode<E> {
	
	E data;
	ListNode<E> nextNode;
	
	ListNode(E object) {this(object, null);}
	
	ListNode(E object, ListNode<E> node) {
		data = object;
		nextNode = node;
	}
	
	E getData() {return data;}
	
	ListNode<E> getNext() {return nextNode;}
}

public class List<E> {
	private ListNode<E> firstNode;
	private ListNode<E> lastNode;
	private String name;
	
	public List() {this("My list");}
	
	public List(String listname) {
		name = listname;
		firstNode = lastNode = null;
	}
	
	public void insertAtFront(E insertItem) {
		if (isEmpty()) {
			firstNode = lastNode = new ListNode<E>(insertItem);
		}
		else {
			firstNode = new ListNode<E>(insertItem, firstNode);
		}
	}
	
	public void insertAtBack(E insertItem) {
		if (isEmpty()) {
			firstNode = lastNode = new ListNode<E>(insertItem);
		}
		else {
			lastNode = lastNode.nextNode = new ListNode<E>(insertItem);
		}
	}
	
	public E removeFromFront() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException(name + " is empty.");
		}
		
		E removedItem = firstNode.data;
		
		if (firstNode == lastNode) {
			firstNode = lastNode = null;
		}
		else {
			firstNode = firstNode.nextNode;
		}
		
		return removedItem;
	}
	
	public E removeFromBack() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException(name + " is empty.");
		}
		
		E removedItem = lastNode.data;
		
		if (firstNode == lastNode) {
			firstNode = lastNode = null;
		}
		else {
			ListNode<E> current = firstNode;
			
			while (current.nextNode != lastNode) {
				current = current.nextNode;
			}
			
			lastNode = current;
			current.nextNode = null;
		}
		
		return removedItem;
	}
	
	public boolean isEmpty() {return firstNode == null;}
	
	public void print() {
		if (isEmpty()) {
			System.out.printf("%s is empty. %n",  name);
			return;
		}
			
		System.out.printf("%s is: ",  name);
		ListNode<E> current = firstNode;
			
		while (current != null) {
			System.out.printf("%s ",  current.data);
			current = current.nextNode;
		}
		
		System.out.println();
	}
}
