package com.company;

public class XOR {
    private int action;
    private String message;
    private String key;

    public XOR(int action, String message, String key) {
        this.action = action;
        this.message = message;
        this.key = key;
    }

    public void chooseAction() {
        String result = "";
        if (action == 1)
            encode(result, message, generateKey(key));
        else if (action == 2)
            encode(result, message, generateKey(key));
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
            result += Character.toString((char) (message.charAt(i) ^ key.charAt(i)));
        }
        System.out.println(result);
    }
}
