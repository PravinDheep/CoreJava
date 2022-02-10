package com.workouts.java8.lambdas.BasicFunctionalInterfaces;

@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
}
