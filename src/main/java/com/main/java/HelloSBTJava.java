package com.main.java;
public class HelloSBTJava {
	String name;
	public HelloSBTJava() {
	}
	public HelloSBTJava(String name){
	this.name =name;	
	}
	public String hello(){
		return "Hello "+name;
	}
	
	public String foundType() {
		return this.foundType();
		   }
	public static void main(String args[]){
		HelloSBTJava obj = new HelloSBTJava("Cybage");
		String msg = obj.hello();
		System.out.println(msg);
	}
}
