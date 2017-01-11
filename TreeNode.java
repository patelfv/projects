package com.sample.maven.testProjects;

/**
 * Node for binary search tree
 *       root
 *      /    \
 *   left   right
 *
 */
public class TreeNode {
	
   public int value;
   public TreeNode leftNode;
   public TreeNode rightNode;
   
   public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
}
