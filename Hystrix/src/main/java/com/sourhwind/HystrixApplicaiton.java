package com.sourhwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liuhongxin
 * @Type HystrixApplicaiton
 * @Desc
 * @date 2020年01月13日
 * @Version V1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker //声明启用数据监控
@EnableHystrixDashboard //声明启用可视化数据监控
public class HystrixApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplicaiton.class,args);
    }
}
