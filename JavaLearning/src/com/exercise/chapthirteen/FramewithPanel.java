package com.exercise.chapthirteen;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FramewithPanel {

	public static void main(String[] args) {
		FramewithPanel gui = new FramewithPanel();
		gui.go();

	}
	
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton button = new JButton("shock me");
		JButton buttonTwo = new JButton("bliss");
		JButton buttonThree = new JButton("huh?");
		panel.add(button);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(250,200);
		frame.setVisible(true);
	}

}
