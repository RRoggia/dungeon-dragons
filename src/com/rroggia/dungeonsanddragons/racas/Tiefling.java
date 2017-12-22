package com.rroggia.dungeonsanddragons.racas;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Tiefling extends Raca {

	public Tiefling() {
		valoresDeHabilidades.put(Habilidades.INTELIGENCIA, Integer.valueOf(1));
		valoresDeHabilidades.put(Habilidades.CARISMA, Integer.valueOf(1));
	}

	@Override
	protected String getNomeDaRaca() {
		return "Tiefling";
	}
}
