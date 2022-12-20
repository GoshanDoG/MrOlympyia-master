package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Storage {
    public void productSearch() {
        final String PATH = "productList.txt";
        Scanner read = new Scanner(System.in);
        System.out.print("Найти товар: ");
        String sub = read.nextLine().trim();

        //читаем файл
        try (Scanner reader = new Scanner(new File(PATH))) {
            while (reader.hasNextLine()) {
                String lineFile = reader.nextLine();
                //если строка из файласодержит наш текст, то выводим
                if (lineFile.contains(sub)) {
                    System.out.println(lineFile);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void addingProduct() {
    }
}
