package com.workouts.corejavatelusko;

class DemoWithoutPublic {
	/* Since Demo class is not public, the file name can vary and can be complied as well as run, 
	 * but if the Demo class is declared with public keyword, then the file name should be same 
	 * as the classname, otherwise it will not compile itself.
	 */
	public static void main(String[] args) {
		
		int i = 0B10100_00_000; //0B or 0b, underscores introduced in java7.
		// Binary to Int
		System.out.println("Hello World: \t" + i);
	}
}