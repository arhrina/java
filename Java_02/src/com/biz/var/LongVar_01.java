package com.biz.var;

public class LongVar_01 {

	public static void main(String[] args) {
		
		long num1=0;
		// long은 8Byte까지 메모리를 할당받는 정수자료형이다
		// 2의 63제곱 -1까지 저장가능
		// l이나 L은 숫자에 붙으면 숫자 literal이다
		num1=999_999_999_999_999_999L;
		System.out.println(num1);
	}
}
