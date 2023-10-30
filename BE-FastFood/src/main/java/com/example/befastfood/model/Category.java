package com.example.befastfood.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer id;

    @Column(name = "name_category", columnDefinition = "varchar(55)")
    private String name;

    @Column(columnDefinition = "Bit")
    @ColumnDefault("0")
    private boolean isFlag;

    public Category() {
    }

    public Category(Integer id, String name, boolean isFlag) {
        this.id = id;
        this.name = name;
        this.isFlag = isFlag;
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

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }
}
