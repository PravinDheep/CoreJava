package com.workouts.corejava.singleton;

class SingletonEx implements Cloneable{
	private static SingletonEx single_instance;
	
	public String str;
	
	private SingletonEx() {
	    str = "Three objects point to the same memory location on the heap i.e, to the same object.";
	}
	
	public static SingletonEx getInstance(){
	     if(single_instance == null){
	     	single_instance = new SingletonEx();
	     }
	     return single_instance;
	}
}
class SingletonImpl {
    public static void main(String[] args) {
		SingletonEx s1 = SingletonEx.getInstance();
		System.out.println(s1.hashCode());
		
		SingletonEx s2 = SingletonEx.getInstance();
		System.out.println(s2.hashCode());
		
		SingletonEx s3 = SingletonEx.getInstance();
		System.out.println(s3.hashCode());
		
	s2.str = (s2.str).toUpperCase();
	s3.str = (s3.str).toLowerCase();
	System.out.println("s1 value: " + s1.str);  	
	System.out.println("s2 value: " + s2.str);
	System.out.println("s3 value: " + s3.str);	
    }
}
