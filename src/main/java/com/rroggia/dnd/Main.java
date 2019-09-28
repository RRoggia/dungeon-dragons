package com.rroggia.dnd;

import java.util.ArrayList;
import java.util.List;

import com.rroggia.dnd.abilityscore.Customized;
import com.rroggia.dnd.abilityscore.Random;
import com.rroggia.dnd.abilityscore.Standard;
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

		Character reginaldo = new Character(Dwarf.getInstance(), new Standard(ordem));
		reginaldo.setName("regi");
		ConsoleWriter.printCharacterSheet(reginaldo);

		Character pedroHenrique = new Character(Dwarf.getInstance(), new Random());
		ConsoleWriter.printCharacterSheet(pedroHenrique);

		Customized valoresPersonalizados = new Customized();
		valoresPersonalizados.purchaseAbilityScore(14, Ability.STRENGTH);
		valoresPersonalizados.purchaseAbilityScore(14, Ability.DEXTERITY);
		valoresPersonalizados.purchaseAbilityScore(14, Ability.CHARISMA);
		valoresPersonalizados.purchaseAbilityScore(9, Ability.CONSTITUITION);
		valoresPersonalizados.purchaseAbilityScore(9, Ability.WISDOM);
		valoresPersonalizados.purchaseAbilityScore(9, Ability.INTELLIGENCE);

		Character breno = new Character(Dwarf.getInstance(), valoresPersonalizados);
		ConsoleWriter.printCharacterSheet(breno);

		ConsoleWriter.printAbilityScoreSummaryOfAllRaces();

	}

}
