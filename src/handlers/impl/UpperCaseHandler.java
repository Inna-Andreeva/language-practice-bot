package handlers.impl;
import handlers.TextHandler;
public class UpperCaseHandler implements TextHandler {
    @Override
    public String handle(String input){
        return input.toUpperCase();
    }
}
