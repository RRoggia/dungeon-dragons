package com.rroggia.dungeonsanddragons;

import java.util.concurrent.ThreadLocalRandom;

public enum Dados {
	D2(2), D4(4), D6(6), D8(8), D10(10), D12(12), D20(20), D100(100);

	private int valorMaximo;

	private Dados(int valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	public int getValorMaximo() {
		return this.valorMaximo;
	}

	public int rolarNVezes(int vezes) {
		int sum = 0;
		for (int i = 0; i < vezes; i++) {
			sum += this.rolarUmaVez();
		}
		return sum;
	}

	public int rolarUmaVez() {
		return ThreadLocalRandom.current().nextInt(1, valorMaximo + 1);
	}

}
