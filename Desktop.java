package org.system;

public class Desktop extends Computer {
	public void dektopSize() {
		System.out.println("My Desktop is black colour");
	}

	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.dektopSize();
		desk.ComputerModel();
		
	}

}
