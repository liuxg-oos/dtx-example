package com.github.liuxg.dtx.bank1.service;

/**
 * @author Mrs.Liuxg
 * @Description: 操作账户service类
 * @date 2021/4/413:25
 */
public interface AccountService {

    /**
     * 更新bank1账户金额
     * @param transferType
     * @param accountNo
     * @param amount
     */
    public void updateAccount(int transferType, String accountNo, double amount);

}
