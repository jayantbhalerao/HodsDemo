package com.VelocityWithTools;

public class VelocityTool {
	private String message = "Hello from ToyTool!";

	public String getMessage() {
		return message;
	}

	public void setMessage(String m) {
		message = m;
	}

	public boolean whine() {
		throw new IllegalArgumentException();
	}
	
	public static void main(String[] args) {
		System.out.println(1%0);
	}
	
}
