package com.rroggia.dnd;

import java.util.ArrayList;
import java.util.List;

import com.rroggia.dnd.abilityscore.Standard;
import com.rroggia.dnd.classes.Barbarian;
import com.rroggia.dnd.output.ConsoleWriter;
import com.rroggia.dnd.races.Dwarf;

public class Main {

	public static void main(String[] args) {
		List<Ability> ordem = new ArrayList<Ability>();
		ordem.add(Ability.STRENGTH);
		ordem.add(Ability.CONSTITUITION);
		ordem.add(Ability.INTELLIGENCE);
		ordem.add(Ability.DEXTERITY);
		ordem.add(Ability.CHARISMA);
		ordem.add(Ability.WISDOM);

		Character reginaldo = new Character(Dwarf.getInstance(), Barbarian.getInstance(), new Standard(ordem));
		reginaldo.setName("regi");
		ConsoleWriter.printCharacterSheet(reginaldo);

	}

}
