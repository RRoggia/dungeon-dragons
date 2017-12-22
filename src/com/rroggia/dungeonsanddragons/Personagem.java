package com.rroggia.dungeonsanddragons;

import java.util.HashMap;
import java.util.List;

import com.rroggia.dungeonsanddragons.classes.Classe;
import com.rroggia.dungeonsanddragons.racas.Raca;

public class Personagem {

	private Raca raca;
	private Classe classe;
	private int nivel;
	private int pontosDeExperiencia;
	private Dados dadoDeVida;

	private HashMap<Habilidades, Integer> valoresDeHabilidades = new HashMap<>();
	private int modificadorConstituicao = 0;

	private int pontosDeVida = modificadorConstituicao + Dados.D6.getValorMaximo();

	private int deslocamento;
	private List<Linguas> linguasConhecidas;

}
