package com.company;

import javax.crypto.*;

import java.nio.charset.StandardCharsets;

public class DES {
    private String message;

    public DES(String message) {
        this.message = message;
    }

    public void doAction() {
        try {
            KeyGenerator kg = KeyGenerator.getInstance("DES");
            SecretKey key = kg.generateKey();
            Cipher encipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            encipher.init(Cipher.ENCRYPT_MODE, key);
            Cipher decipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            decipher.init(Cipher.DECRYPT_MODE, key);

            String encrypted = encode(message, encipher);
            System.out.println("Encoding: "+ encrypted);
            String decrypted = encode(encrypted, decipher);
            System.out.println("Decoding: " + decrypted);
        } catch (Exception e) {
        }

    }

    private String encode(String message, Cipher cipher) throws BadPaddingException, IllegalBlockSizeException {
        byte[] text = cipher.doFinal(message.getBytes(StandardCharsets.ISO_8859_1));
        String result = new String(text, StandardCharsets.ISO_8859_1);
        return result;
    }
}
