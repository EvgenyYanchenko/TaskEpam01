package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static List<Stationery> officeTools = new ArrayList<Stationery>();
	private static List<Stationery> junKit = new ArrayList<Stationery>();

	public static void main(String[] args) {
		Writeln pen = new Writeln();
		pen.setName("pen");
		pen.setPrice(100);
		pen.setColor("blue");
		
		Writeln pencil = new Writeln();
		pencil.setName("pencil");
		pencil.setPrice(20);
		pencil.setColor("grey");

		Paper paper = new Paper();
		paper.setName("paper");
		paper.setPrice(10);
		paper.setAccessory("for fax");
		
		Paper note = new Paper();
		note.setName("note");
		note.setPrice(120);
		note.setAccessory("for mark");

		Tools tool1 = new Tools();
		tool1.setName("stapler");
		tool1.setPrice(200);
		tool1.setHandyOrMechanic("handy");
		
		Tools tool2 = new Tools();
		tool2.setName("puncher");
		tool2.setPrice(400);
		tool2.setHandyOrMechanic("handy");

		UserKit dimka = new UserKit();
		dimka.setName("Dmitry");
		dimka.setPol("men");

		UserKit sveta = new UserKit();
		sveta.setName("Sveta");
		sveta.setPol("woman");

		officeTools.add(pen);
		officeTools.add(paper);
		officeTools.add(tool1);
		officeTools.add(tool2);
		officeTools.add(pencil);
		officeTools.add(note);

		System.out.println(officeTools);

	}

}
