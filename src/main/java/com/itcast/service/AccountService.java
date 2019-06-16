package com.itcast.service;

import com.itcast.domain.Account;

import java.util.List;

/**
 * @Author Lyq
 * @Profession Programmer
 */
public interface AccountService {

    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    public void saveAccount(Account account);
}
