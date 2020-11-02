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
        String result = "";
        int correctKey = key % 26;
        if (action == 1) {
            encode(result, message, correctKey);
        } else if (action == 2) {
            encode(result, message, 26 - correctKey);
        }
    }

    private void encode(String result, String message, int key) {
        for (int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);
            if (Character.isLetter(current) && Character.isUpperCase(current)) {
                result += Character.toString((char) ((current + key - 'A') % 26 + 'A'));
            } else if (Character.isLetter(current) && Character.isLowerCase(current)) {
                result += Character.toString((char) ((current + key - 'a') % 26 + 'a'));
            } else {
                result += current;
            }
        }
        System.out.println(result);
    }
}
