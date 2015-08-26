package com.exercise.chapeight;

public class MyAnimalTestDrive {

	public static void main(String[] args) 
	{
		MyAnimalList list = new MyAnimalList();
		Animal d = new Dog();
		Animal c = new Cat();
		Pet p = new Dog();
		Dog newDog = (Dog)p;
		System.out.println(newDog.rollandRun("roll"));
		Dog getdBack = (Dog)d;
		int res = getdBack.doStuffOnlyDogCanDo(0);
		System.out.println(res);
		list.add(d);
		list.add(c);

	}

}
