package com.parkinglot.accounts;

import com.parkinglot.enums.AccountStatus;
import com.parkinglot.models.Person;

public abstract class Account {
    private int accountId;
    private Person person;
    private AccountStatus status;
    private String userName;
    private String password;

    public Account(int accountId, Person person, String userName, String password) {
        this.accountId = accountId;
        this.person = person;
        this.userName = userName;
        this.password = password;
        this.status = AccountStatus.ACTIVE;
    }

    public int getAccountId() {
        return accountId;
    }

    public Person getPerson() {
        return person;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void displayRole();
}
