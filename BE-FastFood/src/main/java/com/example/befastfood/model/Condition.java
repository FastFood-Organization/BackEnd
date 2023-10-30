package com.example.befastfood.model;

import javax.persistence.*;

@Entity
public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "condition_id")
    private Integer id;

    @Column(name = "descriptions", columnDefinition = "varchar(200)")
    private String descriptions;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale idSale;

    public Condition() {
    }

    public Condition(Integer id, String descriptions, Sale idSale) {
        this.id = id;
        this.descriptions = descriptions;
        this.idSale = idSale;
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

    public Sale getIdSale() {
        return idSale;
    }

    public void setIdSale(Sale idSale) {
        this.idSale = idSale;
    }
}
