package com.staticdata;
// DIFFERENT WAY TO CALL STATIC MEMBER IN JAVA 
import static java.lang.Math.*;

class Demo{
	
	static int  num2=20;
	static void display() {
		System.out.println("Parent class Display method ");
	}
}
public class StaticData extends Demo{
    static int num = 10;
    static void show() {
    	System.out.println("Show method calling...");
    }
    public static void main(String[] args) {
		//1. Using class Name 
    	StaticData.show(); 
    	System.out.println(StaticData.num);
       //2. Diretly (Only in same class)m-> good habit 
    	show();
    	System.out.println(num);
    // 3. Using object refference -> generally avoid 
      StaticData s = new StaticData();
      s.show();
      System.out.println(s.num);
      // 4.Using Child class
        Demo.display();
        System.out.println(Demo.num2);
       // 5. static import 
        System.out.println(sqrt(89));
      //6. Using Fully Qualified Class Name 
       System.out.println(com.constructor.Test.b);
       
	}
}
