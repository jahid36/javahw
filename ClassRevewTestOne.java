package com.Hello.text;

public class ClassRevewTestOne {
	public static void main ( String [] args ) {
		
		String s=new String ("zarah");
		add ();
		substract ();
		add (15,21);
	    add (13.5,16.7);
	    	
	    }
	    public static void add () {
	    	int a=20;
	    	int b=30;
	    	int s=(a+b);
	    	System.out.println(s);
	    	
	    }
	public static void substract () {
		int a=20;
		int b=30;
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
