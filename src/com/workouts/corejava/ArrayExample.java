package com.workouts.corejava;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class ArrayExample {
	public static void main(String[] args){		
	   Integer[] intArr= { 4,10,8,1,42,19,11,24,14,1 };
	   String[] strArray = Arrays.stream(intArr).map(String::valueOf).toArray(String[]::new);
	   System.out.println(strArray[0]);
	   
	   Set<Integer> intArrToList = Arrays.stream(intArr).collect(Collectors.toSet());	
       System.out.println(intArrToList);  

       List<String> a = Arrays.stream(intArr).map(i -> i.toString()).collect(Collectors.toList());
       System.out.println(a);
       List<String> aa = a.stream().filter(i -> i.startsWith("1")).collect(Collectors.toList());
       System.out.println(aa);
       
       Map<Integer, String> hmap = new HashMap<>();
       hmap.put(1, "pravin");
       hmap.put(2, "pravina");
       hmap.put(3, "pravinb");
       hmap.put(4, "pravinc");
       hmap.put(5, "pravind");
       hmap.put(1, "pravinnew");
       hmap.forEach((i,s) -> System.out.println(i + "--" + s));
	}	
}
