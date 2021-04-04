package com.github.liuxg.dtx.bank1.service.impl;

import com.github.liuxg.dtx.bank1.dao.AccountInfoDao;
import com.github.liuxg.dtx.bank1.service.AccountService;
import com.github.liuxg.dtx.bank1.spring.Bank2Client;
import io.seata.common.util.StringUtils;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Mrs.Liuxg
 * @Description: 操作账户金额service实现类
 * @date 2021/4/413:26
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountInfoDao accountInfoDao;

    @Autowired
    private Bank2Client client;

    @GlobalTransactional
    @Transactional
    @Override
    public void updateAccount(int transferType, String accountNo, double amount) {
        String[] accs = accountNo.split(",");
        if (transferType == 0) {
            accountInfoDao.updateAccount(accs[0],amount * -1);
            String transfer = client.transfer(1,accs[1],amount);
            if (StringUtils.equals(transfer,"-1"))
                throw new RuntimeException("转账失败!");
        } else {
            accountInfoDao.updateAccount(accs[0],amount);
            String transfer = client.transfer(0,accs[1],amount);
            if (StringUtils.equals(transfer,"-1"))
                throw new RuntimeException("转账失败!");
        }
    }
}
