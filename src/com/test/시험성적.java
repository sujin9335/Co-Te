package com.test;

import java.util.Scanner;

public class 시험성적 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		String result="";
		
		if(a <= 100 && 90 <= a) {
			result="A";
		}else if(a >= 80) {
			result="B";
		}else if(a >= 70) {
			result="C";
		}else if(a >= 60) {
			result="D";
		}else {
			result="F";
		}
		
		

		System.out.println(result);
		sc.close();
		
		
		
		
		
	}
}
