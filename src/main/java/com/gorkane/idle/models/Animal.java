package com.gorkane.idle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String image;
    private Integer money;
    
    @ManyToOne
    @JoinColumn(name = "habitat_id")
    private Habitat habitat;


    public Animal() {
    }

    public Animal(Long id, String name, String image, Integer money, Habitat habitat) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.money = money;
        this.habitat = habitat;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Habitat getHabitat() {
        return this.habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Animal id(Long id) {
        setId(id);
        return this;
    }

    public Animal name(String name) {
        setName(name);
        return this;
    }

    public Animal image(String image) {
        setImage(image);
        return this;
    }

    public Animal money(Integer money) {
        setMoney(money);
        return this;
    }

    public Animal habitat(Habitat habitat) {
        setHabitat(habitat);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id) && Objects.equals(name, animal.name) && Objects.equals(image, animal.image) && Objects.equals(money, animal.money) && Objects.equals(habitat, animal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image, money, habitat);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", image='" + getImage() + "'" +
            ", money='" + getMoney() + "'" +
            ", habitat='" + getHabitat() + "'" +
            "}";
    }
    
}