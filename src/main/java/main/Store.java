package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Store {
    private static final String PATH = "productList.txt";

    public void checkAvailability() {
        Scanner read = new Scanner(System.in);
        System.out.print("Проверить наличие товара: ");
        String sub = read.nextLine().trim();

        //читаем файл
        try (Scanner reader = new Scanner(new File(PATH))) {
            while (reader.hasNextLine()) {
                String lineFile = reader.nextLine();
                //если строка из файласодержит наш текст, то выводим
                if (lineFile.contains("отсутствует")) {
                    System.out.println("данный товар отсутсвует");
                    break;
                } else if ((lineFile.contains(sub))) {
                    System.out.println(lineFile);
                    break;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
