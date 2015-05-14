// Author: Jesse Sheridan
// Email: Jesse.Sheridan@gmail.com
// Date: 04/13/2015
// Description: Very basic binary tree with a post-order traversal recursive print method.

package playArea;

public class Node {
	public final int value; // Value of the node
	public final Node left; // Left branch 
	public final Node right; // Right branch
	
	/**
     * Constructor for a Node
     * Very simple node that contains a int as its' value and a left and right branch to other nodes.
     */
	public Node(int num, Node myLeft, Node myRight) {
		this.value = num;
		this.left = myLeft;
		this.right = myRight;
	}
	
	 /**
     * Post-order traversal print method.
     * This is a recursive method with the base case being the left and right branches are null.
     */
	public void print() {
		if (left != null)
			left.print();
		if (right != null)
			right.print();
		System.out.println(value);
	}
	
	 /**
     * Unit test to verify correct functionality.
     */
	public static void main(String[] args) {
		Node one = new Node(1, null, null);
		Node three = new Node(3, null, null);
		Node two = new Node(2, one, three);
		two.print();
	}
	

}
