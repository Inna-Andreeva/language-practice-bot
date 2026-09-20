package handlers.impl;
import handlers.TextHandler;
public class UpperCaseHandler implements TextHandler {
    public String handle(String input){
        return input.toUpperCase();
    }
}
