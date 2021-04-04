package com.github.liuxg.dtx.bank2.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * @author Mrs.Liuxg
 * @Description:
 * @date 2021/4/413:59
 */
@Mapper
public interface AccountInfoDao {

    /**
     * 更新账户金额
     * @param accountNo
     * @param amount
     * @return
     */
    @Update("update account_info set account_balance = account_balance + #{amount} where account_no = #{accountNo}")
    int updateAccount(@Param("accountNo")String accountNo, @Param("amount")double amount);

}