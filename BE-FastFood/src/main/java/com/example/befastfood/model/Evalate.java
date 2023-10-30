package com.example.befastfood.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Evalate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evalate_id")
    private Integer id;

    private Integer star;

    @Column(columnDefinition = "varchar(120)")
    private String content;

    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product idProduct;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer idCustomer;

    public Evalate() {
    }

    public Evalate(Integer id, Integer star, String content, LocalDateTime time, Product idProduct, Customer idCustomer) {
        this.id = id;
        this.star = star;
        this.content = content;
        this.time = time;
        this.idProduct = idProduct;
        this.idCustomer = idCustomer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
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

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }
}
