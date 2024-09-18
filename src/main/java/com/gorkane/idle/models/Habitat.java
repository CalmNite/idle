package com.gorkane.idle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Habitat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String image;
    private Integer money;
    private String type;
    private Integer maxAnimals;
    
    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;


    public Habitat() {
    }

    public Habitat(Long id, String name, String image, Integer money, String type, Integer maxAnimals, Level level) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.money = money;
        this.type = type;
        this.maxAnimals = maxAnimals;
        this.level = level;
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMaxAnimals() {
        return this.maxAnimals;
    }

    public void setMaxAnimals(Integer maxAnimals) {
        this.maxAnimals = maxAnimals;
    }

    public Level getLevel() {
        return this.level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Habitat id(Long id) {
        setId(id);
        return this;
    }

    public Habitat name(String name) {
        setName(name);
        return this;
    }

    public Habitat image(String image) {
        setImage(image);
        return this;
    }

    public Habitat money(Integer money) {
        setMoney(money);
        return this;
    }

    public Habitat type(String type) {
        setType(type);
        return this;
    }

    public Habitat maxAnimals(Integer maxAnimals) {
        setMaxAnimals(maxAnimals);
        return this;
    }

    public Habitat level(Level level) {
        setLevel(level);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Habitat)) {
            return false;
        }
        Habitat habitat = (Habitat) o;
        return Objects.equals(id, habitat.id) && Objects.equals(name, habitat.name) && Objects.equals(image, habitat.image) && Objects.equals(money, habitat.money) && Objects.equals(type, habitat.type) && Objects.equals(maxAnimals, habitat.maxAnimals) && Objects.equals(level, habitat.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image, money, type, maxAnimals, level);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", image='" + getImage() + "'" +
            ", money='" + getMoney() + "'" +
            ", type='" + getType() + "'" +
            ", maxAnimals='" + getMaxAnimals() + "'" +
            ", level='" + getLevel() + "'" +
            "}";
    }
    
}