package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, choose the cipher:\n1 - Caesar\n2 - Vigenere\n3 - XOR");
        int type = Integer.parseInt(reader.readLine());

        switch (type) {
            case 1:
                Cipher.encryptCaesar();
                break;
            case 2:
                Cipher.encryptVigenere();
                break;
            case 3:
                Cipher.encryptXOR();
                break;
        }
    }
}
