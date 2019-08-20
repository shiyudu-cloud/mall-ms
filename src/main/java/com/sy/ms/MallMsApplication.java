package com.sy.ms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dushiyu
 */
@MapperScan("com.sy.ms.mapper")
@SpringBootApplication
public class MallMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMsApplication.class, args);
    }

}
