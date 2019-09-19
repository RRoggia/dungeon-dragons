package com.rroggia.dnd;

public class Speed {
	private Integer unit;
	private String measurementUnit;

	public Speed(Integer unit, String measurementUnit) {
		super();
		this.unit = unit;
		this.measurementUnit = measurementUnit;
	}

	public Integer getUnit() {
		return unit;
	}

	public String getMeasurementUnit() {
		return measurementUnit;
	}

}
