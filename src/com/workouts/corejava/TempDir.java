package com.workouts.corejava;

import java.io.File;

public class TempDir {

	public static void main(String[] args) {
	    
		String s = System.getProperty("user.home")+ File.separator + "AppData" + File.separator + "Local" + File.separator + "Temp" + File.separator;           
		File f =  new File(s);
	       
        if(!f.exists())
        	f.mkdirs();
        
        if(!f.canWrite())
        	f.setWritable(true);
        
        System.out.println(s);
        
	}

}
