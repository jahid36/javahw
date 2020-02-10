package com.Hello.text;

public class RTwoNumber {
 public static void main(String args[]) {
int a=10; int x=5; int c=a+x;
System.out.println(c);
Integer d=add(a,x);
System.out.println(d);
}
 public static Integer add(int a,int b){
	 Integer c=a+b;
	 return c;
 }
}