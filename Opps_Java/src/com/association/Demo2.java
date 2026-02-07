package com.association;
// aggrigation 
class Library{
	String LibName;
	Library(String name){
		this.LibName=name;
	}
}

class Student{
	String name;
	Library library;
	Student(String name , Library library){
		this.name = name;
	   this.library = library;
	}
	public void showDetails() {
		System.out.println(name + " Studies in " + library.LibName);
	}
}
public class Demo2 {
   public static void main(String[] args) {
	   Library l= new Library("Physics Wallah");
	   Student s = new Student("Ramjan",l);
	    s.showDetails();
	   
}
}
