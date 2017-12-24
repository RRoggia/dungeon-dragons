package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Elfo extends Raca {

	public final static HashMap<Habilidades, Integer> habilidades = new HashMap<>();
	public final static String ELFO = "Elfo";

	static {
		habilidades.put(Habilidades.DESTREZA, Integer.valueOf(2));
	}

	@Override
	public String getNomeDaRaca() {
		return ELFO;
	}

	@Override
	protected HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca() {
		return habilidades;
	}

}
