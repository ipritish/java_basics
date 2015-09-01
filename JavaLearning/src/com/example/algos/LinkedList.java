package com.example.algos;

public class LinkedList {
	
	
	
	public static Node headInitializer()
	{
		Node head = null;
		head = new Node();
		head.id = 1;
		head.next = null;
		return head;
	}
	
	public static void traverseNode(Node head)
	{
		if (head != null)
		{
			System.out.println(head.id);
			traverseNode(head.next);
		}
	}
	
	public static void addNodeAtEnd(Node head, Node tobeAdded)
	{
		if (head.next != null)
		{
			addNodeAtEnd(head.next, tobeAdded);
		}
		else
		{
			head.next = tobeAdded;
		}
	}
	
	public static Node createNode(int id)
	{
		Node newNode = new Node();
		newNode.id = id;
		newNode.next = null;
		return newNode;
		
	}
	
	public static void main(String[] args) 
	{
		Node head = headInitializer();
		Node first = createNode(2);
		addNodeAtEnd(head, first);
		Node second = createNode(3);
		addNodeAtEnd(head, second);
		traverseNode(head);
	}

}
