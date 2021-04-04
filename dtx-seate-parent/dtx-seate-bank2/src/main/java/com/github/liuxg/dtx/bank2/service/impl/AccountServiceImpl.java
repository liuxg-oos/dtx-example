package com.github.liuxg.dtx.bank2.service.impl;

import com.github.liuxg.dtx.bank2.dao.AccountInfoDao;
import com.github.liuxg.dtx.bank2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Mrs.Liuxg
 * @Description:
 * @date 2021/4/414:06
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountInfoDao accountInfoDao;

    @Transactional
    @Override
    public void updateAccount(int transferType, String accountNo, double amount) {
        if (transferType == 0) {
            accountInfoDao.updateAccount(accountNo,amount * (-1));
        } else {
            accountInfoDao.updateAccount(accountNo,amount);
        }
    }
}
