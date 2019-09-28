package com.rroggia.dnd.abilityscore;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.rroggia.dnd.Ability;

public class Customized implements AbilityDeterminator {

	private static Map<Integer, Integer> abilitiesScorePointCoint = Map.of(8, 0, 9, 1, 10, 2, 11, 3, 12, 4, 13, 5, 14,
			7, 15, 9);
	private Map<Ability, Integer> scoresPurchased = new HashMap<>();
	private int pointsToSpend = 27;

	public void purchaseAbilityScore(int abilityScore, Ability ability) {
		if (abilityScore < 8 || abilityScore > 15)
			throw new IllegalArgumentException("Ability Score is not valid. Too high or too low.");

		Integer abilityCost = abilitiesScorePointCoint.get(abilityScore);

		if (pointsToSpend < abilityCost)
			throw new IllegalArgumentException("Only " + pointsToSpend + " points remaining.");

		pointsToSpend -= abilityCost;
		scoresPurchased.put(ability, abilityScore);
	}

	@Override
	public void determineAbilityScore(Map<Ability, Integer> abilitiesScore) {
		for (Ability ability : Ability.values()) {
			int abilityScore = 8;
			if (scoresPurchased.containsKey(ability))
				abilityScore = scoresPurchased.get(ability);

			abilitiesScore.put(ability, abilityScore);
		}
	}

	public static void printAbilityScoreAndCost() {
		System.out.println("Customized Ability Score:");
		System.out.println("-----");
		for (Entry<Integer, Integer> scoreCost : abilitiesScorePointCoint.entrySet()) {
			System.out.println("Score:" + scoreCost.getKey());
			System.out.println("Cost:" + scoreCost.getValue());
		}
		System.out.println();
	}
}
