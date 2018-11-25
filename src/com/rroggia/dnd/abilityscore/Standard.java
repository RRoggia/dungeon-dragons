package com.rroggia.dnd.abilityscore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rroggia.dnd.Ability;

public class Standard implements AbilityDeterminator {
	private List<Ability> descendentAbilities;
	private static List<Integer> scores = new ArrayList<>();

	static {
		scores.add(15);
		scores.add(14);
		scores.add(13);
		scores.add(12);
		scores.add(10);
		scores.add(8);
	}

	public Standard(List<Ability> descendentAbilities) {
		this.descendentAbilities = descendentAbilities;
	}

	@Override
	public void determineAbilityScore(Map<Ability, Integer> abilitiesScore) {
		if (descendentAbilities.size() != scores.size())
			throw new IllegalArgumentException("Missing abilities.");

		int index = 0;

		for (Ability ability : descendentAbilities) {
			abilitiesScore.put(ability, scores.get(index));
			index++;
		}

	}

}
