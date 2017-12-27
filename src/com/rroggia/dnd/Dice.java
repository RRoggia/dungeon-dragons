package com.rroggia.dnd;

import java.util.concurrent.ThreadLocalRandom;

public enum Dice {
	D2(2), D4(4), D6(6), D8(8), D10(10), D12(12), D20(20), D100(100);

	private int higherResult;

	private Dice(int higherResult) {
		this.higherResult = higherResult;
	}

	public int getHigherResult() {
		return this.higherResult;
	}

	public int roll(int times) {
		int sum = 0;
		for (int i = 0; i < times; i++) {
			sum += this.roll();
		}
		return sum;
	}

	public int roll() {
		return ThreadLocalRandom.current().nextInt(1, higherResult + 1);
	}

}
