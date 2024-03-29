package com.test.test1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {
        log.info("项目启动了！");
        SpringApplication.run(Test1Application.class, args);
    }

}
