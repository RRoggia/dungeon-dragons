package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public class Human extends Race {

	private final static HashMap<Ability, Integer> abilities = new HashMap<>();
	public final static String HUMAN = "Human";

	static {
		abilities.put(Ability.STRENGTH, Integer.valueOf(1));
		abilities.put(Ability.DEXTERITY, Integer.valueOf(1));
		abilities.put(Ability.CONSTITUITION, Integer.valueOf(1));
		abilities.put(Ability.INTELLIGENCE, Integer.valueOf(1));
		abilities.put(Ability.WISDOM, Integer.valueOf(1));
		abilities.put(Ability.CHARISMA, Integer.valueOf(1));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getName() {
		return HUMAN;
	}

	@Override
	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilities;
	}

}
