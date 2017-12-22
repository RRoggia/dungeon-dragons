package com.rroggia.dungeonsanddragons;

import com.rroggia.dungeonsanddragons.racas.Humano;
import com.rroggia.dungeonsanddragons.racas.Raca;

public class Main {

	public static void main(String[] args) {

		Raca raca = new Humano();
		raca.imprimeSumarioValoresDeHabilidadesDaRaca();

		Raca.imprimeSumarioValoresDeHabilidadesDeTodasRacas();

		Dados.D6.rolarNVezes(3);

	}

}
