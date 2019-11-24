package com.weichuang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.weichuang.mapper")
public class SsmDemo1119Application {

	public static void main(String[] args) {
		SpringApplication.run(SsmDemo1119Application.class, args);
	}

}
