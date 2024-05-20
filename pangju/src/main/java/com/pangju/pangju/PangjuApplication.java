package com.pangju.pangju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PangjuApplication {

	public static void main(String[] args) {
		SpringApplication.run(PangjuApplication.class, args);
	}

}
