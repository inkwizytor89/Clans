package com.prototype.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "members")
public class Member {

    private Integer id;
    private String name;
    private Double fury;
    private Double sociality;
    private String sex;
    private Double strength;
    private Double agility;
    private Double stamina;
    private Double intelligence;
    private Double wisdom;
    private Double charisma;
    private Date updated;
    private Date created;

    @Id
    @Column(name = "id", unique = true,
            nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "fury", nullable = false)
    public Double getFury() {
        return fury;
    }

    public void setFury(Double fury) {
        this.fury = fury;
    }

    @Column(name = "sociality", nullable = false)
    public Double getSociality() {
        return sociality;
    }

    public void setSociality(Double sociality) {
        this.sociality = sociality;
    }

    @Column(name = "sex", nullable = false)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name = "strength", nullable = false)
    public Double getStrength() {
        return strength;
    }

    public void setStrength(Double strength) {
        this.strength = strength;
    }

    @Column(name = "agility", nullable = false)
    public Double getAgility() {
        return agility;
    }

    public void setAgility(Double agility) {
        this.agility = agility;
    }

    @Column(name = "stamina", nullable = false)
    public Double getStamina() {
        return stamina;
    }

    public void setStamina(Double stamina) {
        this.stamina = stamina;
    }

    @Column(name = "intelligence", nullable = false)
    public Double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Double intelligence) {
        this.intelligence = intelligence;
    }

    @Column(name = "wisdom", nullable = false)
    public Double getWisdom() {
        return wisdom;
    }

    public void setWisdom(Double wisdom) {
        this.wisdom = wisdom;
    }

    @Column(name = "charisma", nullable = false)
    public Double getCharisma() {
        return charisma;
    }

    public void setCharisma(Double charisma) {
        this.charisma = charisma;
    }

    @Column(name = "updated", nullable = false)
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Column(name = "created", nullable = false)
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
