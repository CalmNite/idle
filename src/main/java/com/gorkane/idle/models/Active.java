package com.gorkane.idle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Active {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    
    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    public Active() {
    }

    public Active(Long id, String status, Mission mission, User user, Animal animal) {
        this.id = id;
        this.status = status;
        this.mission = mission;
        this.user = user;
        this.animal = animal;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Mission getMission() {
        return this.mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Active id(Long id) {
        setId(id);
        return this;
    }

    public Active status(String status) {
        setStatus(status);
        return this;
    }

    public Active mission(Mission mission) {
        setMission(mission);
        return this;
    }

    public Active user(User user) {
        setUser(user);
        return this;
    }

    public Active animal(Animal animal) {
        setAnimal(animal);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Active)) {
            return false;
        }
        Active active = (Active) o;
        return Objects.equals(id, active.id) && Objects.equals(status, active.status) && Objects.equals(mission, active.mission) && Objects.equals(user, active.user) && Objects.equals(animal, active.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, mission, user, animal);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", status='" + getStatus() + "'" +
            ", mission='" + getMission() + "'" +
            ", user='" + getUser() + "'" +
            ", animal='" + getAnimal() + "'" +
            "}";
    }

    
    
    
}
