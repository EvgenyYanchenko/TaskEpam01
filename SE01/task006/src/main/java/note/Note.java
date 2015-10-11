package note;

import java.util.Scanner;
import note.NoteEvent;

public class Note {

	public static void main(String[] args) {

		System.out.println("¬ведите количество записей в блокноте");
		Scanner inn = new Scanner(System.in);
		final int i = inn.nextInt();
		String note[] = new String[i];
		System.out.println("¬ведите 1 чтобы добавить записи");
		System.out.println("¬ведите 2 чтобы изменить запись");
		System.out.println("¬ведите 3 чтобы удалить запись");
		System.out.println("¬ведите 4 чтобы показать все записи в блокноте");

		System.out.println("¬ведите номер действи€");
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
		}else{System.out.println("¬ы ввели число не из диапазона 1-4");}
		inn.close();
		event.close();

	}

}
