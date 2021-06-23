package com.crayons.prepwork;

/**
 * Class to reverse a linked list. Implements a couple of methods -
 * 1. Iterative approach
 * 2. Recursive approach
 *
 * @author Jayant
 */
public class ReverseLinkedList {
	Node head;

	public void addElementsAtBeginning(final int data) {
		Node newNode = new Node(data);
		if (head != null) {
			newNode.next = head;

		}
		head = newNode;
	}

	public void addElementAtEnd(final int data) {
		Node dummyNode = head;
		Node newNode = new Node(data);
		if (dummyNode == null) {
			dummyNode = newNode;
			head = dummyNode;
			return;
		}
		while (dummyNode.next != null) {
			dummyNode = dummyNode.next;
		}
		dummyNode.next = new Node(data);
	}

	/**
	 * Reverse linked list in iterative fashion.
	 */
	public void reverseLinkedList() {
		Node prevNode = null;
		Node currentNode = head;
		Node nextNode;

		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head = prevNode;
	}

	/**
	 * Recursive function to reverse linked list.
	 */
	public Node reverseLinkedList(Node node) {
		if (node == null) {
			return node;
		}

		if (node.next == null) {
			head = node;
			return node;
		}

		Node currentNode = node;
		Node lastNode = reverseLinkedList(node.next);
		currentNode.next = null;
		lastNode.next = currentNode;
		return currentNode;
	}

	private void printLinkedList() {
		Node dummyNode = head;
		while (dummyNode != null) {
			System.out.print(dummyNode.data + " ");
			dummyNode = dummyNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ReverseLinkedList reverseLinkedList1 = new ReverseLinkedList();
		reverseLinkedList1.addElementsAtBeginning(5);
		reverseLinkedList1.addElementsAtBeginning(4);
		reverseLinkedList1.addElementsAtBeginning(3);
		reverseLinkedList1.addElementsAtBeginning(2);
		reverseLinkedList1.addElementsAtBeginning(1);
		reverseLinkedList1.printLinkedList();
		reverseLinkedList1.reverseLinkedList();
		reverseLinkedList1.printLinkedList();

		ReverseLinkedList reverseLinkedList2 = new ReverseLinkedList();
		reverseLinkedList2.addElementAtEnd(1);
		reverseLinkedList2.addElementAtEnd(2);
		reverseLinkedList2.addElementAtEnd(3);
		reverseLinkedList2.addElementAtEnd(4);
		reverseLinkedList2.addElementAtEnd(5);
		reverseLinkedList2.printLinkedList();
		reverseLinkedList2.reverseLinkedList(reverseLinkedList2.head);
		reverseLinkedList2.printLinkedList();
	}

	static class Node {
		int data;
		Node next;

		public Node(final int data) {
			this.data = data;
			this.next = null;
		}
	}
}
