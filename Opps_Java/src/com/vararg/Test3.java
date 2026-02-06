package com.vararg;
class Demo{
	void show(int a , int ...b) // after compile (int a[])
	{
		System.out.println(a);
	}
	void show(int ...b) {
		System.out.println(b);
	}
	
}

public class Test3 {
   public static void main(String[] args) {
	   Demo d = new Demo();
	   //d.show(3);  // gives ambioious error 
	}
}
