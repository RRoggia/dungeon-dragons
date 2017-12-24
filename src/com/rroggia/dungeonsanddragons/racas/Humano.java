package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public class Humano extends Raca {

	public final static HashMap<Habilidades, Integer> habilidades = new HashMap<>();
	public final static String HUMANO = "Humano";

	static {
		habilidades.put(Habilidades.FORCA, Integer.valueOf(1));
		habilidades.put(Habilidades.DESTREZA, Integer.valueOf(1));
		habilidades.put(Habilidades.CONSTITUICAO, Integer.valueOf(1));
		habilidades.put(Habilidades.INTELIGENCIA, Integer.valueOf(1));
		habilidades.put(Habilidades.SABEDORIA, Integer.valueOf(1));
		habilidades.put(Habilidades.CARISMA, Integer.valueOf(1));
	}

	@Override
	public String getNomeDaRaca() {
		return HUMANO;
	}

	@Override
	protected HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca() {
		return habilidades;
	}

}
