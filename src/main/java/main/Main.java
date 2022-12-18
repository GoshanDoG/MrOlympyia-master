package main;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("productList"));

        byte[] buffer = new byte[512];
        while(dis.available() != 0){
            int count = dis.read(buffer);

            if(count > 0){
                System.out.println(new String((buffer)));
            }
        }

    }
}
