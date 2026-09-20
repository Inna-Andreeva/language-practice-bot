package handlers.impl;
import handlers.TextHandler;
public class CamelCaseHandler implements TextHandler{
    public String handle(String input){
        if (input == null || input.isEmpty()) return input;
        String[] words = input.split(" ");
        String result = words[0].toLowerCase();
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfTheWord = word.substring(1).toLowerCase();
                String fixedWord = firstLetter + restOfTheWord;
                result=result+fixedWord;
            }
        }
        return result;
    }
}
