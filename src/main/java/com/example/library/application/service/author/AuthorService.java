package com.example.library.application.service.author;

import com.example.library.domian.author.entity.Author;
import com.example.library.domian.author.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @Transactional
    public Author save(Author author){
        return authorRepository.save(author);
    }
}
