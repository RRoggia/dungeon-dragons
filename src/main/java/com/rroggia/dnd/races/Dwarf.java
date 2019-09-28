package com.rroggia.dnd.races;

import java.util.List;
import java.util.Map;

import com.rroggia.dnd.Ability;
import com.rroggia.dnd.Alignment;
import com.rroggia.dnd.CreatureSize;
import com.rroggia.dnd.Language;
import com.rroggia.dnd.MeasuremementUnit;
import com.rroggia.dnd.Speed;

public final class Dwarf extends Race {

	private final static Dwarf INSTANCE = new Dwarf();

	public final static String DWARF = "Dwarf";

	private final static Map<Ability, Integer> ABILITIES_SCORE = Map.of(Ability.CONSTITUITION, Integer.valueOf(2));

	private static final int AGE = 50;

	private static final int LIFESPAN = 350;

	private static final CreatureSize CREATURE_SIZE = CreatureSize.MEDIUM;

	private final static Speed SPEED = new Speed(25, MeasuremementUnit.FEET);

	private final static List<Language> LANGUAGES = List.of(Language.COMMON, Language.DWARVISH);

	private final static List<Alignment> ALIGNMENTS = List.of(Alignment.LG, Alignment.LN, Alignment.NG);

	private final static List<String> MALE_NAMES = List.of("Adrik", "Alberich", "Baern", "Barendd", "Brottor",
			"Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek", "Kildrak",
			"Morgan", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek", "Traubon",
			"Travok", "Ulfgar", "Veit", "Vondal");

	private final static List<String> FEMALE_NAMES = List.of("Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa",
			"Eldeth", "Falkrunn", "Finellen", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde",
			"Liftrasa", "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra");

	private final static List<String> CLAN_NAMES = List.of("Balderk", "Battlehammer", "Brawnanvil", "Dankil",
			"Fireforge", "Frostbeard", "Gorunn", "Holderhek", "Ironfist", "Lorderr", "Lutgehr", "Rumnaheim", "Strakeln",
			"Torunn", "Ungart");

	public static Dwarf getInstance() {
		return INSTANCE;
	}

	private Dwarf() {

	}

	@Override
	public String getName() {
		return DWARF;
	}

	@Override
	public List<String> getMaleNames() {
		return MALE_NAMES;
	}

	@Override
	public List<String> getFemaleNames() {
		return FEMALE_NAMES;
	}

	@Override
	public Map<Ability, Integer> getAbilitiesScore() {
		return ABILITIES_SCORE;
	}

	@Override
	public int getAdultAge() {
		return AGE;
	}

	@Override
	public int getExpectedLifespan() {
		return LIFESPAN;
	}

	@Override
	public List<Alignment> getAlignments() {
		return ALIGNMENTS;
	}

	@Override
	public CreatureSize getSize() {
		return CREATURE_SIZE;
	}

	@Override
	public Speed getSpeed() {
		return SPEED;
	}

	@Override
	public List<Language> getLanguages() {
		return LANGUAGES;
	}

	public List<String> getClanNames() {
		return CLAN_NAMES;
	}

	public void darkvision() {
		// todo p.20
	}

	public void dwarvenResiliance() {
		// todo p.20
	}

	public void dwarvenCombatTraining() {
		// todo p.20
	}

	public void toolsProficiency() {
		// todo p.20
	}

	public void stonecunning() {
		// todo p.20
	}

}
