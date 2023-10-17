package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자야구 {

	public static void main(String[] args) {
		
		try {
			BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
			
			int n=Integer.parseInt(read.readLine());
			
			System.out.println(n);
			
			StringTokenizer st=new StringTokenizer(read.readLine());
			String st1=st.nextToken();
			String st2=st.nextToken();
			String st3=st.nextToken();
			
			System.out.println(st1);
			System.out.println(st2);
			System.out.println(st3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		StringTokenizer line=new StringTokenizer();
		
		
		
		
	}
}
