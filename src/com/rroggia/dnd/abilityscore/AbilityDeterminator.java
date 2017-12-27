package com.rroggia.dnd.abilityscore;

import java.util.Map;

import com.rroggia.dnd.Abilities;

public interface AbilityDeterminator {

	public void determineAbilityScore(Map<Abilities, Integer> valoresDeHabilidades);

}
