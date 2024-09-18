package com.gorkane.idle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "app_user")
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String password;

    private Integer money;
    private Integer currentExp;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;


    public User() {
    }

    public User(Long id, String name, String email, String password, Integer money, Integer currentExp, Level level) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.money = money;
        this.currentExp = currentExp;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getCurrentExp() {
        return this.currentExp;
    }

    public void setCurrentExp(Integer currentExp) {
        this.currentExp = currentExp;
    }

    public Level getLevel() {
        return this.level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public User id(Long id) {
        setId(id);
        return this;
    }

    public User name(String name) {
        setName(name);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User money(Integer money) {
        setMoney(money);
        return this;
    }

    public User currentExp(Integer currentExp) {
        setCurrentExp(currentExp);
        return this;
    }

    public User level(Level level) {
        setLevel(level);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(money, user.money) && Objects.equals(currentExp, user.currentExp) && Objects.equals(level, user.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, money, currentExp, level);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", money='" + getMoney() + "'" +
            ", currentExp='" + getCurrentExp() + "'" +
            ", level='" + getLevel() + "'" +
            "}";
    }

}
