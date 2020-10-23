package com.company;

public class Caesar {
    private int action;
    private String message;
    private int key;

    public Caesar(int action, String message, int key) {
        this.action = action;
        this.message = message;
        this.key = key;
    }

    public void chooseAction() {
        char[] symbols = new char[message.length()];
        int correctKey = key % 26;
        if (action == 1) {
            encode(symbols, message, correctKey);
        } else if (action == 2) {
            encode(symbols, message, 26 - correctKey);
        }
    }

    private void encode(char[] symbols, String message, int key) {
        for (int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);
            if (Character.isLetter(current) && Character.isUpperCase(current)) {
                symbols[i] = (char) ((current + key - 'A') % 26 + 'A');
            } else if (Character.isLetter(current) && Character.isLowerCase(current)) {
                symbols[i] = (char) ((current + key - 'a') % 26 + 'a');
            } else {
                symbols[i] = current;
            }
        }
        System.out.println(symbols);
    }
}
