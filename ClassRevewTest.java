package com.Hello.text;

public class ClassRevewTest {
	public static void main(String[] args) {
	String s=new String ("jahid");
	add ();
	substract ();		
	add (6,11);
	add(7.5,8.3);
	}
	public static void add () {
	int a=5;
	int b=10;
	int s=(a+b);
	System.out.println (s);
	
	
}
	public static void substract  () {
		int a=5;
		int b=10;
		int s=(a-b);
		System.out.println(s);
				
	}
	public static void add (int a,int b) {
		
		
		 int s=(a*b);
		System.out.println (s);
	}
	public static void add (double aa,double bb) {
		 double s=(aa*bb);
			System.out.println (s);
	}
}
	
