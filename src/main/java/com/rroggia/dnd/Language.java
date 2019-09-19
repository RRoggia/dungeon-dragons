package com.rroggia.dnd;

import java.util.Arrays;
import java.util.List;

public enum Language {

	COMMON("Common", Arrays.asList(new String[] { "Human" }), "Common"), 
	DWARVISH("Dwarvish", Arrays.asList(new String[] { "Dwarves" }), "Dwarvish"),
	ELVISH("Elvish", Arrays.asList(new String[] { "Elves" }), "Elvish"), 
	GIANT("Giant", Arrays.asList(new String[] { "Ogres", "Giants" }), "Dwarvish"), 
	GNOMISH("Gnomish", Arrays.asList(new String[] { "Gnomes" }), "Dwarvish"), 
	GOBLIN("Goblin", Arrays.asList(new String[] { "Goblinoides" }), "Dwarvish"), 
	HALFLING("Halfling", Arrays.asList(new String[] { "Halflings" }), "Common"), 
	ORC("Orc", Arrays.asList(new String[] { "Orcs" }), "Dwarvish"), 
	ABYSSAL("Abyssal", Arrays.asList(new String[] { "Demons" }), "Infernal"),
	CELESTIAL("Celestial", Arrays.asList(new String[] { "Celestials" }), "Celestial"),
	DEEP_SPEECH("Deep speech", Arrays.asList(new String[] { "Mind flayers", "beholders" }), null), 
	DRACONIC("Draconic", Arrays.asList(new String[] { "Dragons", "Dragonborn" }), "Draconic"),
	INFERNAL("Infernal", Arrays.asList(new String[] { "Devils" }), "Infernal"), 
	PRIMORDIAL("Primordial", Arrays.asList(new String[] { "Elementals" }), "Dwarvish"), 
	SYLVAN("Sylvan", Arrays.asList(new String[] { "Fey creatures" }), "Elvish"), 
	UNDERCOMMON("Undercommon", Arrays.asList(new String[] { "Underdark traders" }), "Elvish");

	private Language(String name, List<String> typicalSpeakers, String script) {

	}

}
