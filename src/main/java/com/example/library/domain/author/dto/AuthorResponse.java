package com.example.library.domain.author.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;


@Setter
@Getter
public class AuthorResponse {

    private UUID id;
    private String name;
    private LocalDate birthDate;
    private String biography;

}
