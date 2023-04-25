package com.velocity;

import java.util.Scanner;

public class addition {
 int a;
 int b;
 public static void main(String[] args) {
	System.out.println("enter the first number");
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	System.out.println("enter the second number");
	int b=scanner.nextInt();
	int x=a+b;
	System.out.println("enter the addition>>>"+ x);
}

}

