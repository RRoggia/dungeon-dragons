package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Abilities;

public class HalfOrc extends Race {

	private final static HashMap<Abilities, Integer> abilities = new HashMap<>();
	public final static String HALF_ORC = "Half Orc";

	static {
		abilities.put(Abilities.STRENGTH, Integer.valueOf(2));
	}

	public static HashMap<Abilities, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getRaceName() {
		return HALF_ORC;
	}

	@Override
	protected HashMap<Abilities, Integer> getRacialAbilitiesScore() {
		return abilities;
	}

}
