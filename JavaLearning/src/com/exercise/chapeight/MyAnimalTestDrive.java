package com.exercise.chapeight;

public class MyAnimalTestDrive {

	public static void main(String[] args) 
	{
		MyAnimalList list = new MyAnimalList();
		Animal d = (Animal) new Dog();
		Animal c = (Animal) new Cat();
		list.add(d);
		list.add(c);

	}

}
