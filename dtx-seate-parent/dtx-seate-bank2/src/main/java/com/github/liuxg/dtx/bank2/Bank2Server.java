package com.github.liuxg.dtx.bank2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Mrs.Liuxg
 * @Description:
 * @date 2021/4/413:52
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@MapperScan(basePackages = "com.github.liuxg.dtx.bank2.dao")
public class Bank2Server {

    public static void main(String[] args) {
        SpringApplication.run(Bank2Server.class,args);
    }
}
