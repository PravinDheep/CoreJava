package com.workouts.java8.behavioralparameterization;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
			return (apple.getWeight() > 150);
	}
}
