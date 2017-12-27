package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Abilities;

public class Elf extends Race {

	private final static HashMap<Abilities, Integer> abilities = new HashMap<>();
	public final static String ELF = "Elf";

	static {
		abilities.put(Abilities.DEXTERITY, Integer.valueOf(2));
	}

	public static HashMap<Abilities, Integer> getAbilities() {
		return abilities;
	}

	@Override
	public String getRaceName() {
		return ELF;
	}

	@Override
	protected HashMap<Abilities, Integer> getRacialAbilitiesScore() {
		return abilities;
	}

}
