package com.github.liuxg.dtx.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Mrs.Liuxg
 * @Description: eureka服务注册器
 * @date 2021/4/310:21
 */
@SpringBootApplication
@EnableEurekaServer
public class DtxDiscoverServer {
    public static void main(String[] args) {
        SpringApplication.run(DtxDiscoverServer.class,args);
    }
}
