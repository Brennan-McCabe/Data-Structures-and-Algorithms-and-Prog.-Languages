//TreeTest.java, Generic Binary Search Tree Practice in Java
//Brennan McCabe 6/18

import java.security.SecureRandom;

public class TreeTest {
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();
		SecureRandom randomNumber = new SecureRandom();
		
		System.out.println("Inserting the following values into a Binary Search Tree: ");
		
		for (int i = 1; i <= 10; i++) {
			int value = randomNumber.nextInt(101);
			System.out.printf("%d " , value);
			tree.insertNode(value);
		}
		
		System.out.printf("%n%nPreorder traversal of the Binary Search Tree:%n");
		tree.preorderTraversal();
		
		System.out.printf("%n%nInorder traversal of the Binary Search Tree:%n");
		tree.inorderTraversal();
		
		System.out.printf("%n%nPostorder traversal of the Binary Search Tree:%n");
		tree.postorderTraversal();
		System.out.println();
	}
}
