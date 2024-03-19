package com.projectdatabasepharmacy.model;
import jakarta.persistence.*;


@Entity

public class pharmacy  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String discount;

    public pharmacy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}

