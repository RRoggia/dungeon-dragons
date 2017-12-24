package com.rroggia.dungeonsanddragons.output;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.rroggia.dungeonsanddragons.Habilidades;
import com.rroggia.dungeonsanddragons.Personagem;
import com.rroggia.dungeonsanddragons.racas.Anao;
import com.rroggia.dungeonsanddragons.racas.Draconato;
import com.rroggia.dungeonsanddragons.racas.Elfo;
import com.rroggia.dungeonsanddragons.racas.Gnomo;
import com.rroggia.dungeonsanddragons.racas.Halfling;
import com.rroggia.dungeonsanddragons.racas.Humano;
import com.rroggia.dungeonsanddragons.racas.MeioElfo;
import com.rroggia.dungeonsanddragons.racas.MeioOrc;
import com.rroggia.dungeonsanddragons.racas.Tiefling;

public class EscritorNoConsole {

	public static void imprimeSumarioValoresDeHabilidadesDeTodasRacas() {
		imprimeValoresDeHabilidades(Anao.habilidades, Anao.ANAO);
		imprimeValoresDeHabilidades(Draconato.habilidades, Draconato.DRACONATO);
		imprimeValoresDeHabilidades(Elfo.habilidades, Elfo.ELFO);
		imprimeValoresDeHabilidades(Gnomo.habilidades, Gnomo.GNOMO);
		imprimeValoresDeHabilidades(Halfling.habilidades, Halfling.HALFLING);
		imprimeValoresDeHabilidades(Humano.habilidades, Humano.HUMANO);
		imprimeValoresDeHabilidades(MeioElfo.habilidades, MeioElfo.MEIO_ELFO);
		imprimeValoresDeHabilidades(MeioOrc.habilidades, MeioOrc.MEIO_ORC);
		imprimeValoresDeHabilidades(Tiefling.habilidades, Tiefling.TIEFLING);
	}

	public static void imprimeFicha(Personagem personagem) {
		System.out.println("Nome: " + personagem.getNome());
		System.out.println("Raça: " + personagem.getNomeDaRaca());
		System.out.println("Pontos de vidas Totais: " + personagem.getPontosDeVidaTotais());

		imprimeValoresDeHabilidadeEModificadoresDePersonagem(personagem.getValoresDeHabilidades());

	}

	private static void imprimeValoresDeHabilidadeEModificadoresDePersonagem(
			Map<Habilidades, Integer> valoresDeHabilidades) {
		System.out.println("Habilidades:");
		System.out.println("-----");
		for (Entry<Habilidades, Integer> entrada : valoresDeHabilidades.entrySet()) {
			System.out.println("Habilidade: " + entrada.getKey().toString());
			System.out.println("Valor: " + entrada.getValue());
			System.out.println("Modificador: " + Habilidades.getModificadorDeHabilidade(entrada.getValue()));
		}
		System.out.println();
	}

	private static void imprimeValoresDeHabilidades(HashMap<Habilidades, Integer> valoresDeHabilidades,
			String nomeDaClasse) {

		System.out.println("Habilidades de " + nomeDaClasse + ":");
		System.out.println("-----");
		for (Entry<Habilidades, Integer> entrada : valoresDeHabilidades.entrySet()) {
			System.out.println("Habilidade: " + entrada.getKey().toString());
			System.out.println("Valor: " + entrada.getValue());
		}
		System.out.println();
	}

}
