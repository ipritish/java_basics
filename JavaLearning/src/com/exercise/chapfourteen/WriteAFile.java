package com.exercise.chapfourteen;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("Foo.txt");
			writer.write("hello foo!");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
