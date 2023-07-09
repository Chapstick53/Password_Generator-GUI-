package com.example.passwordgen;

import java.util.Random;

public class PasswordGenerator {
    public static String generatePassword(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_";

        Random random = new Random();

        StringBuilder password = new StringBuilder();

        for(int i=0; i<length; i++){
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
