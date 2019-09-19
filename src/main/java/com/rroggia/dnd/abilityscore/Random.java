package com.rroggia.dnd.abilityscore;

import java.util.Map;

import com.rroggia.dnd.Ability;
import com.rroggia.dnd.Dice;

public class Random implements AbilityDeterminator {

	@Override
	public void determineAbilityScore(Map<Ability, Integer> abilitiesScore) {
		for (Ability ability : Ability.values()) {
			int first = 0;
			int second = 0;
			int third = 0;

			for (int i = 0; i < 4; i++) {
				int result = Dice.D6.roll();

				if (third < result) {
					if (second <= result) {
						if (first <= result) {
							third = second;
							second = first;
							first = result;
						} else {
							third = second;
							second = result;
						}
					} else {
						third = result;
					}
				}

			}
			abilitiesScore.put(ability, first + second + third);
		}
	}
}
