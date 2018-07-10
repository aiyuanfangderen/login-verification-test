package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.mapper")//扫描mapper，这个注解和mapper.java文件中的两个注解二选一
public class LoginVerificationTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginVerificationTestApplication.class, args);
	}
}
