package com.rroggia.dungeonsanddragons.distribuicaohabilidades;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.rroggia.dungeonsanddragons.Habilidades;

public class ValoresPersonalizados implements DistribuicaoHabilidades {

	private static Map<Integer, Integer> valorCustoHabilidade = new HashMap<>();
	private Map<Habilidades, Integer> valoresComprados = new HashMap<>();
	private int pontosASerGasto = 27;

	static {
		valorCustoHabilidade.put(8, 0);
		valorCustoHabilidade.put(9, 1);
		valorCustoHabilidade.put(10, 2);
		valorCustoHabilidade.put(11, 3);
		valorCustoHabilidade.put(12, 4);
		valorCustoHabilidade.put(13, 5);
		valorCustoHabilidade.put(14, 7);
		valorCustoHabilidade.put(15, 9);
	}

	public void compraValorDeHabilidade(int valorDaHabilidade, Habilidades habilidade) {
		if (valorDaHabilidade < 8 || valorDaHabilidade > 15)
			throw new IllegalArgumentException("Valor de habilidade não é válido");

		Integer custoDaHabilidade = valorCustoHabilidade.get(valorDaHabilidade);

		if (pontosASerGasto < custoDaHabilidade)
			throw new IllegalArgumentException("Somente " + pontosASerGasto + " pontos a ser gastos restantes.");

		pontosASerGasto -= custoDaHabilidade;
		valoresComprados.put(habilidade, valorDaHabilidade);
	}

	@Override
	public void determinaValorDeHabilidades(Map<Habilidades, Integer> valoresDeHabilidades) {
		for (Habilidades habilidade : Habilidades.values()) {
			int valorDaHabilidade = 8;
			if (valoresComprados.containsKey(habilidade))
				valorDaHabilidade = valoresComprados.get(habilidade);

			valoresDeHabilidades.put(habilidade, valorDaHabilidade);
		}
	}

	public static void imprimeValoresECustosDeHabilidades() {
		System.out.println("Valores Personalizados:");
		System.out.println("-----");
		for (Entry<Integer, Integer> valorCusto : valorCustoHabilidade.entrySet()) {
			System.out.println("Valor:" + valorCusto.getKey());
			System.out.println("Custo:" + valorCusto.getValue());
		}
		System.out.println();
	}
}
