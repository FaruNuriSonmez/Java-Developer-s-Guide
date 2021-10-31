import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("/Users/farunurisonmez/Desktop/students.txt");

        createFile(file);
        readingFileInfo(file);
        readingFile(file);
        writeFile(file);
    }

    public static void createFile(File file){
        try {
            if (file.createNewFile()){
                System.out.println("File Created.");
            }
            else{
                System.out.println("File Not Created.");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readingFileInfo(File file){
        if (file.exists()){
            System.out.println("File Name : " + file.getName());
            System.out.println("File Path : " + file.getAbsolutePath());
            System.out.println("File Size : " + file.length());
            System.out.println("Is the file writable : " + file.canWrite());
            System.out.println("Is the file readable : " + file.canRead());
        }
    }

    public static void readingFile(File file){
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void writeFile(File file){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.newLine();
            writer.write("10");
            System.out.println("File Writer");
            writer.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
