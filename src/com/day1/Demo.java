package com.day1;
/*
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("HEllo");




	}
	
	
	
	

}
*/
/*
 * class A{ void msg(){System.out.println("Hello");} } class B{ void
 * msg(){System.out.println("Welcome");} } class C extends A{//suppose if it
 * were
 * 
 * public static void main(String args[]){ C obj=new C(); obj.msg();//Now which
 * msg() method would be invoked? } }
 */



class Animal{  
void bark(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class Demo{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.bark();  
//c.bark();//C.T.Error  
}}  