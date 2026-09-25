package org.example.handlers;

public class UpperCaseHandler implements TextHandler {
    @Override
    public String handle(String input){
        return input.toUpperCase();
    }
}
