package com.exercise.chaptwelve;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {
	
	int x = 70;
	int y = 70;
	
	public static void main(String[] args)	{
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void go(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AnimationDrawPanel drawPanel = new AnimationDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		for (int i=0; i<130; i++)
		{
			x++;
			y++;
			
			drawPanel.repaint();
			try{
				Thread.sleep(50);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	public class AnimationDrawPanel extends JPanel{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		protected void paintComponent(Graphics g) {
			
			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(),this.getHeight());
			
			g.setColor(Color.green);
			g.fillOval(x,y,40,40);
		
		}

	}

}
