package com.credera.account.model;

public class Balance{

    private String type;
    private int amount;
    private int accountId;

    public Balance(){}

    public Balance(int accountId, String type, int amount){
	this.accountId = accountId;
	this.type = type;
	this.amount = amount;
    }

    public int getAccountId(){
	return this.accountId;
    }

    public String getAccountType(){
	return this.type;
    }

    public int getAmount(){
	return this.amount;
    }
}
