package com.test;

import java.util.Scanner;

public class 곱셈 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
//		int a=sc.nextInt();
//        int b=sc.nextInt();
        int a=472;
        int b=385;
        
        
        
        int result1=0;
        int result2=0;
        int result3=0;
        int result4=0;
        
        result1=a*(b%10);
        result2=a*(b%100/10);
        result3=a*(b%1000/100);
        result4=a*b;
        
        
        
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		sc.close();
		
	}
}
