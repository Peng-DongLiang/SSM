package com.pdl.service.Imp;


import com.pdl.dao.AccountDao;
import com.pdl.domain.Account;
import com.pdl.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pdl.dao.AccountDao;
import com.pdl.domain.Account;
import com.pdl.service.AccountService;

import java.util.List;

@Service("accountService")
public class AccountServiceImp implements AccountService {
    @Autowired()
    @Qualifier("accountDao")
    private AccountDao accountDao;


    public void save(Account account) {
        accountDao.save(account);
    }

    public void delete(Account account) {
        accountDao.delete(account);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public Account query(Integer account_Id) {
        return accountDao.query(account_Id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void updateAccount(Integer i1,Integer i2,float money) {
        Account query1 = accountDao.query(i1);
        Account query2 = accountDao.query(i2);
        query1.setMoney(query1.getMoney()-money);
        query2.setMoney(query2.getMoney()+money);
        accountDao.update(query1);
        int i=1/0;
        accountDao.update(query2);
    }
}
