package com.example.befastfood.model;

import javax.persistence.*;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id")
    private Integer id;

    @Column(name = "descriptions", columnDefinition = "varchar(120)")
    private String descriptions;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer idCustomer;

    public History() {
    }

    public History(Integer id, String descriptions, Customer idCustomer) {
        this.id = id;
        this.descriptions = descriptions;
        this.idCustomer = idCustomer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }
}
