package com.rroggia.dungeonsanddragons.racas;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Elfo extends Raca {

	public Elfo() {
		valoresDeHabilidades.put(Habilidades.DESTREZA, Integer.valueOf(2));
	}

	@Override
	protected String getNomeDaRaca() {
		return "Elfo";
	}

}
