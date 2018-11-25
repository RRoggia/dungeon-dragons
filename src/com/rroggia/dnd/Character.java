package com.rroggia.dnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.rroggia.dnd.abilityscore.AbilityDeterminator;
import com.rroggia.dnd.classes.CharClass;
import com.rroggia.dnd.races.Race;

public class Character {

	private String name;
	private Race race;
	private CharClass charClass;
	private int level;
	private int experiencePoints;
	private Dice hitDice;

	private Map<Ability, Integer> abilitiesScore = new HashMap<>();
	private int hitPointMaximum;

	public Character(Race race, AbilityDeterminator abilities) {
		this.race = race;
		abilities.determineAbilityScore(this.abilitiesScore);
		this.addRacialAbilitiesScore(this.race.getAbilitiesScore());
		this.setHitPointMaximum();
	}

	private void addRacialAbilitiesScore(HashMap<Ability, Integer> racialAbilitiesScore) {
		for (Entry<Ability, Integer> racialAbility : racialAbilitiesScore.entrySet()) {
			Integer characterScore = abilitiesScore.get(racialAbility.getKey());
			abilitiesScore.put(racialAbility.getKey(), characterScore + racialAbility.getValue());
		}
	}

	private void setHitPointMaximum() {
		this.hitPointMaximum = Ability.getModifier(abilitiesScore.get(Ability.CONSTITUITION))
				+ Dice.D6.getHigherResult();
	}

	public String getRaceName() {
		return this.race.getName();
	}

	public int getHitPointMaximum() {
		return this.hitPointMaximum;
	}

	public Map<Ability, Integer> getAbilitiesScore() {
		return abilitiesScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
