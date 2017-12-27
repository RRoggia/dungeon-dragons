package com.rroggia.dnd;

import java.util.HashMap;
import java.util.Map;

public enum Abilities {

	STRENGTH, DEXTERITY, CONSTITUITION, INTELLIGENCE, WISDOM, CHARISMA;

	public static Integer getAbilityModifier(Integer abilityScore) {
		return (abilityScore - 10) / 2;
	}

	public static Map<Abilities, Integer> getAbilityModifier(Map<Abilities, Integer> abilitiesScore) {
		HashMap<Abilities, Integer> abilitiesModifier = new HashMap<>();

		for (Abilities ability : abilitiesScore.keySet()) {
			abilitiesModifier.put(ability, getAbilityModifier(abilitiesScore.get(ability)));
		}

		return abilitiesModifier;
	}
}
