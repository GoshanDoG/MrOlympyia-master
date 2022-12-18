package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Store {
    public void checkAvailability() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("productList"));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}