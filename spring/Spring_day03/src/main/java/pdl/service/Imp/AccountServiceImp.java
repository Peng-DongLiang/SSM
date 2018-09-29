package pdl.service.Imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pdl.dao.AccountDao;
import pdl.domain.Account;
import pdl.service.AccountService;

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
        Account a=accountDao.findMoney(i1);
        Account b=accountDao.findMoney(i2);
        accountDao.updateMoney(i1,a.getMoney()-money);
        accountDao.updateMoney(i2,b.getMoney()-money);

    }
}
