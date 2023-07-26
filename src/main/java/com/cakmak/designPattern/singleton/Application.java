package com.cakmak.designPattern.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		SingletonExample singletonExample1 = SingletonExample.getInstance();
		SingletonExample singletonExample2 = SingletonExample.getInstance();

		System.out.println("singletonExample1 ==> " + singletonExample1);
		System.out.println("singletonExample2 ==> " + singletonExample2);

		System.out.println(singletonExample1 == singletonExample2);
	}

}
