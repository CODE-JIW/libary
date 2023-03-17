package com.example.library.domain.author.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class AuthorRequest {

    @NotBlank
    @Size(min = 5, max = 100)
    private String name;
    @NotNull
    private LocalDate birthDate;
    @NotBlank
    @Size(min = 5, max = 1000)
    private String biography;
}
