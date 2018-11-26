package com.rroggia.dnd;

public enum CreatureSize {
	TINY(2.5, "Feet"), SMALL(5, "Feet"), MEDIUM(5, "Feet"), LARGE(10, "Feet"), HUGE(15, "Feet"), GARGANTUAN(20, "Feet");

	private Double space;
	private String measurementUnit;

	private CreatureSize(double space, String measurementUnit) {
		this.space = space;
		this.measurementUnit = measurementUnit;
	}

	public Double getSpace() {
		return space;
	}

	public String getMeasurementUnit() {
		return this.measurementUnit;
	}

}
