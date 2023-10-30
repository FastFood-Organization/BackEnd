package com.example.befastfood.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "user_name", columnDefinition = "varchar(50)")
    private String name;
    @Column(columnDefinition = "varchar(50)")
    private String password;
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    Set<Role> roles = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "adminshop_id")
    private AdminShop idAdminShop;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer idCustomer;

    @Column(columnDefinition = "bit")
    @ColumnDefault("0")
    private boolean isFlag;

    public User() {
    }

    public User(Integer id, String name, String password, Set<Role> roles, AdminShop idAdminShop, Customer idCustomer, boolean isFlag) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roles = roles;
        this.idAdminShop = idAdminShop;
        this.idCustomer = idCustomer;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }

    public AdminShop getIdAdminShop() {
        return idAdminShop;
    }

    public void setIdAdminShop(AdminShop idAdminShop) {
        this.idAdminShop = idAdminShop;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }
}
