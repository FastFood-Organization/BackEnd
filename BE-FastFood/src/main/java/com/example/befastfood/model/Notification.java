package com.example.befastfood.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private Integer id;

    @Column(columnDefinition = "varchar(200)")
    private String content;

    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop idShop;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer idCustomer;

    public Notification() {
    }

    public Notification(Integer id, String content, LocalDateTime time, Shop idShop, Customer idCustomer) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.idShop = idShop;
        this.idCustomer = idCustomer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Shop getIdShop() {
        return idShop;
    }

    public void setIdShop(Shop idShop) {
        this.idShop = idShop;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }
}
