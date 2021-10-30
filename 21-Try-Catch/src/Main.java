import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (Exception exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("Finally");
        }

        example();
        throwExample();
    }

    public static void example() throws IOException {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("/Users/farunurisonmez/Documents/Github/JavaBeginners/21-Try-Catch/src/numbers.txt"));

            String line = null;

            while ((line = reader.readLine()) !=null){
                total += Integer.valueOf(line);
            }

            System.out.println(total);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }

    public static void throwExample(){
        AccountManager manager = new AccountManager();
        System.out.println("Account : "+manager.getBalance());
        manager.deposit(100);
        System.out.println("Account : "+manager.getBalance());
        try {
            manager.withdraw(90);
        }
        catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

        try {
            manager.withdraw(20);
        }
        catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Account : "+manager.getBalance());
    }
}
