package com.epam.cycleFunction;
import java.util.Scanner;
import static java.lang.Math.*;
public class CycleFunction {
	

		public static void main(String[] args) {
			double i = 0, a = 0, b = 0, h = 0, x = 0;
			Scanner sc = new Scanner(System.in); // создаём объект класса Scanner

			System.out.print("Введите значение А: ");
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();

			} else {
				System.out.println("Вы ввели не число double");
			}

			System.out.print("Введите значение B: ");
			if (sc.hasNextDouble()) { // возвращает истинну если дабл

				b = sc.nextDouble();

			} else {
				System.out.println("Вы ввели не число double");
			}

			System.out.print("Введите шаг Н: ");
			if (sc.hasNextDouble()) {
				h = sc.nextDouble();

			} else {
				System.out.println("Вы ввели не число double");
			}
			System.out.println("a= " + a);
			System.out.println("b= " + b);
			System.out.println("шаг h= " + h);
			System.out.println(" ");

			for (i = a; i <= b; i = i + h) {
				x = (Math.tan(2.0 * a)) - 3.0;
				System.out.print("F(x)= " + x +"     "+ i + " \n" );

			}
		}
	}

