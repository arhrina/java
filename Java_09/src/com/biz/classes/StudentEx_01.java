package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {

		StudentVO[] stVO = new StudentVO[5];
		for(int i = 0; i < stVO.length; i++)
		{
			stVO[i] = new StudentVO();
		}

		stVO[0].strNum = "001";
		stVO[0].strName = "홍길동";
		stVO[0].strTel = "010-000-0000";

		stVO[1].strNum = "002";
		stVO[1].strName = "이몽룡";
		stVO[1].strTel = "010-000-0000";

		stVO[2].strNum = "003";
		stVO[2].strName = "성춘향";
		stVO[2].strTel = "010-000-0000";
		
		
		System.out.println("===============================");
		System.out.println("학생명부");
		System.out.println("-------------------------------");
		System.out.println("학번\t이름\t전화번호");
		System.out.println("-------------------------------");
		for(int i = 0; i < stVO.length; i++)
		{
			System.out.printf("%s\t%s\t%s\n", stVO[i].strNum, stVO[i].strName, stVO[i].strTel);
		}
	}

}
