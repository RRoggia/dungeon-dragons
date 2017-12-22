package com.rroggia.dungeonsanddragons.racas;

import com.rroggia.dungeonsanddragons.Habilidades;

public class MeioElfo extends Raca {

	public MeioElfo() {
		valoresDeHabilidades.put(Habilidades.CARISMA, Integer.valueOf(2));
	}

	@Override
	protected String getNomeDaRaca() {
		return "Meio Elfo";
	}

}
