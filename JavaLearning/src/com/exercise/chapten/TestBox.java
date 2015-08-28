package com.exercise.chapten;

public class TestBox {

	Integer j;
	int i;
	public static void main(String[] args) {
		TestBox t = new TestBox();
		t.i = 5;
		t.go();
		
	}
	
	public void go(){
		j=i;
		System.out.println(j);
		System.out.println(i);
	}

}
