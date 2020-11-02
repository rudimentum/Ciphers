package com.company;

public class XOR {
    private int action;
    private int format;
    private String message;
    private String key;

    public XOR(int action, int format, String message, String key) {
        this.action = action;
        this.format = format;
        this.message = message;
        this.key = key;
    }

    public void chooseAction() {
        String result = "";
        if (action == 1) {
            if (format == 1)
                encodeBinary(result, message, generateKey(key));
            else if (format == 2)
                encodeHex(result, message, generateKey(key));
        }
        else if (action == 2) {
            if (format == 1)
                decodeBinary(result, message, generateKey(key));
            else if (format == 2)
                decodeHex(result, message, generateKey(key));
        }
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


    private void encodeBinary(String result, String message, String key) {
        for (int i = 0; i < message.length(); i++) {
            result+= Integer.toBinaryString(message.charAt(i) ^ key.charAt(i));
        }
        System.out.println(result);
    }

    private void encodeHex(String result, String message, String key) {
        for (int i = 0; i < message.length(); i++) {
            result+= Integer.toHexString(message.charAt(i) ^ key.charAt(i));
        }
        System.out.println(result);
    }

    private void decodeBinary(String result, String message, String key) {
        String toDecimal = "";
        for (int i = 0; i < message.length(); i+=6) {
            String current = message.substring(i, (i+6));
            int binary = Integer.parseInt(current, 2);
            toDecimal += (char) binary;

        }
        for (int i = 0; i < toDecimal.length(); i++) {
            result += Character.toString((char) (toDecimal.charAt(i) ^ key.charAt(i)));
        }

        System.out.println(result);
    }

    private void decodeHex(String result, String message, String key) {
        String toDecimal = "";
        for (int i = 0; i < message.length(); i+=2) {
            String current = message.substring(i, (i+2));
            int hex = Integer.parseInt(current, 16);
            toDecimal += (char) hex;

        }
        for (int i = 0; i < toDecimal.length(); i++) {
            result += Character.toString((char) (toDecimal.charAt(i) ^ key.charAt(i)));
        }

        System.out.println(result);
    }
}
