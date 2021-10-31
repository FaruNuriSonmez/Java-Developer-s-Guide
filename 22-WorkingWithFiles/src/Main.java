import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("/Users/farunurisonmez/Desktop/students.txt");
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
}
