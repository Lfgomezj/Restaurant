package com.example.restaurantefinal.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "Menus")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long id;
    @Column(nullable = false)
    private Character rol;
    @Column(name = "name_Menu", nullable = false)
    private String nameMenu;
    @Column(nullable = false)

    private Integer price;
    @Column(nullable = false)

    private String description;
    @Column(nullable = false)

    private String url;
    @Column(nullable = false)

    private String category;
    @Column(nullable = false)

    private Boolean state;
    @Column(nullable = false)

    private String campus;
    @Column(nullable = false, name = "preparation_time")

    private Double preparationTime;

    public Menu(Long id, Character rol, String nameMenu, Integer price, String description, String url, String category, Boolean state, String campus, Double preparationTime) {
        this.id = id;
        this.rol = rol;
        this.nameMenu = nameMenu;
        this.price = price;
        this.description = description;
        this.url = url;
        this.category = category;
        this.state = state;
        this.campus = campus;
        this.preparationTime = preparationTime;
    }

    public Menu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getRol() {
        return rol;
    }

    public void setRol(Character rol) {
        this.rol = rol;
    }

    public String getNameplate() {
        return nameMenu;
    }

    public void setNameplate(String nameplate) {
        this.nameMenu = nameplate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Double getpreparationTime() {
        return preparationTime;
    }

    public void setpreparationTime(Double preparationTime) {
        this.preparationTime = preparationTime;
    }
}

