package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("productList"));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }
            Store store = new Store();
            store.checkAvailability();

        }
    }

