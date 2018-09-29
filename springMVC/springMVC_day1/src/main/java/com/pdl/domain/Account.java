package com.pdl.domain;

public class Account {
    private Integer aid;
    private String aname;
    private float money;
    private User user;

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", money=" + money +
                ", user=" + user +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account() {

    }

    public Account(Integer aid, String aname, float money, User user) {

        this.aid = aid;
        this.aname = aname;
        this.money = money;
        this.user = user;
    }
}
