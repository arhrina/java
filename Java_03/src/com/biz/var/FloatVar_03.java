package com.biz.var;

public class FloatVar_03 {
	public static void main(String[] args) {
		long intKor=90, intEng=87, intMath=67, intSum=intKor+intEng+intMath;
		float fAvg=intSum/3.0f;
		System.out.printf("=============\n성적표\n-------------\n");
		System.out.printf("국어 : %6d\n영어 : %6d\n수학점수 : %6d\n"
				+"-------------\n총점 : %6d\n평균 : %6.2f", intKor,intEng,
				intMath,intSum,fAvg);
	}// %d는 ESCAPE 문자열 중 하나(???)
}
