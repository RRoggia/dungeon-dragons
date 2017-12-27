package com.rroggia.dnd.abilityscore;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.rroggia.dnd.Abilities;

public class Customized implements AbilityDeterminator {

	private static Map<Integer, Integer> abilitiesScorePointCoint = new HashMap<>();
	private Map<Abilities, Integer> scoresPurchased = new HashMap<>();
	private int pointsToSpend = 27;

	static {
		abilitiesScorePointCoint.put(8, 0);
		abilitiesScorePointCoint.put(9, 1);
		abilitiesScorePointCoint.put(10, 2);
		abilitiesScorePointCoint.put(11, 3);
		abilitiesScorePointCoint.put(12, 4);
		abilitiesScorePointCoint.put(13, 5);
		abilitiesScorePointCoint.put(14, 7);
		abilitiesScorePointCoint.put(15, 9);
	}

	public void compraValorDeHabilidade(int abilityScore, Abilities ability) {
		if (abilityScore < 8 || abilityScore > 15)
			throw new IllegalArgumentException("Ability Score is not valid. Too high or too low.");

		Integer abilityCost = abilitiesScorePointCoint.get(abilityScore);

		if (pointsToSpend < abilityCost)
			throw new IllegalArgumentException("Only " + pointsToSpend + " points remaining.");

		pointsToSpend -= abilityCost;
		scoresPurchased.put(ability, abilityScore);
	}

	@Override
	public void determineAbilityScore(Map<Abilities, Integer> abilitiesScore) {
		for (Abilities ability : Abilities.values()) {
			int abilityScore = 8;
			if (scoresPurchased.containsKey(ability))
				abilityScore = scoresPurchased.get(ability);

			abilitiesScore.put(ability, abilityScore);
		}
	}

	public static void imprimeValoresECustosDeHabilidades() {
		System.out.println("Customized Ability Score:");
		System.out.println("-----");
		for (Entry<Integer, Integer> scoreCost : abilitiesScorePointCoint.entrySet()) {
			System.out.println("Score:" + scoreCost.getKey());
			System.out.println("Cost:" + scoreCost.getValue());
		}
		System.out.println();
	}
}