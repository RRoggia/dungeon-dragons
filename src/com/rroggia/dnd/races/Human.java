package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Abilities;

public class Human extends Race {

	private final static HashMap<Abilities, Integer> abilities = new HashMap<>();
	public final static String HUMAN = "Human";

	static {
		abilities.put(Abilities.STRENGTH, Integer.valueOf(1));
		abilities.put(Abilities.DEXTERITY, Integer.valueOf(1));
		abilities.put(Abilities.CONSTITUITION, Integer.valueOf(1));
		abilities.put(Abilities.INTELLIGENCE, Integer.valueOf(1));
		abilities.put(Abilities.WISDOM, Integer.valueOf(1));
		abilities.put(Abilities.CHARISMA, Integer.valueOf(1));
	}

	public static HashMap<Abilities, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getRaceName() {
		return HUMAN;
	}

	@Override
	protected HashMap<Abilities, Integer> getRacialAbilitiesScore() {
		return abilities;
	}

}
