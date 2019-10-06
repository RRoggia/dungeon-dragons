package com.rroggia.dnd.classes;

import java.util.Set;

import com.rroggia.dnd.Dice;
import com.rroggia.dnd.proficiency.ArmorProficiency;

public final class Barbarian extends CharacterClass {

	private static final Barbarian INSTANCE = new Barbarian();

	private static final Dice HIT_DICE = Dice.D12;

	private static final Set<ArmorProficiency> ARMOR_PROFICIENCIES = Set.of(ArmorProficiency.LIGHT,
			ArmorProficiency.MEDIUM, ArmorProficiency.SHIELD);

	private Barbarian() {

	}

	public static Barbarian getInstance() {
		return INSTANCE;
	}

	@Override
	public Dice getHitDice() {
		return HIT_DICE;
	}

	@Override
	public Set<ArmorProficiency> getArmorProficiencies() {
		return ARMOR_PROFICIENCIES;
	}

	@Override
	public String toString() {
		return CharClass.BARBARIAN.toString();
	}

}
