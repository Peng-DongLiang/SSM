package com.pdl.dao.imp;

import com.pdl.dao.AccountDao;
import com.pdl.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


import java.sql.SQLException;
import java.util.List;

@Repository("accountDao")
public class AccountDaoImp extends JdbcDaoSupport implements AccountDao {

    public void save(Account account) {
        getJdbcTemplate().update("insert into account set (name,money) values(?,?)",account.getName(),account.getMoney());

    }

    public void delete(Account account) {
        getJdbcTemplate().update("delect from account where id=?", account.getId());

    }

    public void update(Account account) {
        getJdbcTemplate().update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());

    }

    public Account query(Integer i) {
        List<Account> query = getJdbcTemplate().query("select * from account where id=?", new BeanPropertyRowMapper<Account>(Account.class), i);
        if (query.isEmpty()){
            return null;
        }
        if (query.size()>1){
            throw new RuntimeException("结果不唯一");
        }
        return query.get(0);
    }


    public List<Account> findAll() {
        List<Account> query = getJdbcTemplate().query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        if (query.isEmpty()){
            return null;
        }
        return query;
    }

    public void updateMoney(Integer i, float money) {
        getJdbcTemplate().update("update account set money=? where id=?",money,i);
    }
}
