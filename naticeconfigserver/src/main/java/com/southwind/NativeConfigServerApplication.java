package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liuhongxin
 * @Type NativeConfigServerApplication
 * @Desc
 * @date 2020年01月13日
 * @Version V1.0
 */
@SpringBootApplication
@EnableConfigServer //声明配置中心
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}
