package com.example.library.domian.author.entity;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private OffsetDateTime birthDate;
    private String biography;

    public Author() {
    }

    public Author(UUID id, String name, OffsetDateTime birthDate, String biography) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.biography = biography;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OffsetDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(OffsetDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
