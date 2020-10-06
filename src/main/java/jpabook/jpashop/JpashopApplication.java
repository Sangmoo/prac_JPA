package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		Hello hello = new Hello();

		hello.setData("New Data");
		hello.setTestData("Test Data");
		String data = hello.getData();
		String testData = hello.getTestData();

		System.out.println("data = " + data); // soutv - sysout - InteliJ
		System.out.println("testData = " + testData);

		SpringApplication.run(JpashopApplication.class, args);
	}

}
