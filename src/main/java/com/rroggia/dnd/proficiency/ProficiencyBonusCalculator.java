package com.rroggia.dnd.proficiency;

import java.util.Objects;

public final class ProficiencyBonusCalculator {
	public static Integer calculateProfiencyBonusForLevel(Integer level) {
		Objects.requireNonNull(level, "Level cannot be null");

		if (level <= 0) {
			throw new RuntimeException("Level cannot be zero or negative");
		} else if (level <= 4) {
			return 2;
		} else if (level <= 8) {
			return 3;
		} else if (level <= 12) {
			return 4;
		} else if (level <= 16) {
			return 5;
		} else {
			return 6;
		}
	}
}
