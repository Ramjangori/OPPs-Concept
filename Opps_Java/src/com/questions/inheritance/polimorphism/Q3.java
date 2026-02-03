package com.questions.inheritance.polimorphism;
//method overloading having different data Type and common parameter 
public class Q3 {
   int mul(int n , int b) {
	   return n*b;
   }
   long mul(long a , long b) {
	   return a*b;
   }
   public static void main(String[] args) {
	Q3 q = new Q3();
	System.out.println(q.mul(2, 4));
	System.out.println(q.mul(2, 100));

}
}
