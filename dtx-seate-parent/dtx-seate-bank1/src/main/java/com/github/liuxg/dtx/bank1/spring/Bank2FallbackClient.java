package com.github.liuxg.dtx.bank1.spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Mrs.Liuxg
 * @Description: 转账失败处理类
 * @date 2021/4/413:19
 */
public class Bank2FallbackClient{

    public String transfer(Integer transferType, String accountNo, Double amount) {
        return "-1";
    }
}
