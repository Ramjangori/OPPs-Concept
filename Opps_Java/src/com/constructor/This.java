package com.constructor;
/* This keyword reffer to current class object 
 * is is used to differentiate instance variable from local variable 
 * -> call another constructor in same class 
 * -> pass current object as an argument 
 * 
 * */
public class This {
    int a;
   
    int  setData(int a) {
    	a = a;
    	return a; // Output = local a
    }
    This(int a){
    	this.a = a;
    	System.out.println(a); // Output Instance a
    }
    public static void main(String[] args) {
		This t = new This(10);
		System.out.println(t.setData(30));
	}
}
