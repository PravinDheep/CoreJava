package com.workouts.java8.lambdas.BasicFunctionalInterfaces;

@FunctionalInterface
public interface Function<T, R> {
	R apply(T t);
}
