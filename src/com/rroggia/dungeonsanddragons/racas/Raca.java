package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;

import com.rroggia.dungeonsanddragons.Habilidades;

public abstract class Raca {

	protected abstract HashMap<Habilidades, Integer> getValoresDeHabilidadesEspecificoDaRaca();

	public abstract String getNomeDaRaca();

	public HashMap<Habilidades, Integer> getValoresDeHabilidadesDaRaca() {
		return this.getValoresDeHabilidadesEspecificoDaRaca();
	}

}
