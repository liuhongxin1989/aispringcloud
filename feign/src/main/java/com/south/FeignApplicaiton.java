package com.south;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liuhongxin
 * @Type FeignApplicaiton
 * @Desc
 * @date 2020年01月13日
 * @Version V1.0
 */

@SpringBootApplication
@EnableFeignClients
public class FeignApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplicaiton.class,args);
    }
}
