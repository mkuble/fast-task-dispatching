package com.fast.task.dispatching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fast.framework.data.jpa.BaseRepositoryFactoryBean;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.fast.task.dispatching" }, repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)	//指定自定义的工厂类
public class FastApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastApplication.class, args);
	}
	
}
