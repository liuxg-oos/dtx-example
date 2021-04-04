package com.github.liuxg.dtx.bank1.controller;

import com.github.liuxg.dtx.bank1.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mrs.Liuxg
 * @Description: 账户转账控制器
 * @date 2021/4/413:37
 */
@Slf4j
@RestController
public class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping("/transfer")
    public String transfer(@RequestParam("accountNo") String accountNo, @RequestParam("amount") Double amount) {
        try {
            service.updateAccount(0,accountNo,amount);
            return "success";
        } catch (Exception e) {
            log.error("转账失败!",e);
            return "fail!";
        }
    }
}
