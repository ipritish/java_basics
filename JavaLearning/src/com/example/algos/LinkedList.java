package com.example.algos;

public class LinkedList {
	
	
	
	public static Node headInitializer()
	{
		Node head = null;
		head = new Node();
		head.name = "Starting Point";
		head.next = null;
		return head;
	}
	
	public static void traverseNode(Node head)
	{
		if (head != null)
		{
			System.out.println(head.name);
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
	
	public static Node createNode(String name)
	{
		Node newNode = new Node();
		newNode.name = name;
		newNode.next = null;
		return newNode;
		
	}
	
	public static Node getNode(Node start, String nodeName)
	{
		if (start.name == nodeName)
			return start;
		else
			return getNode(start.next,nodeName);
	}
	
	public static void insertNode(Node head, Node newNode, String afterThis)
	{
		newNode.next = getNode(head,afterThis).next;
		getNode(head,afterThis).next = newNode;
		
	}
	
	public static void main(String[] args) 
	{
		Node head = headInitializer();
		Node first = createNode("First After Head");
		addNodeAtEnd(head, first);
		Node second = createNode("Second After Head");
		addNodeAtEnd(head, second);
		Node Random = createNode("Random");
		insertNode(head, Random, "Starting Point");
		traverseNode(head);
	}

}
