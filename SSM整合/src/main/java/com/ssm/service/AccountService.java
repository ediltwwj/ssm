package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

/**
 * @author 13967
 * @date 2019/8/17 16:49
 */
public interface AccountService {

    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAllAccount();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);
}
