package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=0;
		
		if(a >=0 && b >= 0) {
			result=1;
		}else if( a < 0 && b >=0) {
			result=2;
		}else if( a < 0 && b < 0) {
			result=3;
		}else if( a >= 0 && b < 0) {
			result=4;
		}
		
		

		System.out.println(result);
		sc.close();

	}
}
