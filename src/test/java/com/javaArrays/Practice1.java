package com.javaArrays;

public class Practice1 extends IronMan{

	public static void main(String[] args) {
		//IronMan.main(args);
		//IronMan im = new IronMan();
		//im.trial();
		Practice1 p = new Practice1();
		
		p.trial2();//Constructor call must be the first statement in a constructor
		p.trial();
		
	}
	
	public void trial2() {

		int a=10; 
		int b=20;
		System.out.println(a+b);
	}

}
