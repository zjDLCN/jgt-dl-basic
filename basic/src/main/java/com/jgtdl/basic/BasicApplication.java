package com.jgtdl.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * SpringBoot 启动类
 *
 * @author ZhangJian
 * @date 2018/09/20
 */
@SpringBootApplication
@EnableJpaAuditing
public class BasicApplication {

  public static void main(String[] args) {
    SpringApplication.run(BasicApplication.class, args);
  }
}
