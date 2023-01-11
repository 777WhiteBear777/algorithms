package ex_5;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class App {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        //        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");  // Авто генерация ключа
        //        keyGenerator.init(128);
        //        SecretKey key = keyGenerator.generateKey();

        SecretKey key = new SecretKeySpec("KeyCipher7777777".getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);


        Cipher decriptCipher = Cipher.getInstance("AES");
        decriptCipher.init(Cipher.DECRYPT_MODE, key);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            byte[] bytes = new byte[16];
            byte[] decriptedBytes;

            int chose;
            String line;

            System.out.println("Chose way:");
            System.out.println("AUTO -> 1");
            System.out.println("Manually -> 2");

            chose = Integer.parseInt(reader.readLine());

            switch (chose) {
                case 1 -> {
                    String text = "Bober";
                    System.out.println("Your line: " + text);
                    bytes = cipher.doFinal(text.getBytes());
                    System.out.print("Encrypted line: ");
                    for (byte b : bytes) {
                        System.out.print(b);
                    }

                    System.out.print("\nDecrypted line: ");

                    decriptedBytes = decriptCipher.doFinal(bytes);
                    for (byte b : decriptedBytes) {
                        System.out.print((char) b);
                    }

                }
                case 2 -> {

                    System.out.println("Enter choice: ");
                    System.out.println("Encrypted -> 1");
                    System.out.println("Decrypted -> 2");
                    chose = Integer.parseInt(reader.readLine());

                    switch (chose) {
                        case 1 -> {
                            System.out.println("Enter text: ");
                            line = reader.readLine();

                            bytes = cipher.doFinal(line.getBytes());
                            System.out.print("Encrypted line: ");
                            for (byte b : bytes) {
                                System.out.print(b);
                            }

                        }
                        case 2 -> {
                            System.out.print("\nEnter encrypt: ");

                            for (int i = 0; i < 16; i++) {
                                bytes[i] = (byte) Integer.parseInt(reader.readLine());
                            }

                            System.out.print("\nDecrypted line: ");
                            decriptedBytes = decriptCipher.doFinal(bytes);
                            for (byte b : decriptedBytes) {
                                System.out.print((char) b);
                            }
                        }
                    }


                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
