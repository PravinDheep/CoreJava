package com.workouts.corejava.builder;
class House implements HousePlan {
  /*
     Builder pattern aims to “Separate the construction of a complex object from its representation so that
     the same construction process can create different representations.” It is used to construct a complex
     object step by step and the final step will return the object. The process of constructing an object
     should be generic so that it can be used to create different representations of the same object.
  */
  
  private String basement;
  private String structure;
  private String roof;
  private String interior;
  
  @Override
  public void setBasement(String basement){
  	this.basement = basement;
  	System.out.println("Basement creation");
  }
  
  @Override
  public void setStructure(String structure){
        this.structure = structure;
  	System.out.println("Structure creation");
  }
  
  @Override
  public void setRoof(String roof){
        this.roof = roof;
  	System.out.println("Roof creation");
  }
  
  @Override
  public void setInterior(String interior){
        this.interior = interior;
  	System.out.println("Interior creation");
  }

}
