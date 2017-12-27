package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Abilities;

public class HalfElf extends Race {

	private final static HashMap<Abilities, Integer> abilities = new HashMap<>();
	public final static String HALF_ELF = "Half Elf";

	static {
		abilities.put(Abilities.CHARISMA, Integer.valueOf(2));
	}

	public static HashMap<Abilities, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getRaceName() {
		return HALF_ELF;
	}

	@Override
	protected HashMap<Abilities, Integer> getRacialAbilitiesScore() {
		return abilities;
	}

}
