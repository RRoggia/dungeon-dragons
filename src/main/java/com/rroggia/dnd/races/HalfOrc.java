package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public class HalfOrc {

	private final static HashMap<Ability, Integer> abilities = new HashMap<>();
	public final static String HALF_ORC = "Half Orc";

	static {
		abilities.put(Ability.STRENGTH, Integer.valueOf(2));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilities;
	}

	public String getName() {
		return HALF_ORC;
	}

	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilities;
	}

}
