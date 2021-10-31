import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("/Users/farunurisonmez/Desktop/students.txt");
        createFile(file);
        readingFileInfo(file);
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
}
