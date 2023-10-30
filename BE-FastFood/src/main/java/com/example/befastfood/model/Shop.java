package com.example.befastfood.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private Integer id;

    @Column(name = "shop_name", columnDefinition = "varchar(50)")
    private String name;

    @Column(columnDefinition = "varchar(200)")
    private String address;

    @Column(columnDefinition = "Longtext")
    private String descriptions;

    @Column(columnDefinition = "Longtext")
    private String img;

    @Column(columnDefinition = "Bit")
    @ColumnDefault("0")
    private boolean isFlag;

    public Shop() {
    }

    public Shop(Integer id, String name, String address, String descriptions, String img, boolean isFlag) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.descriptions = descriptions;
        this.img = img;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }
}
