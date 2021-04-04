package com.github.liuxg.dtx.bank1;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Mrs.Liuxg
 * @Description:
 * @date 2021/4/413:11
 */
@SpringBootApplication
@EnableHystrix
@EnableFeignClients(basePackages = "com.github.liuxg.dtx.bank1.spring")
@EnableDiscoveryClient
@MapperScan(basePackages = "com.github.liuxg.dtx.bank1.dao")
public class Bank1Server {

    public static void main(String[] args) {
        SpringApplication.run(Bank1Server.class,args);
    }


}
