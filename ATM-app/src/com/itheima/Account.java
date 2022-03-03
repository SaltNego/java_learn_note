package com.itheima;

/**
 * @author： Negoowen
 * @date： 2022-02-14
 * @project_name: java_learn_note
 * 账户类
 */
public class Account {
    private String cardId; // 卡号
    private String userName; // 用户名称
    private String passWord; // 密码
    private double money; // 账户余额
    private double quotaMoney; // 每次取现额度限度。

    public Account() {
    }

    public Account(String cardId, String userName, String passWord, double quotaMoney) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWord = passWord;
        this.quotaMoney = quotaMoney;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
