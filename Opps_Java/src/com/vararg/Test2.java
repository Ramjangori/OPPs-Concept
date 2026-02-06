package com.vararg;
class Hay{
	void show(String ...a) {
		System.out.println(a.length);
		for( String b : a) {
			System.out.println(b);
		}
	}
	
	void show (int...a) {
		System.out.println(a.length);
		for( int  b : a) {
			System.out.println(b);
		}
	}
}
public class Test2 {
public static void main(String[] args) {
	Hay h = new Hay();
	h.show("Ramjan" , "Gori");
	h.show(3,5,6,7);
	//h.show(null);
}
}
