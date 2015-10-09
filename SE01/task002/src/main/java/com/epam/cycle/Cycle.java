package com.epam.cycle;

public class Cycle {

	public static void main(String[] args) {

		/**
		 * @param args
		 */

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i * 2;
			System.out.println((i + 1) + "-й элемент массива = " + arr[i]);
		}
		System.out.println("");

		int i = 1;
		while (i < 10) {
			arr[i] = arr[i] * arr[i - 1];
			System.out.println((i + 1) + "-й элемент массива = " + arr[i]);
			i = i + 2;

		}
		System.out.println("");
		int j = 1;
		do {
			System.out.println((j + 1) + "-й элемент массива = " + arr[j]);
			j++;
		} while (j < 10);
	}
}
