package com.workouts.corejava;

public class DemoImplementationClass {

	public static void main(String[] args) {
		Demo d = new Demo();
		if(d instanceof DemoMarkerInterface) {
			d.show();
		}

	}

}
