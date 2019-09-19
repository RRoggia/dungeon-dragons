package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public class Dragonborn {

	private final static HashMap<Ability, Integer> abilities = new HashMap<>();
	public final static String DRAGONBORN = "Dragonborn";

	static {
		abilities.put(Ability.STRENGTH, Integer.valueOf(2));
		abilities.put(Ability.CHARISMA, Integer.valueOf(1));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilities;
	}

	public String getName() {
		return DRAGONBORN;
	}

	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilities;
	}

}
