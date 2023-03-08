package com.example.library.api.assembler;

import com.example.library.domian.author.dto.AuthorRequest;
import com.example.library.domian.author.dto.AuthorResponse;
import com.example.library.domian.author.entity.Author;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorAssembler {
    private ModelMapper modelMapper;

    public AuthorAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public AuthorResponse entityToDto(Author author){
        return modelMapper.map(author, AuthorResponse.class);
    }
    public Author dtoToEntity(AuthorRequest authorRequest){
        return  modelMapper.map(authorRequest, Author.class);
    }
}
