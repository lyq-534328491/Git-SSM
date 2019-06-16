package com.itcast.service.impl;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

/**
 * @Author Lyq
 * @Profession Programmer
 */
@Service("accountService")
public class AccountSerivceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层:保存账户...");
        accountDao.saveAccount(account);
    }
}
