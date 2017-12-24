package com.rroggia.dungeonsanddragons.distribuicaohabilidades;

import java.util.Map;

import com.rroggia.dungeonsanddragons.Dados;
import com.rroggia.dungeonsanddragons.Habilidades;

public class Randomica implements DistribuicaoHabilidades {

	@Override
	public void determinaValorDeHabilidades(Map<Habilidades, Integer> valoresDeHabilidades) {
		for (Habilidades habilidade : Habilidades.values()) {
			int primeiro = 0;
			int segundo = 0;
			int terceiro = 0;

			for (int i = 0; i < 4; i++) {
				int resultado = Dados.D6.rolarUmaVez();

				if (terceiro < resultado) {
					if (segundo <= resultado) {
						if (primeiro <= resultado) {
							terceiro = segundo;
							segundo = primeiro;
							primeiro = resultado;
						} else {
							terceiro = segundo;
							segundo = resultado;
						}
					} else {
						terceiro = resultado;
					}
				}

			}
			valoresDeHabilidades.put(habilidade, primeiro + segundo + terceiro);
		}
	}
}
