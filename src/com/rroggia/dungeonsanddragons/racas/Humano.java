package com.rroggia.dungeonsanddragons.racas;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Humano extends Raca {

	public Humano() {
		valoresDeHabilidades.put(Habilidades.FORCA, Integer.valueOf(1));
		valoresDeHabilidades.put(Habilidades.DESTREZA, Integer.valueOf(1));
		valoresDeHabilidades.put(Habilidades.CONSTITUICAO, Integer.valueOf(1));
		valoresDeHabilidades.put(Habilidades.INTELIGENCIA, Integer.valueOf(1));
		valoresDeHabilidades.put(Habilidades.SABEDORIA, Integer.valueOf(1));
		valoresDeHabilidades.put(Habilidades.CARISMA, Integer.valueOf(1));
	}

	@Override
	protected String getNomeDaRaca() {
		return "Humano";
	}

}
