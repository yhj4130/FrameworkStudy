/*==========================================
   Main.java
   - main() 메소드가 포함된 테스트 클래스
==========================================*/

package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		// 주 업무 실행에 대한 테스트(Spring  AOP 기법 적용 후)
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		// Calculator cal = new CalculatorImpl();
		Calculator cal = context.getBean("proxy", Calculator.class);
		
		int add = cal.add(10, 20);
		System.out.println(add);
		
		int sub = cal.sub(10, 20);
		System.out.println(sub);
		
		int multi = cal.multi(10, 20);
		System.out.println(multi);
		
		int div = cal.div(10, 20);
		System.out.println(div);
		
		
		// 예외 상황이 발생할 수 있도록 값을 넘기는 처리
		int add2 = cal.add(100, 200);
		System.out.println(add2);
	}
}
