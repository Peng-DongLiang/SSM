package pdl.dao;

import pdl.domain.Account;

import java.util.List;

public interface AccountDao {
    //增加
    void save(Account account);
    //删除
    void delete(Account account);
    //修改
    void update(Account account);
    //条件查询
    Account query(Integer account_Id);
    //查询所有
    List<Account> findAll();
    //查询用户账户
    Account findMoney(Integer i);
    //修改账户金额
    void updateMoney(Integer i,float money);
}
