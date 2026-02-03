package com.questions.inheritance.polimorphism;
//  Program method overloading two method having different datatypes 
public class Question1 {
   int  sum(int a , int b) {
	   return a+b;
   }
   String sum(String a , String b) {
	   return a + b;
   }
   public static void main(String[] args) {
	   Question1 q = new Question1();
	System.out.println(q.sum(5,20));
	System.out.println(q.sum("Ramjan ","Gori"));

}
}
