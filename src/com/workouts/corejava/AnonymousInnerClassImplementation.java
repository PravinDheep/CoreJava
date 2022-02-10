package com.workouts.corejava;

public class AnonymousInnerClassImplementation {

	public static void main(String[] args) {
		AnonymousExample ae = new  AnonymousExample() {
			void show() {
				System.out.println("I am(AnonymousExample) inside AnonymousInnerClassImplementation");
			}
		};
		ae.show();
		// Instead of method overriding concept, we use this.
	}

}
