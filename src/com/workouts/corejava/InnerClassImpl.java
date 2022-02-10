package com.workouts.corejava;

import com.workouts.corejava.InnerClass.InnerClassSubClass;

public class InnerClassImpl {

	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		InnerClass.InnerClassSubClass ii = ic.new InnerClassSubClass();
		//InnerClassSubClass ii = ic.new InnerClassSubClass();
		System.out.println(ii.j + ">>>" + ic.i);
		
		// Try the same with static class, if its static then you can do like this
		// InnerClass.InnerClassSubClass ii = new InnerClass.InnerClassSubClass();
		// no need of object reference.
		
	}

}
