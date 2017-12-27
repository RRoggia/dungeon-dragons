package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Abilities;

public class Dragonborn extends Race {

	private final static HashMap<Abilities, Integer> abilities = new HashMap<>();
	public final static String DRAGONBORN = "Dragonborn";

	static {
		abilities.put(Abilities.STRENGTH, Integer.valueOf(2));
		abilities.put(Abilities.CHARISMA, Integer.valueOf(1));
	}

	public static HashMap<Abilities, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getRaceName() {
		return DRAGONBORN;
	}

	@Override
	protected HashMap<Abilities, Integer> getRacialAbilitiesScore() {
		return abilities;
	}

}
