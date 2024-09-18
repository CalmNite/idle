package com.gorkane.idle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer reward;
    private Integer experience;
    private Integer duration;
    private Boolean loop;
    
    @ManyToOne
    @JoinColumn(name = "habitat_id")
    private Habitat habitat;


    public Mission() {
    }

    public Mission(Long id, String name, Integer reward, Integer experience, Integer duration, Boolean loop, Habitat habitat) {
        this.id = id;
        this.name = name;
        this.reward = reward;
        this.experience = experience;
        this.duration = duration;
        this.loop = loop;
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

    public Integer getReward() {
        return this.reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Integer getExperience() {
        return this.experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean isLoop() {
        return this.loop;
    }

    public Boolean getLoop() {
        return this.loop;
    }

    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    public Habitat getHabitat() {
        return this.habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Mission id(Long id) {
        setId(id);
        return this;
    }

    public Mission name(String name) {
        setName(name);
        return this;
    }

    public Mission reward(Integer reward) {
        setReward(reward);
        return this;
    }

    public Mission experience(Integer experience) {
        setExperience(experience);
        return this;
    }

    public Mission duration(Integer duration) {
        setDuration(duration);
        return this;
    }

    public Mission loop(Boolean loop) {
        setLoop(loop);
        return this;
    }

    public Mission habitat(Habitat habitat) {
        setHabitat(habitat);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mission)) {
            return false;
        }
        Mission mission = (Mission) o;
        return Objects.equals(id, mission.id) && Objects.equals(name, mission.name) && Objects.equals(reward, mission.reward) && Objects.equals(experience, mission.experience) && Objects.equals(duration, mission.duration) && Objects.equals(loop, mission.loop) && Objects.equals(habitat, mission.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, reward, experience, duration, loop, habitat);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", reward='" + getReward() + "'" +
            ", experience='" + getExperience() + "'" +
            ", duration='" + getDuration() + "'" +
            ", loop='" + isLoop() + "'" +
            ", habitat='" + getHabitat() + "'" +
            "}";
    }
    
}
