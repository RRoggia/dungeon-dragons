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
	private Map<CharClass, Integer> classesAndLevel;
	private Alignment alignment;
	private int experiencePoints;
	private int hitPointMaximum;
	private Dice hitDice;
	private Map<Ability, Integer> abilitiesScore = new HashMap<>();
	private Integer proficiencyBonus = 0;
	private Map<Ability, Integer> savingThrow = new HashMap<>();
	private Map<Skill, Integer> skills;
	private Integer armorClass;
	private Integer initiative;
	private Speed speed;

	public Character(Race race, AbilityDeterminator abilities) {
		this.race = race;
		this.speed = race.getSpeed();
		this.abilitiesScore = abilities.determineAbilityScore();
		this.addRacialAbilitiesScore(this.race.getAbilitiesScore());
		this.determineSavingThrows();

		this.setHitPointMaximum();
	}

	private void determineSavingThrows() {
		for (var abilityAndScore : this.abilitiesScore.entrySet()) {
			Ability ability = abilityAndScore.getKey();
			Integer score = abilityAndScore.getValue();
			savingThrow.put(ability, Ability.getModifier(score) + proficiencyBonus);
		}
	}

	private void addRacialAbilitiesScore(Map<Ability, Integer> racialAbilitiesScore) {
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

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Map<CharClass, Integer> getClassesAndLevel() {
		return classesAndLevel;
	}

	public void setClassesAndLevel(Map<CharClass, Integer> classesAndLevel) {
		this.classesAndLevel = classesAndLevel;
	}

	public Alignment getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public Dice getHitDice() {
		return hitDice;
	}

	public void setHitDice(Dice hitDice) {
		this.hitDice = hitDice;
	}

	public Integer getProficiencyBonus() {
		return proficiencyBonus;
	}

	public void setProficiencyBonus(Integer proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}

	public Map<Ability, Integer> getSavingThrow() {
		return savingThrow;
	}

	public void setSavingThrow(Map<Ability, Integer> savingThrow) {
		this.savingThrow = savingThrow;
	}

	public Map<Skill, Integer> getSkills() {
		return skills;
	}

	public void setSkills(Map<Skill, Integer> skills) {
		this.skills = skills;
	}

	public Integer getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(Integer armorClass) {
		this.armorClass = armorClass;
	}

	public Integer getInitiative() {
		return initiative;
	}

	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	public void setHitPointMaximum(int hitPointMaximum) {
		this.hitPointMaximum = hitPointMaximum;
	}

	public void setAbilitiesScore(Map<Ability, Integer> abilitiesScore) {
		this.abilitiesScore = abilitiesScore;
	}

}
