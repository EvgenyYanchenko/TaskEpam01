package note;

import java.util.Scanner;
import note.NoteEvent;

public class Note {

	public static void main(String[] args) {

		System.out.println("������� ���������� ������� � ��������");
		Scanner inn = new Scanner(System.in);
		final int i = inn.nextInt();
		String note[] = new String[i];
		System.out.println("������� 1 ����� �������� ������");
		System.out.println("������� 2 ����� �������� ������");
		System.out.println("������� 3 ����� ������� ������");
		System.out.println("������� 4 ����� �������� ��� ������ � ��������");

		System.out.println("������� ����� ��������");
		Scanner event = new Scanner(System.in);
		int eventChoice = event.nextInt();
		if(eventChoice<=4 & eventChoice>=1){
		if(eventChoice==1){
			NoteEvent.addRecord(note);	
		}
		
		if(eventChoice==2){
			NoteEvent.setRecord(note);	
		}
		
		if(eventChoice==3){
			NoteEvent.deltRecord(note);	
		}
		
		if(eventChoice==4){
			NoteEvent.showAllRecords(note);	
		}
		}else{System.out.println("�� ����� ����� �� �� ��������� 1-4");}
		inn.close();
		event.close();

	}

}
