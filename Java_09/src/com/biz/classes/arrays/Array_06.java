package com.biz.classes.arrays;

import java.util.Scanner;

import com.biz.classes.service.ArrayScanService;

public class Array_06 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayScanService aService = new ArrayScanService(10);

		while (true) {
			aService.scanArrayAll();
			System.out.print("Press Any Key..(END:quit)");
			String keyIn = scanner.nextLine();
			if(keyIn.equals("END")) break;
		}
		System.out.println("END");
		scanner.close();
	}
}
