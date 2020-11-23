package com.company;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, choose the cipher:\n1 - Caesar\n2 - Vigenere\n3 - XOR\n4 - DES\n5 - RSA");
        int type = Integer.parseInt(reader.readLine());

        switch (type) {
            case 1:
                Ciphers.encryptCaesar();
                break;
            case 2:
                Ciphers.encryptVigenere();
                break;
            case 3:
                Ciphers.encryptXOR();
                break;
            case 4:
                Ciphers.encryptDES();
                break;
            case 5:
                Ciphers.encryptRSA();
                break;
        }
    }
}
