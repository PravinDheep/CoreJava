package com.workouts.corejava;

import java.util.HashMap;

class Example extends Thread {
	static HashMap<Integer, String> l = new HashMap<Integer, String>();

	public void run() {

		try {
			Thread.sleep(1000);
			// Child thread trying to add
			// new element in the object
			l.put(103, "D");
		} catch (InterruptedException e) {
			System.out.println("Child Thread going to add element");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		l.put(100, "A");
		l.put(101, "B");
		l.put(102, "C");

		for (Object o : l.entrySet()) {
			Object s = o;
			System.out.println(s);
			Thread.sleep(1000);
			Example t = new Example();
			t.start();
		}
		System.out.println(l);
	}
}

/*
 * public class Example extends Thread {
 * 
 * static Map<Integer, String> mapObj = new HashMap<>();
 * 
 * 
 * 
 * 
 * 
 * public void run() { try { Thread.sleep(1000);
 * 
 * mapObj.put(4,"aaaa"); } catch(Exception e) { e.printStackTrace(); } }
 * 
 * public static void main(String[] args) throws InterruptedException {
 * 
 * mapObj.put(1, "asdf"); mapObj.put(2, "ghij"); mapObj.put(3, "klmn"); Example
 * ex = new Example(); ex.start();
 * 
 * for(Object mapVar : mapObj.entrySet()){ Object s = mapVar;
 * 
 * System.out.println(s); Thread.sleep(1000);
 * 
 * try { Thread.sleep(1000); } catch(Exception e) { e.printStackTrace(); }
 * 
 * } System.out.println(mapObj); }
 * 
 * }
 */