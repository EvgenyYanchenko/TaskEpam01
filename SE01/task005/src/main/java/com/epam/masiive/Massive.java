package com.epam.masiive;

import java.util.Scanner;

public class Massive {

	public static void main(String[] args) {
		int m, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ���-�� ����� ");
		m = scanner.nextInt();
		System.out.println("������ ���-�� �������� ");
		n = scanner.nextInt();
		System.out.println();

		// ������� ��������� ������ m �� n
		int[][] matrica = new int[m][n];

		// ���� �� ������ �����������
		for (int i = 0; i < m; i++) {
			// ���� �� ������ �����������
			for (int j = 0; j < n; j++) {
				// ������������� ��������� �������
				if (i == j || i == (n - (j + 1))) {
					matrica[i][j] = 1;
				} else {
					matrica[i][j] = 0;
				}

				// ����� ��������� �������
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
