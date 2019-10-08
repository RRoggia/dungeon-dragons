package com.rroggia.dnd.classes;

import java.util.Set;

import com.rroggia.dnd.Dice;
import com.rroggia.dnd.proficiency.ArmorProficiency;
import com.rroggia.dnd.proficiency.SavingThrowProficiency;

public abstract class CharacterClass {

	public abstract Dice getHitDice();

	public abstract Set<ArmorProficiency> getArmorProficiencies();

	public abstract Set<SavingThrowProficiency> getSavingThrowProficiencies();

}
