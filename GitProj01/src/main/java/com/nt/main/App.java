package com.nt.main;


public class App {
	
	public int sum(int a,int b) {
		return a+b;
	}
    public static void main(String[] args) {
    	
    	App a=new App();
        System.out.println("sum is::"+a.sum(10, 20));
    }
}
