package com.example.befastfood.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "name_product", columnDefinition = "varchar(55)")
    private String name;

    @Column(name = "unit", columnDefinition = "varchar(55)")
    private String unit;

    @Column(columnDefinition = "LongText")
    private String img;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop idShop;

    @Column(columnDefinition = "Bit")
    @ColumnDefault("0")
    private boolean isFlag;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category idCategory;

    public Product() {
    }

    public Product(Integer id, String name, String unit, String img, Shop idShop, boolean isFlag, Category idCategory) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.img = img;
        this.idShop = idShop;
        this.isFlag = isFlag;
        this.idCategory = idCategory;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Shop getIdShop() {
        return idShop;
    }

    public void setIdShop(Shop idShop) {
        this.idShop = idShop;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }

    public Category getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Category idCategory) {
        this.idCategory = idCategory;
    }
}
