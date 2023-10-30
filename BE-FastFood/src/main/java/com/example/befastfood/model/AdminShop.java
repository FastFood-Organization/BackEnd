package com.example.befastfood.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class AdminShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminShop_id")
    private Integer id;

    @Column(name = "first_name", columnDefinition = "varchar(120)")
    private String firstName;

    @Column(name = "last_name", columnDefinition = "varchar(120)")
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "email", columnDefinition = "varchar(25)")
    private String email;

    @Column(name = "address", columnDefinition = "varchar(200)")
    private String address;

    @Column(name = "phone_number", columnDefinition = "varchar(15)")
    private String phoneNumber;

    @Column(name = "id_card", columnDefinition = "varchar(20)")
    private String idCard;

    @Column(name = "img", columnDefinition = "LongText")
    private String img;

    @Column(columnDefinition = "bit")
    @ColumnDefault("0")
    private boolean isFlag;

    @OneToOne
    @JoinColumn(name = "shop_id")
    private Shop idShop;

    public AdminShop() {
    }

    public AdminShop(Integer id, String firstName, String lastName, LocalDate dateOfBirth, String email, String address, String phoneNumber, String idCard, String img, boolean isFlag, Shop idShop) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.idCard = idCard;
        this.img = img;
        this.isFlag = isFlag;
        this.idShop = idShop;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public Shop getIdShop() {
        return idShop;
    }

    public void setIdShop(Shop idShop) {
        this.idShop = idShop;
    }
}
