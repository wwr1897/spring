package com.wwr.myspring;

import com.wwr.myspring.pojo.MyHello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Application.class);
		MyHello myHello = ac.getBean(MyHello.class);
		myHello.hello();
	}
}
