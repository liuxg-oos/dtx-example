package com.github.liuxg.dtx.bank2.service;

/**
 * @author Mrs.Liuxg
 * @Description: TODO
 * @date 2021/4/414:05
 */
public interface AccountService {
    /**
     *
     * @param transferType
     * @param accountNo
     * @param amount
     */
    public void updateAccount(int transferType, String accountNo, double amount);
}
