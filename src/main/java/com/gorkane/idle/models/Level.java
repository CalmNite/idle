package com.gorkane.idle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number;
    private Integer expNeeded;
    

    public Level() {
    }

    public Level(Long id, Integer number, Integer expNeeded) {
        this.id = id;
        this.number = number;
        this.expNeeded = expNeeded;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getExpNeeded() {
        return this.expNeeded;
    }

    public void setExpNeeded(Integer expNeeded) {
        this.expNeeded = expNeeded;
    }

    public Level id(Long id) {
        setId(id);
        return this;
    }

    public Level number(Integer number) {
        setNumber(number);
        return this;
    }

    public Level expNeeded(Integer expNeeded) {
        setExpNeeded(expNeeded);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Level)) {
            return false;
        }
        Level level = (Level) o;
        return Objects.equals(id, level.id) && Objects.equals(number, level.number) && Objects.equals(expNeeded, level.expNeeded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, expNeeded);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", number='" + getNumber() + "'" +
            ", expNeeded='" + getExpNeeded() + "'" +
            "}";
    }
    
}
