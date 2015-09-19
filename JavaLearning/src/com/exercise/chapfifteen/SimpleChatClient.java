package com.exercise.chapfifteen;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class SimpleChatClient {
	
	JTextArea incoming;
	JTextField outgoing;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;
	
	public static void main(String[] args) {
		SimpleChatClient client = new SimpleChatClient();
		client.go();

	}
	
	public void go(){
		JFrame frame = new JFrame("Simple Chat Client");
		JPanel mainPanel = new JPanel();
		
		incoming = new JTextArea(15,50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);
		
		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		outgoing = new JTextField(20);
		
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		
		mainPanel.add(qScroller);
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		
		setUpNetworking();
		
		Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();
		
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
		frame.setSize(400,500);
		frame.setVisible(true);
		
	}
	
	public class SendButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try{
				writer.println(outgoing.getText());
				writer.flush();
			}
			catch(Exception ie)
			{
				ie.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
		
	} 
	
	public void setUpNetworking(){
		
		try {
			sock = new Socket("127.0.0.1",5000);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(streamReader);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public class IncomingReader implements Runnable{

		@Override
		public void run() {
			String message;
			try
			{
				while((message = reader.readLine()) != null)
				{
					System.out.println("read " + message);
					incoming.append(message + "\n");
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
	}

}
