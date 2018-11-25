package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public final class Dwarf extends Race {

	private final static HashMap<Ability, Integer> abilities = new HashMap<>();
	public final static String DWARF = "Dwarf";

	static {
		abilities.put(Ability.CONSTITUITION, Integer.valueOf(2));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getName() {
		return DWARF;
	}

	@Override
	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilities;

	}

}
