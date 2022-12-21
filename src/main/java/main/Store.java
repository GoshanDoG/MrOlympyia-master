package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Store {
    private static final String PATH = "productList.txt";

    public void checkAvailability() {
        Storage storage = new Storage();

        Scanner read = new Scanner(System.in);
        System.out.print("Проверить наличие товара: ");
        String sub = read.nextLine().trim();

        storage.productSearch(sub);

        //читаем файл
        try (Scanner reader = new Scanner(new File(PATH))) {
            while (reader.hasNextLine()) {
                String lineFile = reader.nextLine();
                //если строка из файласодержит наш текст, то выводим
                if ((lineFile.contains("шт"))) {
                    System.out.println("в наличии");
                    break;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
