package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Halfling extends Raca {

	public final static HashMap<Habilidades, Integer> habilidades = new HashMap<>();
	public final static String HALFLING = "Halfling";

	static {
		habilidades.put(Habilidades.DESTREZA, Integer.valueOf(2));
	}

	@Override
	public String getNomeDaRaca() {
		return HALFLING;
	}

	@Override
	protected HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca() {
		return habilidades;
	}

}
