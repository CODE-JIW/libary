package com.example.library.domain.expection;

public class EntityNotFoundException extends BusinessRuleException{
    private static final long serialVersionUID = 1L;

    public EntityNotFoundException(String message){
        super(message);
    }
}
