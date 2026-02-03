package com.questions.inheritance.polimorphism;
// java program method overloading with varargs
public class Q4 {
   int sum(int a , int b) {
	   return a+b;
   }
   int sum(int...a) {
	   int sum=0;
	   for(int n:a) {
		  sum = sum+n;
	   }
	   return sum;
   }
   public static void main(String[] args) {
	 Q4 q = new Q4();
	 System.out.println(q.sum(4,6));
	 System.out.println(q.sum(4,6,40));

}
}
