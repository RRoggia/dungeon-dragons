package com.rroggia.dungeonsanddragons;

import java.util.ArrayList;
import java.util.List;

import com.rroggia.dungeonsanddragons.distribuicaohabilidades.Randomica;
import com.rroggia.dungeonsanddragons.distribuicaohabilidades.ValoresEspecificos;
import com.rroggia.dungeonsanddragons.distribuicaohabilidades.ValoresPersonalizados;
import com.rroggia.dungeonsanddragons.output.EscritorNoConsole;
import com.rroggia.dungeonsanddragons.racas.Elfo;
import com.rroggia.dungeonsanddragons.racas.Humano;
import com.rroggia.dungeonsanddragons.racas.MeioElfo;

public class Main {

	public static void main(String[] args) {
		List<Habilidades> ordem = new ArrayList<Habilidades>();
		ordem.add(Habilidades.FORCA);
		ordem.add(Habilidades.CONSTITUICAO);
		ordem.add(Habilidades.INTELIGENCIA);
		ordem.add(Habilidades.DESTREZA);
		ordem.add(Habilidades.CARISMA);
		ordem.add(Habilidades.SABEDORIA);

		Personagem reginaldo = new Personagem(new Elfo(), new ValoresEspecificos(ordem));
		reginaldo.setNome("regi");
		EscritorNoConsole.imprimeFicha(reginaldo);

		Personagem pedroHenrique = new Personagem(new Humano(), new Randomica());
		EscritorNoConsole.imprimeFicha(pedroHenrique);

		ValoresPersonalizados valoresPersonalizados = new ValoresPersonalizados();
		valoresPersonalizados.compraValorDeHabilidade(14, Habilidades.FORCA);
		valoresPersonalizados.compraValorDeHabilidade(14, Habilidades.DESTREZA);
		valoresPersonalizados.compraValorDeHabilidade(14, Habilidades.CARISMA);
		valoresPersonalizados.compraValorDeHabilidade(9, Habilidades.CONSTITUICAO);
		valoresPersonalizados.compraValorDeHabilidade(9, Habilidades.SABEDORIA);
		valoresPersonalizados.compraValorDeHabilidade(9, Habilidades.INTELIGENCIA);

		Personagem breno = new Personagem(new MeioElfo(), valoresPersonalizados);
		EscritorNoConsole.imprimeFicha(breno);

		EscritorNoConsole.imprimeSumarioValoresDeHabilidadesDeTodasRacas();

	}

}
