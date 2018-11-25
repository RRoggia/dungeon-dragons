package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public class HalfElf extends Race {

	private final static HashMap<Ability, Integer> abilities = new HashMap<>();
	public final static String HALF_ELF = "Half Elf";

	static {
		abilities.put(Ability.CHARISMA, Integer.valueOf(2));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getName() {
		return HALF_ELF;
	}

	@Override
	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilities;
	}

}
