package com.ktdsuniversity.edu.ods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

// mybatis기능: 해당 패키지 내의 매퍼 인터페이스를 스캔하여 MyBatis가 동적 프록시를 통해 자동으로 구현체를 생성함 그래서 daoimple을 따로 안 만들어줘도 
// XML 매퍼 파일이나 어노테이션으로 SQL을 정의하면 mybatis가 자동으로 연결함
// iple은 직접구현하는듯험

@MapperScan("com.ktdsuniversity.edu.ods.bbs.dao")
public class HelloSpringOdsApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringOdsApplication.class, args);
    }
}