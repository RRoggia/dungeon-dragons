package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public class MeioOrc extends Raca {

	public final static HashMap<Habilidades, Integer> habilidades = new HashMap<>();
	public final static String MEIO_ORC = "Meio Orc";

	static {
		habilidades.put(Habilidades.FORCA, Integer.valueOf(2));
	}

	@Override
	public String getNomeDaRaca() {
		return MEIO_ORC;
	}

	@Override
	protected HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca() {
		return habilidades;
	}

}
