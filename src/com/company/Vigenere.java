package com.company;

public class Vigenere {
    private int action;
    private String message;
    private String key;

    public Vigenere(int action, String message, String key) {
        this.action = action;
        this.message = message;
        this.key = key;
    }

    public void chooseAction() {
        String result = "";
        if (action == 1)
            encode(result, message, generateKey(key));
        else if (action == 2)
            decode(result, message, generateKey(key));
    }

    private String generateKey(String key) {
        int i = 0;
        StringBuilder keyBuilder = new StringBuilder(key.toUpperCase());
        while (message.length() != keyBuilder.length()) {
            keyBuilder.append(keyBuilder.charAt(i));
            i++;
            if (i > keyBuilder.length()-1) {
                i = 0;
            }
        }
        return keyBuilder.toString();
    }

    private void encode(String result, String message, String key) {
        for (int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);
            if (Character.isLetter(current) && Character.isUpperCase(current)) {
                result += Character.toString((char) (((current + key.charAt(i)) - 2 * 'A') % 26 + 'A'));
            } else if (Character.isLetter(current) && Character.isLowerCase(current)) {
                result += Character.toString((char) (((current + key.toLowerCase().charAt(i)) - 2 * 'a') % 26 + 'a'));
            }
            else {
                result += current;
            }
        }
        System.out.println(result);
    }

    private void decode(String result, String message, String key) {
        for (int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);
            if (Character.isLetter(current) && Character.isUpperCase(current)) {
                result += Character.toString((char) (((current - key.charAt(i)) + 26) % 26 + 'A'));
            } else if (Character.isLetter(current) && Character.isLowerCase(current)) {
                result += Character.toString((char) (((current - key.toLowerCase().charAt(i)) + 26) % 26 + 'a'));
            } else {
                result += current;
            }
        }
        System.out.println(result);
    }
}
