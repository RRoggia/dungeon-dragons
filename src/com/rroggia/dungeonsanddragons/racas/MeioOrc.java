package com.rroggia.dungeonsanddragons.racas;

import com.rroggia.dungeonsanddragons.Habilidades;

public class MeioOrc extends Raca {

	public MeioOrc() {
		valoresDeHabilidades.put(Habilidades.FORCA, Integer.valueOf(2));
	}

	@Override
	protected String getNomeDaRaca() {
		return "Meio Orc";
	}

}
