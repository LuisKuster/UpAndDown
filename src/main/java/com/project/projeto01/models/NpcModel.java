package com.project.projeto01.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_NPC")
public class NpcModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false)
    private Integer idade;

    @Column(nullable = false, length = 255)
    private String story;

    @Column(nullable = false)
    private Boolean isgood;

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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Boolean getIsgood() {
        return isgood;
    }

    public void setIsgood(Boolean isgood) {
        this.isgood = isgood;
    }






}
