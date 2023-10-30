package com.example.befastfood.model;

import javax.persistence.*;

@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Integer id;

    @Column(name = "bank_number", columnDefinition = "varchar(30)")
    private String bankNumber;

    @Column(name = "bank_name", columnDefinition = "varchar(55)")
    private String bankName;

    @Column(name = "bank_branch", columnDefinition = "varchar(120)")
    private String bankBranch;

    @Column(name = "account_name", columnDefinition = "varchar(50)")
    private String accountName;

    @Column(name = "account_balance", columnDefinition = "double")
    private Double accountBalance;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer idCustomer;

    public BankAccount() {
    }

    public BankAccount(Integer id, String bankNumber, String bankName, String bankBranch, String accountName, Double accountBalance, Customer idCustomer) {
        this.id = id;
        this.bankNumber = bankNumber;
        this.bankName = bankName;
        this.bankBranch = bankBranch;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        this.idCustomer = idCustomer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }
}
