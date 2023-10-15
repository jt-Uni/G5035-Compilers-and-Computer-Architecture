package com.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String userInput = "";
        String charClass = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = reader.readLine();
        } catch (IOException ex) {
            System.err.print("Input error!");
            ex.printStackTrace();
            System.exit(1);
        }

        for (int i = 0; i < userInput.length(); ++i){

            char c = userInput.charAt(i);

            if (Character.isUpperCase(c)) {
                System.out.println("upperCase");
            } else if (Character.isLowerCase(c)) {
                System.out.println("lowerCase");
            } else {
                System.out.println("numerical");
            }
        }
    }
}