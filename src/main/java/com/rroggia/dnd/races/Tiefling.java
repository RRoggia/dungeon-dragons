package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public class Tiefling {

	private final static HashMap<Ability, Integer> abilities = new HashMap<>();
	public final static String TIEFLING = "Tiefling";

	static {
		abilities.put(Ability.INTELLIGENCE, Integer.valueOf(1));
		abilities.put(Ability.CHARISMA, Integer.valueOf(1));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilities;
	}

	public String getName() {
		return "Tiefling";
	}

	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilities;
	}
}
