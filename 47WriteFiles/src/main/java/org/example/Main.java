package org.example;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // How to write a file using java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "C:\\Users\\NAME\\Desktop\\test.txt";
        //String textContent = "I like pizza!\nIt's rally good\nBuy me Pizza!";
        String textContent = """                        
                Roses are red
                violates are blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERYWHERE!
                """;                                // multi line string


        try(FileWriter writer = new FileWriter(filePath);) {
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }


    }
}