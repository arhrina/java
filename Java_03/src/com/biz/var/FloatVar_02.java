package com.biz.var;

public class FloatVar_02 {
	public static void main(String[] args) {
		
		float fNum=60;
		fNum=100; // 정수가 실수형태로 변경되어 실수 변수에 삽입됨
		fNum=55/3;
		System.out.println(fNum);
		fNum=55/3.0f;
		System.out.println(fNum);
		/* 두 값이 실수로 바뀌는데, 바뀔 때를 잘 확인해야 한다
		 * 
		 */
		
	}
}
