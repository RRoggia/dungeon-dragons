package com.rroggia.dungeonsanddragons.racas;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Draconato extends Raca {

	public Draconato() {
		valoresDeHabilidades.put(Habilidades.FORCA, Integer.valueOf(2));
		valoresDeHabilidades.put(Habilidades.CARISMA, Integer.valueOf(1));
	}

	@Override
	protected String getNomeDaRaca() {
		return "Draconato";
	}

}
