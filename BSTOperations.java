package com.sample.maven.testProjects;

/**
 * perform operations like 
 * 1. add node to tree, 
 * 2. delete node from tree, -- > this operation is not working TODO 
 * 3. print BST, 
 * 4. find node in tree
 *
 */
public class BSTOperations {
	
	/**
	 * find the node by value
	 * 
	 * Logic -
	 * 
	 * 1. check if the root is null, tree is empty
	 * 2. check if the value is equal to root, return root
	 * 3. check if the value is less than root, go to left subtree and continue search in recursive way.
	 * 4. check if the value is greater than root, go to right subtree and continue search in recursive way.
	 *
	 */
	private static TreeNode search(TreeNode root, int value) {
		if(root == null){
			return null; // tree is empty
			
		}
		
		if(value == root.value) {
			return root;
		}
		
	    if(value < root.value) {
			return search(root.leftNode, value);
		} 
	    
	    if(value > root.value) {
	    	return search(root.rightNode, value);
	    }
		
	    return null;	
	}
	
	/**
	 * add node to BST 
	 * @param root
	 * @param value
	 */
	private static TreeNode addNode(TreeNode root, int value) {
		if(root == null) { // tree is empty
			root = new TreeNode();
			root.value = value;
			root.leftNode = null;
			root.rightNode = null;
			return root; 
		}
	
	   if(value < root.value) {
		   TreeNode tempRoot = addNode(root.leftNode, value);
		   root.leftNode = tempRoot;
	   }
	   
	   if(value > root.value) {
		   TreeNode tempRoot =  addNode(root.rightNode, value);
		   root.rightNode = tempRoot;
	   }
	   return root;
	}
	
	/**
	 * print preorder traversal of BST
	 * 
	 * root- left- right
	 */
	private static void printPreOrderTraversal(TreeNode root){
		
		if(root == null) {
			return;
		}
		
		System.out.println(root.value);
		printPreOrderTraversal(root.leftNode);
		printPreOrderTraversal(root.rightNode);
		
	}
	
	/**
	 *  print in order traversal
	 *  left-root-right
	 */
	private static void printInOrderTraversal(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		printInOrderTraversal(root.leftNode);
		System.out.println(root.value);
		printInOrderTraversal(root.rightNode);
	}
	
	
	/**
	 * print post order traversal
	 * left-right-root
	 */
	private static void printPostOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		
		printPostOrderTraversal(root.leftNode);
		printPostOrderTraversal(root.rightNode);
		System.out.println(root.value);
		
	}
	
	/**
	 * delete node
	 * 
	 * Logic -
	 * 
	 * 1. check if tree is empty
	 * 2. search node 
	 *  -- if node has only left subtree, make leftnode as current node
	 *  -- if node has only right subtree, make rightnode as current node
	 *  -- if node has left and right subtree, find the lowest in right sub tree and make that node as current tree
	 * @param root
	 * @param value
	 * @return
	 */
	private static TreeNode deleteNode(TreeNode root, int value){
		
		if(root == null){
			return null ; // can't be deleted as tree is empty
		}
		
		TreeNode node = search(root, value);
		if(node == null){
			System.out.println("No node found for value ==" +value);
			return null; // no node found
		}
		
		if(node.leftNode == null && node.rightNode != null){
			node = node.rightNode;
			node.rightNode = null;
		}
		
		if(node.leftNode != null && node.rightNode == null) {
			node  = node.leftNode;
			node.leftNode = null;
		}
		
		if(node.leftNode != null && node.rightNode != null) {
			TreeNode minLeftNode = findMinNode(node.rightNode);
			
			minLeftNode.leftNode = null;
			minLeftNode.rightNode = null;
			node.leftNode = minLeftNode.leftNode;
			node.rightNode= minLeftNode.rightNode;
			node = minLeftNode;
		}
		
		return root;
	}
	
	private static TreeNode findMinNode(TreeNode root) {
		
		if(root == null) {
			return root;
		}
		
		return findMinNode(root.leftNode);
		
	}

	/**
	 * test methods
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		TreeNode leftNode = new TreeNode();
		leftNode.value= 12;
		leftNode.leftNode = null;
		leftNode.rightNode = null;
		
		TreeNode rightNode = new TreeNode();
		rightNode.value= 15;
		rightNode.leftNode = null;
		rightNode.rightNode = null;
		
		TreeNode node = new TreeNode();
		node.value= 13;
		node.leftNode = leftNode;
		node.rightNode = rightNode;
		
		int value = 15;
		TreeNode finalNode = search(node, value);
		
		if(finalNode != null) {
			System.out.println("Node found for value = " + value);
		} else {
			System.out.println("Node doesn't exist with value = " + value);
		}
		
		addNode(node, 17);
		addNode(node, 27);
		addNode(node, 10);
		
		System.out.println("Pre Order Traversal -->");
		printPreOrderTraversal(node);
		
		System.out.println("In Order Traversal -->");
		printInOrderTraversal(node);
		
		System.out.println("Post Order Traversal -->");
		printPostOrderTraversal(node);
		
		/*deleteNode(node, 17);
		deleteNode(node, 67);
		
		System.out.println("Pre Order Traversal -->");
		printPreOrderTraversal(node);
		
		System.out.println("In Order Traversal -->");
		printInOrderTraversal(node);
		
		System.out.println("Post Order Traversal -->");
		printPostOrderTraversal(node);*/
	}
}
