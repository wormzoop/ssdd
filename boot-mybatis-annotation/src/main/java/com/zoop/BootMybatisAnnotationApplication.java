package com.zoop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.zoop")
@MapperScan(basePackages = "com.zoop.mapper")
public class BootMybatisAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMybatisAnnotationApplication.class, args);
	}
}
