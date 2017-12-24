package com.rroggia.dungeonsanddragons;

import java.util.HashMap;
import java.util.Map;

public enum Habilidades {

	FORCA, DESTREZA, CONSTITUICAO, INTELIGENCIA, SABEDORIA, CARISMA;

	public static Integer getModificadorDeHabilidade(Integer valorDaHabilidade) {
		return (valorDaHabilidade - 10) / 2;
	}

	public static Map<Habilidades, Integer> getModificadorDeHabilidade(Map<Habilidades, Integer> valoresDeHabilidades) {
		HashMap<Habilidades, Integer> modificadoresDeHabilidades = new HashMap<>();

		for (Habilidades habilidade : valoresDeHabilidades.keySet()) {
			modificadoresDeHabilidades.put(habilidade,
					getModificadorDeHabilidade(valoresDeHabilidades.get(habilidade)));
		}

		return modificadoresDeHabilidades;
	}
}
