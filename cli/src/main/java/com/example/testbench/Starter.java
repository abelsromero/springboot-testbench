package com.example.testbench;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class Starter implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hello world!!");	
	}
}
