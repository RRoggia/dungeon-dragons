package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public class Gnome {

	private final static HashMap<Ability, Integer> abilitiesScore = new HashMap<>();
	public final static String GNOME = "Gnome";

	static {
		abilitiesScore.put(Ability.INTELLIGENCE, Integer.valueOf(2));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilitiesScore;
	}

	public String getName() {
		return GNOME;
	}

	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilitiesScore;
	}

}
