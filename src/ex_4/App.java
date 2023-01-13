package ex_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter the equation: ");
            String line = reader.readLine();

            int openSymbol = line.indexOf('(');
            int closeSymbol = line.indexOf(')');

            if (openSymbol >= 0 && closeSymbol >= 0) {
                if (openSymbol < closeSymbol) {
                    System.out.println("All good!");
                } else if (openSymbol > closeSymbol) {
                    System.out.println("Error ");
                }
            }

            if (openSymbol < 0 && closeSymbol >= 0) {
                System.out.println("Open parenthesis missing!");
            } else if (openSymbol >= 0 && closeSymbol < 0) {
                System.out.println("Close parenthesis missing!");
            } else {
                System.out.println("Parenthesis missing!");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
