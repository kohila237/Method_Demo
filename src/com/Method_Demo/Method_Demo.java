package com.Method_Demo;

public class Method_Demo {
	private void name()		//private cls-only can access within that parti. cls
	{
		System.out.println("name is:kohi");
	}
	public void id_num() {		// anywhere can use
		System.out.println("id num is:23");
	}
	
public static void main(String[] args) {		//main method
	System.out.println("Student Details:");
	
	Method_Demo md=new Method_Demo();	//obj creation
	
	md.id_num();				// method call by obj
	md.name();
	
	
	
}
		
	
}
	
	
	
	

