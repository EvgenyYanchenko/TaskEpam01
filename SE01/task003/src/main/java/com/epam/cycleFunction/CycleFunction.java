package com.epam.cycleFunction;
import java.util.Scanner;
import static java.lang.Math.*;
public class CycleFunction {
	

		public static void main(String[] args) {
			double i = 0, a = 0, b = 0, h = 0, x = 0;
			Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner

			System.out.print("������� �������� �: ");
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();

			} else {
				System.out.println("�� ����� �� ����� double");
			}

			System.out.print("������� �������� B: ");
			if (sc.hasNextDouble()) { // ���������� ������� ���� ����

				b = sc.nextDouble();

			} else {
				System.out.println("�� ����� �� ����� double");
			}

			System.out.print("������� ��� �: ");
			if (sc.hasNextDouble()) {
				h = sc.nextDouble();

			} else {
				System.out.println("�� ����� �� ����� double");
			}
			System.out.println("a= " + a);
			System.out.println("b= " + b);
			System.out.println("��� h= " + h);
			System.out.println(" ");

			for (i = a; i <= b; i = i + h) {
				x = (Math.tan(2.0 * a)) - 3.0;
				System.out.print("F(x)= " + x +"     "+ i + " \n" );

			}
		}
	}

