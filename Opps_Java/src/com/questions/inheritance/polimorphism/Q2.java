package com.questions.inheritance.polimorphism;
// method overloadinng with two method having different number of parameter 
public class Q2 {
   int sum(int a , int b , int c) {
	   return a+b+c;
   }
   int sum(int a , int b ) {
	   return a+b;
   }
   public static void main(String[] args) {
	Q2  q = new Q2();
	System.out.println(q.sum(39, 11));
	System.out.println(q.sum(39, 11,10));
}
}
