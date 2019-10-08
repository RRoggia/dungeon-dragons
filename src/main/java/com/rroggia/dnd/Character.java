package com.rroggia.dnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.rroggia.dnd.abilityscore.AbilityDeterminator;
import com.rroggia.dnd.classes.CharacterClass;
import com.rroggia.dnd.proficiency.ProficiencyBonusCalculator;
import com.rroggia.dnd.proficiency.SavingThrowProficiency;
import com.rroggia.dnd.proficiency.Skill;
import com.rroggia.dnd.races.Race;

public class Character {

	private String name;
	private Race race;
	private Map<CharacterClass, Integer> classesAndLevel;
	private Alignment alignment;
	private int experiencePoints;
	private int hitPointMaximum;
	private Dice hitDice;
	private Map<Ability, Integer> abilitiesScore = new HashMap<>();
	private Integer proficiencyBonus = 0;
	private Map<SavingThrowProficiency, Integer> savingThrow = new HashMap<>();
	private Map<Skill, Integer> skills;
	private Integer armorClass;
	private Integer initiative;
	private Speed speed;
	private CharacterClass characterClass;

	public Character(Race race, CharacterClass characterClass, AbilityDeterminator abilities) {
		this.race = race;
		this.speed = race.getSpeed();
		this.abilitiesScore = abilities.determineAbilityScore();
		this.addRacialAbilitiesScore(this.race.getAbilitiesScore());

		this.hitDice = characterClass.getHitDice();
		this.hitPointMaximum = hitDice.getHigherResult()
				+ Ability.getModifier(abilitiesScore.get(Ability.CONSTITUITION));

		classesAndLevel = Map.of(characterClass, 1);

		proficiencyBonus = ProficiencyBonusCalculator.calculateProfiencyBonusForLevel(1);
		this.characterClass = characterClass;
		this.determineSavingThrows();

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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Race getRace() {
		return race;
	}

	public Map<CharacterClass, Integer> getClassesAndLevel() {
		return classesAndLevel;
	}

	public Alignment getAlignment() {
		return alignment;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public Integer getProficiencyBonus() {
		return proficiencyBonus;
	}

	public Map<SavingThrowProficiency, Integer> getSavingThrow() {
		return savingThrow;
	}

	public Map<Skill, Integer> getSkills() {
		return skills;
	}

	public Integer getArmorClass() {
		return armorClass;
	}

	public Integer getInitiative() {
		return initiative;
	}

	public Speed getSpeed() {
		return speed;
	}

	private void determineSavingThrows() {
		for (var savingThrowProficiency : SavingThrowProficiency.values()) {
			Ability ability = Ability.valueOf(savingThrowProficiency.name());
			Integer abilityScore = this.abilitiesScore.get(ability);

			Set<SavingThrowProficiency> characterSavingThrowProficiency = this.characterClass
					.getSavingThrowProficiencies();

			Integer savingThrowModifier = Ability.getModifier(abilityScore);

			if (characterSavingThrowProficiency.contains(savingThrowProficiency)) {
				savingThrowModifier += this.proficiencyBonus;
			}

			savingThrow.put(savingThrowProficiency, savingThrowModifier);
		}
	}

	private void addRacialAbilitiesScore(Map<Ability, Integer> racialAbilitiesScore) {
		for (Entry<Ability, Integer> racialAbility : racialAbilitiesScore.entrySet()) {
			Integer characterScore = abilitiesScore.get(racialAbility.getKey());
			abilitiesScore.put(racialAbility.getKey(), characterScore + racialAbility.getValue());
		}
	}

}
