package com.rroggia.dungeonsanddragons;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.rroggia.dungeonsanddragons.classes.Classe;
import com.rroggia.dungeonsanddragons.distribuicaohabilidades.DistribuicaoHabilidades;
import com.rroggia.dungeonsanddragons.racas.Raca;

public class Personagem {

	private String nome;
	private Raca raca;
	private Classe classe;
	private int nivel;
	private int pontosDeExperiencia;
	private Dados dadoDeVida;

	private Map<Habilidades, Integer> valoresDeHabilidades = new HashMap<>();
	private int pontosDeVidaTotais;

	private int deslocamento;
	private List<Linguas> linguasConhecidas;

	public Personagem(Raca raca, DistribuicaoHabilidades habilidades) {
		this.raca = raca;
		habilidades.determinaValorDeHabilidades(this.valoresDeHabilidades);
		this.adicionaValoresDeHabilidadeDaRaca(this.raca.getValoresDeHabilidadesDaRaca());
		this.setPontosDeVidaTotais();
	}

	private void adicionaValoresDeHabilidadeDaRaca(HashMap<Habilidades, Integer> valoresDeHabilidadesDaRaca) {
		for (Entry<Habilidades, Integer> habilidadeDaRaca : valoresDeHabilidadesDaRaca.entrySet()) {
			Integer valorDoPersonagem = valoresDeHabilidades.get(habilidadeDaRaca.getKey());
			valoresDeHabilidades.put(habilidadeDaRaca.getKey(), valorDoPersonagem + habilidadeDaRaca.getValue());
		}
	}

	private void setPontosDeVidaTotais() {
		this.pontosDeVidaTotais = Habilidades.getModificadorDeHabilidade(
				valoresDeHabilidades.get(Habilidades.CONSTITUICAO)) + Dados.D6.getValorMaximo();
	}

	public String getNomeDaRaca() {
		return this.raca.getNomeDaRaca();
	}

	public int getPontosDeVidaTotais() {
		return this.pontosDeVidaTotais;
	}

	public Map<Habilidades, Integer> getValoresDeHabilidades() {
		return valoresDeHabilidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
