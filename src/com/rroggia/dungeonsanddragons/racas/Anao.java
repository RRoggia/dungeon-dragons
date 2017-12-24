package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public final class Anao extends Raca {

	public final static HashMap<Habilidades, Integer> habilidades = new HashMap<>();
	public final static String ANAO = "Anão";

	static {
		habilidades.put(Habilidades.CONSTITUICAO, Integer.valueOf(2));
	}

	@Override
	public String getNomeDaRaca() {
		return ANAO;
	}

	@Override
	protected HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca() {
		return habilidades;

	}

}
