package com.github.liuxg.dtx.bank2.controller;

import com.github.liuxg.dtx.bank2.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mrs.Liuxg
 * @Description:
 * @date 2021/4/413:54
 */
@Slf4j
@RestController
public class AccountInfoController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "transfer")
    public String transfer(@RequestParam("transferType") Integer transferType, @RequestParam("accountNo") String accountNo,@RequestParam("amount") Double amount) {
        try {
            accountService.updateAccount(transferType,accountNo,amount);
            return "0";
        } catch (Exception e) {
            log.error("操作金额失败",e);
            return "-1";
        }
    }
}
