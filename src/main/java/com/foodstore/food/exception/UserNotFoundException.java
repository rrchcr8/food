package com.foodstore.food.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message)  {
        super(message);
    }
}
