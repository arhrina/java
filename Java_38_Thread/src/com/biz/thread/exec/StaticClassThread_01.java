package com.biz.thread.exec;

import com.biz.thread.classes.StaticClassV1;

public class StaticClassThread_01 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		StaticClassV1.sum = 0;
		for(int i = 0; i < 200; i++) {
			StaticClassV1.sum += i+1;
		}
		System.out.println("Thread에서 계산한 합계");
		System.out.println(StaticClassV1.sum);
	}
}
