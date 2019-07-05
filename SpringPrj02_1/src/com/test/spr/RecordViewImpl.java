package com.test.spr;

import java.util.Scanner;

public class RecordViewImpl implements RecordView
{
	private Record record;
	
	@Override
	public void setRecord(Record record)
	{
		this.record = record;
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("< 정보 입력 >");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String tel = sc.nextLine();
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		
		record.setName(name);
		record.setTel(tel);
		record.setAddr(addr);
		
		sc.close();
	}

	@Override
	public void output()
	{
		System.out.println();
		System.out.println("=============== 결과 확인 ===============");
		System.out.println("이름 : " + record.getName());
		System.out.println("전화번호 : " + record.getTel());
		System.out.println("주소 : " + record.getAddr());
	}
}
