package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Draconato extends Raca {

	public final static HashMap<Habilidades, Integer> habilidades = new HashMap<>();
	public final static String DRACONATO = "Draconato";

	static {
		habilidades.put(Habilidades.FORCA, Integer.valueOf(2));
		habilidades.put(Habilidades.CARISMA, Integer.valueOf(1));
	}

	@Override
	public String getNomeDaRaca() {
		return DRACONATO;
	}

	@Override
	protected HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca() {
		return habilidades;
	}

}
