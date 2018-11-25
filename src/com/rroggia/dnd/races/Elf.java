package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Ability;

public class Elf extends Race {

	private final static HashMap<Ability, Integer> abilities = new HashMap<>();
	public final static String ELF = "Elf";

	static {
		abilities.put(Ability.DEXTERITY, Integer.valueOf(2));
	}

	public static HashMap<Ability, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getName() {
		return ELF;
	}

	@Override
	public HashMap<Ability, Integer> getAbilitiesScore() {
		return abilities;
	}

}
