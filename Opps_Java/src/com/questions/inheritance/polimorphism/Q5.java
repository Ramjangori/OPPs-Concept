package com.questions.inheritance.polimorphism;
// method overloading with different order of parameter 
public class Q5 {
   float  sum (int a , float b) {
	    return a+b;
   }
   float  sum (float a , int  b) {
	    return a+b;
  }
   public static void main(String[] args) {
	Q5  q = new Q5();
	System.out.println(q.sum(5, 3.6f));
	System.out.println(q.sum(5.6f, 6));
	
	
}
}
