package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Tiefling extends Raca {

	public final static HashMap<Habilidades, Integer> habilidades = new HashMap<>();
	public final static String TIEFLING = "Tiefling";

	static {
		habilidades.put(Habilidades.INTELIGENCIA, Integer.valueOf(1));
		habilidades.put(Habilidades.CARISMA, Integer.valueOf(1));
	}

	@Override
	public String getNomeDaRaca() {
		return "Tiefling";
	}

	@Override
	protected HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca() {
		return habilidades;
	}
}
