package com.company;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Ciphers {

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

        XOR xor = new XOR(action, message, key);
        xor.chooseAction();
    }

    public static void encryptDES() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter message: ");
        String message = reader.readLine();

        DES des = new DES(message);
        des.doAction();
    }

    public static void encryptRSA() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter message: ");
        String message = reader.readLine();

        RSA rsa = new RSA(message);
        rsa.doAction();
    }
}
