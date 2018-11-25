package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public class HalfOrc extends Race {

	private final static HashMap<Ability, Integer> abilities = new HashMap<>();
	public final static String HALF_ORC = "Half Orc";

	static {
		abilities.put(Ability.STRENGTH, Integer.valueOf(2));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getName() {
		return HALF_ORC;
	}

	@Override
	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilities;
	}

}
