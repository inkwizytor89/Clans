package com.prototype.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 40)
    private String name;

    @Column(name = "fury", nullable = false)
    private Double fury;

    @Column(name = "sociality", nullable = false)
    private Double sociality;

    @Column(name = "updated", nullable = false)
    private Date updated;

    @Column(name = "created", nullable = false)
    private Date created;

    @OneToMany
    @JoinColumn(name="team_id")
    List<Member> members;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFury() {
        return fury;
    }

    public void setFury(Double fury) {
        this.fury = fury;
    }

    public Double getSociality() {
        return sociality;
    }

    public void setSociality(Double sociality) {
        this.sociality = sociality;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<Member> getMembers() {
        return members;
    }

//    @OneToMany
//    @JoinTable(
//            name="members",
//            joinColumns = @JoinColumn( name="team_id")//,
//            inverseJoinColumns = @JoinColumn( name="PART_ID")
//    )
    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
