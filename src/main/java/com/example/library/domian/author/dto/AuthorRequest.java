package com.example.library.domian.author.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.OffsetDateTime;
import java.util.UUID;

public class AuthorRequest {

    @NotBlank
    private String name;
    @NotBlank
    private OffsetDateTime birthDate;
    @NotBlank
    private String biography;

    public AuthorRequest() {
    }

    public AuthorRequest(String name, OffsetDateTime birthDate, String biography) {
        this.name = name;
        this.birthDate = birthDate;
        this.biography = biography;
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
