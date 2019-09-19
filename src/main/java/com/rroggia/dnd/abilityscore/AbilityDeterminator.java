package com.rroggia.dnd.abilityscore;

import java.util.Map;

import com.rroggia.dnd.Ability;

public interface AbilityDeterminator {

	public void determineAbilityScore(Map<Ability, Integer> valoresDeHabilidades);

}
