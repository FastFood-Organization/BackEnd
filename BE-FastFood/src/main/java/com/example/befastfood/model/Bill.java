package com.example.befastfood.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private Integer id;

    private LocalDateTime time;

    @OneToOne
    @JoinColumn(name = "sale_id")
    private Sale idSale;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer idCustomer;

    @ManyToOne
    @JoinColumn(name = "method_id")
    private PaymentMethod idMethod;

    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name = "product_bill", joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "bill_id"))
    Set<Product> products = new HashSet<>();

    public Bill() {
    }

    public Bill(Integer id, LocalDateTime time, Sale idSale, Customer idCustomer, PaymentMethod idMethod, Set<Product> products) {
        this.id = id;
        this.time = time;
        this.idSale = idSale;
        this.idCustomer = idCustomer;
        this.idMethod = idMethod;
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Sale getIdSale() {
        return idSale;
    }

    public void setIdSale(Sale idSale) {
        this.idSale = idSale;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public PaymentMethod getIdMethod() {
        return idMethod;
    }

    public void setIdMethod(PaymentMethod idMethod) {
        this.idMethod = idMethod;
    }
}
