package com.pdl.dao.Imp;

import com.pdl.dao.AccountDao;
import com.pdl.dao.AccountService;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class AccountImpService implements AccountService {
    private List<String> list;
    private Map<String,String> map;
    private String[] array;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void saveAccount() {
        System.out.println(list);
        System.out.println(map);
        System.out.println(array);
    }
//    private String name;
//    private int age;
//    private Date birthday;
//
//    public AccountImpService(String name, int age, Date birthday) {
//        this.name = name;
//        this.age = age;
//        this.birthday = birthday;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public void saveAccount() {
//        System.out.println(name+","+age+","+birthday);
//    }

}
