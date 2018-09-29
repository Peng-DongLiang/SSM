package pdl.dao.imp;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import pdl.dao.AccountDao;
import pdl.domain.Account;

import java.sql.SQLException;
import java.util.List;
@Repository("accountDao")
public class AccountDaoImp implements AccountDao {
    @Autowired
    @Qualifier("runner")
    private QueryRunner runner;


    public void save(Account account) {
        try {
            runner.update("insert into account set (name,money) values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Account account) {
        try {
            runner.update("delect from account where id=?",account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Account account) {
        try {
            runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Account query(Integer account_Id) {
        try {
            return runner.query("select * from account where id=?",new BeanHandler<Account>(Account.class),account_Id);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public List<Account> findAll() {
        try {
            return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public Account findMoney(Integer i) {
        try {
            Account query = runner.query("select money from account where id=?", new BeanHandler<Account>(Account.class), i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateMoney(Integer i, float money) {
        try {
            runner.update("update account set money=? where id=?",money,i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
