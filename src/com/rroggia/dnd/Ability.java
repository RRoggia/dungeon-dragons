package com.rroggia.dnd;

import java.util.HashMap;
import java.util.Map;

public enum Ability {

	STRENGTH, DEXTERITY, CONSTITUITION, INTELLIGENCE, WISDOM, CHARISMA;

	public static Integer getModifier(Integer abilityScore) {
		return (abilityScore - 10) / 2;
	}

	public static Map<Ability, Integer> getAbilityModifier(Map<Ability, Integer> abilitiesScore) {
		HashMap<Ability, Integer> abilitiesModifier = new HashMap<>();

		for (Ability ability : abilitiesScore.keySet()) {
			abilitiesModifier.put(ability, getModifier(abilitiesScore.get(ability)));
		}

		return abilitiesModifier;
	}
}
