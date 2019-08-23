package com.biz.var;

public class Print_01 {
	public static void main(String[] args) {
		
		System.out.println("대한민국 만세");
		System.out.println();
		System.out.println("우리나라 만세");
		System.out.print(30+40);
		System.out.println(30-40);
		//println에서 ln은 html <br>과 같은 의미
		
		int num1=30;
		int num2=7;
		System.out.print(num1);
		System.out.print("/");
		System.out.print(num2);
		System.out.print("=");
		System.out.println(num1/num2);
		
		// 연속적으로 같은 코드를 반복시키면 메모리 적재가 되어있고
		// 변경할 필요가 없으므로 pc에 친화적 코드다
		
		
		// System.out.println(num1," % ",num2," = ",num1%num2);
		// c언어 printf(%d" % "%d" = "%d, num1, num2, num1%num2);
	}
}
