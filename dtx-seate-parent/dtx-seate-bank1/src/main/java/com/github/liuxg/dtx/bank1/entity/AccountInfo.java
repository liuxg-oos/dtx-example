package com.github.liuxg.dtx.bank1.entity;

import java.io.Serializable;

/**
 * @author Mrs.Liuxg
 * @Description: 银行卡账户
 * @date 2021/4/413:21
 */
public class AccountInfo implements Serializable {
    private Long id;

    private String accountName;

    private String accountNo;

    private String accountPassword;

    private Double accountBalance;

    public AccountInfo() {
    }

    public AccountInfo(Long id, String accountName, String accountNo, String accountPassword, Double accountBalance) {
        this.id = id;
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.accountPassword = accountPassword;
        this.accountBalance = accountBalance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
