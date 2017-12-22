package com.rroggia.dungeonsanddragons.racas;

import java.util.HashMap;
import java.util.Map.Entry;

import com.rroggia.dungeonsanddragons.Habilidades;

public abstract class Raca {
	protected HashMap<Habilidades, Integer> valoresDeHabilidades = new HashMap<>();

	protected abstract String getNomeDaRaca();

	public void imprimeSumarioValoresDeHabilidadesDaRaca() {

		System.out.println(getNomeDaRaca());
		System.out.println("-----");
		for (Entry<Habilidades, Integer> entrada : valoresDeHabilidades.entrySet()) {
			System.out.println("Habilidade: " + entrada.getKey().toString());
			System.out.println("Valor: " + entrada.getValue());
		}
		System.out.println();
	}

	public static void imprimeSumarioValoresDeHabilidadesDeTodasRacas() {

		new Anao().imprimeSumarioValoresDeHabilidadesDaRaca();

		new Draconato().imprimeSumarioValoresDeHabilidadesDaRaca();

		new Elfo().imprimeSumarioValoresDeHabilidadesDaRaca();

		new Gnomo().imprimeSumarioValoresDeHabilidadesDaRaca();

		new Halfling().imprimeSumarioValoresDeHabilidadesDaRaca();

		new Humano().imprimeSumarioValoresDeHabilidadesDaRaca();

		new MeioElfo().imprimeSumarioValoresDeHabilidadesDaRaca();

		new MeioOrc().imprimeSumarioValoresDeHabilidadesDaRaca();

		new Tiefling().imprimeSumarioValoresDeHabilidadesDaRaca();

	}
}
