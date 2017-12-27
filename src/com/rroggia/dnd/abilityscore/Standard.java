package com.rroggia.dnd.abilityscore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rroggia.dnd.Abilities;

public class Standard implements AbilityDeterminator {
	private List<Abilities> descendentAbilities;
	private static List<Integer> scores = new ArrayList<>();

	static {
		scores.add(15);
		scores.add(14);
		scores.add(13);
		scores.add(12);
		scores.add(10);
		scores.add(8);
	}

	public Standard(List<Abilities> descendentAbilities) {
		this.descendentAbilities = descendentAbilities;
	}

	@Override
	public void determineAbilityScore(Map<Abilities, Integer> abilitiesScore) {
		if (descendentAbilities.size() != scores.size())
			throw new IllegalArgumentException("Missing abilities.");

		int index = 0;

		for (Abilities ability : descendentAbilities) {
			abilitiesScore.put(ability, scores.get(index));
			index++;
		}

	}

}
