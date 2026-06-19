//Tree.java, Generic Binary Search Tree Node Class Definition in Java
//Generic Binary Search Tree
//Brennan McCabe 6/18

class TreeNode<E extends Comparable<E>> {
	TreeNode<E> leftNode;
	E data;
	TreeNode<E> rightNode;
	
	public TreeNode(E nodeData) {
		data = nodeData;
		leftNode = rightNode = null;
	}
	
	public void insert (E insertValue) {
		if (insertValue.compareTo(data) < 0) {
			if (leftNode == null) {
				leftNode = new TreeNode<E>(insertValue);
			}
			else {
				leftNode.insert(insertValue);
			}
		}
		else if (insertValue.compareTo(data) > 0) {
			if (rightNode == null) {
				rightNode = new TreeNode<E>(insertValue);
			}
			else {
				rightNode.insert(insertValue);
			}
		}
	}
}

//Binary Search Tree Class Definition
public class Tree<E extends Comparable<E>> {
	private TreeNode<E> root;
	
	public Tree() {root = null;}
	
	public void insertNode(E insertValue) {
		if (root == null) {
			root = new TreeNode<E>(insertValue);
		}
		else {
			root.insert(insertValue);
		}
	}
	
	public void preorderTraversal() {preorderHelper(root);}
	
	public void preorderHelper(TreeNode<E> node) {
		if (node == null) {
			return;
		}
		
		System.out.printf("%s " , node.data); //output node data
		preorderHelper(node.leftNode); 			// traverse left subtree
		preorderHelper(node.rightNode);			//traverse right subtree
	}
	
	public void inorderTraversal() {inorderHelper(root);}
	
	private void inorderHelper(TreeNode<E> node) {
		if (node == null) {
			return;
		}
		
		inorderHelper(node.leftNode);
		System.out.printf("%s " , node.data);
		inorderHelper(node.rightNode);
	}
	
	public void postorderTraversal() {postorderHelper(root);}
	
	private void postorderHelper(TreeNode<E> node) {
		if (node == null) {
			return;
		}
		
		postorderHelper(node.leftNode); 		//traverse left subtree
		postorderHelper(node.rightNode); 		//traverse right subtree
		System.out.printf("%s " , node.data); 	 //output node data
	}
}
