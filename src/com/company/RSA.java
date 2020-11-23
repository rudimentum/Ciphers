package com.company;

import javax.crypto.*;
import java.security.*;
import java.nio.charset.StandardCharsets;

public class RSA {
    private String message;

    public RSA(String message) {
        this.message = message;
    }

    public void doAction() {
        try {
            Cipher encipher = Cipher.getInstance("RSA");
            Cipher decipher = Cipher.getInstance("RSA");
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            Key publicKey = keyPair.getPublic();
            Key privateKey = keyPair.getPrivate();
            encipher.init(Cipher.ENCRYPT_MODE, publicKey);
            decipher.init(Cipher.DECRYPT_MODE, privateKey);
            String encrypted = encode(message, encipher);
            System.out.println("Encoding: " + encrypted);
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
