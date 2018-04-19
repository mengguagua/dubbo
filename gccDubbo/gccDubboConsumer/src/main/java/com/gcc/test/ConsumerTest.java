package com.gcc.test;

import com.gcc.service.DemoProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        DemoProviderService demoProviderService=(DemoProviderService) context.getBean("demoProviderService");
        String result=demoProviderService.sayHello("你好");
        System.out.println("远程调用结果："+result);
        try {
			System.in.read();//一直连接
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        context.close();
	}
}
