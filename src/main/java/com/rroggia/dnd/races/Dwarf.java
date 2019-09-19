package com.rroggia.dnd.races;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.rroggia.dnd.Ability;
import com.rroggia.dnd.Alignment;
import com.rroggia.dnd.CreatureSize;
import com.rroggia.dnd.Language;
import com.rroggia.dnd.Speed;

public final class Dwarf extends Race {

	public final static String DWARF = "Dwarf";

	private final static HashMap<Ability, Integer> ABILITIES_SCORE = new HashMap<>();
	private final static List<String> MALE_NAMES = new ArrayList<>();
	private final static List<String> FEMALE_NAMES = new ArrayList<>();
	private final static List<Alignment> ALIGNMENTS = new ArrayList<>();
	private final static Speed SPEED = new Speed(25, "Feet");
	private final static List<Language> LANGUAGES = new ArrayList<>();
	private final static List<String> CLAN_NAMES = new ArrayList<>();

	static {
		ABILITIES_SCORE.put(Ability.CONSTITUITION, Integer.valueOf(2));
		addMaleNames();
		addFemaleNames();
		addClanNames();
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
	public HashMap<Ability, Integer> getAbilitiesScore() {
		return ABILITIES_SCORE;

	}

	@Override
	public int getAdultAge() {
		return 50;
	}

	@Override
	public int getExpectedLifespan() {
		return 350;
	}

	@Override
	public List<Alignment> getAlignments() {
		ALIGNMENTS.add(Alignment.LG);
		ALIGNMENTS.add(Alignment.LN);
		ALIGNMENTS.add(Alignment.NG);
		return ALIGNMENTS;
	}

	@Override
	public CreatureSize getSize() {
		return CreatureSize.MEDIUM;
	}

	@Override
	public Speed getSpeed() {
		return SPEED;
	}

	@Override
	public List<Language> getLanguages() {
		LANGUAGES.add(Language.COMMON);
		LANGUAGES.add(Language.DWARVISH);
		return null;
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

	private static void addMaleNames() {
		MALE_NAMES.add("Adrik");
		MALE_NAMES.add("Alberich");
		MALE_NAMES.add("Baern");
		MALE_NAMES.add("Barendd");
		MALE_NAMES.add("Brottor");
		MALE_NAMES.add("Bruenor");
		MALE_NAMES.add("Dain");
		MALE_NAMES.add("Darrak");
		MALE_NAMES.add("Delg");
		MALE_NAMES.add("Eberk");
		MALE_NAMES.add("Einkil");
		MALE_NAMES.add("Fargrim");
		MALE_NAMES.add("Flint");
		MALE_NAMES.add("Gardain");
		MALE_NAMES.add("Harbek");
		MALE_NAMES.add("Kildrak");
		MALE_NAMES.add("Morgan");
		MALE_NAMES.add("Orsik");
		MALE_NAMES.add("Oskar");
		MALE_NAMES.add("Rangrim");
		MALE_NAMES.add("Rurik");
		MALE_NAMES.add("Taklinn");
		MALE_NAMES.add("Thoradin");
		MALE_NAMES.add("Thorin");
		MALE_NAMES.add("Tordek");
		MALE_NAMES.add("Traubon");
		MALE_NAMES.add("Travok");
		MALE_NAMES.add("Ulfgar");
		MALE_NAMES.add("Veit");
		MALE_NAMES.add("Vondal");
	}

	private static void addFemaleNames() {
		FEMALE_NAMES.add("Amber");
		FEMALE_NAMES.add("Artin");
		FEMALE_NAMES.add("Audhild");
		FEMALE_NAMES.add("Bardryn");
		FEMALE_NAMES.add("Dagnal");
		FEMALE_NAMES.add("Diesa");
		FEMALE_NAMES.add("Eldeth");
		FEMALE_NAMES.add("Falkrunn");
		FEMALE_NAMES.add("Finellen");
		FEMALE_NAMES.add("Gunnloda");
		FEMALE_NAMES.add("Gurdis");
		FEMALE_NAMES.add("Helja");
		FEMALE_NAMES.add("Hlin");
		FEMALE_NAMES.add("Kathra");
		FEMALE_NAMES.add("Kristryd");
		FEMALE_NAMES.add("Ilde");
		FEMALE_NAMES.add("Liftrasa");
		FEMALE_NAMES.add("Mardred");
		FEMALE_NAMES.add("Riswynn");
		FEMALE_NAMES.add("Sannl");
		FEMALE_NAMES.add("Torbera");
		FEMALE_NAMES.add("Torgga");
		FEMALE_NAMES.add("Vistra");
	}

	private static void addClanNames() {
		CLAN_NAMES.add("Balderk");
		CLAN_NAMES.add("Battlehammer");
		CLAN_NAMES.add("Brawnanvil");
		CLAN_NAMES.add("Dankil");
		CLAN_NAMES.add("Fireforge");
		CLAN_NAMES.add("Frostbeard");
		CLAN_NAMES.add("Gorunn");
		CLAN_NAMES.add("Holderhek");
		CLAN_NAMES.add("Ironfist");
		CLAN_NAMES.add("Lorderr");
		CLAN_NAMES.add("Lutgehr");
		CLAN_NAMES.add("Rumnaheim");
		CLAN_NAMES.add("Strakeln");
		CLAN_NAMES.add("Torunn");
		CLAN_NAMES.add("Ungart");
	}

}
