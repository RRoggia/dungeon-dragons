package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public class Halfling extends Race {

	private final static HashMap<Ability, Integer> abilities = new HashMap<>();
	public final static String HALFLING = "Halfling";

	static {
		abilities.put(Ability.DEXTERITY, Integer.valueOf(2));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getName() {
		return HALFLING;
	}

	@Override
	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilities;
	}

}
