package com.github.liuxg.dtx.bank1.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Mrs.Liuxg
 * @Description: bank2转账类
 * @date 2021/4/413:17
 */
@FeignClient(value = "seata-bank2")
public interface Bank2Client {

    @GetMapping(value = "/bank2/transfer")
    public String transfer(@RequestParam("transferType") Integer transferType, @RequestParam("accountNo") String accountNo,@RequestParam("amount") Double amount);
}
