package com.biz.thread.classes;

import java.util.Calendar;
import java.util.Date;

public class Cal_01 extends Thread {
	@Override
	public void run() {
		Calendar ca1 = Calendar.getInstance();
		ca1.set(2019, Calendar.OCTOBER, 10);
		Date date1 = ca1.getTime();
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			String curDate = SimpleStaticClass.sd.format(date1);
			System.out.println("Thread1 : " + curDate);
		}
	}
}