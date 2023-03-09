package com.example.library.domian.author.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Setter
@Getter
public class AuthorRequest {

    @NotBlank
    private String name;
    @NotBlank
    private LocalDate birthDate;
    @NotBlank
    private String biography;
}
