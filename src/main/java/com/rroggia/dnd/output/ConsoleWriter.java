package com.rroggia.dnd.output;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.rroggia.dnd.Ability;
import com.rroggia.dnd.Character;
import com.rroggia.dnd.races.Dragonborn;
import com.rroggia.dnd.races.Elf;
import com.rroggia.dnd.races.Gnome;
import com.rroggia.dnd.races.HalfElf;
import com.rroggia.dnd.races.HalfOrc;
import com.rroggia.dnd.races.Halfling;
import com.rroggia.dnd.races.Human;
import com.rroggia.dnd.races.Tiefling;

public class ConsoleWriter {

	public static void printAbilityScoreSummaryOfAllRaces() {

		printAbilityScore(Dragonborn.getAbilities(), Dragonborn.DRAGONBORN);
		printAbilityScore(Elf.getAbilities(), Elf.ELF);
		printAbilityScore(Gnome.getAbilities(), Gnome.GNOME);
		printAbilityScore(Halfling.getAbilities(), Halfling.HALFLING);
		printAbilityScore(Human.getAbilities(), Human.HUMAN);
		printAbilityScore(HalfElf.getAbilities(), HalfElf.HALF_ELF);
		printAbilityScore(HalfOrc.getAbilities(), HalfOrc.HALF_ORC);
		printAbilityScore(Tiefling.getAbilities(), Tiefling.TIEFLING);
	}

	public static void printCharacterSheet(Character character) {
		System.out.println("Name: " + (character.getName() == null ? "" : character.getName()));

		System.out.println("Classes and Level:");
		if (character.getClassesAndLevel() != null) {
			for (var classLevel : character.getClassesAndLevel().entrySet()) {
				var charClass = classLevel.getKey();
				var level = classLevel.getValue();
				System.out.println(charClass + " " + level);
			}
		} else {
			System.out.println("No class specified.");
		}
		System.out.println("Race: " + character.getRaceName());
		System.out.println("Hit Point Maximum: " + character.getHitPointMaximum());

		printCharacterAbilitiesScoreAndModifiers(character.getAbilitiesScore());
		printCharacterSavingThrowsAndModifiers(character.getSavingThrow());

	}

	private static void printCharacterAbilitiesScoreAndModifiers(Map<Ability, Integer> abilitiesScore) {
		System.out.println("Abilities:");
		System.out.println("-----");
		printAbilityAndModifier(abilitiesScore);
	}

	private static void printCharacterSavingThrowsAndModifiers(Map<Ability, Integer> savingThrows) {
		System.out.println("Saving Throws");
		System.out.println("-----");
		printAbilityAndSavingThrow(savingThrows);
	}

	private static void printAbilityAndSavingThrow(Map<Ability, Integer> abilitiesScore) {
		for (Entry<Ability, Integer> entry : abilitiesScore.entrySet()) {
			System.out.println(entry.getKey().toString() + " " + entry.getValue());
		}
		System.out.println();
	}

	private static void printAbilityAndModifier(Map<Ability, Integer> abilitiesScore) {
		for (Entry<Ability, Integer> entry : abilitiesScore.entrySet()) {
			System.out.println(entry.getKey().toString() + " " + entry.getValue() + " ("
					+ Ability.getModifier(entry.getValue()) + ")");
		}
		System.out.println();
	}

	private static void printAbilityScore(HashMap<Ability, Integer> valoresDeHabilidades, String nomeDaClasse) {

		System.out.println(nomeDaClasse + " Racial Abilities:");
		System.out.println("-----");
		for (Entry<Ability, Integer> entrada : valoresDeHabilidades.entrySet()) {
			System.out.println("Ability: " + entrada.getKey().toString());
			System.out.println("Score: " + entrada.getValue());
		}
		System.out.println();
	}

}
