package com.rroggia.dnd.proficiency;

import java.util.List;

public enum Language {

	COMMON("Common", List.of("Human"), "Common"), DWARVISH("Dwarvish", List.of("Dwarves"), "Dwarvish"),
	ELVISH("Elvish", List.of("Elves"), "Elvish"), GIANT("Giant", List.of("Ogres", "Giants"), "Dwarvish"),
	GNOMISH("Gnomish", List.of("Gnomes"), "Dwarvish"), GOBLIN("Goblin", List.of("Goblinoides"), "Dwarvish"),
	HALFLING("Halfling", List.of("Halflings"), "Common"), ORC("Orc", List.of("Orcs"), "Dwarvish"),
	ABYSSAL("Abyssal", List.of("Demons"), "Infernal"), CELESTIAL("Celestial", List.of("Celestials"), "Celestial"),
	DEEP_SPEECH("Deep speech", List.of("Mind flayers", "beholders"), null),
	DRACONIC("Draconic", List.of("Dragons", "Dragonborn"), "Draconic"),
	INFERNAL("Infernal", List.of("Devils"), "Infernal"), PRIMORDIAL("Primordial", List.of("Elementals"), "Dwarvish"),
	SYLVAN("Sylvan", List.of("Fey creatures"), "Elvish"),
	UNDERCOMMON("Undercommon", List.of("Underdark traders"), "Elvish");

	private Language(String name, List<String> typicalSpeakers, String script) {

	}

}
