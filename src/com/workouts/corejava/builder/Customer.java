package com.workouts.corejava.builder;
import com.workouts.corejava.builder.HouseBuilder;
import com.workouts.corejava.builder.IglooHouseBuilder;
import com.workouts.corejava.builder.CivilEngineer;
import com.workouts.corejava.builder.House;
class Customer {
  public static void main(String[] args){
	   HouseBuilder iglooHouseBuilder = new IglooHouseBuilder();
       CivilEngineer engineer = new CivilEngineer(iglooHouseBuilder);
       engineer.constructHouse();
       House iglooHouse = engineer.getHouse();
       
       System.out.println("Igloo House Constructed: " + iglooHouse);
  }
}
