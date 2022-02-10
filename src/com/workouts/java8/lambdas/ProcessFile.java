package com.workouts.java8.lambdas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProcessFile {

	public static String processFile(BufferedReaderProcessor brp) throws IOException {
		String desktopFile = System.getProperty("user.home")+"\\Desktop\\ImportExecutionController.java";
		
		try(BufferedReader br = new BufferedReader(new FileReader(desktopFile))) {
			//return br.readLine();
			return brp.process(br);
		}
	}
	
	public static void main(String[] args) {
		try {
			String oneLine = processFile( (BufferedReader b) -> String.valueOf(b.read()));
			String twoLines = processFile( (BufferedReader br) -> br.readLine() + br.readLine());
			
			System.getProperty("java.io.tmpdir");
			String s = System.getProperty("user.home")+ File.separator + "AppData" + File.separator + "Local" + File.separator + "Temp" + File.separator;
			
			File f =  new File(s);
			
			if(!f.exists())
				f.mkdirs();
			
			if(!f.canWrite()) {
				f.setWritable(true);
			};
			
			
			System.out.println(oneLine);
			System.out.println(twoLines);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
