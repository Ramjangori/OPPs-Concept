package com.staticdata;
// DIFFERENT WAY FOR DATA INITIALIZATION 
public class DataInitialization {
  //1. AT TIME OF DECLARATION 
	int a =10;
	int b;
	int c;
	int num;
 //2. USING INSTANCE BLOCK
	{
		b = 20;
	}
//3.USING CONSTRUCTOR
	DataInitialization(int a){
		this.b=a;
	}
//4. USING SETER METHOD 
 void setData(int a) {
	 this.c = a;
 }
 //5. USING INSTANCE REFFERENCE 
 public static void main(String[] args) {
	 DataInitialization d = new DataInitialization(5);
	 d.num = 40;
 
}
}
