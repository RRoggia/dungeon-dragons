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
		List<Ability> ordem = new ArrayList<Ability>();
		ordem.add(Ability.STRENGTH);
		ordem.add(Ability.CONSTITUITION);
		ordem.add(Ability.INTELLIGENCE);
		ordem.add(Ability.DEXTERITY);
		ordem.add(Ability.CHARISMA);
		ordem.add(Ability.WISDOM);

		Character reginaldo = new Character(new Elf(), new Standard(ordem));
		reginaldo.setName("regi");
		ConsoleWriter.printCharacterSheet(reginaldo);

		Character pedroHenrique = new Character(new Human(), new Random());
		ConsoleWriter.printCharacterSheet(pedroHenrique);

		Customized valoresPersonalizados = new Customized();
		valoresPersonalizados.compraValorDeHabilidade(14, Ability.STRENGTH);
		valoresPersonalizados.compraValorDeHabilidade(14, Ability.DEXTERITY);
		valoresPersonalizados.compraValorDeHabilidade(14, Ability.CHARISMA);
		valoresPersonalizados.compraValorDeHabilidade(9, Ability.CONSTITUITION);
		valoresPersonalizados.compraValorDeHabilidade(9, Ability.WISDOM);
		valoresPersonalizados.compraValorDeHabilidade(9, Ability.INTELLIGENCE);

		Character breno = new Character(new HalfElf(), valoresPersonalizados);
		ConsoleWriter.printCharacterSheet(breno);

		ConsoleWriter.printAbilityScoreSummaryOfAllRaces();

	}

}
