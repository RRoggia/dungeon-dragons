package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public class MeioElfo extends Raca {

	public final static HashMap<Habilidades, Integer> habilidades = new HashMap<>();
	public final static String MEIO_ELFO = "Meio Elfo";

	static {
		habilidades.put(Habilidades.CARISMA, Integer.valueOf(2));
	}

	@Override
	public String getNomeDaRaca() {
		return MEIO_ELFO;
	}

	@Override
	protected HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca() {
		return habilidades;
	}

}
