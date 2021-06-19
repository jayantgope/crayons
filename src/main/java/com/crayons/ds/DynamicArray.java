package com.crayons.ds;

import java.util.Arrays;

/**
 * Class implements dynamic array.
 *
 * @author Jayant
 */
public class DynamicArray {
	private int[] array;
	private int arraySize;
	private int numberOfElements;

	public DynamicArray() {
		this.array = new int[1];
		this.arraySize = 1;
		this.numberOfElements = 0;
	}

	private void growArray() {
		final int newSizeOfArray = arraySize * 2;
		int[] tempArray = new int[newSizeOfArray];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		array = tempArray;
		arraySize = newSizeOfArray;
	}

	private void shrinkArray() {
		int[] tempArray = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			tempArray[i] = array[i];
		}
		array = tempArray;
		arraySize = numberOfElements;
	}

	public void addElement(final int element) {
		if (arraySize == numberOfElements) {
			growArray();
		}
		array[numberOfElements] = element;
		numberOfElements++;
	}

	public void addElementAt(final int index, final int element) {
		if (arraySize == numberOfElements) {
			growArray();
		}
		for (int i = numberOfElements - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		array[index] = element;
		numberOfElements++;
	}

	public void removeElement() {
		if (numberOfElements > 0) {
			array[numberOfElements - 1] = 0;
			numberOfElements--;
		}
	}

	public void removeElementAt(final int index) {
		if (index > 0) {
			for (int i = index; i < numberOfElements - 1; i++) {
				array[i] = array[i + 1];
			}
			numberOfElements--;
			shrinkArray();
		}
	}

	public static void main(String[] args) {
		DynamicArray dynamicArray = new DynamicArray();
		dynamicArray.addElement(1);
		dynamicArray.printArrayStatus();
		dynamicArray.addElement(4);
		dynamicArray.printArrayStatus();
		dynamicArray.addElement(5);
		dynamicArray.printArrayStatus();
		dynamicArray.addElementAt(1, 2);
		dynamicArray.printArrayStatus();
		dynamicArray.addElementAt(2, 3);
		dynamicArray.printArrayStatus();
		dynamicArray.removeElementAt(3);
		dynamicArray.printArrayStatus();
		dynamicArray.removeElement();
		dynamicArray.printArrayStatus();
		dynamicArray.shrinkArray();
		dynamicArray.printArrayStatus();
	}

	private void printArrayStatus() {

		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "DynamicArray{" + "array=" + Arrays.toString(array) + ", arraySize=" + arraySize + ", numberOfElements="
				+ numberOfElements + '}';
	}
}
