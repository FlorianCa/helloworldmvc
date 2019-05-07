package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAOHelloWorld {

	
	private DAOHelloWorld() throws IOException {
		
		this.readFile();
	}
	
	public void readFile() throws IOException {
		
		BufferedReader buffer;
		try {
			buffer = new BufferedReader(new InputStreamReader(new FileInputStream(FileName)));
			this.setHelloWorldMessage(buffer.readLine());
			buffer.close();
		} catch (final FileNotFoundException exception) {
			exception.printStackTrace();
		}
	}
	
	private static final String FileName = "text.txt";
	
	private static DAOHelloWorld instance = null;
	public static synchronized DAOHelloWorld getInstance() throws IOException {
		
		if(instance == null) {
			setInstance(new DAOHelloWorld());
		}
		
		return instance;	
	}
	private static void setInstance(final DAOHelloWorld instanc) {instance = instanc;}
	
	private String HelloWorldMessage = null;
	public String getHelloWorldMessage() {return this.HelloWorldMessage;}
	public void setHelloWorldMessage(String HelloWorldMessage) {this.HelloWorldMessage = HelloWorldMessage;}
	
}
