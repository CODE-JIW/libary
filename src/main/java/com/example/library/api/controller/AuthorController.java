package com.example.library.api.controller;

import com.example.library.api.assembler.AuthorAssembler;
import com.example.library.application.service.author.AuthorService;
import com.example.library.domian.author.dto.AuthorRequest;
import com.example.library.domian.author.entity.Author;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/authors")
public class AuthorController {

    private AuthorService authorService;
    private AuthorAssembler authorAssembler;

    public AuthorController(AuthorService authorService, AuthorAssembler authorAssembler) {
        this.authorService = authorService;
        this.authorAssembler = authorAssembler;
    }

    @GetMapping
    public String find(){
        return "Funcionou!!!";
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Author save(@RequestBody  AuthorRequest authorRequest){
        var author = authorAssembler.dtoToEntity(authorRequest);
        return authorService.save(author);
    }
}
