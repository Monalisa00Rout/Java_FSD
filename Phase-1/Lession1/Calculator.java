package com.simplilearn.calculator;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	System.out.println("     Arithmetic Calculator\n");
	Scanner sc=new Scanner(System.in);
	
	//Variable declaration
	double a,num1,num2,num3;
	char b;
	
	while(true) {

		//Getting User Operation
		
		System.out.println("1. (+) 2. (-)"+"\n3. (*) 4. (/)");
		System.out.println("Choose a Operation (1/2/3/4)");
		
	//getting user operation selection
	a=sc.nextInt();
	
	//Getting user input Value
	System.out.println("Enter two numbers :");
	num1=sc.nextDouble();
	num2=sc.nextDouble();
	
	if(a==1) {
		System.out.println("you Choose Addition");
		
		num3=num1+num2;
		System.out.println(num1+"+"+num2+" ="+num3);
	}
	else if(a==2) {
		System.out.println("You Choose Substraction");
		
		num3=num1-num2;
		System.out.println(num1+"-"+num2+" ="+num3);
	}
	else if(a==3){
		System.out.println("You Choose Multiplication");
		
		num3=num1*num2;
		System.out.println(num1+"*"+num2+" ="+num3);
	}
	else if(a==4) {
		System.out.println("You Choose Division");
		
		num3=num1/num2;	
		System.out.println(num1+"/"+num2+" ="+num3);
	}
	
	//Either continue or exit
		System.out.println("Enter 'y' to Continue & 'n' to exit");
		b=sc.next().charAt(0);
		if(b=='y'||b=='Y') continue;
		else
			System.out.println("Thank you");
		break;
		}
}
}
