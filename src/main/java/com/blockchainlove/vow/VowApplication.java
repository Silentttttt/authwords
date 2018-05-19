package com.blockchainlove.vow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blockchainlove")
public class VowApplication {

	public static void main(String[] args) {
		SpringApplication.run(VowApplication.class, args);
	}

}
