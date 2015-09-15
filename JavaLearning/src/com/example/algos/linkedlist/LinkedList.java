package com.example.algos.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		if (start.name.equals(nodeName))
			return start;
		else
			return getNode(start.next,nodeName);
	}
	
	public static void insertNode(Node head, Node newNode, String afterThis)
	{
		newNode.next = getNode(head,afterThis).next;
		getNode(head,afterThis).next = newNode;
		
	}
	
	public static void deleteNode(Node tobeDeleted, Node head)
	{
		Node prevNode;
		Node nextNode;

		if(head.next != null)
		{
			if (head.next == tobeDeleted)
			{
				prevNode = head;
				nextNode = head.next.next;
				prevNode.next = nextNode;
			}
			else
			{
				deleteNode(tobeDeleted,head.next);
			}
		}
		
	}
	
	public static String getUserInput(String prompt) 
	{
		String inputLine = null;
		System.out.println(prompt);
		try
		{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0)
				return null;
			
		}
		catch (IOException io)
		{
			io.printStackTrace();
		}
		return inputLine;
	}
	
	public static void main(String[] args) 
	{
		Node head = headInitializer();
		String userInput;
		boolean exit = false;
		while (exit == false)
		{
			System.out.println("Options are \t1.Add\t2.Delete\t3.Print\t4.Insert\t5.Exit\tType the full strings");
			userInput = getUserInput(" ");
			switch (userInput) {
			case "Add":
				System.out.println("Add a node in the end give a value for it");
				String valueNode = getUserInput(" ");
				Node tobeAdded = createNode(valueNode);
				addNodeAtEnd(head, tobeAdded);
				traverseNode(head);
				break;
			case "Delete":
				System.out.println("Which node to be deleted");
				traverseNode(head);
				String nodeName = getUserInput(" ");
				deleteNode(getNode(head, nodeName), head);
				System.out.println("");
				traverseNode(head);
				break;
			case "Print":
				traverseNode(head);
				break;
			case "Insert":
				System.out.println("Insert a node give a value for it");
				String valueInsert = getUserInput(" ");
				Node tobeInserted = createNode(valueInsert);
				System.out.println("Insert After");
				traverseNode(head);
				String insertAfter = getUserInput(" ");
				//Node afterThis = getNode(head, insertAfter);
				insertNode(head, tobeInserted, insertAfter);
				traverseNode(head);
				break;
			case "Exit":
				exit = true;
				System.out.println("Exiting...");
				break;
	
			default:
				exit = true;
				System.out.println("Exiting...");
				break;
			}
		}
		
		//System.out.println("After Deletion");
		//traverseNode(head);
	}

}
