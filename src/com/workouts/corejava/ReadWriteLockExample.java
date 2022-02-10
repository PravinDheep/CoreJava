package com.workouts.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteLockExample<O> {

	
		final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		
		final Lock writeLock  = readWriteLock.writeLock();
		
		final Lock readLock = readWriteLock.readLock();
		
		final List<O> list = new ArrayList<>();

		// setElement function sets
	    // i.e., write the element to the thread
	    public void setElement(O o)
	    {
	        // acquire the thread for writing
	        writeLock.lock();
	        try {
	            list.add(o);
	            System.out.println(
	                "Element by thread "
	                + Thread.currentThread().getName()
	                + " is added");
	        }
	        finally {
	            // To unlock the acquired write thread
	            writeLock.unlock();
	        }
	    }
	    
	    public O getElement(int i) {
	    	readLock.lock();
	    	try {
	    		System.out.println("Element by thread " + Thread.currentThread().getName() + " is printed");
	    		return list.get(i);
	    	}
	    	finally {
	    		readLock.unlock();
	    	}	    	
	    }
	    
	    public static void main(String[] args) {
	    	ReadWriteLockExample<String> rwle = new ReadWriteLockExample<>();
	    	rwle.setElement("hi");
	    	rwle.setElement("hey");
	    	rwle.setElement("hello");
	    	
	    	System.out.println("Printing the last element : " + rwle.getElement(2));
	    }

}
