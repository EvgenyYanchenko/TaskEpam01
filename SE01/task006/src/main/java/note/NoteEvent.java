package note;

import java.util.Scanner;

public class NoteEvent {

	public static void addRecord(String noteNew[]) {
		Scanner read = new Scanner(System.in);
		for (int j = 0; j < noteNew.length; j++) {
			System.out.println("������� ������");
			noteNew[j] = read.nextLine();
		}
		System.out.println("��� ������ � ����� ��������");
		System.out.println(" ");

		for (int t = 0; t < noteNew.length; t++) {
			System.out.println(noteNew[t]);
		}
		read.close();
	}

	public static void setRecord(String noteNew[]) {
		System.out.println("������� ����� ������ ������� ������ ��������");
		Scanner read = new Scanner(System.in);
		int r = read.nextInt();
		System.out.println("������� ����� ������");
		Scanner newRecord = new Scanner(System.in);
		noteNew[r] = newRecord.nextLine();
		read.close();
		newRecord.close();
	}

	public static void deltRecord(String noteNew[]) {
		System.out.println("������� ����� ������ ������� ������ �������");
		Scanner read = new Scanner(System.in);
		int r = read.nextInt();
		String k = "";
		noteNew[r] = k;
		System.out.println("���� ������ # " + r + " �������");
		read.close();
	}

	public static void showAllRecords(String noteNew[]) {
		System.out.println("��� ������ ��������");
		for (int i = 0; i <= noteNew.length; i++) {
			System.out.println(noteNew[i]);
		}
	}
}
