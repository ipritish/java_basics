package com.exercise.chapfifteen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {
	
	
	ArrayList<PrintWriter> clientOutputStreams;
	
	public class ClientHandler implements Runnable{
		
		BufferedReader reader;
		Socket sock;
		
		public ClientHandler(Socket clientSocket) {
			try
			{
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
				reader = new BufferedReader(isReader);
				
				
			}
			catch (Exception ie)
			{
				ie.printStackTrace();
			}
			
		}
		
		@Override
		public void run() {
			String message;
			try{
				while((message = reader.readLine()) != null)
				{
					tellEveryOne(message);
				}
					
			}
			catch(Exception ie){
				ie.printStackTrace();
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		new VerySimpleChatServer().go();

	}
	
	public void go(){
		clientOutputStreams = new ArrayList<PrintWriter>();
		try{
			ServerSocket serverSock = new ServerSocket(5000);
			while(true)
			{
				Socket clientSocket = serverSock.accept();
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
				clientOutputStreams.add(writer);
				
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();
				System.out.println("got a connection");
			}
		}
		catch(Exception ie){
			ie.printStackTrace();
		}
	}
	
	public void tellEveryOne(String message)
	{
		Iterator<PrintWriter> it = clientOutputStreams.iterator();
		while(it.hasNext())
		{
			try{
				PrintWriter writer = (PrintWriter) it.next();
				writer.println(message);
				writer.flush();
			}
			catch(Exception ie)
			{
				ie.printStackTrace();
			}
		}
	}

}
