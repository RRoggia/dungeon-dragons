package com.rroggia.dungeonsanddragons.racas;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Gnomo extends Raca {

	public Gnomo() {
		valoresDeHabilidades.put(Habilidades.INTELIGENCIA, Integer.valueOf(2));
	}

	@Override
	protected String getNomeDaRaca() {
		return "Gnomo";
	}

}
