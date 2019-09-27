package com.rroggia.dnd;

public class Speed {
	private Integer unit;
	private MeasuremementUnit measurementUnit;

	public Speed(Integer unit, MeasuremementUnit measurementUnit) {
		super();
		this.unit = unit;
		this.measurementUnit = measurementUnit;
	}

	public Integer getUnit() {
		return unit;
	}

	public MeasuremementUnit getMeasurementUnit() {
		return measurementUnit;
	}

}
