package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Storage  {
    public void productSearch(String sub) {

        final String PATH = "productList.txt";

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
