package com.example.library.domian.author.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public class AuthorResponse {

    private UUID id;
    private String name;
    private OffsetDateTime birthDate;
    private String biography;

    public AuthorResponse() {
    }

    public AuthorResponse(UUID id, String name, OffsetDateTime birthDate, String biography) {
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
