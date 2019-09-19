package com.rroggia.dnd;

public enum Alignment {

	LG("Lawful good"), NG("Neutral good"), CG("Chaotic good"), LN("Lawfull neutral"), N("Neutral"), CN(
			"Chaotic neutral"), LE("Lawfull evil"), NE("Neutral evil"), CE("Chaotic evil");

	private String name;

	private Alignment(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
