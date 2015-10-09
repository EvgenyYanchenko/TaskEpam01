package com.epam.classes;

import java.util.LinkedList;
import java.util.Scanner;

public class NotePad {

	
	
	//public class NoteBookActions {
		
		public static LinkedList<String> noteBook = new LinkedList<String>();
		
		public static void main(String args[]) {
			for(int i = 0; i < 5; i++) {
				addRecord();
			}
			removeRecord(2);
			changeRecord(3);
			showAllRecords();
			
		}
		
		public static void addRecord() {
			System.out.print("Введите новую запись: ");
			Scanner read = new Scanner(System.in);
			noteBook.add(read.nextLine());
		}
		
		public static void removeRecord(int index) {
			noteBook.remove(index);
			System.out.println("Запись с индексом " + index + " удалена!");
		}
		
		public static void changeRecord(int index) {
			System.out.print("Введите содержимое новой записи: ");
			Scanner read = new Scanner(System.in);
			noteBook.set(index, read.nextLine());
		}
		
		public static void showAllRecords() {
			System.out.println("Все записи в вашем блокноте:");
			for (int i = 0; i < noteBook.size(); i++) {
				System.out.println(noteBook.get(i));
			}
		}
	}


