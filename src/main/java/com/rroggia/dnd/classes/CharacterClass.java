package com.rroggia.dnd.classes;

import java.util.Set;

import com.rroggia.dnd.Dice;
import com.rroggia.dnd.proficiency.ArmorProficiency;

public abstract class CharacterClass {

	public abstract Dice getHitDice();

	public abstract Set<ArmorProficiency> getArmorProficiencies();

}
