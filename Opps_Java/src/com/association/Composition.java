package com.association;
// Composition
class Engine{
	String engineType;
	Engine(String s){
		this.engineType = s;
	}
	public void showDetails() {
		System.out.println("Engine Type :" + engineType);
	}
}

class Car{
	String name;
	Engine engine;
	Car(String carname , String engineType){
		name = carname;
		this.engine = new Engine(engineType);
	}
	
	public void showdetails() {
		System.out.println("Car Name " + name);
		engine.showDetails();
	}
}
public class Composition {
  public static void main(String[] args) {
	Car car = new Car("Alto" , "CNG");
	car.showdetails();
}
}
