/*=========================================
   Main.java
   - main() 메소드가 포함된 테스트 클래스
=========================================*/

package com.test.spr;

public class Main
{

	public static void main(String[] args)
	{
		Record rec = new RecordImpl();
		
		RecordView view = new RecordViewImpl();
		
		view.setRecord(rec);
		
		view.input();
		
		view.output();
	}

}
