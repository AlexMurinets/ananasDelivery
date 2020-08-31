package com.example.backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Deliveryman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private char[] password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deliveryman")
    private List<Order> orders;

    public Deliveryman() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

}
