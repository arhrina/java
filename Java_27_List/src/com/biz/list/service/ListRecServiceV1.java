package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
/*
 * ReceiveService
 */
public class ListRecServiceV1 {
	private List<String> myStrList;
	private List<String> recStrList;
	
	public ListRecServiceV1() {
		
	}
	/*
	 * myStrList : ListServiceV1에서 임의로 생성한 리스트
	 * recStrList : 외부에서 주입되는 리스트
	 */
	public ListRecServiceV1(List<String> recStrList) {
		myStrList = new ArrayList<String>();
		this.recStrList = recStrList;
	}
	
	public void setStrList(List<String> recStrList) {
		this.recStrList = recStrList;
	}
	
	public void viewList() {
		for(String str : this.recStrList) {
			System.out.println(str);
		}
	}
}