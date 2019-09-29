package com.rroggia.dnd.abilityscore;

import java.util.Map;

import com.rroggia.dnd.Ability;

@FunctionalInterface
public interface AbilityDeterminator {

	public Map<Ability, Integer> determineAbilityScore();

}
