package com.crayons.ds;

/**
 * Class implements LinkedList. Following features have been implemented:
 * 1. Addition of element at the beginning
 * 2. Addition of element at the end
 * 3. Deletion of element at a given index
 * 4. Deletion of given element
 * 5. Delete entire linked list
 *
 * @author Jayant
 */
public class LinkedList {
	public Node addElementAtBeginning(Node head, final int data) {
		final Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}

	public Node addElementAtEnd(Node head, final int data) {
		final Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}
		Node dummyHead = head;
		Node prevNode = head;
		while (dummyHead.next != null) {
			dummyHead = dummyHead.next;
			prevNode = dummyHead;
		}
		prevNode.next = newNode;
		return head;
	}

	/**
	 * Deletes element at a given index. Index starts form one.
	 *
	 * @param head
	 * @param index
	 * @return
	 */
	public Node deleteElementAtGivenIndex(Node head, final int index) {
		if (index == 0) {
			return head;
		}

		Node prevNode = null;
		Node currentNode = head;
		int currentIndex = 1;
		while (currentNode != null && currentIndex != index) {
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
		if (currentNode == null) {
			return head;
		}
		if (prevNode != null) {
			prevNode.next = currentNode.next;
		} else {
			head = currentNode.next;
		}
		return head;
	}

	public Node deleteGivenElement(Node head, final int data) {
		Node prevNode = null;
		Node currentNode = head;
		while (currentNode != null && currentNode.data != data) {
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode == null) {
			return head;
		}
		if (prevNode != null) {
			prevNode.next = currentNode.next;
		} else {
			head = currentNode.next;
		}
		return head;
	}

	/**
	 * Assigning null to head would delete the linked list as automatic garbaze collection would happen.
	 *
	 * @param head
	 * @return
	 */
	public Node deleteEntireLinkedList(Node head) {
		head = null;
		return head;
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		Node head = new Node(4);
		head = linkedList.addElementAtBeginning(head, 3);
		head = linkedList.addElementAtEnd(head, 5);
		head = linkedList.addElementAtBeginning(head, 2);
		head = linkedList.addElementAtEnd(head, 6);
		head = linkedList.addElementAtBeginning(head, 1);
		linkedList.printLinkedList(head);

		head = linkedList.deleteGivenElement(head, 4);
		linkedList.printLinkedList(head);

		head = linkedList.deleteElementAtGivenIndex(head, 1);
		linkedList.printLinkedList(head);

		head = linkedList.deleteEntireLinkedList(head);
		linkedList.printLinkedList(head);
	}

	private void printLinkedList(final Node head) {
		Node tempHead = head;
		while (tempHead != null) {
			System.out.print(tempHead.data + " ");
			tempHead = tempHead.next;
		}
		System.out.println();
	}

	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}
