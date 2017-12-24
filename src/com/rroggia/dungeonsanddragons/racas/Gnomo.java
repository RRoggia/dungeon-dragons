package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Gnomo extends Raca {

	public final static HashMap<Habilidades, Integer> habilidades = new HashMap<>();
	public final static String GNOMO = "Gnomo";

	static {
		habilidades.put(Habilidades.INTELIGENCIA, Integer.valueOf(2));
	}

	@Override
	public String getNomeDaRaca() {
		return GNOMO;
	}

	@Override
	protected HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca() {
		return habilidades;
	}

}
