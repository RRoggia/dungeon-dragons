package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Abilities;

public class Gnome extends Race {

	private final static HashMap<Abilities, Integer> abilities = new HashMap<>();
	public final static String GNOME = "Gnome";

	static {
		abilities.put(Abilities.INTELLIGENCE, Integer.valueOf(2));
	}

	public static HashMap<Abilities, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getRaceName() {
		return GNOME;
	}

	@Override
	protected HashMap<Abilities, Integer> getRacialAbilitiesScore() {
		return abilities;
	}

}