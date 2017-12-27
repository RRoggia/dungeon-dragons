package com.rroggia.dnd.races;

import java.util.HashMap;

import com.rroggia.dnd.Abilities;

public abstract class Race {

	protected abstract HashMap<Abilities, Integer> getRacialAbilitiesScore();

	public abstract String getRaceName();

	public HashMap<Abilities, Integer> getAbilitiesScore() {
		return this.getRacialAbilitiesScore();
	}

}
