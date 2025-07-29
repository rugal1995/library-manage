package com.lxr.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class})
@SpringBootApplication
public class LibraryManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManageApplication.class, args);
    }

}
