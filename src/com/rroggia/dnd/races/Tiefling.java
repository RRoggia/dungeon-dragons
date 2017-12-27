package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Abilities;

public class Tiefling extends Race {

	private final static HashMap<Abilities, Integer> abilities = new HashMap<>();
	public final static String TIEFLING = "Tiefling";

	static {
		abilities.put(Abilities.INTELLIGENCE, Integer.valueOf(1));
		abilities.put(Abilities.CHARISMA, Integer.valueOf(1));
	}

	public static HashMap<Abilities, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getRaceName() {
		return "Tiefling";
	}

	@Override
	protected HashMap<Abilities, Integer> getRacialAbilitiesScore() {
		return abilities;
	}
}
