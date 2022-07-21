package com.JavaBasic;

public class FirstProgram {
	
	int a=5;
	float x=40.50f;
	float y=66.55f;
	double b=55;
	double c=88;
	
	public static int add(int e,int f) {
		return e+f;
	}
		
		public int sub(int g,int h) {
			return g-h;
			
	}
	public static void main(String[] args) {
		System.out.println("This is my first Program");
		System.out.println("This is my first Program11111");
		FirstProgram obj=new FirstProgram();
		System.out.println("value of b is " +obj.b);
		System.out.println("added value is " +add(5,8));
		System.out.println("subtracted value is " +obj.sub(8, 2));
		
	}

}
