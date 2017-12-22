package com.rroggia.dungeonsanddragons.racas;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Anao extends Raca {

	public Anao() {
		valoresDeHabilidades.put(Habilidades.CONSTITUICAO, Integer.valueOf(2));
	}

	@Override
	protected String getNomeDaRaca() {
		return "Anão";
	}

}
