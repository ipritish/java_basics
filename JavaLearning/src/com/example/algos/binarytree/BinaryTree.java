package com.example.algos.binarytree;

public class BinaryTree {

	TreeNode root;
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.startInterface();
	}
	
	public void startInterface()
	{
		root = createNode("Root Node");
		TreeNode firstLeft = createNode("First Left");
		root.leftChild = firstLeft;
		TreeNode firstRight = createNode("First Right");
		root.rightChild = firstRight;
		firstRight.rightChild = createNode("Right Right");
		traverseTree(root);
	}
	
	public TreeNode createNode(String nodeValue){
		TreeNode newNode = new TreeNode();
		newNode.nodeName = nodeValue;
		newNode.leftChild = null;
		newNode.rightChild = null;
		return newNode;
	}
	
	public void traverseTree(TreeNode root)
	{
		if(root != null)
		{
			System.out.println(root.nodeName);
			if(root.leftChild != null)
				traverseTree(root.leftChild);
			if(root.rightChild != null)
				traverseTree(root.rightChild);
		}
		
	}

}
