package com.workouts.corejava;

import java.text.SimpleDateFormat;  
import java.util.Date;
import java.lang.String;
import java.util.*;
import java.time.LocalDate;

public class StringToDateExample {
	
public static void main(String[] args)throws Exception {  
	Date date = new Date();
    String dateFormat = "yyyy-mm-dd";
    if(dateFormat != null) {
		int hoursIndex = dateFormat.toUpperCase().indexOf("H");
		if(hoursIndex == 0) {
			// There is no date part, contains only time part.
			dateFormat = dateFormat.replaceAll("M", "m");
		} else if(hoursIndex > 0){
			// Contains both date and time part.
			dateFormat = dateFormat.replace("Y", "y");
			dateFormat = dateFormat.replace("D", "d");
			dateFormat = dateFormat.substring(0, hoursIndex).concat(dateFormat.substring(hoursIndex).replaceAll("M", "m"));
		} else {
			// There is no time part.
			dateFormat = dateFormat.replace("Y", "y");
			dateFormat = dateFormat.replace("D", "d");
			dateFormat = dateFormat.replaceAll("m", "M");
		}
		SimpleDateFormat myDateFormatter = new SimpleDateFormat(dateFormat);
		System.out.println(new String(myDateFormatter.format(date)));
	}
}
}