package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cipher {

    public static void encryptCaesar() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter message: ");
        String message = reader.readLine();
        System.out.println("Enter key: ");
        int key = Integer.parseInt(reader.readLine());
        System.out.println("Select an action:\n1 - Encoding\n2 - Decoding");
        int action = Integer.parseInt(reader.readLine());

        Caesar caesar = new Caesar(action, message, key);
        caesar.chooseAction();
    }

    public static void encryptVigenere() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter message: ");
        String message = reader.readLine();
        System.out.println("Enter key: ");
        String key = reader.readLine();
        System.out.println("Select an action:\n1 - Encoding\n2 - Decoding");
        int action = Integer.parseInt(reader.readLine());

        Vigenere vigenere = new Vigenere(action, message, key);
        vigenere.chooseAction();
    }

    public static void encryptXOR() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter message: ");
        String message = reader.readLine();
        System.out.println("Enter key: ");
        String key = reader.readLine();
        System.out.println("Select an action:\n1 - Encoding\n2 - Decoding");
        int action = Integer.parseInt(reader.readLine());
        System.out.println("Select a result format:\n1 - Binary\n2 - Hexdecimal");
        int format = Integer.parseInt(reader.readLine());

        XOR xor = new XOR(action, format, message, key);
        xor.chooseAction();
    }
}
