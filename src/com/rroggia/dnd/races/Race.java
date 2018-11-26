package com.rroggia.dnd.races;

import java.util.HashMap;
import java.util.List;

import com.rroggia.dnd.Ability;
import com.rroggia.dnd.Alignment;
import com.rroggia.dnd.CreatureSize;
import com.rroggia.dnd.Language;
import com.rroggia.dnd.Speed;

public abstract class Race {

	public abstract String getName();

	public abstract List<String> getMaleNames();

	public abstract List<String> getFemaleNames();

	public abstract HashMap<Ability, Integer> getAbilitiesScore();

	public abstract int getAdultAge();

	public abstract int getExpectedLifespan();

	public abstract List<Alignment> getAlignments();

	public abstract CreatureSize getSize();

	public abstract Speed getSpeed();

	public abstract List<Language> getLanguages();

}
