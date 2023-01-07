package ex_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        int ARRAY_SIZE;
        int NUMBER;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter size array: ");
            ARRAY_SIZE = Integer.parseInt(reader.readLine());

            List<Integer> array = new ArrayList<>(ARRAY_SIZE);

            for (int i = 0; i < ARRAY_SIZE; i++) {
                array.add((int) (Math.random() * 100));
                System.out.println(array.get(i));
            }

            System.out.print("\nEnter index element: ");
            NUMBER = Integer.parseInt(reader.readLine());

            for (int i = 0; i < ARRAY_SIZE; i++) {
                if (NUMBER == array.get(i)) {
                    System.out.println("Index found: " + i);
                    System.out.println("Step: " + (i + 1));
                    break;
                }
                if (i == array.size() - 1) {
                    System.out.println("Index not found!");
                    System.out.println("Step: " + (i + 1));
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
