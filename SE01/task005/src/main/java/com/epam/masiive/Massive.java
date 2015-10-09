package com.epam.masiive;

import java.util.Scanner;

public class Massive {

	public static void main(String[] args) {
		int m, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ведите кол-во строк ");
		m = scanner.nextInt();
		System.out.println("ведите кол-во столбцов ");
		n = scanner.nextInt();
		System.out.println();

		// создаем двумерный массив m на n
		int[][] matrica = new int[m][n];

		// цикл по первой размерности
		for (int i = 0; i < m; i++) {
			// цикл по второй размерности
			for (int j = 0; j < n; j++) {
				// инициализация элементов массива
				if (i == j || i == (n - (j + 1))) {
					matrica[i][j] = 1;
				} else {
					matrica[i][j] = 0;
				}

				// вывод элементов массива
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
