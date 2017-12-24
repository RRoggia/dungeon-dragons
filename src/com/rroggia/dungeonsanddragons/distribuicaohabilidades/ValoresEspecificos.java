package com.rroggia.dungeonsanddragons.distribuicaohabilidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rroggia.dungeonsanddragons.Habilidades;

public class ValoresEspecificos implements DistribuicaoHabilidades {
	private List<Habilidades> habilidadesEmOrdem;

	public ValoresEspecificos(List<Habilidades> habilidadesEmOrdem) {
		this.habilidadesEmOrdem = habilidadesEmOrdem;
	}

	@Override
	public void determinaValorDeHabilidades(Map<Habilidades, Integer> valoresDeHabilidades) {
		List<Integer> valores = new ArrayList<>();
		valores.add(15);
		valores.add(14);
		valores.add(13);
		valores.add(12);
		valores.add(10);
		valores.add(8);

		if (habilidadesEmOrdem.size() != valores.size())
			throw new IllegalArgumentException("Está faltando habilidades");

		int index = 0;

		for (Habilidades habilidade : habilidadesEmOrdem) {
			valoresDeHabilidades.put(habilidade, valores.get(index));
			index++;
		}

	}

}
