package com.gxy.consumer;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gxy.provider.ServiceAPI;

public class ConsumerClient {

	private static Scanner scanner;

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
		
		context.start();
		
		while(true) {
			scanner = new Scanner(System.in);
			String message = scanner.next();
			
			//获取接口
			ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");
			System.out.println(serviceAPI.sendMessage(message));
		}
	}
	
}
