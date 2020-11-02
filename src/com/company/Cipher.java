package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cipher {

    public static void encryptCaesar() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Message: ");
        String message = reader.readLine();
        System.out.println("Key: ");
        int key = Integer.parseInt(reader.readLine());
        System.out.println("Action: 1 - encode, 2 - decode");
        int action = Integer.parseInt(reader.readLine());

        Caesar caesar = new Caesar(action, message, key);
        caesar.chooseAction();
    }

    public static void encryptVigenere() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Message: ");
        String message = reader.readLine();
        System.out.println("Key: ");
        String key = reader.readLine();
        System.out.println("Action: 1 - encode, 2 - decode");
        int action = Integer.parseInt(reader.readLine());

        Vigenere vigenere = new Vigenere(action, message, key);
        vigenere.chooseAction();
    }

    public static void encryptXOR() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Message: ");
        String message = reader.readLine();
        System.out.println("Key: ");
        String key = reader.readLine();
        System.out.println("Action: 1 - encode, 2 - decode");
        int action = Integer.parseInt(reader.readLine());

        XOR xor = new XOR(action, message, key);
        xor.chooseAction();
    }
}
