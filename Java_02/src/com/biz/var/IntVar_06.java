package com.biz.var;

public class IntVar_06 {
	
	public static void main(String[] args) {
		int num1=0;
		
		// Java 1.7부터 _를 이용해 숫자를 구분할 수 있다
		
		num1=999_999_999;
		
		
		/*
		for(int count=10000000; count<100000000; count++)//(count*ten))
		{
			num1=count*9;
			System.out.println(num1);
			// interger형은 overflow가 2의 31제곱-1을 넘어서면 나타난다
			// integer형은 4바이트만큼 할당되기 때문 
		}
		*/
	}
}
