package com.example.befastfood.model;

import javax.persistence.*;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Integer id;

    @Column(name = "name_sale", columnDefinition = "varchar(200)")
    private String name;

    private Integer discount;

    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "adminshop_id")
    private AdminShop idAdminShop;

    public Sale() {
    }

    public Sale(Integer id, String name, Integer discount, Integer amount, AdminShop idAdminShop) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.amount = amount;
        this.idAdminShop = idAdminShop;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public AdminShop getIdAdminShop() {
        return idAdminShop;
    }

    public void setIdAdminShop(AdminShop idAdminShop) {
        this.idAdminShop = idAdminShop;
    }
}