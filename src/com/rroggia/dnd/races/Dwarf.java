package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Abilities;

public final class Dwarf extends Race {

	private final static HashMap<Abilities, Integer> abilities = new HashMap<>();
	public final static String DWARF = "Dwarf";

	static {
		abilities.put(Abilities.CONSTITUITION, Integer.valueOf(2));
	}

	public static HashMap<Abilities, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getRaceName() {
		return DWARF;
	}

	@Override
	protected HashMap<Abilities, Integer> getRacialAbilitiesScore() {
		return abilities;

	}

}
