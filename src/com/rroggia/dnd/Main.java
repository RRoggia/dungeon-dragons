package com.rroggia.dnd;

import java.util.ArrayList;
import java.util.List;

import com.rroggia.dnd.abilityscore.Customized;
import com.rroggia.dnd.abilityscore.Random;
import com.rroggia.dnd.abilityscore.Standard;
import com.rroggia.dnd.output.ConsoleWriter;
import com.rroggia.dnd.races.Elf;
import com.rroggia.dnd.races.HalfElf;
import com.rroggia.dnd.races.Human;

public class Main {

	public static void main(String[] args) {
		List<Abilities> ordem = new ArrayList<Abilities>();
		ordem.add(Abilities.STRENGTH);
		ordem.add(Abilities.CONSTITUITION);
		ordem.add(Abilities.INTELLIGENCE);
		ordem.add(Abilities.DEXTERITY);
		ordem.add(Abilities.CHARISMA);
		ordem.add(Abilities.WISDOM);

		Character reginaldo = new Character(new Elf(), new Standard(ordem));
		reginaldo.setName("regi");
		ConsoleWriter.printCharacterSheet(reginaldo);

		Character pedroHenrique = new Character(new Human(), new Random());
		ConsoleWriter.printCharacterSheet(pedroHenrique);

		Customized valoresPersonalizados = new Customized();
		valoresPersonalizados.compraValorDeHabilidade(14, Abilities.STRENGTH);
		valoresPersonalizados.compraValorDeHabilidade(14, Abilities.DEXTERITY);
		valoresPersonalizados.compraValorDeHabilidade(14, Abilities.CHARISMA);
		valoresPersonalizados.compraValorDeHabilidade(9, Abilities.CONSTITUITION);
		valoresPersonalizados.compraValorDeHabilidade(9, Abilities.WISDOM);
		valoresPersonalizados.compraValorDeHabilidade(9, Abilities.INTELLIGENCE);

		Character breno = new Character(new HalfElf(), valoresPersonalizados);
		ConsoleWriter.printCharacterSheet(breno);

		ConsoleWriter.printAbilityScoreSummaryOfAllRaces();

	}

}
