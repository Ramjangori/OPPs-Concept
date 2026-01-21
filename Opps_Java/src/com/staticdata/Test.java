package com.staticdata;
// Calling main method in another class 
 class Test2{
	 public static void main(String[] args) {
		 System.out.println(args[0]);
		 System.out.println(args[1]);

		 
	 }
 }
public class Test {
  public static void main(String[] args) {
	  Test2.main(new String[] {"Ramjan" , "Gori"});
}
}
