
public class HelloKorea {
	public static void main(String[] args) {
		System.out.println("Republic of Korea");
		
		int i = 0;
		// 전항연산자와 후항연산자의 비교
		
		for(i = 0; i<3; i++)
			{System.out.println(i);
			}
		/* for ( init; condition; increment ) {
   			statement(s);
			}

The init step is executed first, and only once. This step allows you to declare and initialize any loop control variables. You are not required to put a statement here, as long as a semicolon appears.
init는 가장 처음에 한번 실행된다. 이 단계에서 루프를 제어할 변수를 선언하고 초기화 할 수 있으며 필요가 없다면 세미콜론까지 공백으로 채우면 된다 
Next, the condition is evaluated. If it is true, the body of the loop is executed. If it is false, the body of the loop does not execute and the flow of control jumps to the next statement just after the 'for' loop.
다음으로, 조건으로 넘어간다. 조건이 참이라면 반복문의 바디(내용문, {}안의 내용)이 실행된다. 조건이 거짓이라면 바디의 루프는 실행되지 않고 for문의 바깥에 있는 문장의 실행으로 넘어간다.
After the body of the 'for' loop executes, the flow of control jumps back up to the increment statement. This statement allows you to update any loop control variables. This statement can be left blank, as long as a semicolon appears after the condition.
바디의 루프가 실행되고 흐름은 증가로 넘어간다. 여기서는 루프의 제어변수값을 변화시키며 필요치 않다면 공란으로 남길 수 있다
*/
		for(i=0; i<3; ++i)
			{System.out.println(i);
			}
	}
}