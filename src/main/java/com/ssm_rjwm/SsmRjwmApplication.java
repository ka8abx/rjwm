package com.ssm_rjwm;

import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@ServletComponentScan

public class SsmRjwmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmRjwmApplication.class, args);
        log.info("项目启动成功");
    }


}
