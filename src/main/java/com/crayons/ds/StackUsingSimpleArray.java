package com.crayons.ds;

/**
 * Implementation of stack using simple array. Following features have been implemented -
 * 1. Push - Adds an element
 * 2. Pop - Returns last inserted element and deletes it
 * 3. Top - Returns last inserted element without deleting it
 * 4. Size - Returns size of the stack
 * 5. Empty - Returns boolean value based on the state of the stack
 * 6. Full - Vice versa of Empty
 */
public class StackUsingSimpleArray {
	private int[] stack;
	private int top = -1;

	public StackUsingSimpleArray(final int sizeOfStack) {
		this.stack = new int[sizeOfStack];
	}

	private boolean isFull() {
		return top + 1 == stack.length;
	}

	private boolean isEmpty() {
		return top == -1;
	}

	private void push(final int element) {
		if (isFull()) {
			System.out.println("Stack is full!");
			return;
		}
		stack[++top] = element;
	}

	private int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return Integer.MIN_VALUE;
		}
		final int topElement = stack[top];
		stack[top--] = Integer.MIN_VALUE;
		return topElement;
	}

	private int top() {
		return stack[top];
	}

	private int size() {
		return top;
	}

	private void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackUsingSimpleArray stackUsingSimpleArray = new StackUsingSimpleArray(4);
		System.out.println("Size: " + stackUsingSimpleArray.size());
		stackUsingSimpleArray.push(1);
		stackUsingSimpleArray.printStack();
		System.out.println("Size: " + stackUsingSimpleArray.size());
		stackUsingSimpleArray.push(2);
		System.out.println("Top: " + stackUsingSimpleArray.top());
		stackUsingSimpleArray.printStack();
		stackUsingSimpleArray.push(3);
		stackUsingSimpleArray.printStack();
		stackUsingSimpleArray.push(4);
		stackUsingSimpleArray.printStack();
		stackUsingSimpleArray.push(5);

		System.out.println("Top: " + stackUsingSimpleArray.top());

		stackUsingSimpleArray.printStack();
		stackUsingSimpleArray.pop();
		stackUsingSimpleArray.printStack();
		stackUsingSimpleArray.pop();
		stackUsingSimpleArray.printStack();
		stackUsingSimpleArray.pop();
		stackUsingSimpleArray.printStack();
		stackUsingSimpleArray.pop();
		stackUsingSimpleArray.printStack();
		stackUsingSimpleArray.pop();
		stackUsingSimpleArray.printStack();
	}
}
