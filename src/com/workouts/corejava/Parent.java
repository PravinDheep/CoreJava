package com.workouts.corejava;

public class Parent{
    protected int num = 1;
    
    Parent(){
        System.out.println("Parent class default constructor.");
    }
    
    Parent(String x){
        System.out.println("Parent class parameterised constructor.");
    }
    
    public void foo(){
        System.out.println("Parent class foo!");
    }
    
    public static void main(String[] args) {
    	Parent p = new Parent();
    	
	}
}