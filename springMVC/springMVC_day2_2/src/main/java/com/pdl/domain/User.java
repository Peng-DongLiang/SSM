package com.pdl.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private String name;
    private String sex;
    private Date birthday;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(String name, String sex, Date birthday) {

        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }
}
