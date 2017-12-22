package com.rroggia.dungeonsanddragons.racas;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Halfling extends Raca {

	public Halfling() {
		valoresDeHabilidades.put(Habilidades.DESTREZA, Integer.valueOf(2));
	}

	@Override
	protected String getNomeDaRaca() {
		return "Halfling";
	}

}
